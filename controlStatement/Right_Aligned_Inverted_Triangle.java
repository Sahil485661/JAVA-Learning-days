package controlStatement;

public class Right_Aligned_Inverted_Triangle {
    public static void main(String[] args){
        int a = 5;
        for(int i = 1; i<= 5; i++){
            for(int j = 1; j<= i; j++){
                System.out.print(" ");
            }
            for(int k = 1; k <= a-i; k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
