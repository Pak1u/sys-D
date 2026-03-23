public class FanIncSpeed implements  Command{
    Fan fan;
    public FanIncSpeed(Fan fan) {
        this.fan = fan;
    } 
    public void execute() {
        fan.increaseSpeed();
    }
    public void undo() {
        fan.decreaseSpeed();
    }
}
