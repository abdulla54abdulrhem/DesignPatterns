import java.util.*;
import java.util.ArrayList;
public class main {
    public static void main(String []args){
       PizzaStore p1=new NYPizzaStore();
       p1.orderPizza();
       PizzaStore p2=new ChicagePizzaStore();
       p2.orderPizza();
    }
}
