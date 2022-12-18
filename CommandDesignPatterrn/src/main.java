public class main {
    public static void main(String []args){
        RemoteControl remote=new RemoteControl();
        Light light=new Light();
        GarageDoor garageDoor=new GarageDoor();
        Kitchen kitchen=new Kitchen();
        LightOnCommand lightOnCommand=new LightOnCommand(light);
        LightOffCommand lightOffCommand=new LightOffCommand(light);
        OpenGarageCommand openGarageCommand=new OpenGarageCommand(garageDoor);
        CloseGarageCommand closeGarageCommand=new CloseGarageCommand(garageDoor);
        KitchenOnCommand kitchenOnCommand=new KitchenOnCommand(kitchen);
        KitchenOffCommand kitchenOffCommand=new KitchenOffCommand(kitchen);
        remote.setCommand(0,lightOnCommand,lightOffCommand);
        remote.setCommand(1,openGarageCommand,closeGarageCommand);

        remote.setCommand(2,kitchenOnCommand,kitchenOffCommand);
        /*
        remote.setCommand(2,()->kitchen.on(),()->kitchen.off());
        //lets try lambda expression (you can check it in pg 216 head first design patterns)
        //it works really well and we can skip creating all those concrete command objects
        //wow
        //note we can use lambda expression in cas that the command interface has only one abstract method
        //if it has more the lambda shorthand won't work
        */
        remote.onButtonWasPushed(0);
        remote.onButtonWasPushed(1);
        remote.undoButtonWasPushed();
        remote.onButtonWasPushed(2);
        remote.offButtonWasPushed(0);
        remote.offButtonWasPushed(1);
        remote.offButtonWasPushed(2);
    }
}
