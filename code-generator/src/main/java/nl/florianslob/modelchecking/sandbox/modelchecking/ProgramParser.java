package nl.florianslob.modelchecking.sandbox.modelchecking;

import nl.florianslob.modelchecking.sandbox.modelchecking.datastructure.AtomicProposition;
import nl.florianslob.modelchecking.sandbox.modelchecking.datastructure.NodeRelation;
import nl.florianslob.modelchecking.sandbox.modelchecking.datastructure.StateNode;

import java.util.HashMap;

public class ProgramParser {

    public static final String END_OF_FILE = "THE_END";
    public static final String NODE_DEF = "NODE";
    public static final String REL_DEF = "REL";

    public static StateNode Parse(String programDefinition) throws Exception {
        String[] programDefinitionLines = programDefinition.split("\n");

        StateNode initialNode = null;
        HashMap<String, StateNode> nodesByName = new HashMap<>();

        int counter = 0;

        for (String programLine : programDefinitionLines) {
            counter++;
            try {
                if (programLine.startsWith(NODE_DEF)) {
                    StateNode newNode = getStateNodeFromLine(programLine);

                    nodesByName.put(newNode.GetHashingNumberKey(), newNode);
                    // Add Node to list
                    if (initialNode == null) {
                        // Add as initial if empty
                        initialNode = newNode;
                    }
                } else if (programLine.startsWith(REL_DEF)) {
                    // Add relation
                    NodeRelation newRelation = getStateNodeRelationFromLine(programLine);
                    StateNode fromNode = nodesByName.get(newRelation.fromNodeHashingNumber);
                    StateNode toNode = nodesByName.get(newRelation.toNodeHashingNumber);

                    // Add the actual relation
                    fromNode.Successors.add(toNode);
                } else if (programLine.startsWith(END_OF_FILE)) {
                    return initialNode;
                } else {
                    throw new Exception("Format error on line " + counter + ", cannot read line: " + programLine);
                }
            }catch (Exception e){
                throw new Exception("Format error on line " + counter + ", cannot read line: " + programLine + "Original Exception"+e.getMessage());
            }
        }
        throw new Exception("Format error, missing THE_END");
    }

    private static NodeRelation getStateNodeRelationFromLine(String programLine) {
        String relationPart = programLine.split("=")[1]; // Get all after the = char
        String[] relationPartNodeHashingNumbers = relationPart.split("->");
        return new NodeRelation(relationPartNodeHashingNumbers[0], relationPartNodeHashingNumbers[1]);
    }

    private static StateNode getStateNodeFromLine(String programLine) {
        String[] stateNodeParts = programLine.split("\\|"); // Get all after the = char

        String nodeHashingNumber = stateNodeParts[0].split("=")[1];
        String[] atomicPropositions = stateNodeParts[1].split("=")[1].split(",");

        StateNode returnValue = new StateNode(Integer.parseInt(nodeHashingNumber));

        for (String atomicProposition : atomicPropositions) {
            returnValue.AtomicPropositions.add(new AtomicProposition(atomicProposition));
        }

        return returnValue;
    }
}
