package nl.florianslob.model.checking.sandbox.protocolcodegeneration.definitiondatastructure;

import static nl.florianslob.model.checking.sandbox.helpers.GraphVisualizationHelpers.saveSvgStringToFile;

public class PlantUmlVisualizationVisitor implements IVisitor<ProtocolStateNode> {

    private StringBuilder plantUmlSyntaxFromVisits = new StringBuilder();

    @Override
    public void Visit(ProtocolStateNode host) {
        // Add all transitions to plantUml syntax, with some formatting
        for(ProtocolTransaction transaction : host.outgoingTransactions){
            plantUmlSyntaxFromVisits.append("State");
            plantUmlSyntaxFromVisits.append(host.stateId);
            plantUmlSyntaxFromVisits.append("-->State");
            plantUmlSyntaxFromVisits.append(transaction.targetState.stateId);
            plantUmlSyntaxFromVisits.append(":");

            plantUmlSyntaxFromVisits.append("[");
            plantUmlSyntaxFromVisits.append(transaction.fromRole);
            plantUmlSyntaxFromVisits.append(",");
            plantUmlSyntaxFromVisits.append(transaction.toRole);
            plantUmlSyntaxFromVisits.append("]");
            if(transaction.action == ProtocolMessageAction.SEND){
                plantUmlSyntaxFromVisits.append("!");
            }else{
                plantUmlSyntaxFromVisits.append("?");
            }
            plantUmlSyntaxFromVisits.append("\\n");
            plantUmlSyntaxFromVisits.append(transaction.messageContentType);
            plantUmlSyntaxFromVisits.append("\n");
        }
    }

    public String getPlantUmlSyntax(){
        return "@startuml\n" +
            " header\n" +
            "\n" +
            "\n" +
            " endheader\n" +
            "\n" +
            "\n" +
            "[*] -> State0 \n" +
            plantUmlSyntaxFromVisits.toString() +
            "@enduml \n\n";
    }

    public void savePlantUmlGraphToSvg() {
        System.out.println("Writing protocol visualization to file?");
        String plantUmlGraph = getPlantUmlSyntax();
        System.out.print(plantUmlGraph);

        try {
            saveSvgStringToFile(plantUmlGraph, "protocol_definition.svg");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
