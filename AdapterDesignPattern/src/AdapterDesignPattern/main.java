package AdapterDesignPattern;
import java.util.LinkedList;
import java.util.List;
public class main {
    public static void main(String []args)
    {
        WildDuck wildDuck=new WildDuck();
        WildTurkey wildTurkey=new WildTurkey();
        Duck turkeyAdapter = new TurkeyAdapter(wildTurkey);
        List<Duck> ducks= new LinkedList<Duck>();
        ducks.add(wildDuck);
        ducks.add(turkeyAdapter);
        for(Duck d:ducks)
        {
            d.Display();
            d.Fly();
        }
    }
}
