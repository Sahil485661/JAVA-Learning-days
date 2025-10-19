// Here we use the Interface
package Class_and_Object;

public class interfaces {
    public static void main(String args[]){
        Queen q = new Queen();
        q.moves();
    }
}
interface ChessPlayer{
    void moves();
}
class Queen implements ChessPlayer {
    public void moves(){
        System.out.println("up,down, left, right, diagonal(in all 4 drims)");
    }
}
class Rook implements ChessPlayer{
    public void moves(){
        System.out.println("up, down, left, right");
    }
}
class King implements ChessPlayer{
    public void moves(){
        System.out.println("up, down, left, right(1 steps only)");
    }
}