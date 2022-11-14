import java.util.Scanner;
import java.util.*;
public abstract class PizzaStore {
    public PizzaStore(){

    }
    abstract Pizza createPizza(String pizzaName);
    void orderPizza(){
        String pizzaName=getPizzaName();
        Pizza pizza=createPizza(pizzaName);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
    }
    String getPizzaName(){
        Scanner sc=new Scanner(System.in);
        String pizzaName=sc.next();
        return pizzaName;
    }
}
