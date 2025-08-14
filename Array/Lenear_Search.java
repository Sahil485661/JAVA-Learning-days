package Array;

public class Lenear_Search {
    public static void main(String args[]){
    int arr[] = {43,54,22,76,3,5,73,12};
    int target = 10;
    boolean check = false;
    for(int i = 0; i < arr.length; i++){
        if(target == arr[i]){
            System.out.print("In " +i +" Index your variable is stored");
            check = false;
            break;
        }
        else{
            check = true;
            continue;
        }
    }
    if (check == true ){
        System.out.println("Your Targeted value is not found.");
    }
}
}
