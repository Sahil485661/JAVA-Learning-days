package Class_and_Object;

public class Basicclass {
    public static void main(String args[]){
        Pen p1 = new Pen(); //Created a pen object 
        p1.setcolor("pink");       //Function calling
        System.out.println(p1.color);
        p1.settip(03);     // Function calling
        System.out.println(p1.tip);
        p1.color = "yellow";        //Here we called variable
        System.out.println(p1.color);
    }
}
   class Pen{
    int tip;
    String color;
    void setcolor(String newcolor){
        color = newcolor;
    }
    void settip(int newtip){
        tip = newtip;
    }
}
