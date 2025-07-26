// Get the 3rd bit (Position = 2) of a number n. (number = 0101)
package Bit_Manipulation;

public class getBit {
    public static void main(String args []){
        int n = 5;
        int pos = 2;
        int leftShift = 1<< pos;
        if((leftShift & n) ==0){
            System.out.println("The 3rd bit is zero");
        }
        else{
            System.out.println("The 3rd bit is 1");
        }
    }
}
