public abstract class Pizza {
    Dough dough;
    Sauce sauce;
    Cheese cheese;
    IngredientFactory factory;
    void prepare() {
        System.out.println("Preparing the ingredients");
    }
    void bake() {
        System.out.println("Baking the pizza at 400 degrees");
    }
    void box() {
        System.out.println("Packing the pizza");
    }
    void cut() {
        System.out.println("Cutting as required");
    }
    public void describe() {
        dough = factory.createDough();
        sauce = factory.createSauce();
        cheese = factory.createCheese();
    }
    public void details() {
        prepare();
        bake();
        box();
        cut();
        System.out.println("Final order -> " + dough.getName() + " " + sauce.getName() + " " + cheese.getName());
    }
}
