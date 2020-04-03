package nl.florianslob.model.checking.sandbox.protocolimplementations;

import java.util.HashSet;
import java.util.Set;

public class PlantUmlProtocolWatcher implements IProtocolWatcher {

    // fields for visualizing the graph
    private Set<Integer> alreadyVisualizedStates = new HashSet<>();
    private Set<Integer> alreadyVisualizedTransaction = new HashSet<>();

    private StringBuilder plantUmlCode = new StringBuilder();

    @Override
    public void reportVisitedState(int stateIdentifier) {
        if (!alreadyVisualizedStates.contains(stateIdentifier)) {
            alreadyVisualizedStates.add(stateIdentifier);

            plantUmlCode.append("State" + stateIdentifier + " :  \n");
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

    public String getPlantUmlGraph() {
        // This is where the magic should happen.

        return "@startuml\n" +
            " header\n" +
            "\n" +
            "\n" +
            " endheader\n" +
            " \n" +
//            "skinparam state{\n" +
//            "\t backgroundColor<<accepting>> Lime\n" +
//            "}\n" +
            "\n" +
            "[*] -> State0 \n" +
            plantUmlCode.toString() +
            "@enduml \n\n";
    }
}
