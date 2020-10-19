// @ts-ignore
import './dashboard.scss';
import {data} from "../../services/report-model";
import {autoinject} from "aurelia-framework";
import {StatusConverter} from "../../services/status-converter";
import {StatisticsGenerator} from "../../services/statistics-generator";
import {ClassStatistics, ExecutionStatistics} from "../../services/statistic-models";
import moment, {Duration} from 'moment';
import IExecutionContext = data.IExecutionContext;
import ResultStatusType = data.ResultStatusType;


@autoinject()
export class Dashboard {
  private _apexPieOptions: any = undefined;
  private _apexBarOptions: any = undefined;
  private _testDuration: Duration = moment.duration(0);

  _executionContext: IExecutionContext;
  private _executionStatistics: ExecutionStatistics;
  //private _classStatistics:ClassStatistics[] = [];

  constructor(
    private _statusConverter: StatusConverter,
    private _statisticsGenerator: StatisticsGenerator,
  ) {
  }

  attached() {
    this._statisticsGenerator.getExecutionStatistics().then(executionStatistics => {
      this._executionStatistics = executionStatistics;
      this._executionContext = executionStatistics.executionAggregate.executionContext;
      this._testDuration = moment.duration(<number>this._executionContext.contextValues.endTime - <number>this._executionContext.contextValues.startTime);

      this._preparePieChart(executionStatistics);
      this._prepareHorizontalBarChart(executionStatistics.classStatistics);
    })
  }

  private _preparePieChart(executionStatistics:ExecutionStatistics): void {
    this._apexPieOptions = {
      chart: {
        type: 'donut',
        width: '400px'
      },
      series: [executionStatistics.overallPassed, executionStatistics.overallFailed, executionStatistics.overallSkipped],
      labels: ["passed", "failed", "skipped"],
      colors:[this._statusConverter.colorFor(ResultStatusType.PASSED),
              this._statusConverter.colorFor(ResultStatusType.FAILED),
              this._statusConverter.colorFor(ResultStatusType.SKIPPED)]
    }
  }

  private _prepareHorizontalBarChart(classStatistics):void{
    let data: Map<string, Array<number>> = new Map();
    let xlabels: Array<string> = [];
    let displayedStatuses: Array<string> = ["passed", "failed", "skipped"];

    displayedStatuses.forEach (status => {
      data.set(status, []);
    })

    console.log(classStatistics);
    classStatistics.forEach(classStats => {
      //const classStatisticsValues = StatisticsValues.create();

      /*if (classStats) {
        classStats.forEach(statisticsValue => {
          console.log(statisticsValue)
          //classesStatisticsValues.addStatisticsValue(statisticsValue);
        });
      }*/

      displayedStatuses.forEach(status => {
        console.log("");
        //data.get(status).push(classesStatisticsValues[status]);
      });

      xlabels.push(classStats.classAggregate.classContext.fullClassName);
    });

    if (xlabels.length < 10) {
      for (let i = xlabels.length; i <= 10; i++) {
        xlabels[i] = "";
        displayedStatuses.forEach(status => {
          data.get(status)[i] = 0;
        })
      }
    }


    this._apexBarOptions = {
      chart: {
        type: 'bar',
        stacked:true
      },
      series: [{
        name: "Passed",
        data: [5, 2, 0, 0, 0, 0]
      } , {
        name: "Failed",
        data: [3, 1, 0, 0, 0, 0]
      } , {
        name: "Skipped",
        data: [1, 5, 0, 0, 0, 0]
      }
      ],
      labels: ["passed", "failed", "skipped"],
      colors:[
        this._statusConverter.colorFor(ResultStatusType.PASSED),
        this._statusConverter.colorFor(ResultStatusType.FAILED),
        this._statusConverter.colorFor(ResultStatusType.SKIPPED)
      ],
      xaxis: {
        categories: xlabels
      },
      yaxis: {
        title: {
          text: undefined
        },
      },
      tooltip: {
        y: {
          formatter: function (val) {
            return val
          }
        }
      },
      plotOptions:{
        bar: {
          horizontal: true,
        }
      },
      noData: {
        text: "There is no data available at the moment. Please be patient!"
      },
      fill: {
        opacity: 1,
      },
      dataLabels:{
        enable:false,
      },
      legend: {
        position: 'top',
        horizontalAlign: 'left',
        offsetX: 40
      }
    }
  }
}
