// In this we use Stair case matrix here we search element upper right side column matrix[0].length
// se isme hum check karte hai ki key yadi cell value se badi hai toh  hum bottom move honge 
// aur yadi cell value badi hogi toh left move honnge rough me bhi hai 
// Time Complexity: O(n+m)
// Issi question ka ek aaur code hai jisme yahi method left bottom se chalate hai 
package Twod_Array;

public class Search_Keyin_sorted_Matrix {
    public static boolean search(int matrix[][], int key){
        int row = 0;
        int col = matrix[0].length-1;
        while(row < matrix.length && col >= 0){
            if(key == matrix[row][col]){
                System.out.print("Found the target [" +row +"," +col +"]");
                return true;
            }
            else if(key < matrix[row][col]){
                col--;
            }
            else{       //(key > matrix[row][col])
                row++;
            }
        }
        System.out.println("Key was not available in this matrix");
        return false;
    }
    public static void main(String args[]){
        int matrix[][] =  {{10,20,30,40},
                            {15,25,35,45},
                            {27,29,37,48},
                            {32,33,39,50}};
        int key = 32;
        search(matrix, key);

    }
}
