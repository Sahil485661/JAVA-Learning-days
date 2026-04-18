package TCS_Practice;

public class Chocalate_Question {
    public static void moveZeroes(int[] arr){
        int j = -1;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == 0){
                j = i;
                break;
            }
        }
        if(j==-1) return;
        for(int i = j+1; i< arr.length; i++){
            if(arr[i] != 0){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
        }
    }
    public static void main(String args[]){
        int arr[]= {-1,42,43,1,3,0,5,0,12,66,};
        moveZeroes(arr);
        for(int num : arr){
            System.out.println(num+ " ");
        }
    }
}
