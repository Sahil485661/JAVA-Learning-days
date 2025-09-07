package Twod_Array;

public class SecondMethod_of_search_key_in_sorted_metrix {
    public static boolean search(int matrix[][], int key){
        int row = matrix.length-1;
        int col = 0;
        while(row >= 0 && col < matrix[0].length){
            if(key == matrix[row][col]){
                System.out.println("Found Key [" +row +"," +col +"]");
                return true;
            }
            else if(key < matrix[row][col]){
                row--;      //upar jayega
            }
            else{           //key > matrix[row][col]
                col++;      //right jayega
            }
        }
        System.out.println("Here your Key is not found");
        return false;
    }
    public static void main(String args[]){
        int matrix[][] = {{1}};//{{10,20,30,40},
                                //{15,25,35,45},
                                //{27,29,37,48},
                                //{32,33,39,50}};
        int key =  1;
        search(matrix, key);
    }
}
