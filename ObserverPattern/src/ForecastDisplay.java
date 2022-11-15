public class ForecastDisplay implements Observer,Display {
    public ForecastDisplay(){

    }
    private float temp,humidity,pressure;
    public void display(){
        System.out.println("Forecost:  Temp: "+temp+" Humidity: "+humidity+" Pressure: "+pressure);
    }
    public void updata(float temp,float humidity,float pressure){
        this.temp=temp;
        this.humidity=humidity;
        this.pressure=pressure;
        display();
    }
}
