package nl.florianslob.modelchecking.base.runtime.v2.ltlautomaton;

import it.unimi.dsi.fastutil.objects.Object2IntArrayMap;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import nl.florianslob.modelchecking.base.runtime.v2.datastructure.LtlState;
import nl.florianslob.modelchecking.base.runtime.v2.datastructure.LtlTransaction;
import owl.automaton.Automaton;
import owl.automaton.acceptance.GeneralizedBuchiAcceptance;
import owl.automaton.edge.Edge;
import owl.collections.ValuationSet;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LtlAutomatonVisitor<S> implements Automaton.EdgeVisitor<S>, Automaton.EdgeMapVisitor<S> {
    private final Object2IntMap<S> stateNumbers = new Object2IntArrayMap<>();

    private List<String> alphabet;
    private Automaton<S, GeneralizedBuchiAcceptance> automaton;
    private Map<Integer, LtlState> stateIdToState = new HashMap<>();

    public LtlAutomatonVisitor(Automaton<S, GeneralizedBuchiAcceptance> automaton) {
        this.alphabet = automaton.factory().alphabet();

        this.automaton = automaton;
    }

    public List<LtlState> getInitialStates(){
        List<LtlState> ltlStates = new ArrayList<>();
        for (var initialState :
                automaton.initialStates()) {
            ltlStates.add(getLtlState(initialState));
        }

        return ltlStates;
    }

    private LtlState getLtlState(S state) {
        var stateNumber = stateNumbers.computeIntIfAbsent(state, k -> stateNumbers.size());

        var ltlState = stateIdToState.getOrDefault(stateNumber,null);
        if(ltlState == null){
            ltlState = new LtlState(stateNumber);
            stateIdToState.put(stateNumber,ltlState);
        }

        return ltlState;
    }

    @Override
    public void enter(S state) {
        getLtlState(state);
    }

    @Override
    public void visit(S state, Map<Edge<S>, ValuationSet> edgeMap) {
        edgeMap.forEach((edge, valuationSet) -> {

            S targetState = edge.successor();

            var ltlTargetState = getLtlState(targetState);
            var ltlState = getLtlState(state);



            var targetStateId = ltlTargetState.stateNumber;

            var newTransaction = new LtlTransaction(ltlTargetState);



            if (valuationSet.isEmpty()) {
                return;
            } else {
                // TODO Convert to expression we can use while model checking
                var expression = valuationSet.toExpression();
                var expressionString = expression.toString();
                for (int i = 0; i< alphabet.size(); i++) {
                    expressionString  = expressionString.replace(""+i, "\""+alphabet.get(i)+"\"");
                }

                newTransaction.Expression = expressionString;
            }

            BitSet acceptanceSets = edge.acceptanceSets();
            var size = acceptanceSets.length();

            if (size > 0) {
                var accSet = new ArrayList<Integer>();

                for (int i = 0; i < size; i++) {
                    var acceptanceBit = acceptanceSets.get(i);
                    if (acceptanceBit) {
                        accSet.add(i);
                    }
                }

                // Print acceptance set comma separated
                var accSetString = Stream.of(accSet).map(String::valueOf).collect(Collectors.joining(","));

                newTransaction.AcceptanceSet = accSetString;
            }
            ltlState.OutgoingTransactions.add(newTransaction);
        });
    }

    @Override
    public void visit(S state, BitSet valuation, Edge<S> edge) {
        // Do nothing.
    }
}
