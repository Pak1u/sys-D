public class CoffeeShop {
    public static void main(String[] args) {
        Beverage b1 = new HouseBrew();
        b1 = new Mocha(b1);
        b1 = new Mocha(b1);
        b1 = new Cream(b1);
        System.out.println("Desc = " + b1.getDescription() + "Cost = " + b1.getCost());
    }
}
