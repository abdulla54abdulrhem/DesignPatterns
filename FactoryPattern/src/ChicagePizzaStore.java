public class ChicagePizzaStore extends PizzaStore{
    public ChicagePizzaStore(){
    }

    Pizza createPizza(String pizzaName) {
        Pizza p=null;
        if(pizzaName.equals("cheese")){
            p=new ChicagoStyleCheesePizza();
        }
        return p;
    }
}
