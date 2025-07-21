package String;

import java.util.Scanner;

public class TakingInput {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the name:");;
        String name = sc.nextLine();
        sc.close();
        System.out.println(name);
    }
}
