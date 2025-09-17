//Que.1 for given set of String, Print the largest String. (apple,banana,mango,jackfruit)
package String.SubString;

public class CompareTo{
    public static void com(String arr[]){
        String largest = arr[0];
        for(int i=0;i<arr.length; i++){
            // Yaha pe logic ye lagate hai ki yadi largest arr[i] se chhota hoga tab hum 
            // largest me arr[i] ki value ko update kar denge. jisse hume value new badi wali
            // mil jaati hai 
            if(largest.compareTo(arr[i])<0){     //yaha compareTo int value return karta hai so iss 
                // liye hum 0 se fir se compare karte hai. aur yadi value negative deta hai 
                // Means largest chhota hai tab hum
                // largest variable ko update kar denge
                largest = arr[i];
            }
        }
        System.out.print("Our Largest String is " +largest);
    }
    public static void main(String args[]){
        String arr[] = {"apple", "mango", "banana", "jackfruit"};
        com(arr);
    }
}
