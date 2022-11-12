public class WoodenDuck extends Duck{
    public WoodenDuck() {
        flyBehaior=new FlyNoWay();
        quackBehavior=new MuteQuack();
    }
}
