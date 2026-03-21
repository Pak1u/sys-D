public class Mocha extends Condiments {
    Beverage bev;
    public Mocha(Beverage bev) {
        this.bev = bev;
    }    
    public String getDescription() {
        return bev.getDescription() + "Mocha";
    }
    public double getCost() {
        return bev.getCost() + 0.10;
    }
}
