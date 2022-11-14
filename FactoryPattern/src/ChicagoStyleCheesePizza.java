public class ChicagoStyleCheesePizza extends Pizza{
    public ChicagoStyleCheesePizza(){
        name="Chicaga Sytle Cheese Pizza";
        dough="Extra Thick crust dough";
        sauce="Plum Tomato Sauce";
        toppings.add("Shredded Mozzarella Cheese");
    }
    void cut(){
        System.out.println("Cut into squares");
    }
}
