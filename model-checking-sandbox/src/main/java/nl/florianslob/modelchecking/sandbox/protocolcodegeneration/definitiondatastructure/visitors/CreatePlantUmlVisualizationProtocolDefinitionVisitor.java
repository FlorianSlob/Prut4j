package nl.florianslob.modelchecking.sandbox.protocolcodegeneration.definitiondatastructure.visitors;

import nl.florianslob.modelchecking.sandbox.protocolcodegeneration.definitiondatastructure.ProtocolMessageActionType;
import nl.florianslob.modelchecking.sandbox.protocolcodegeneration.definitiondatastructure.ProtocolStateNode;
import nl.florianslob.modelchecking.sandbox.protocolcodegeneration.definitiondatastructure.ProtocolTransaction;
import nl.florianslob.modelchecking.sandbox.helpers.GraphVisualizationHelpers;

public class CreatePlantUmlVisualizationProtocolDefinitionVisitor implements IProtocolDefinitionVisitor {

    private StringBuilder plantUmlSyntax = new StringBuilder();

    @Override
    public void Visit(ProtocolStateNode protocolStateNode) {
        // Add all transitions to plantUml syntax, with some formatting
        for(ProtocolTransaction transaction : protocolStateNode.outgoingTransactions){
            plantUmlSyntax.append("State");
            plantUmlSyntax.append(protocolStateNode.stateId);
            plantUmlSyntax.append("-->State");
            plantUmlSyntax.append(transaction.targetState.stateId);
            plantUmlSyntax.append(":");

            plantUmlSyntax.append("[");
            plantUmlSyntax.append(transaction.fromRole);
            plantUmlSyntax.append(",");
            plantUmlSyntax.append(transaction.toRole);
            plantUmlSyntax.append("]");
            if(transaction.action == ProtocolMessageActionType.SEND){
                plantUmlSyntax.append("!");
            }else{
                plantUmlSyntax.append("?");
            }
            plantUmlSyntax.append("\\n");
            plantUmlSyntax.append(transaction.messageContentType);
            plantUmlSyntax.append("\n");
        }
    }

    // Ignoring spell check for PlantUml Syntax
    @SuppressWarnings("SpellCheckingInspection")
    public String getPlantUmlSyntax(){
        return "@startuml\n" +
            " header\n" +
            "\n" +
            "\n" +
            " endheader\n" +
            "\n" +
            "\n" +
            "[*] -> State0 \n" +
            plantUmlSyntax.toString() +
            "@enduml \n\n";
    }

    public void savePlantUmlGraphToSvg() {
        System.out.println("Writing protocol visualization to file?");
        String plantUmlGraph = getPlantUmlSyntax();
        System.out.print(plantUmlGraph);

        try {
            GraphVisualizationHelpers.saveSvgStringToFile(plantUmlGraph, "protocol_definition.svg");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
