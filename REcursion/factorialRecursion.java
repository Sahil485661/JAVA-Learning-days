package REcursion;

public class factorialRecursion {
    public static int fact(int a ){
        if(a == 0){
            return 1;
        }
        int factm1 = fact(a-1); //factmn (factorial a minus 1)
        int facta = a * factm1; // factn (factorial of a)
        return facta;
    }
        public static void main(String args []){
        int n = 5;
        int result = fact(n);
        System.out.println(result);
    }
}
