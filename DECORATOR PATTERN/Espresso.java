public class Espresso extends Beverage {
    public Espresso() {
        description = "Espresso";
    }
    public double getCost() {
        return cost + 0.99;
    }
}
