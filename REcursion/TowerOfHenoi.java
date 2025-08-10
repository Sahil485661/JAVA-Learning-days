package REcursion;

public class TowerOfHenoi {
    static int count = 0; 
    public static void Toi(int n,  String src, String help, String des ){
        if(n == 1){ // that means disk has only one piece so sending one disk from source to destination is easy
            count++;
            System.out.println("the disk " +n +" from " +src +" to " +des);
            return;
        }
        Toi(n-1, src, des, help);
        count++;
        System.out.println("The Disk " +n +" from " +src +" to " +help);
        Toi(n-1, help, src, des);
    }
    public static void main(String args[]){
        int n = 10;
        Toi(n, "S", "H", "D");
        System.out.println("Total Steps Taken for solve this " +n +" disk Tower of Henoi: " +count);
    }
}
