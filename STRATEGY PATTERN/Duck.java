public abstract class Duck {
    Quackable quackType;
    Flyable flyType;
    public abstract void displayItem();
    public void performFly() {
        flyType.fly(); 
    } 
    public void performQuack() {
        quackType.quack();
    }
};