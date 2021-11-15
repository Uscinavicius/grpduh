import ChartBars from "./ChartBars";
import "../../style/Chart.css";

const Chart = (props) => {
  const dataPointValues = props.dataPoints.map(dataPoint => dataPoint.value);
  const totalMaximum = Math.max(...dataPointValues);

  return (
    <div className="chart">
      {props.dataPoints.map((dataPoints) => (
        <ChartBars
          key={dataPoints.key}
          value={dataPoints.value}
          maxValue={totalMaximum}
          label={dataPoints.label}
        />
      ))}
    </div>
  );
};

export default Chart;
