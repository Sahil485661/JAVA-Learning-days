package StringBuilder;

public class insertFunction {
    public static void main(String args[]){
        StringBuilder word = new StringBuilder("Sahil");
        word.insert(0,"Hello");
        word.insert(5," welcome to our new office " );
        System.out.print(word);
    }
}
