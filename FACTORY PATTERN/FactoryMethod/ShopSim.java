public class ShopSim {
    public static void main(String[] args) {
        NYPizzaStore n1 = new NYPizzaStore();
        Pizza p1 = n1.orderPizza("ButterChicken");
        ChicagoPizzaStore c1 = new ChicagoPizzaStore();
        Pizza p2 = c1.orderPizza("ButterChicken");
        System.out.println("Created " + p1.name + "and"  + p2.name);
    }    
}
