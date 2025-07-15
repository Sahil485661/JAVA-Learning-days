package Function;
import java.util.*;
public class printName {
    public static void Myname(String name){
        System.out.print("MyName is " +name);
        return;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        Myname(name);
        sc.close();
    }
}

/*Output:Sahil Vishwakarma
 * My name is Sahil Vishwakarma
 */