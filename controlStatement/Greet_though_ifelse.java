package controlStatement;
import java.util.*;
public class Greet_though_ifelse {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        System.out.println("Press the Button");
        System.out.println("Button 1 for Hello");
        System.out.println("Button 2 for Hi");
        System.out.println("Button 3 for Namaste");
        int Button = sc.nextInt();
    sc.close();
        if(Button == 1) {
            System.out.print("Hello");
        } else if(Button == 2) {
            System.out.print("Hi");
        } else if(Button == 3) {
            System.out.print("Namaste");
        } else {
            System.out.print("Invalid Button Pressed");
        }
    }
}
