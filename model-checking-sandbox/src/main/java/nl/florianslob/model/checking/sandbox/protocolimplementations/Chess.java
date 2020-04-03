package nl.florianslob.model.checking.sandbox.protocolimplementations;

import nl.florianslob.model.checking.sandbox.fosterchandy.exceptions.MaxDepthReachedException;

import static nl.florianslob.model.checking.sandbox.helpers.GraphVisualizationHelpers.saveSvgStringToFile;

public class Chess {

    public static void play(boolean visualizeProtocolGraph) {
        PlantUmlProtocolWatcher plantUmlProtocolWatcher = new PlantUmlProtocolWatcher();
        IProtocol protocol;
        if (visualizeProtocolGraph) {
            protocol = new ChessProtocolWithGraphVisualization(plantUmlProtocolWatcher);
        } else {
            protocol = new ChessProtocol();
        }

        new Thread(() -> {
            try {
                runWhite(protocol.getEnvironment("W"));
            } catch (MaxDepthReachedException e) {
                if (visualizeProtocolGraph) {
                    VisualizeProtocolGraph(plantUmlProtocolWatcher);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }).start();

        new Thread(() -> {
            try {
                runBlack(protocol.getEnvironment("B"));
            } catch (MaxDepthReachedException e) {
                if (visualizeProtocolGraph) {
                    VisualizeProtocolGraph(plantUmlProtocolWatcher);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }).start();

    }

    public static void VisualizeProtocolGraph(PlantUmlProtocolWatcher plantUmlProtocolWatcher) {
        System.out.println("Are threads done?");
        String plantUmlGraph = plantUmlProtocolWatcher.getPlantUmlGraph();
        System.out.print(plantUmlGraph);

        try {
            saveSvgStringToFile(plantUmlGraph, "chessProtocol.svg");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public static void runWhite(IEnvironment environment) throws Exception {
        Board board = new Board("White");
        while (!board.isFinal()) {
            if (!board.isInitial()) {
                Move mBlack = (Move) environment.receive();
                board.update(mBlack);
                board.print();
                if (board.isFinal()) throw new MaxDepthReachedException("Max depth reached");
//                if (board.isFinal()) break;
            }

            Move mWhite = new Move();
            board.update(mWhite);
            board.print();
            environment.send(mWhite);
        }
    }

    public static void runBlack(IEnvironment environment) throws Exception {
        Board board = new Board("Black");
        while (!board.isFinal()) {

            Move mWhite = (Move) environment.receive();
            board.update(mWhite);
            if (board.isFinal()) throw new MaxDepthReachedException("Max depth reached");
//            if (board.isFinal()) break;

            board.print();
            Move mBlack = new Move();
            board.update(mBlack);
            board.print();
            environment.send(mBlack);
        }

    }
}
