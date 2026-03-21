public class Cream extends Condiments {
    Beverage bev;
    public Cream(Beverage bev) {
        this.bev = bev;
    }    
    public String getDescription() {
        return bev.getDescription() + "Cream";
    }
    public double getCost() {
        return bev.getCost() + 0.19;
    }
}
