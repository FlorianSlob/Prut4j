package nl.florianslob.modelchecking.sandbox.protocolimplementations;

import nl.florianslob.modelchecking.base.api.ProtocolMessage;
import nl.florianslob.modelchecking.base.runtime.GenericParticipant;
import nl.florianslob.modelchecking.base.runtime.GenericParticipantAction;
import nl.florianslob.modelchecking.base.api.IProtocol;

public class ChessWithGenericParticipant {

    public static void play(boolean visualizeProtocolGraph) {
        PlantUmlProtocolWatcher plantUmlProtocolWatcher = new PlantUmlProtocolWatcher();
        IProtocol protocol;
        if (visualizeProtocolGraph) {
            protocol = new ChessProtocolWithGraphVisualization(plantUmlProtocolWatcher);
        } else {
            protocol = new ChessProtocol();
        }

        GenericParticipantAction sendActionWhite = GenericParticipantAction.GetSendAction(new ProtocolMessage("B", new Move()));
        GenericParticipantAction sendActionBlack = GenericParticipantAction.GetSendAction(new ProtocolMessage("W", new Move()));

        GenericParticipant playerWhite = new GenericParticipant();
        playerWhite.AddStartupAction(sendActionWhite);
        playerWhite.AddAfterSendAction(sendActionWhite, GenericParticipantAction.GetReceiveAction());
        playerWhite.AddAfterReceiveActions(Move.class, sendActionWhite);
        GenericParticipant playerBlack = new GenericParticipant();
        playerBlack.AddStartupAction(GenericParticipantAction.GetReceiveAction());
        playerBlack.AddAfterSendAction(sendActionBlack, GenericParticipantAction.GetReceiveAction());
        playerBlack.AddAfterReceiveActions(Move.class, sendActionBlack);

        new Thread(() -> {
            try {
                playerWhite.run(protocol.getEnvironment("W"));
            } catch (Exception e) {
                e.printStackTrace();
            }
            if (visualizeProtocolGraph) {
                plantUmlProtocolWatcher.savePlantUmlGraphToSvg();
            }
        }).start();

        new Thread(() -> {
            try {
                playerBlack.run(protocol.getEnvironment("B"));
            } catch (Exception e) {
                e.printStackTrace();
            }
            if (visualizeProtocolGraph) {
                plantUmlProtocolWatcher.savePlantUmlGraphToSvg();
            }
        }).start();
    }
}
