package REcursion;

public class numberPrint {
    public static void number(int n ){
        if(6==n){
            return;
        }
        System.out.println(n);
        number(n+1);
    }
    public static void main(String args[]){
        int a = 1;
        number(a);
    }
}
