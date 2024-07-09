import javafx.scene.chart.AreaChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;

public class MainFormController {

    NumberAxis xAxis = new NumberAxis(1,7,1);
    NumberAxis yAxis = new NumberAxis(10,500,20);
    public AreaChart<Number,Number> chart = new AreaChart<>(xAxis,yAxis);

    public void initialize(){
        xAxis.setLabel("Day");
        yAxis.setLabel("Student Count");
        XYChart.Series javaStudents = new XYChart.Series();
        javaStudents.setName("Java");
        javaStudents.getData().add(new XYChart.Data(1,20));
        javaStudents.getData().add(new XYChart.Data(2,450));
        javaStudents.getData().add(new XYChart.Data(3,250));
        javaStudents.getData().add(new XYChart.Data(4,50));
        javaStudents.getData().add(new XYChart.Data(5,350));
        javaStudents.getData().add(new XYChart.Data(6,150));
        javaStudents.getData().add(new XYChart.Data(7,100));

        XYChart.Series phpStudents = new XYChart.Series();
        phpStudents.setName("Php");
        phpStudents.getData().add(new XYChart.Data(1,40));
        phpStudents.getData().add(new XYChart.Data(2,450));
        phpStudents.getData().add(new XYChart.Data(3,500));
        phpStudents.getData().add(new XYChart.Data(4,120));
        phpStudents.getData().add(new XYChart.Data(5,360));
        phpStudents.getData().add(new XYChart.Data(6,270));
        phpStudents.getData().add(new XYChart.Data(7,200));

        chart.getData().addAll(javaStudents,phpStudents);
    }

}
