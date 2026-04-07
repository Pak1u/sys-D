public class Client {
    public static void main(String[] args) {
        Example e1 = new Example();
        Adapter a = new Adapter(e1);
        a.do1();
        a.do2();
    }
}
