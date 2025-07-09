package controlStatement;
import java.util.*;
public class use_switch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Press the Button:");
        int Button = sc.nextInt();
        sc.close();
        switch(Button) {
            case 1:
            System.out.print("Hey");
            break;
            case 2:
            System.out.print("hello");
            break;
            case 3:
            System.out.print("Namaste");
            break;
            default:
            System.out.print("Invalid Button code");
            break;
        }
    }
}
