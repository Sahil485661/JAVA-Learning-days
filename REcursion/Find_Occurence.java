package REcursion;

public class Find_Occurence {
    public static int Occurence(int a[], int key, int i){
        if(a[i] == key){
            return i;
        }
        if(i == a.length-1 ){
            return -1;
        }
        return Occurence(a, key, i+1);
    }
    public static void main(String[] args) {
        int a[] = {2,4,52,43,22,1,7};
        int key = 7;
        System.out.println(Occurence(a, key, 0));
    }
}
