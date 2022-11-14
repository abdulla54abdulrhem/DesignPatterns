import java.awt.*;
import java.util.ArrayList;
import java.util.*;
import java.util.List;

public abstract class Pizza {
    public Pizza(){}
    String name;
    String dough;
    String sauce;
    List <String> toppings = new ArrayList<String>();
    void prepare(){
        System.out.println("Preparing "+name);
        System.out.println("Tossing dough "+dough);
        System.out.println("Adding sause: "+sauce);
        System.out.println("Adding toppings: ");
        for(String topping:toppings){
            System.out.print("   "+topping);
        }
    }
    void bake(){
        System.out.println("Bake for 25 min at 350c");
    }
    void cut(){
        System.out.println("Cutting pizza");
    }
    void box(){
        System.out.println("Putting to box");
    }
    public String getName(){
        return this.name;
    }
}
