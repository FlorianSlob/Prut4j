package nl.florianslob.model.checking.sandbox.protocolimplementations;

public class Chess {

    public static void play() {
        IProtocol protocol = new ChessProtocol();

        new Thread(() -> {
            try {
                runWhite(protocol.getEnvironment("W"));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }).start();

        new Thread(() -> {
            try {
                runBlack(protocol.getEnvironment("B"));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }).start();
    }
    public static  void runWhite(IEnvironment environment) throws Exception {
        Board board = new Board("White");
        while(!board.isFinal()){
            if(!board.isInitial()){

                Move mBlack = (Move) environment.receive();
                board.update(mBlack);
                board.print();
                if (board.isFinal()) break;
            }


            Move mWhite = new Move();
            board.update(mWhite);
            board.print();
            environment.send(mWhite);
        }
    }

    public static  void runBlack(IEnvironment environment) throws Exception {
        Board board = new Board("Black");
        while(!board.isFinal()){

            Move mWhite = (Move) environment.receive();
            board.update(mWhite);
            if (board.isFinal()) break;

            board.print();
            Move mBlack = new Move();
            board.update(mBlack);
            board.print();
            environment.send(mBlack);
        }

    }
}
