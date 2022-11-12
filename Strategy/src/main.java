import java.util.*;
public class main {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        Duck d1=new MilladDuck();
        d1.performFly();
        d1.performQuack();
        d1.SetFlyBehavoir(new FlyNoWay());
        d1.performFly();
    }
}
