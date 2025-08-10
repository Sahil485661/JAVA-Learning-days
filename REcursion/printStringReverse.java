package REcursion;

public class printStringReverse {
    public static void reverseString(String val, int idx){
        if(idx == 0){
            System.out.println(val.charAt(idx));
            return;
        }
        System.out.print(val.charAt(idx));
        reverseString(val, idx-1);
    }
    public static void main(String args []){
        String val = "sahil Vishwakarma";
        int idx = val.length()-1;
        reverseString(val, idx);
    }
}
