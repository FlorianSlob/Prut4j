package program;

import owl.automaton.Automaton;
import owl.automaton.edge.Edge;
import owl.collections.ValuationSet;

import java.util.BitSet;
import java.util.Map;

public class PlantUmlVisitor<S> implements  Automaton.EdgeVisitor<S>, Automaton.EdgeMapVisitor<S> {

    public PlantUmlVisitor(){

    }


    @Override
    public void visit(S state, BitSet valuation, Edge<S> edge) {
        System.out.println("Visiting State"+ state.getClass());
        System.out.println("With edge: "+ edge.getClass());
        System.out.println("Valuations: "+ valuation);
    }

    @Override
    public void visit(S state, Map<Edge<S>, ValuationSet> edgeMap) {
        System.out.println("Visiting State"+ state.getClass());
        System.out.println("With edge: "+ edgeMap.getClass());
    }
}
