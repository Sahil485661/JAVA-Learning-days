package REcursion;

public class numberPrint {
    public static void number(int n ){
        if(n==0){
            return;
        }
        number(n-1);
        if (n!= 0) {
           System.out.println(n); 
        }
        
    }
    public static void main(String args[]){
        int a = 20783;
        number(a);
    }
}
