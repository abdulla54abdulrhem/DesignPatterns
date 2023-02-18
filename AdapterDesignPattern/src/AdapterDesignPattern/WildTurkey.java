package AdapterDesignPattern;

public class WildTurkey implements Turkey{
    public WildTurkey()
    {

    }
    public void gobble()
    {
        System.out.println("Gobble Gobble");
    }
    public void fly()
    {
        System.out.println("Wild Turkey is flying");
    }
}
