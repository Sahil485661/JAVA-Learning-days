package REcursion;

public class sumOfNnumber {
    public static int sum(int a){
        if(a == 0){
            return 0;
        }
       int sumam1 = sum(a-1); // sumam1 (sum of a minus 1)
       int suma = a+sumam1; //suma (Sum of a)
       return suma;
    }
    public static void main(String args[]){
        int a = 2;
        System.out.println(sum(a));
    }
}
