public class Milk extends CondimentDecorator{
    public Milk(Beverage beverage){
        this.beverage=beverage;
    }
    public String getDescription()
    {
        return this.beverage.getDescription()+" Milk";
    }
    public double cost(){
        return this.beverage.cost()+0.50;
    }
}
