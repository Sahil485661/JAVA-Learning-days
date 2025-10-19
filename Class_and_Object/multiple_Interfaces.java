// here we use the multiple interfaces means "2 interfaces are implemented in the single class"
package Class_and_Object;

public class multiple_Interfaces {
    public static void main(String[] args) {
        Bear Bhalu = new Bear();
        Bhalu.grass();
        Bear Bha = new Bear();
        Bha.meat();
    }
}
interface herbivore{
    void grass();
}
interface berbivore{
    void meat();
}
class Bear implements herbivore, berbivore{
   public void grass(){
        System.out.println("bear are eating grass.");
    }
   public void meat(){
        System.out.println("This bear is also eat the meat.");
    }
}
