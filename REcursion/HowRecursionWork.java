// Recursion is working like this means they are calling again and again. It is creating also a stack call
// Where these call are stored in stack form after completing all calls they are returning and wiping
// all stack call one by one from memory
// Analogy:Soch tu ek stack mein plates rakh raha hai (function calls). Tu sabse upar wali plate 
// (last call) se kaam shuru karta hai. Jaise hi kaam ho jaata hai, tu plate hata deta hai 
// (stack pop). Sabse neeche wali plate (first call) tab tak wait karti hai jab tak sab upar wali
//  plates hata di jaayein.
package REcursion;

public class HowRecursionWork {
    public static void main(String[] args) {
        message();
    }
    public static void message() {
        System.out.println("Here call message ");
        message2();
    }
    public static void message2() {
        System.out.println("Here call message2 ");
        message3();
    }
    public static void message3() {
        System.out.println("Here call message3 ");
        message4();
    }
    public static void message4() {
        System.out.println("Here call message4 ");
        message5();
    }
    public static void message5() {
        System.out.println("Here call message5 ");
    }
}
