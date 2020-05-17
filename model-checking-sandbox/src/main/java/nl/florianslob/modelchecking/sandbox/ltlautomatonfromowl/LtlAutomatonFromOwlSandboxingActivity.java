package nl.florianslob.modelchecking.sandbox.ltlautomatonfromowl;

import nl.florianslob.modelchecking.sandbox.ISandboxingActivity;
import owl.automaton.Automaton;
import owl.ltl.parser.LtlParser;
import owl.run.Environment;
import owl.translations.delag.State;
import owl.translations.modules.LTL2NGBAModule;

import java.io.IOException;

public class LtlAutomatonFromOwlSandboxingActivity implements ISandboxingActivity {
    @Override
    public void runActivity() throws Exception {
        System.out.println("Run LtlAutomatonFromOwlSandboxingActivity");
        testOwl();
    }

    private static void testOwl() throws IOException {
        // we use a demo formula from the Chess example
        String formulaString = "G(\"Move to B\" -> X(!\"Move to B\" U \"Move to W\"))  &  G(\"Move to W\" -> X(!\"Move to W\" U \"Move to B\")) & G(!(\"Move to W\" & \"Move to B\") & !(!\"Move to W\" & !\"Move to B\"))";
        // Other test formulas:
        // String formulaString = "G(\"Move to B\" -> X(!\"Move to B\" U \"Move to W\"))  &  G(\"Move to W\" -> X(!\"Move to W\" U \"Move to B\")) & G(!(\"Move to W\" & \"Move to B\"))";
        // String formulaString  = "G(\"Move to B\" -> X(!\"Move to B\"))";
        // String formulaString = "F G a | G F b";

        var formula = LtlParser.parse(formulaString);
        // Optionally use formula simplifier:
        //  formula = SimplifierFactory.apply(formula, SimplifierFactory.Mode.SYNTACTIC_FAIRNESS); // <-- Optional??

        // We use standard Non-deterministic, generalised Büchi automata
        var function = LTL2NGBAModule.translation(Environment.standard(), false);
        // If you want to test different automata, you can use one of the functions below (this are examples, there are more functions available)
        // var function = new LTL2DPAFunction(Environment.standard(), LTL2DPAFunction.RECOMMENDED_SYMMETRIC_CONFIG);
        // var function = new LTL2DGRAModule(AllAcceptance.class, Environment.standard());
        // var function = new LTL2DAFunction(OmegaAcceptance.class, Environment.annotated());
        // var function = LTL2DGRAModule.translation(Environment.standard(), true, false, RabinizerConfiguration.of(true, true, true));

        // Apply the function to obtain the automaton.
        var automaton = function.apply(formula);

        // Get the alphabet
        var alphabet = automaton.factory().alphabet();

        // Create a PlantUml visitor for the automaton
        var plantUmlStringBuilder = new StringBuilder();
        var visitor = new PlantUmlVisitor<State<?>>(alphabet, plantUmlStringBuilder, automaton);

        // Visit the Automaton
        automaton.accept((Automaton.Visitor) visitor);

        // Save the plant uml SVG file.
        visitor.savePlantUmlGraphToSvg();

        // File can be found in /generated_graph_svg_files/owl_formula_visualization.svg
    }
}
