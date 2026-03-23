public class RemoteSimulation {
    public static void main(String[] args) {

        Remote r = new Remote();

        Light l1 = new Light();
        Fan f1 = new Fan();

        r.commands.set(0, new LightOnCommand(l1));
        r.commands.set(1, new LightOffCommand(l1));
        r.commands.set(2, new FanOnCommand(f1));
        r.commands.set(3, new FanDecSpeed(f1));

        r.OnButtonPress(2);
        r.OnButtonPress(0);
        r.OnButtonPress(3);
        r.OnButtonPress(3);
        r.OnButtonPress(4);
        r.OnButtonPress(4);
    }
}