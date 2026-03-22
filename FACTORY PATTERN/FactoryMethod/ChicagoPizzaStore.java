public class ChicagoPizzaStore extends PizzaStore{
    public Pizza createPizza(String type) {
        if(type == "Cheese") {
            return new CCP();
        }
        if(type == "Pepporoni") {
            return new CPP();
        }
        if(type == "ButterChicken") {
            return new CBC();
        }
        return null;
    }
    
    
}
