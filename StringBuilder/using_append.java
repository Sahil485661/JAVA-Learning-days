//StringBUilder is class which is can insert any word sentence and also insert any sentence it has opertation like insert, delete, append etc.
//append means end me word add karna. isme memory me change nahi hota hai yadi string bana bana ke yadi word bnate hai toh memory connsumption badh jaayega
package StringBuilder;

public class using_append {
    public static void main(String args []){
        StringBuilder Sentence = new StringBuilder("RAJA BABU");
        Sentence.append(" Raju");
        Sentence.append( " says India is best country");     //isme bh hum value insert hi karte hai but isme hum next word bas daal sakte hai beech me kahi word nahi apppned kar sakte hai
        System.out.print(Sentence);
    }
}
