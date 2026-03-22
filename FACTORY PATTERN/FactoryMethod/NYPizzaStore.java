public class NYPizzaStore extends PizzaStore{
    public Pizza createPizza(String type) {
        if(type == "Cheese") {
            return new NYCP();
        }
        if(type == "Pepporoni") {
            return new NYPP();
        }
        if(type == "ButterChicken") {
            return new NYBC();
        }
        return null;
    }
    
    
}
