package nl.florianslob.modelchecking.sandbox.protocolimplementations;

import java.util.HashSet;
import java.util.Set;

import static nl.florianslob.modelchecking.base.helpers.GraphVisualizationHelpers.saveSvgStringToFile;

public class PlantUmlProtocolWatcher implements IProtocolWatcher {
    // fields for visualizing the graph
    private final Set<Integer> alreadyVisualizedStates = new HashSet<>();
    private final Set<Integer> alreadyVisualizedTransaction = new HashSet<>();

    private final StringBuilder plantUmlCode = new StringBuilder();

    @Override
    public void reportVisitedState(int stateIdentifier) {
        if (!alreadyVisualizedStates.contains(stateIdentifier)) {
            alreadyVisualizedStates.add(stateIdentifier);

            plantUmlCode.append("State");
            plantUmlCode.append(stateIdentifier);
            plantUmlCode.append(" :  \n");
        }
    }

    @Override
    public void reportVisitedTransaction(int transactionIdentifier, int fromStateIdentifier, int toStateIdentifier, String sourceEnvironmentName, String targetEnvironmentName, String sendOrReceive, String messageType) {
        if (!alreadyVisualizedTransaction.contains(transactionIdentifier)) {
            alreadyVisualizedTransaction.add(transactionIdentifier);

            plantUmlCode.append("State");
            plantUmlCode.append(fromStateIdentifier);
            plantUmlCode.append(" --> State");
            plantUmlCode.append(toStateIdentifier);
            plantUmlCode.append(" :");
            plantUmlCode.append(messageType);
            plantUmlCode.append("\\n");
            plantUmlCode.append("[");
            plantUmlCode.append(sourceEnvironmentName);
            plantUmlCode.append(",");
            plantUmlCode.append(targetEnvironmentName);
            plantUmlCode.append("]");
            plantUmlCode.append(sendOrReceive);
            plantUmlCode.append(" \n");
        }
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
            plantUmlCode.toString() +
            "@enduml \n\n";
    }

    public void savePlantUmlGraphToSvg() {
        System.out.println("Writing protocol visualization to file?");
        String plantUmlGraph = getPlantUmlGraph();
        System.out.print(plantUmlGraph);

        try {
            saveSvgStringToFile(plantUmlGraph, "protocol_visualization.svg");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
