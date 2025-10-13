package Class_and_Object;

public class Method_Overriding {
    public static void main(String[] args) {
        deer  d = new deer();
        d.eat();
    }
}
class Animal{
    void eat(){
        System.out.println("Eats Anything");
    }
}
class deer extends Animal{
    void eat(){
        System.out.println("Eats Grass");
    }
}

