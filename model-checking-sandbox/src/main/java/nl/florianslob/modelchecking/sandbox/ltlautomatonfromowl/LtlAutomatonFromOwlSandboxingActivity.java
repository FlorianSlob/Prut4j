package nl.florianslob.modelchecking.sandbox.ltlautomatonfromowl;

import nl.florianslob.modelchecking.base.runtime.v2.ltlautomaton.OwlHelper;
import nl.florianslob.modelchecking.base.runtime.v2.ltlautomaton.PlantUmlVisitor;
import nl.florianslob.modelchecking.sandbox.ISandboxingActivity;
import owl.automaton.Automaton;
import owl.translations.delag.State;

public class LtlAutomatonFromOwlSandboxingActivity implements ISandboxingActivity {
    @Override
    public void runActivity() {
        System.out.println("Run LtlAutomatonFromOwlSandboxingActivity");
        // we use a demo formula from the Chess example
        String formulaString = "G(\"Move to B\" -> X(!\"Move to B\" U \"Move to W\"))  &  G(\"Move to W\" -> X(!\"Move to W\" U \"Move to B\")) & G(!(\"Move to W\" & \"Move to B\") & !(!\"Move to W\" & !\"Move to B\"))";
        // Other test formulas:
        // String formulaString = "G(\"Move to B\" -> X(!\"Move to B\" U \"Move to W\"))  &  G(\"Move to W\" -> X(!\"Move to W\" U \"Move to B\")) & G(!(\"Move to W\" & \"Move to B\"))";
        // String formulaString  = "G(\"Move to B\" -> X(!\"Move to B\"))";
        // String formulaString = "F G a | G F b";

        var automaton = OwlHelper.GetAutomatonForFormula(formulaString);

        var initialStates = OwlHelper.GetInitialLtlStatesForAutomaton(automaton);

        System.out.print("Printing Initial States");
        System.out.print(initialStates);

        // Create a PlantUml visitor for the automaton
        var plantUmlStringBuilder = new StringBuilder();
        var plantUmlVisitor = new PlantUmlVisitor<State<?>>(plantUmlStringBuilder, automaton);
        automaton.accept((Automaton.Visitor) plantUmlVisitor);

        // Save the plant uml SVG file.
        plantUmlVisitor.savePlantUmlGraphToSvg();

        // File can be found in /generated_graph_svg_files/owl_formula_visualization.svg
    }
}
