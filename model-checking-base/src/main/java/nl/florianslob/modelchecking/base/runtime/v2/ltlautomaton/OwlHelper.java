package nl.florianslob.modelchecking.base.runtime.v2.ltlautomaton;
import nl.florianslob.modelchecking.base.runtime.v2.datastructure.LtlState;
import owl.automaton.Automaton;
import owl.automaton.acceptance.GeneralizedBuchiAcceptance;
import owl.ltl.parser.LtlParser;
import owl.run.Environment;
import owl.translations.delag.State;
import owl.translations.modules.LTL2NGBAModule;

import java.util.List;

public class OwlHelper {
    public static List<LtlState> GetInitialLtlStatesForFormula(String formulaString, boolean negateFormula){
        var automaton = GetAutomatonForFormula(formulaString, negateFormula);
        return GetInitialLtlStatesForAutomaton(automaton);
    }

    public static List<LtlState> GetInitialLtlStatesForAutomaton(Automaton<State<?>, GeneralizedBuchiAcceptance> automaton) {
        var ltlAutomatonVisitor = new LtlAutomatonVisitor<>(automaton);

        // Visit the Automaton
        automaton.accept((Automaton.Visitor) ltlAutomatonVisitor);


        return ltlAutomatonVisitor.getInitialStates();
    }

    public static Automaton<State<?>, GeneralizedBuchiAcceptance> GetAutomatonForFormula(String formulaString, boolean negateFormula){


        var formula = LtlParser.parse(formulaString);
        // Optionally use formula simplifier:
        //  formula = SimplifierFactory.apply(formula, SimplifierFactory.Mode.SYNTACTIC_FAIRNESS); // <-- Optional??

        // TODO does this work?
        if(negateFormula){
            formula = formula.not();
        }

        // We use standard Non-deterministic, generalised Büchi automata
        var function = LTL2NGBAModule.translation(Environment.standard(), false);
        // If you want to test different automata, you can use one of the functions below (this are examples, there are more functions available)
        // var function = new LTL2DPAFunction(Environment.standard(), LTL2DPAFunction.RECOMMENDED_SYMMETRIC_CONFIG);
        // var function = new LTL2DGRAModule(AllAcceptance.class, Environment.standard());
        // var function = new LTL2DAFunction(OmegaAcceptance.class, Environment.annotated());
        // var function = LTL2DGRAModule.translation(Environment.standard(), true, false, RabinizerConfiguration.of(true, true, true));

        // Apply the function to obtain the automaton.
        return (Automaton<State<?>, GeneralizedBuchiAcceptance>) function.apply(formula);
    }

}
