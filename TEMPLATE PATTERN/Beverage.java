public abstract class Beverage {
    final void prepare() {
        boil();
        brew();
        pour();
        if(wantCondiments())
            addCondiments();
    } 

    public void boil() {
        System.out.println("Boiling water");
    }
    public void pour() {
        System.out.println("Pouring water into cup");
    }
    public boolean wantCondiments() {
        return true;
    }
    public abstract void brew();
    public abstract void addCondiments();
}
