package program;

import it.unimi.dsi.fastutil.ints.IntArrayList;
import it.unimi.dsi.fastutil.objects.Object2IntArrayMap;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import jhoafparser.extensions.BooleanExpressions;
import owl.automaton.Automaton;
import owl.automaton.edge.Edge;
import owl.automaton.hoa.HoaWriter;
import owl.collections.ValuationSet;

import java.util.ArrayList;
import java.util.BitSet;
import java.util.List;
import java.util.Map;
import java.util.function.IntConsumer;
import java.util.logging.Level;

public class PlantUmlVisitor<S> implements  Automaton.EdgeVisitor<S>, Automaton.EdgeMapVisitor<S> {
    private S currentState = null;
    private final Object2IntMap<S> stateNumbers = new Object2IntArrayMap<>();

    public PlantUmlVisitor(){

    }

    private int getStateId(S state) {

        return stateNumbers.computeIntIfAbsent(state, k -> stateNumbers.size());
    }

    @Override
    public void enter(S state) {
        currentState = state;
//        String label = state.toString();
        var id = getStateId(state);

        System.out.println("Entered state "+id);

    }

    @Override
    public void exit(S state) {
//        String label = state.toString();
        var id = getStateId(state);

        System.out.println("Exited state "+id);
    }

    private final int alphabetSize = 1;

    @Override
    public void visit(S state, BitSet valuation, Edge<S> edge) {

        IntArrayList accSets = new IntArrayList();
        edge.acceptanceSetIterator().forEachRemaining((IntConsumer) accSets::add);
        List<String> conjuncts = new ArrayList<>();

        for (int i = 0; i < alphabetSize; i++) {

            if (valuation.get(i)) {
                conjuncts.add(i+" is true");
            }
        }
        System.out.println(BooleanExpressions.createConjunction(conjuncts)); //, edge.successor(), accSets);
    }

    @Override
    public void visit(S state, Map<Edge<S>, ValuationSet> edgeMap) {
        edgeMap.forEach((edge, valuationSet) -> {
            S end = edge.successor();

            if (valuationSet.isEmpty()) {
                return;
            }

            IntArrayList acceptanceSets = new IntArrayList();
            edge.acceptanceSetIterator().forEachRemaining((IntConsumer) acceptanceSets::add);
            addEdgeBackend(valuationSet.toExpression(), end, acceptanceSets);
        });
    }
//
//    @Override
//    public void visit(S state, BitSet valuation, Edge<S> edge) {
//        System.out.println("Visiting State"+ state.getClass());
//        System.out.println("With edge: "+ edge.getClass());
//        System.out.println("Valuations: "+ valuation);
//    }
//
//    @Override
//    public void visit(S state, Map<Edge<S>, ValuationSet> edgeMap) {
//        System.out.println("Visiting State"+ state.getClass());
//        System.out.println("With edge: "+ edgeMap.getClass());
//    }
}
