package nl.florianslob.model.checking.sandbox.protocolimplementations;

import nl.florianslob.model.checking.sandbox.fosterchandy.exceptions.MaxDepthReachedException;

public class SomeNonDeterministicGame {
    public static void play(boolean visualizeProtocolGraph) {
        PlantUmlProtocolWatcher plantUmlProtocolWatcher = new PlantUmlProtocolWatcher();
        IProtocol protocol;
        if (visualizeProtocolGraph) {
            protocol = new NonDeterministicLoopsProtocolWithVisualization(plantUmlProtocolWatcher);
        } else {
            protocol = new NonDeterministicLoopsProtocol();
        }

        new Thread(() -> {
            try {
                runRoot(protocol.getEnvironment("Root"));
            } catch (Exception e) {
                e.printStackTrace();
            }
            if (visualizeProtocolGraph) {
                plantUmlProtocolWatcher.savePlantUmlGraphToSvg();
            }
        }).start();

        new Thread(() -> {
            try {
                runLeftOrRight(protocol.getEnvironment("Left"));
            } catch (Exception e) {
                e.printStackTrace();
            }
            if (visualizeProtocolGraph) {
                plantUmlProtocolWatcher.savePlantUmlGraphToSvg();
            }
        }).start();

        new Thread(() -> {
            try {
                runLeftOrRight(protocol.getEnvironment("Right"));
            } catch (Exception e) {
                e.printStackTrace();
            }
            if (visualizeProtocolGraph) {
                plantUmlProtocolWatcher.savePlantUmlGraphToSvg();
            }
        }).start();
    }

    public static  void runRoot(IEnvironment environment) throws Exception {
        Board board = new Board(environment.getName());
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

    public static  void runLeftOrRight(IEnvironment environment) throws Exception {
        Board board = new Board(environment.getName());
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
