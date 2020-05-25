package program;

import dto.Move;
import nl.florianslob.modelchecking.base.api.v2.IProtocol;
import nl.florianslob.modelchecking.base.runtime.v2.GenericParticipant;
import nl.florianslob.modelchecking.base.runtime.v2.GenericParticipantAction;
import nl.florianslob.modelchecking.base.runtime.v2.LtlModelChecker;
import nl.florianslob.modelchecking.base.runtime.v2.StateSpaceExplorer;
import nl.florianslob.modelchecking.generated.GeneratedChessProtocol;
import nl.florianslob.modelchecking.generated.GeneratedChessProtocolDebug;


public class Main {
    public static void main(String[] args) {
//      runGeneratedChessProtocol();
//      exploreStateSpace();
        TestModelChecking();
    }

    private static void TestModelChecking() {
        IProtocol protocol = new GeneratedChessProtocolDebug();

        // we use a demo formula from the Chess example
        String formulaString = "G(\"Move to B\" -> X(!\"Move to B\" U \"Move to W\"))  &  G(\"Move to W\" -> X(!\"Move to W\" U \"Move to B\")) & G(!(\"Move to W\" & \"Move to B\") & !(!\"Move to W\" & !\"Move to B\"))";
        // Other test formulas:
        // String formulaString = "G(\"Move to B\" -> X(!\"Move to B\" U \"Move to W\"))  &  G(\"Move to W\" -> X(!\"Move to W\" U \"Move to B\")) & G(!(\"Move to W\" & \"Move to B\"))";
        // String formulaString  = "G(\"Move to B\" -> X(!\"Move to B\"))";
        // String formulaString = "F G a | G F b";
        System.out.println("Testing Formula:");
        System.out.println(formulaString);
        var result = new LtlModelChecker(protocol).CheckProtocolForLtlFormula(formulaString);

        System.out.println("Does formula hold: "+result);
    }

    private static void exploreStateSpace() {
        IProtocol protocol = new GeneratedChessProtocolDebug();
        StateSpaceExplorer explorer = new StateSpaceExplorer(protocol);
        explorer.ExploreStateSpace();
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
                //noinspection deprecation
                threadWhite.stop();
            } catch (Exception e) {
                e.printStackTrace();
            }

        });

        threadWhite.start();
        threadBlack.start();
    }

    private static GenericParticipant getGenericParticipantPlayerBlack() {
        GenericParticipantAction sendActionBlack = GenericParticipantAction.GetSendAction(new Move());
        GenericParticipant playerBlack = new GenericParticipant();
        playerBlack.AddStartupAction(GenericParticipantAction.GetReceiveAction());
        playerBlack.AddAfterSendAction(sendActionBlack, GenericParticipantAction.GetReceiveAction());
        playerBlack.AddAfterReceiveActions(Move.class, sendActionBlack);
        return playerBlack;
    }

    private static GenericParticipant getGenericParticipantPlayerWhite() {
        GenericParticipantAction sendActionWhite = GenericParticipantAction.GetSendAction(new Move());
        GenericParticipant playerWhite = new GenericParticipant();
        playerWhite.AddStartupAction(sendActionWhite);
        playerWhite.AddAfterSendAction(sendActionWhite, GenericParticipantAction.GetReceiveAction());
        playerWhite.AddAfterReceiveActions(Move.class, sendActionWhite);
        return playerWhite;
    }
}
