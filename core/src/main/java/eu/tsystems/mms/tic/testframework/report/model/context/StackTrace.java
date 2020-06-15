/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * Contributors:
 *     Peter Lehmann
 *     pele
 */
package eu.tsystems.mms.tic.testframework.report.model.context;

import java.util.List;
import java.util.stream.Collectors;

public class StackTrace {

    public static class Cause {

        public String className;
        public String message;
        public List<String> stackTraceElements;
        public Cause cause;

        @Override
        public String toString() {
            String s = className + ": " + message + "\n" + stackTraceElements.stream().collect(Collectors.joining("\n"));
            if (cause != null) {
                s += "\ncaused by: " + cause;
            }
            return s;
        }
    }

    public Cause stackTrace;
    public String additionalErrorMessage;

    @Override
    public String toString() {
        String msg = "";
        if (additionalErrorMessage != null) {
            msg += "(" + additionalErrorMessage + ")\n";
        }
        msg += stackTrace;
        return msg;
    }

    public String getFirstLine() {
        return stackTrace.className + ": " + stackTrace.message;
    }
}
