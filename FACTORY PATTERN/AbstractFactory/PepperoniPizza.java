public class PepperoniPizza extends Pizza{
    public PepperoniPizza(IngredientFactory factory) {
        this.factory = factory;
        this.describe();
        System.out.println("Pepporoni Pizza with ");
    }
}
