/*
 * Testerra
 *
 * (C) 2020, Mike Reiche, T-Systems Multimedia Solutions GmbH, Deutsche Telekom AG
 *
 * Deutsche Telekom AG and all other contributors /
 * copyright owners license this file to you under the Apache
 * License, Version 2.0 (the "License"); you may not use this
 * file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

import {autoinject} from "aurelia-framework";
import {DataLoader} from "./data-loader";
import {ClassStatistics, ExecutionStatistics, FailureAspectStatistics} from "./statistic-models";
import {CacheService} from "t-systems-aurelia-components/src/services/cache-service";
import {Config} from "./config-dev";
import {data} from "./report-model";
import IFile = data.IFile;
import IMethodContext = data.IMethodContext;
import {StatusConverter} from "./status-converter";
import ITestContext = data.ITestContext;
import ISuiteContext = data.ISuiteContext;
import ISessionContext = data.ISessionContext;
import ITestStep = data.ITestStep;

export interface IMethodDetails {
    executionStatistics?: ExecutionStatistics,
    methodContext: IMethodContext,
    classStatistics?: ClassStatistics,
    testContext?: ITestContext,
    suiteContext?: ISuiteContext,
    numDetails?: number,
    failureAspectStatistics?:FailureAspectStatistics,
    sessionContexts?:ISessionContext[],
    failedStep?:ITestStep,
}

@autoinject()
export class StatisticsGenerator {

    constructor(
        private _dataLoader: DataLoader,
        private _cacheService:CacheService,
        private _config:Config,
        private _statusConverter:StatusConverter,
    ) {
        this._cacheService.setDefaultCacheTtl(120);

    }

    getExecutionStatistics(): Promise<ExecutionStatistics> {
        return this._cacheService.getForKeyWithLoadingFunction("executionStatistics", () => {
            return this._dataLoader.getExecutionAggregate().then(executionAggregate => {

                const executionStatistics = new ExecutionStatistics();
                executionStatistics.setExecutionAggregate(executionAggregate);

                for (const id in executionAggregate.methodContexts) {
                    const methodContext = executionAggregate.methodContexts[id];
                    const classContext = executionAggregate.classContexts[methodContext.classContextId];
                    let classStatistics:ClassStatistics;

                    // Group by test context name
                    if (classContext.testContextName) {
                        classStatistics = executionStatistics.classStatistics.find(classStatistics => classStatistics.classContext.testContextName == classContext.testContextName);

                        // Or by class name
                    } else {
                        classStatistics = executionStatistics.classStatistics.find(classStatistics => classStatistics.classContext.fullClassName == classContext.fullClassName);
                    }
                    if (!classStatistics) {
                        classStatistics = new ClassStatistics().setClassContext(classContext);
                        executionStatistics.addClassStatistics(classStatistics);
                    }

                    methodContext.resultStatus = this._statusConverter.correctStatus(methodContext.resultStatus);
                    classStatistics.addMethodContext(methodContext);
                }
                executionStatistics.updateStatistics();
                // console.log(executionStatistics);
                return executionStatistics;
            });
        })
    }

    getMethodDetails(methodId:string):Promise<IMethodDetails> {
        return this._cacheService.getForKeyWithLoadingFunction("method:"+methodId, () => {
            return this.getExecutionStatistics().then(executionStatistics => {
                for (const classStatistic of executionStatistics.classStatistics) {
                    const methodContext = classStatistic.methodContexts.find(methodContext => methodContext.contextValues.id == methodId);
                    if (methodContext) {
                        const classContext = classStatistic.classContext;
                        const testContext = executionStatistics.executionAggregate.testContexts[classContext.testContextId];
                        const suiteContext = executionStatistics.executionAggregate.suiteContexts[testContext.suiteContextId];
                        const sessionContexts = [];
                        methodContext.sessionContextIds.forEach(value => {
                            sessionContexts.push(executionStatistics.executionAggregate.sessionContexts[value]);
                        })
                        return {
                            executionStatistics: executionStatistics,
                            methodContext: methodContext,
                            classStatistics: classStatistic,
                            testContext: testContext,
                            suiteContext: suiteContext,
                            numDetails: (methodContext.errorContext ? 1 : 0) + (methodContext.customContextJson ? 1 : 0),
                            sessionContexts: sessionContexts,
                            failedStep: (methodContext.failedStepIndex >= 0 ? methodContext.testSteps[methodContext.failedStepIndex] : null),
                        }
                    }
                }
            });
        });
    }

    getScreenshotsFromMethodContext(methodContext:IMethodContext) {
        const screenshots:IFile[] = [];
        const allFilePromises = [];
        methodContext.testSteps
            .flatMap(value => value.actions)
            .flatMap(value => value.entries)
            .forEach(value => {
                if (value.screenshotId) {
                    allFilePromises.push(this._dataLoader.getFile(value.screenshotId).then(file => {
                        file.relativePath = this._config.correctRelativePath(file.relativePath);
                        screenshots.push(file);
                    }));
                }
            })
        return Promise.all(allFilePromises).then(()=>screenshots);
    }
}

