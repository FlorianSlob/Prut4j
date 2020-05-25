package nl.florianslob.modelchecking.base.runtime.v2.ltlautomaton;

import it.unimi.dsi.fastutil.objects.Object2IntArrayMap;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import nl.florianslob.modelchecking.base.helpers.GraphVisualizationHelpers;
import owl.automaton.Automaton;
import owl.automaton.acceptance.GeneralizedBuchiAcceptance;
import owl.automaton.edge.Edge;
import owl.collections.ValuationSet;

import java.util.ArrayList;
import java.util.BitSet;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class PlantUmlVisitor<S> implements Automaton.EdgeVisitor<S>, Automaton.EdgeMapVisitor<S> {
    private final Object2IntMap<S> stateNumbers = new Object2IntArrayMap<>();

    private List<String> alphabet;
    private StringBuilder plantUmlStringBuilder;
    private Automaton<?, GeneralizedBuchiAcceptance> automaton;

    public PlantUmlVisitor(StringBuilder plantUmlStringBuilder, Automaton<?, GeneralizedBuchiAcceptance> automaton) {
        this.alphabet = automaton.factory().alphabet();
        this.plantUmlStringBuilder = plantUmlStringBuilder;
        this.automaton = automaton;
    }

    @SuppressWarnings("SpellCheckingInspection")
    public String getPlantUmlGraph() {
        return "@startuml\n" +
                " header\n" +
                "\n" +
                "\n" +
                " endheader\n" +
                "\n" +
                "\n" +
                "[*] -> State0 \n" +
                plantUmlStringBuilder.toString() +
                "@enduml \n\n";
    }

    public void savePlantUmlGraphToSvg() {
        System.out.println("Writing protocol visualization to file?");
        String plantUmlGraph = getPlantUmlGraph();
        System.out.print(plantUmlGraph);

        try {
            GraphVisualizationHelpers.saveSvgStringToFile(plantUmlGraph, "owl_formula_visualization.svg");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private int getStateId(S state) {
        return stateNumbers.computeIntIfAbsent(state, k -> stateNumbers.size());
    }

    @Override
    public void enter(S state) {
        var id = getStateId(state);

        plantUmlStringBuilder.append("State");
        plantUmlStringBuilder.append(id);
        plantUmlStringBuilder.append(" : \n");
    }

    @Override
    public void visit(S state, Map<Edge<S>, ValuationSet> edgeMap) {
        edgeMap.forEach((edge, valuationSet) -> {

            S targetState = edge.successor();

            var id = getStateId(state);
            var targetStateId = getStateId(targetState);

            plantUmlStringBuilder.append("State");
            plantUmlStringBuilder.append(id);
            plantUmlStringBuilder.append(" --> State");
            plantUmlStringBuilder.append(targetStateId);
            plantUmlStringBuilder.append(" : ");
            plantUmlStringBuilder.append("\\n");
            plantUmlStringBuilder.append("[ ");

            if (valuationSet.isEmpty()) {
                return;
            } else {
                var expression = valuationSet.toExpression();
                var expressionString = expression.toString();
                for (int i = 0; i< alphabet.size(); i++) {
                    expressionString  = expressionString.replace(""+i, "\""+alphabet.get(i)+"\"");
                }

                plantUmlStringBuilder.append(expressionString);
            }

            BitSet acceptanceSets = edge.acceptanceSets();
            var size = acceptanceSets.length();

            if (size > 0) {
                plantUmlStringBuilder.append(" AccSet");

                var accSet = new ArrayList<Integer>();

                for (int i = 0; i < size; i++) {
                    var acceptanceBit = acceptanceSets.get(i);
                    if (acceptanceBit) {
                        accSet.add(i);
                    }
                }

                // Print acceptance set comma separated
                plantUmlStringBuilder.append(Stream.of(accSet).map(String::valueOf).collect(Collectors.joining(",")));
            }
            plantUmlStringBuilder.append("] ");

            plantUmlStringBuilder.append("\n");
        });
    }

    @Override
    public void visit(S state, BitSet valuation, Edge<S> edge) {
        // Do nothing.
    }
}
