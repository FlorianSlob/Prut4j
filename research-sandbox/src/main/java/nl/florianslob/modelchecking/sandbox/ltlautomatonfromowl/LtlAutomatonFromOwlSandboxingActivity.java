package nl.florianslob.modelchecking.sandbox.ltlautomatonfromowl;

import nl.florianslob.modelchecking.base.runtime.v2.ltlautomaton.LtlAutomatonVisitor;
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
        String formulaString = "G(\"SEND Move TO b\" -> X(!\">SEND Move TO b\" U \"SEND Move TO w\"))  &  G(\"SEND Move TO w\" -> X(!\"SEND Move TO w\" U \"SEND Move TO b\")) & G(!(\"SEND Move TO w\" & \"SEND Move TO b\") & !(!\"SEND Move TO w\" & !\"SEND Move TO b\"))";
        // Other test formulas:
        // String formulaString = "G(\"Move to B\" -> X(!\"Move to B\" U \"Move to W\"))  &  G(\"Move to W\" -> X(!\"Move to W\" U \"Move to B\")) & G(!(\"Move to W\" & \"Move to B\"))";
        // String formulaString  = "G(\"Move to B\" -> X(!\"Move to B\"))";
        // String formulaString = "F G a | G F b";

        var automatonForNegatedFormula = OwlHelper.GetAutomatonForFormula(formulaString, true);

        var initialStates = OwlHelper.GetInitialLtlStatesForAutomaton(automatonForNegatedFormula);

        System.out.print("Printing Initial States");
        System.out.print(initialStates);

        // Create a PlantUml visitor for the automaton
        var plantUmlStringBuilder = new StringBuilder();
        var plantUmlVisitor = new PlantUmlVisitor<State<?>>(plantUmlStringBuilder, automatonForNegatedFormula);

        var ltlAutomatonVisitor = new LtlAutomatonVisitor<State<?>>(automatonForNegatedFormula);

        automatonForNegatedFormula.accept((Automaton.Visitor) plantUmlVisitor);
        automatonForNegatedFormula.accept((Automaton.Visitor) ltlAutomatonVisitor);

        var initialStatesForModelChecking = ltlAutomatonVisitor.getInitialStates();

        // Save the plant uml SVG file.
        plantUmlVisitor.savePlantUmlGraphToSvg();

        // File can be found in /generated_graph_svg_files/owl_formula_visualization.svg
    }
}
