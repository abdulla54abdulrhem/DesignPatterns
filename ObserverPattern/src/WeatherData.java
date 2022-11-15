import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Subject{

    private List<Observer>observers;
    private float temp,humidity,pressure;
    public WeatherData(){
        observers= new ArrayList<Observer>();
    }
    public void registerObserver(Observer o){
        observers.add(o);
    }
    public void removeObserver(Observer o){
        observers.remove(o);
    }
    public void notifyObservers(){
        for(Observer ob:observers){
            ob.updata(temp,humidity,pressure);
        }
    }
    public void measurmentChanged(){
        notifyObservers();
    }
    public void setMeasurments(float temp,float humidity,float pressure){
        this.temp=temp;
        this.humidity=humidity;
        this.pressure=pressure;
        measurmentChanged();
    }
}
