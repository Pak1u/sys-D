public class Adapter implements SecondInterface{
    FirstInterface f1;

    public Adapter(FirstInterface f1) {
        this.f1 = f1;
    }

    public void do1() {
        f1.display();
    }
    public void do2(){
        f1.end();
    }
    
}
