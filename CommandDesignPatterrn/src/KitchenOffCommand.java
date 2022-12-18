public class KitchenOffCommand implements Command{
    Kitchen kitchen;
    public KitchenOffCommand(Kitchen kitchen){
        this.kitchen=kitchen;
    }
    public void execute(){
        kitchen.off();
    }
    public void undo(){
        kitchen.on();
    }
}
