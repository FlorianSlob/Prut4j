package nl.florianslob.model.checking.sandbox.protocolimplementations;

public class Board {

    private String _name;

    public Board(String name){

        _name = name;
    }

    private int moves = 0;

    public boolean isFinal() {
        if(moves> 10){
            return true;
        }
        return false;
    }

    public boolean isInitial() {
        if(moves == 0){
            return true;
        }
        return false;
    }

    public void update(Move newMove) {
        moves ++;
    }

    public void print() {
        System.out.println(_name+" reporting moves done: "+moves);
    }
}
