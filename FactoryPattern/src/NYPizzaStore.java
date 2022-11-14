public class NYPizzaStore extends PizzaStore{
    public NYPizzaStore(){}
    Pizza createPizza(String pizzaName){
        Pizza p=null;
        if(pizzaName.equals("cheese")){
            p= new NYStyleCheesePizza();
        }
        return p;
    }
}
