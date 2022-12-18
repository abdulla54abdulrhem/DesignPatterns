public class OpenGarageCommand implements Command{
    GarageDoor garageDoor;
    public OpenGarageCommand(GarageDoor g){
        this.garageDoor=g;
    }
    public void execute(){
        garageDoor.on();
    }
    public void undo(){
        garageDoor.off();
    }
}
