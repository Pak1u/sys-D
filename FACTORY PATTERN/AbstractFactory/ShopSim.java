public class ShopSim {
    public static void main(String[] args) {
        NYIgFactory n1 = new NYIgFactory();
        ChicagoIgFactory c1 = new ChicagoIgFactory();
        PepperoniPizza pp1 = new PepperoniPizza(n1);
        pp1.details();
        PepperoniPizza pp2 = new PepperoniPizza(c1);
        pp2.details(); 
    }
}
