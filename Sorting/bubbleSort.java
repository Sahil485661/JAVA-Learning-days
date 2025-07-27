// this code is created for taking the array element from user and after that
// sort the array and print it as output. 
package Sorting;
import java.util.*;
public class bubbleSort {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num[] = new int[5];
        for(int i = 0; i<num.length;i++){
            num[i] = sc.nextInt();
        }
        sc.close();
        System.out.println("The given array is:");
        for(int i = 0; i<num.length;i++)       //this looop is use to print the array before sorting
        {
             System.out.print(num[i] +" ");
        }
        System.out.println();
        for (int i = 0; i<num.length-1;i++)         //this loop is run from 0 to n-1 that means 0 to 3 that is 4 indexes. Because 5th autometic sort ho jayega
        {                                           
            for(int j = 0 ; j<num.length-i-1;j++){  // 🔄Inner loop: har pass mein adjacent elements compare karte hain
            // num.length - i - 1 tak chalta hai kyunki har pass ke baad last i elements sorted ho jaate hain
                if(num[j]>num[j+1]){
                    int temp = num[j];
                    num[j] = num[j+1];
                    num[j+1] = temp;
                }
            }
        }
        System.out.println("Final Sorted Array is:");
        for(int i = 0; i<num.length; i++){
            System.out.print(num[i] +" ");      //this is print the array after sorting
        }
}
}
// yaha  par main logic me loop ke ander loop hai that means iski time complexity O[n^2]