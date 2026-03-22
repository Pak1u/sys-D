public class ChicagoIgFactory implements IngredientFactory{
   public  Dough createDough() {
        return new PanDough();
    }
    public Sauce createSauce() {
        return new VodkaSauce();
    }
    public Cheese createCheese() {
        return new MozzarellaCheese();
    }
}
