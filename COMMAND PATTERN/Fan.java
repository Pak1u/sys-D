public class Fan {
    public int speed = 2;
    void on() {
        System.out.println("Fan is running now at speed "+ speed);
    }
    void increaseSpeed() {
        if(speed == 3) {
            System.out.println("Fan max speed");
            return;
        }
        System.out.println("Fan speed increased !");
        speed++;
    }
    void off() {
        System.out.println("Fan off");
    }
    void decreaseSpeed() {
        if(speed <= 1) {
            off();
            return;
        }
        System.out.println("Fan speed Decreased");
        speed--;
    }
}
