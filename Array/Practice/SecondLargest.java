package Array.Practice;
public class SecondLargest {
    public static int Second(int arr[]){
        int largest = Integer.MIN_VALUE;
        int Slargest = Integer.MIN_VALUE;      //Second Largest
        for(int i = 0; i<arr.length; i++){
            if(arr[i] > largest){
                Slargest = largest;
                largest = arr[i];
            }
            else if(arr[i]< largest && arr[i]> Slargest){
                Slargest = arr[i];
            }    //yaha par hum else nahi le rahe kyunki else me hum condition nahi likh sakte 
        }
        if(Slargest == Integer.MIN_VALUE){
            return -1;
        }
        return Slargest;
    }
    public static void main(String args[]){
        int arr[] = {10,10,10};
        System.out.println("second largest number :" +Second(arr));
    }
}
