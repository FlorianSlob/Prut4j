package nl.florianslob.model.checking.sandbox.onthefly.datastructure;

import java.text.MessageFormat;
import java.util.HashSet;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Stream;
import nl.florianslob.model.checking.sandbox.LoggingHelper;

/**
 *
 * @author FlorianSlob TODO: Break logic into separate methods. Java Reference
 * types??? Check assignments of lists with existing lists, copy function? Add
 * Next operator 'X'
 *
 */
public class GraphNode {

    public GraphNode fatherNode; // We only need this for proof of correctness.
    public Set<GraphNode> childNodes = new HashSet<>();

    public String name;
    public Set<GraphNode> incomingEdges = new HashSet();
    public Set<TemporalFormulla> newFormullas = new HashSet();
    public Set<TemporalFormulla> oldFormullas = new HashSet();
    public Set<TemporalFormulla> nextFormullas = new HashSet();
    public Boolean isInitialState = false;
    private static int currentNodeId = 0;

    public GraphNode(String name, TemporalFormulla property, Boolean isInitialState) {
        this.name = name;
        this.isInitialState = isInitialState;
        newFormullas.add(property);
    }

    public GraphNode(String name, TemporalFormulla property) {
        this.name = name;
        newFormullas.add(property);
    }

    public GraphNode(String name) {
        this.name = name;
    }

    public void printTreeDepthFirst() {
        if (!isInitialState) {
            LoggingHelper.logInfoLine(MessageFormat.format("Printing {0}", name));
            if (fatherNode != null) {
                LoggingHelper.logInfoLine("Father node: " + fatherNode.name);
            }

            if (incomingEdges.size() > 0) {
                LoggingHelper.logInfoLine("Incomming edges:");
                incomingEdges.forEach(edge -> {
                    LoggingHelper.logInfoLine(edge.name);
                });
            }

            LoggingHelper.logInfoLine("Size new: " + newFormullas.size());
            newFormullas.forEach(formulla -> printFormulla(formulla));
            LoggingHelper.logInfoLine("Size old: " + oldFormullas.size());
            oldFormullas.forEach(formulla -> printFormulla(formulla));
            LoggingHelper.logInfoLine("Size of next: " + nextFormullas.size());
            nextFormullas.forEach(formulla -> printFormulla(formulla));

            LoggingHelper.logInfoLine("Children of : " + name);
        }
        childNodes.forEach((childNode) -> childNode.printTreeDepthFirst());
        if (!isInitialState) {
            LoggingHelper.logInfoLine("End of : " + name);
        }
    }

    private void printFormulla(TemporalFormulla formulla) {
        formulla.printRecursive();
        LoggingHelper.logInfoLine(",");
    }

    public void expand(Set<GraphNode> graphNodeSet) throws Exception {
        LoggingHelper.logDebug("Expanding graphNode " + this.name);
        // REF=figure1:line4 = if New(Node)= ∅ then
        if (this.newFormullas.isEmpty()) {
            LoggingHelper.logDebug("New temporal properties is empty.");

            // REF=figure1:line5 = if ∃ ND ∈ Nodes Set with Old(ND)=Old(Node) and Next(ND)=Next(Node)
            Optional<GraphNode> sameStateNode = getSameStateNode(graphNodeSet);
            if (sameStateNode.isPresent()) {
                // REF=figure1:line6 = then Incoming(ND) = Incoming(ND) ∪ Incoming(Node);
                GraphNode node = sameStateNode.get();
                node.incomingEdges.addAll(this.incomingEdges);
                // REF=figure1:line7 = return(Nodes Set);
                // !!! THIS IS WHERE THE CONSTRUCTION OF THE TREE ENDS!!!!
                // ALL Other Paths are infinite
            } else {
                // REF=figure1:line8,9,10 = 
                // else return(expand( [ Name ⇐ Father ⇐ new name(),
                // Incoming ⇐ { Name(Node) } , New ⇐ Next(Node),
                //  Old ⇐ ∅ , Next ⇐ ∅] , { Node }∪ Nodes Set))
                GraphNode newNode = new GraphNode("Node" + getNextNodeId());
                newNode.fatherNode = this;
                newNode.incomingEdges.add(this);
                newNode.newFormullas.addAll(this.nextFormullas);

                // Yes?? --> Yes!
                this.fatherNode.childNodes.add(this);

                graphNodeSet.add(this);

                newNode.expand(graphNodeSet);
            }
            // Do C1
        } else {
            // C2
            TemporalFormulla temporalFormulla = this.newFormullas.iterator().next();
            this.newFormullas.remove(temporalFormulla);
            // We take a transaction (or more) when we take a formulla from the new list

            if (temporalFormulla.isLeafFormulla()) {
                LoggingHelper.logDebug("Executing split option Leaf.");
                if ((temporalFormulla.truthValue != null && temporalFormulla.truthValue) // Is false truthValue
                        || this.oldFormullas.contains(temporalFormulla.getNegation())) // Negation is in old nodes
                {
                    LoggingHelper.logDebug("Contradicting leaf found, ignoring.");
                } else {
                    this.oldFormullas.add(temporalFormulla);
                    // TODO Call expand recursively?? See row 19??
                    // YES!YES
                    this.expand(graphNodeSet);

                }
            } else if (temporalFormulla.operator == TemporalOperator.U
                    || temporalFormulla.operator == TemporalOperator.V
                    || temporalFormulla.operator == TemporalOperator.Or) {
                LoggingHelper.logDebug("Action for U V Or(v) operators. Splitting nodes!");

                //21 Node1:= [ Name ⇐ new name(), Father ⇐ Name(Node), Incoming ⇐ Incoming(Node),
                //22 New ⇐ New(Node) ∪ ( { New1( η ) }\ Old(Node)),
                //23 Old ⇐ Old(Node) ∪{η} , Next=Next(Node) ∪{ Next1( η)}] ;
                GraphNode newNode1 = new GraphNode("Node" + getNextNodeId());
                newNode1.fatherNode = this.fatherNode;
                newNode1.incomingEdges = this.incomingEdges;

                newNode1.newFormullas = new HashSet(this.newFormullas);
                newNode1.newFormullas.addAll(this.getNew1(temporalFormulla));

                newNode1.oldFormullas = new HashSet(this.oldFormullas);
                newNode1.oldFormullas.add(temporalFormulla);

                newNode1.nextFormullas = new HashSet(this.nextFormullas);
                newNode1.nextFormullas.addAll(this.getNext1(temporalFormulla));

                //24 Node2:= [ Name ⇐ new name(), Father ⇐ Name(Node), Incoming ⇐ Incoming(Node),
                //25 New ⇐ New(Node) ∪({ New2( η)}\ Old(Node)),
                //26 Old ⇐ Old(Node) ∪{η} , Next ⇐ Next(Node) ] ;
                //27 return(expand(Node2, expand(Node1, Nodes Set)));
                GraphNode newNode2 = new GraphNode("Node" + getNextNodeId());
                newNode2.fatherNode = this.fatherNode;
                newNode2.incomingEdges = this.incomingEdges;

                newNode2.newFormullas = new HashSet(this.newFormullas);
                newNode2.newFormullas.addAll(this.getNew2(temporalFormulla));

                newNode2.oldFormullas = new HashSet(this.oldFormullas);
                newNode2.oldFormullas.add(temporalFormulla);

                newNode2.nextFormullas = new HashSet(this.nextFormullas);

                newNode1.expand(graphNodeSet);
                newNode2.expand(graphNodeSet);

            }else if (temporalFormulla.operator == TemporalOperator.X) 
            {
//                η = Xµ =>
//return(expand([Name⇐Name(Node), Father⇐Father(Node),
//Incoming⇐Incoming(Node), New⇐New(Node), Old⇐Old(Node)∪{η},
//Next⇐Next(Node)∪{µ}], Nodes Set))
                oldFormullas.add(temporalFormulla);
                nextFormullas.add(temporalFormulla.rightOperantFormulla);
                
                expand(graphNodeSet);
            }
            else {

                //return(expand( [ Name ⇐ Name(Node), Father ⇐ Father(Node), Incoming ⇐ Incoming(Node),
                //30 New ⇐ New(Node) ∪({µ, ψ }\ Old(Node)),
                //31 Old ⇐ Old(Node) ∪{η} , Next=Next(Node) ] , Nodes Set))
                LoggingHelper.logDebug("Action for And(^) operator.");

                GraphNode newNode = new GraphNode(this.name);
                newNode.fatherNode = this.fatherNode;
                newNode.incomingEdges.addAll(this.incomingEdges);
                newNode.newFormullas = new HashSet(this.newFormullas);

                if (!this.oldFormullas.contains(temporalFormulla.leftOperantFormulla)) {
                    newNode.newFormullas.add(temporalFormulla.leftOperantFormulla);
                }
                if (!this.oldFormullas.contains(temporalFormulla.rightOperantFormulla)) {
                    newNode.newFormullas.add(temporalFormulla.rightOperantFormulla);
                }

                newNode.oldFormullas = new HashSet(this.oldFormullas);
                newNode.oldFormullas.add(temporalFormulla);

                newNode.nextFormullas = new HashSet(this.nextFormullas);

                newNode.expand(graphNodeSet);
            }
        }
    }

    private Optional<GraphNode> getSameStateNode(Set<GraphNode> graphNodeSet) throws Exception {
        Stream<GraphNode> nodes = graphNodeSet
                .stream()
                .filter(graphNode
                        -> graphNode.oldFormullas.equals(this.oldFormullas)
                && graphNode.nextFormullas.equals(this.nextFormullas)
                ); // TODO Implement equals for sets of temporal properties. Separate method?

        return nodes.findFirst();
    }

    private static int getNextNodeId() {
        GraphNode.currentNodeId++;
        return GraphNode.currentNodeId;
    }

    private Set<TemporalFormulla> getNew1(TemporalFormulla inputFormulla) {
        HashSet<TemporalFormulla> returnValue = new HashSet();
        TemporalFormulla returnFormulla;

        if (inputFormulla.operator == TemporalOperator.U || inputFormulla.operator == TemporalOperator.Or) {
            returnFormulla = inputFormulla.leftOperantFormulla;
        } else {
            returnFormulla = inputFormulla.rightOperantFormulla;
        }

        if (!this.oldFormullas.contains(returnFormulla)) {
            returnValue.add(returnFormulla);
        }

        return returnValue;
    }

    private Set<TemporalFormulla> getNew2(TemporalFormulla inputFormulla) {
        HashSet<TemporalFormulla> returnValue = new HashSet();

        returnValue.add(inputFormulla.rightOperantFormulla);

        if (inputFormulla.operator == TemporalOperator.V) {
            returnValue.add(inputFormulla.leftOperantFormulla);
        }

        return returnValue;
    }

    private Set<TemporalFormulla> getNext1(TemporalFormulla inputFormulla) {

        HashSet<TemporalFormulla> returnValue = new HashSet();

        if (!(inputFormulla.operator == TemporalOperator.Or)) {
            returnValue.add(inputFormulla);
        }

        return returnValue;
    }
}
