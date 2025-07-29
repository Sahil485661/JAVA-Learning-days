package Sorting;

public class insertionSort {
    public static void main(String args[]){
    int a [] = {13,12,43,5,22};
    int temp,j;
    for(int i = 1; i<a.length;i++){
        temp = a[i];
        j = i;
        while(j>0 && a[i-1]>temp){
            a[j] = a [j-1];
            j--;
        }
        a[j] = temp;
    }
    for(int i = 0; i<a.length;i++){
        System.out.print(a[i] +" ");
    }
}
}