package Sorting;

public class SelectionSort {
    public static void main(String args[]){
    int array[] = {4,2,5,21,5,6,2};
    for(int i = 0; i<array.length;i++){
        System.out.print(array[i] +" ");
    }
    System.out.println();
    for(int i  = 0; i<array.length-1;i++){
        int small = i;
        for(int j  = i+1; j<array.length;j++){
            if(array[j]<array[small]){
                small = j;
            }
        }
        int temp = array[small];
        array[small] = array[i];
        array[i] = temp;
    }
    for(int i = 0; i< array.length;i++){
        System.out.print(array[i] +" ");
    }
}
}
