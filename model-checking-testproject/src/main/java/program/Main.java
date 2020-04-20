package program;

import dto.Move;
import nl.florianslob.modelchecking.base.api.IProtocol;
import nl.florianslob.modelchecking.base.api.ProtocolMessage;
import nl.florianslob.modelchecking.base.runtime.GenericParticipant;
import nl.florianslob.modelchecking.base.runtime.GenericParticipantAction;
import nl.florianslob.modelchecking.generated.GeneratedChessProtocol;

public class Main {
    public static void main(String[] args){
        runGeneratedChessProtocol();
    }

    private static void runGeneratedChessProtocol() {
        IProtocol protocol = new GeneratedChessProtocol();

        GenericParticipant playerWhite = getGenericParticipantPlayerWhite();
        GenericParticipant playerBlack = getGenericParticipantPlayerBlack();

        Thread threadWhite, threadBlack = null;

        threadWhite = new Thread(() -> {
            try {
                playerWhite.run(protocol.getEnvironment("W"));
            } catch (Exception e) {
                e.printStackTrace();
            }
        });

        threadBlack = new Thread(() -> {
            try {
                playerBlack.run(protocol.getEnvironment("B"));
                // Danger! But is for debugging purposes! Black thread stops first.
                threadWhite.stop();
            } catch (Exception e) {
                e.printStackTrace();
            }

        });

        threadWhite.start();
        threadBlack.start();
    }

    private static GenericParticipant getGenericParticipantPlayerBlack() {
        GenericParticipantAction sendActionBlack = GenericParticipantAction.GetSendAction(new ProtocolMessage<>("W", new Move()));
        GenericParticipant playerBlack = new GenericParticipant();
        playerBlack.AddStartupAction(GenericParticipantAction.GetReceiveAction());
        playerBlack.AddAfterSendAction(sendActionBlack, GenericParticipantAction.GetReceiveAction());
        playerBlack.AddAfterReceiveActions(Move.class, sendActionBlack);
        return playerBlack;
    }

    private static GenericParticipant getGenericParticipantPlayerWhite() {
        GenericParticipantAction sendActionWhite = GenericParticipantAction.GetSendAction(new ProtocolMessage<>("B", new Move()));
        GenericParticipant playerWhite = new GenericParticipant();
        playerWhite.AddStartupAction(sendActionWhite);
        playerWhite.AddAfterSendAction(sendActionWhite, GenericParticipantAction.GetReceiveAction());
        playerWhite.AddAfterReceiveActions(Move.class, sendActionWhite);
        return playerWhite;
    }
}
