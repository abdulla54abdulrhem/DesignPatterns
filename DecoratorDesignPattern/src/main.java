public class main {
    public static void main(String []args){
        Beverage esspresso=new Esspresso();
        System.out.println(esspresso.getDescription());
        System.out.println(esspresso.cost());
        Beverage mocha=new Mocha(esspresso);
        System.out.println(mocha.getDescription());
        System.out.println(mocha.cost());
        Beverage milk=new Milk(mocha);
        System.out.println(milk.getDescription());
        System.out.print(milk.cost());
    }
}
