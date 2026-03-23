public class FanDecSpeed implements  Command{
    Fan fan;
    public FanDecSpeed(Fan fan) {
        this.fan = fan;
    } 
    public void execute() {
        fan.decreaseSpeed();
    }
    public void undo() {
        fan.increaseSpeed();
    }
}
