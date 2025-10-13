// Here we cannot create abstract class object
package Class_and_Object;

public class abstracts {
    public static void main(String args[]){
      Horse h = new Horse();
      h.eat();
      h.walk(); 
      Dog Sheru = new Dog();
      Sheru.eat();
      Sheru.walk(); 
    }
}
abstract class Animal{
    void eat(){
        System.out.println("Eats");
    }
    abstract void walk();
}
class Horse extends Animal{
    void walk(){
        System.out.println("Horse is walk on four Leg");
    }
}
class Dog extends Animal{
    void walk(){
        System.out.println("Dog is also  walked in four leg");
    }
}
