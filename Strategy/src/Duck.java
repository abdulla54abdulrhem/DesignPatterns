import java.util.*;
public abstract class Duck {
    FlyBehaior flyBehaior;
    QuackBehavior quackBehavior;
    public Duck() {
    }
    public void performFly() {
        flyBehaior.fly();
    }
    public void performQuack(){
        quackBehavior.quack();
    }
    public void swim() {
            System.out.println("Duck is swimming");
    }
    //these two function so we are able to change the behavoir dynamically
    public void SetFlyBehavoir(FlyBehaior f){
        this.flyBehaior=f;
    }
    public void SetQuackBehavoir(QuackBehavior q){
        this.quackBehavior=q;
    }
}
