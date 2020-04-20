package nl.florianslob.modelchecking.sandbox.protocolimplementations;

import nl.florianslob.modelchecking.base.api.IEnvironment;
import nl.florianslob.modelchecking.base.api.IProtocol;
import nl.florianslob.modelchecking.base.api.ProtocolMessage;

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
            if(board.isNotInitial()){

                Move mBlack = (Move) environment.receive().message;
                board.update(mBlack);
                board.print();
                if (board.isFinal()) break;
            }

            Move move = new Move();
            board.update(move);
            board.print();
            environment.send(new ProtocolMessage("?",move));
        }
    }

    public static  void runLeftOrRight(IEnvironment environment) throws Exception {
        Board board = new Board(environment.getName());
        while(!board.isFinal()){

            Move mWhite = (Move) environment.receive().message;
            board.update(mWhite);
            if (board.isFinal()) break;

            board.print();
            Move move = new Move();
            board.update(move);
            board.print();
            environment.send(new ProtocolMessage("root",move));
        }

    }

}
