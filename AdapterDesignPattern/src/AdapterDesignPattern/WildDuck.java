package AdapterDesignPattern;

public class WildDuck implements Duck{
    public WildDuck()
    {

    }
    public void Display()
    {
        System.out.println("Wild duck");
    }
    ///System.out.println('Hello world');
    public void Fly()
    {
        System.out.println("Wild Duck Flies");
    }
}
