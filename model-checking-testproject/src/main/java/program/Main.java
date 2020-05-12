package program;

import dto.Move;
import nl.florianslob.modelchecking.base.api.v2.IProtocol;
import nl.florianslob.modelchecking.base.runtime.v2.GenericParticipant;
import nl.florianslob.modelchecking.base.runtime.v2.GenericParticipantAction;
import nl.florianslob.modelchecking.base.runtime.v2.StateSpaceExplorer;
import nl.florianslob.modelchecking.generated.GeneratedChessProtocol;
import nl.florianslob.modelchecking.generated.GeneratedChessProtocolDebug;
import owl.ltl.parser.LtlParser;
import owl.ltl.rewriter.SimplifierFactory;
import owl.run.Environment;
import owl.translations.LTL2DAFunction;

public class Main {
    public static void main(String[] args) {
//      runGeneratedChessProtocol();
//      exploreStateSpace();
        testOwl();
    }

    private static void testOwl(){
        var formula = LtlParser.parse("a & X G (a U XXb) | !a & X G (a U XXc)");
        formula = SimplifierFactory.apply(formula, SimplifierFactory.Mode.NNF);

        var function = new LTL2DAFunction(Environment.standard());
        var automaton = function.apply(formula);
        var test = automaton;
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
