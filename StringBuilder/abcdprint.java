package StringBuilder;

public class abcdprint {
    public static void main(String args[]){
        StringBuilder alpha = new StringBuilder();
        for(char i = 'a'; i<='z'; i++){
            alpha.append(i);
    }
    System.out.println(alpha);
}
}
