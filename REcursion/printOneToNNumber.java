package REcursion;

public class printOneToNNumber {
    public static void incr(int a){
        if(a == 1){
            System.out.println(a);
            return;
        }
        incr(a-1);
        System.out.println(a);
    }

public static void main(String args[]){
    int a = 10;
    incr(a);
}
}