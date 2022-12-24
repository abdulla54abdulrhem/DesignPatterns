
public class MenuItem extends MenuComponent{
    String name,description;
    Boolean vegeterian;
    double price;
    public MenuItem(String name, Boolean vegeterian, double price){
        this.name=name;
        this.description=description;
        this.vegeterian=vegeterian;
        this.price=price;
    }
    //now we override the methods we need to use from the abstract base class we inherit from
    public String getName(){
        return this.name;
    }
    public String getDescriptionn(){
        return this.description;
    }
    public double getPrice(){
        return this.price;
    }
    public boolean isVegeterian(){
        return this.vegeterian;
    }
    public void print(){
        System.out.print(" "+getName());
        if (isVegeterian()){
            System.out.print(" (v) ");
        }
        System.out.println(" "+getPrice());
        System.out.println("---------"+getDescriptionn());
    }
}
