public class CurrentConditionDisplay implements Observer,Display{
    public CurrentConditionDisplay(){

    }
    private float temp,humidity,pressure;
    public void display(){
        System.out.println("Current Conditions:  Temp: "+temp+" Humidity: "+humidity);
    }
    public void updata(float temp,float humidity,float pressure){
        this.temp=temp;
        this.humidity=humidity;
        display();
    }
}
