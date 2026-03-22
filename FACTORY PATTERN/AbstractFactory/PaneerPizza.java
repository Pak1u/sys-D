public class PaneerPizza extends Pizza{
    public PaneerPizza(IngredientFactory factory) {
        this.factory = factory;
        this.describe();
        System.out.println("Paneer Pizza with ");
    }
    
}
