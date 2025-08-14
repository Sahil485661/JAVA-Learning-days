package Array;

public class Array_in_function {
    public static void fun(int arr[], int non_changable){
        non_changable = 10;  //Non-changing variable is changed inside the function
        for(int i = 0; i<arr.length; i++){
             arr[i] = arr[i] + 1;
        }
    }
    public static void main(String args[]){
        int arr [] = {3,53,5,2,2};      //Arrays are passed as reference in Java
        int non_changable = 5;          //Non changing variable is passed by value
        fun(arr, non_changable);
        for(int i = 0; i<arr.length; i++){
            System.out.println(arr[i] + " ");
         }
         System.out.println();
         System.out.println(non_changable);
    }
    
}
//output is 4 54 6 3 3 5 2 2 2
// 5 (non-changing variable)
