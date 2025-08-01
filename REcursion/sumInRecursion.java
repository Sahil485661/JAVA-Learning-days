package REcursion;

public class sumInRecursion {
    public static void sum(int n, int i, int add){
        if(i == n){
            add = add + i;
            System.out.println(add);
            return;
        }
        add =  add + i;
        sum(n,i+1,add);
        System.out.println(i);      //in this line our recursion is returning to main and our code is print i from 9 to 1
    }
    public static void main(String args[]){
        int n = 10;
        int i = 1;
        int add = 0;
        sum(n, i, add);
    }
}
