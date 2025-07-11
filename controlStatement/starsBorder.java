package controlStatement;

public class starsBorder {
    public static void main(String[] args){
        int a = 4;
        int b = 5;
        for(int i = 1; i <= a; i++){
            for(int j = 1; j <= b; j++){
                if(j==a|| j==b|| i==1|| i==4|| j ==1){
                System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    
}
