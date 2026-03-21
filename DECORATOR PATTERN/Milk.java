public class Milk extends Condiments {
    Beverage bev;
    public Milk(Beverage bev) {
        this.bev = bev;
    }    
    public String getDescription() {
        return bev.getDescription() + "Milk";
    }
    public double getCost() {
        return bev.getCost() + 0.05;
    }
}
