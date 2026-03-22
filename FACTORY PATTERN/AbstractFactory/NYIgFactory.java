public class NYIgFactory implements IngredientFactory {
    public Dough createDough() {
        return new HandDough();
    }

    public Sauce createSauce() {
        return new MarinaraSauce();
    }

    public Cheese createCheese() {
        return new ParmCheese();
    }
}