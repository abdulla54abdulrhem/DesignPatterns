import java.util.*;
public class main {
    public static void main(String[] args){
        WeatherData weatherData=new WeatherData();
        Observer currentcondition=new CurrentConditionDisplay();
        Observer forecast=new ForecastDisplay();
        weatherData.registerObserver(currentcondition);
        weatherData.registerObserver(forecast);
        weatherData.setMeasurments(37,1,55);
        weatherData.removeObserver(forecast);
        weatherData.setMeasurments(39,1,55);
    }
}
