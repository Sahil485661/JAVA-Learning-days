package REcursion;

public class FriendsPair {
    public static int pair(int n){
        // base case
        if(n==1 || n==2){
            return n;
        }
        // Single Choice
        int fnm1 = pair(n-1);

        // Pair me friend firstly ho

        int fnm2 = pair(n-2);
        int pairways = (n-1) * fnm2;

        // Total Ways
        int totalWays = fnm1 + pairways;
        return totalWays;
    }
    public static void main(String[] args) {
        int n = 3;
        System.out.println(pair(n));
        System.out.println(friendpair(n));
    }
    // Same Thing in Single Line
    public static int friendpair(int n){
        if(n==1||n==2){
            return n;
        }
        return friendpair(n-1)+ (n-1)*friendpair(n-2);
    }

}
