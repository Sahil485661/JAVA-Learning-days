package StringBuilder;

public class AtoZjavaApend {
    public static void main(String args[]){
        StringBuilder alphabet = new StringBuilder("");
        for(char v= 'a'; v<='z'; v++){
            alphabet.append(v);
        }
        System.out.println(alphabet);
    }
}
