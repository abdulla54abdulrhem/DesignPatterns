package AdapterDesignPattern;

public class TurkeyAdapter implements Duck{
    private Turkey turkey;
    public TurkeyAdapter(Turkey turkey)
    {
        this.turkey=turkey;
    }
    public void Display()
    {
        this.turkey.gobble();
    }
    public void Fly()
    {
        this.turkey.fly();
    }
}
