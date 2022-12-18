public class KitchenOnCommand implements Command{
    Kitchen kitchen;
    public KitchenOnCommand(Kitchen kitchen){
        this.kitchen=kitchen;
    }
    public void execute(){
        kitchen.on();
    }
    public void undo(){
        kitchen.off();
    }
}
