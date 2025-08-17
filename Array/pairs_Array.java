package Array;

public class pairs_Array {
    public static void main(String args[]){
        int arr[] = {34,2,45,12,43,56,34,11};
        for(int i = 0; i< arr.length -1; i++){
            for(int j = i+1; j< arr.length; j++){
                System.out.print("("+arr[i] +"," +arr[j]+")");
            }
            System.out.println();
        }
    }
}
