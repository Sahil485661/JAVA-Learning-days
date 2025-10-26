// Yaha hume given key ki index value find karna hai
package REcursion;

public class LastOccurence {
    public static int LastOccurenc(int a[], int key, int i){
        if(i < 0){
            return -1;
        }
        if (key == a[i]) {
            return i;
        }
        return LastOccurenc(a, key, i-1);
    }
    public static void main(String[] args) {
        int a[] = {2,4,3,6,7,88,6,7,1,2};
        int key = 7;
        System.out.println(LastOccurenc(a,key, a.length-1));
        System.out.println(lastOccurance(a, key, 0));
    }

    // Another method means isme pahle hum array me index 0- arr.length tak jaayenge and waapa aate
    // time jo mile usko store karn lena hai simple
    public static int lastOccurance(int a[], int key, int i) {
        if(i == a.length){
            return -1;
        }
        int isFound = lastOccurance(a, key, i+1); //Yaha par index aage badhega jab tak  arr.length 
        // tak nahi pahunch jata
        if(isFound != -1){
            return isFound;
        }
        if(key == a[i]){
            return i;
        }
        return -1; //means yadi key value nahi milegi toh -1 return karega
    }
}
