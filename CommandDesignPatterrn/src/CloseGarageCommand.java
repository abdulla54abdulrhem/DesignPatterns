public class CloseGarageCommand implements Command{
    GarageDoor g;
    public CloseGarageCommand(GarageDoor g){
        this.g=g;
    }
    public void execute(){
        g.off();
    }
    public void undo(){
        g.off();
    }
}
