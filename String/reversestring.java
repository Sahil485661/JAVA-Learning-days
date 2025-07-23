package String;

public class reversestring {
    public static void main(String args[]){
        String name = "BaalChandra";
        String reverse = "";
        for(int i = name.length()-1;  i>=0;i--){
            reverse = reverse+name.charAt(i);
        }
        System.out.println(name);
        System.out.print("Reverse is:" +reverse);
    }
}
