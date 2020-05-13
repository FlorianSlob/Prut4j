package program;

import dto.Move;
import nl.florianslob.modelchecking.base.api.v2.IProtocol;
import nl.florianslob.modelchecking.base.runtime.v2.GenericParticipant;
import nl.florianslob.modelchecking.base.runtime.v2.GenericParticipantAction;
import nl.florianslob.modelchecking.base.runtime.v2.StateSpaceExplorer;
import nl.florianslob.modelchecking.generated.GeneratedChessProtocol;
import nl.florianslob.modelchecking.generated.GeneratedChessProtocolDebug;
import owl.automaton.Automaton;
import owl.automaton.acceptance.*;
import owl.ltl.parser.LtlParser;
import owl.ltl.rewriter.SimplifierFactory;
import owl.run.Environment;
import owl.run.modules.OutputWriters;
import owl.translations.LTL2DAFunction;
import owl.translations.LTL2NAFunction;
import owl.translations.delag.State;
import owl.translations.ltl2dpa.LTL2DPAFunction;
import owl.translations.modules.LTL2DAModule;
import owl.translations.modules.LTL2DGRAModule;
import owl.translations.modules.LTL2NAModule;
import owl.translations.modules.LTL2NGBAModule;
import owl.translations.rabinizer.RabinizerConfiguration;

import java.io.CharArrayWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.nio.channels.Channels;
import java.nio.charset.StandardCharsets;

public class Main {
    public static void main(String[] args) {
//      runGeneratedChessProtocol();
//      exploreStateSpace();
        try {
            testOwl();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void testOwl() throws IOException {
//        String formulaString = "G(\"Move to B\" -> X(!\"Move to B\" U \"Move to W\"))  &  G(\"Move to W\" -> X(!\"Move to W\" U \"Move to B\")) & G(!(\"Move to W\" & \"Move to B\"))";
//        String formulaString  = "G(\"Move to B\" -> X(!\"Move to B\"))";
        String formulaString = "G(\"Move to B\" -> X(!\"Move to B\" U \"Move to W\"))  &  G(\"Move to W\" -> X(!\"Move to W\" U \"Move to B\")) & G(!(\"Move to W\" & \"Move to B\") & !(!\"Move to W\" & !\"Move to B\"))";
//        String formulaString = "F G a | G F b";

        System.out.println(formulaString);

        var formula = LtlParser.parse(formulaString);
//        formula = SimplifierFactory.apply(formula, SimplifierFactory.Mode.SYNTACTIC_FAIRNESS); // <-- Optional??

//        var function = new LTL2DPAFunction(Environment.standard(), LTL2DPAFunction.RECOMMENDED_SYMMETRIC_CONFIG);
//        var function = new LTL2DGRAModule(AllAcceptance.class, Environment.standard());
//        var function = new LTL2DAFunction(OmegaAcceptance.class, Environment.annotated());
//        var function = LTL2DGRAModule.translation(Environment.standard(), true, false, RabinizerConfiguration.of(true, true, true));
        var function = LTL2NGBAModule.translation(Environment.standard(), false);
        var automaton = function.apply(formula);

        // TODO Explore the automaton to: 1: create plantuml syntax, 2: to create dto's of the formulla we can use when model checking.

        var writer = new OutputWriters.ToHoa(false, false);
        writer.write(new OutputStreamWriter(System.out), automaton);

        var visitor = new PlantUmlVisitor<State<?>>();

        automaton.accept((Automaton.Visitor)visitor);


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
