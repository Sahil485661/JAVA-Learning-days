//Find the maximum & minimum number in an array of integers. 

package Array;

public class Find_Mini_max_inArray {
    public static void main(String args[]){
        int number[]={13,34,13,23,12,32,};
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int i = 0; i<number.length;i++){
            if(number[i]>max){
                max = number[i];
            }
            if(number[i]<min){
                min = number[i];
            }
        }
        System.out.println("Max Value in Array is : "+max);
        System.out.println("Mini Value in Array is : "+min);
    }
}
