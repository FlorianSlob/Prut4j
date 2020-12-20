package nl.florianslob.modelchecking.sandbox.protocolimplementations;

public class Board {

    private final String _name;

    public Board(String name){

        _name = name;
    }

    private int moves = 0;

    public boolean isFinal() {
        return moves > 10;
    }

    public boolean isNotInitial() {
        return moves != 0;
    }

    public void update(Move newMove) {
        moves ++;
    }

    public void print() {
        System.out.println(_name+" reporting moves done: "+moves);
    }
}
