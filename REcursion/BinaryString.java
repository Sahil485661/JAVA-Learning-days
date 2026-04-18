// Print all binary String of size N without consecutive ones.
// consecutive means lagaatar . Lagaatar 1 nahi aane waali binary string banani hai 
// example: 010, 1010, 100, 000, 101, 001, 0101.
// if n=4 than string 0101, 1010, 1000, 1001,0010.
package REcursion;

public class BinaryString {
    public static void binary(int n, int lastPlace, String BinaryValue){
        // Base
        if(n ==0){
            System.out.println(BinaryValue);
            return;
        }
        // Kaam
        if(lastPlace ==0){
            binary(n-1, 0, BinaryValue+"0");
            binary(n-1, 1, BinaryValue+"1");
        }
        else{
            binary(n-1, 0, BinaryValue+"0");
        }
        // binary(n-1, 0, BinaryValue+"0");
        // if(lastPlace == 0){
        //     binary(n-1, 1, BinaryValue+"1");
        // }
    }
    public static void main(String[] args) {
        int n = 2;
        binary(n, 0, "");
    }
}
