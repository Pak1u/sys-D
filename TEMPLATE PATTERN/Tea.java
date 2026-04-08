import java.util.*;

public class Tea extends Beverage {
    public void brew() {
        System.out.println("Adding tea leaves");
    }
    public void addCondiments() {
        System.out.println("Adding lemon juice");
    }
    public boolean wantCondiments() {
        String getReply = ip(); 
        if(getReply.startsWith("y")) {
            return true;
        }
        return false;
    }
    private String ip() {
        System.out.println("Do u want lemon?");
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        if(a == null) {
            return "no";
        }
        return a;
    }
}
