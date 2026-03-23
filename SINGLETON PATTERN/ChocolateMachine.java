//eager leads to unecessary resouces consumption even though i dont need the instance;
//lazy loading is overhead.
public class ChocolateMachine {
    private boolean boiled, empty;  
    private volatile static ChocolateMachine machine;
    private ChocolateMachine() {
        empty = true;
        boiled = false;
    } 
    public static ChocolateMachine makeMachine() {
        if(machine == null) {
            synchronized(ChocolateMachine.class) {
                if(machine == null) {
                    return machine = new ChocolateMachine();
                }
            }
        }
        return machine;
    }
    public void fillUp() {
        if(!boiled && empty) {
            empty = false;
            boiled = false;
        }
    }
    public void drain() {
        if(boiled && !empty) {
            empty = true;
        }
    }
    public void boil() {
        if(!boiled && !empty) {
            boiled = true;
        }
    }
}
