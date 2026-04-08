import java.util.*;

public class Coffee extends Beverage {
    public void brew() {
        System.out.println("Brewing Coffee beans");
    }
    public void addCondiments() {
        System.out.println("Adding milk and sugar");
    }
    public boolean wantCondiments() {
        String getReply = ip(); 
        if(getReply.startsWith("y")) {
            return true;
        }
        return false;
    }
    private String ip() {
        System.out.println("Do u want milk and sugar?");
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        if(a == null) {
            return "no";
        }
        return a;
    }
}
