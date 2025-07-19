package Array;

public class array_is_sorted_or_not {
    public static void main(String args[]){
        int number[] = {12,23,11,43,26,48};
        boolean check = true;
        for(int i = 0; i<number.length-1;i++){
            if(number[i]>number[i+1]){          //“Sorted hai” dikhane ke liye, hume sirf ye prove karna hota hai ki kahin bhi sorted nahi toota hai.”
                check = false;
                break;
            }
        }
        if(check == true){
            System.out.print("The array is in Assending order");
        }
        else{
            System.out.print("The Array is not in assending order");
        }
    }
}
