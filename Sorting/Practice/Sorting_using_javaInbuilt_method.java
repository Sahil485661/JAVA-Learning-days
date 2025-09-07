package Sorting.Practice;

import java.util.Arrays;

public class Sorting_using_javaInbuilt_method {
    public static void main(String args[]){
        int arr[] = {3,6,3,1,6,7};
        // Arrays.sort(arr); EK baar me ek hi valid hota hai
        Arrays.sort(arr,1,5);   //jaise yaha agar isko comment kar de,
        // toh upar wala comment se bahar kar denge
        System.out.println(Arrays.toString(arr));

    }
}
