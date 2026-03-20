public class cuteDuck extends Duck{
    public cuteDuck() {
        quackType = new Quacker();
        flyType = new FlywithRocket();
    }
    public void displayItem() {
        System.out.println("Im a cute Duck");
    }
}; 