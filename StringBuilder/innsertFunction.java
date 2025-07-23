package StringBuilder;

public class innsertFunction {
    public static void main(String args[]){
        StringBuilder word = new StringBuilder("Sahil");
        word.insert(0,"Hello " );
        word.insert(11, " Welcome to our company as a software developer.");
        System.out.print(word);
    }
}
