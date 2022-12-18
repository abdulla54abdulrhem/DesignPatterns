public class NoCommand implements Command{
    /*
        we made this command to avoid checking if the command is null before execute or not
        we will always have some command to call in each slot
        nocommand object is an example of null object

     */
    public NoCommand(){}
    public void execute(){
        //do nothing
    }
    public void undo(){
        //do nothing
    }
}
