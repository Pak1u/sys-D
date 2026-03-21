public class HouseBrew extends Beverage {
    public HouseBrew() {
        description = "HouseBrew";
    }
    public double getCost() {
        return cost + 1.50;
    }
}
