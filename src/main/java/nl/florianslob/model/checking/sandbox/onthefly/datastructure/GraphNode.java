package nl.florianslob.model.checking.sandbox.onthefly.datastructure;

import java.text.MessageFormat;
import java.util.HashSet;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Stream;

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
    public Set<TemporalFormulla> newTemporalFormullas = new HashSet();
    public Set<TemporalFormulla> oldTemporalFormullas = new HashSet();
    public Set<TemporalFormulla> nextTemporalFormullas = new HashSet();
    public Boolean isInitialState = false;
    private static int currentNodeId = 0;

    public GraphNode(String name, TemporalFormulla property, Boolean isInitialState) {
        this.name = name;
        this.isInitialState = isInitialState;
        newTemporalFormullas.add(property);
    }

    public GraphNode(String name, TemporalFormulla property) {
        this.name = name;
        newTemporalFormullas.add(property);
    }

    public GraphNode(String name) {
        this.name = name;
    }

    public void printTreeDepthFirst() {
        System.out.println(MessageFormat.format("Printing from {0}", name));
        System.out.println(MessageFormat.format("Initial? {0}", isInitialState));
        if (fatherNode != null) {
            System.out.println("Name of father node: " + fatherNode.name);
        }

        if (incomingEdges.size() > 0) {
            incomingEdges.forEach(edge -> {
                System.out.println("Name of incomming edge: " + edge.name);
            });
        }
        
        
        System.out.println("Number of incomming newTemporalFormullas: " + newTemporalFormullas.size());
        newTemporalFormullas.forEach(formulla -> formulla.printRecursive());
        System.out.println("Number of incomming oldTemporalFormullas: " + oldTemporalFormullas.size());
        oldTemporalFormullas.forEach(formulla -> formulla.printRecursive());
        System.out.println("Number of incomming nextTemporalFormullas: " + nextTemporalFormullas.size());
        nextTemporalFormullas.forEach(formulla -> formulla.printRecursive());

        childNodes.forEach((childNode) -> childNode.printTreeDepthFirst());
    }

    public void expand(Set<GraphNode> graphNodeSet) throws Exception {
        System.out.println("Expanding graphNode " + this.name);
        // REF=figure1:line4 = if New(Node)= ∅ then
        if (this.newTemporalFormullas.isEmpty()) {
            System.out.println("New temporal properties is empty.");

            // REF=figure1:line5 = if ∃ ND ∈ Nodes Set with Old(ND)=Old(Node) and Next(ND)=Next(Node)
            Optional<GraphNode> sameStateNode = getSameStateNode(graphNodeSet);
            if (sameStateNode.isPresent()) {
                // REF=figure1:line6 = then Incoming(ND) = Incoming(ND) ∪ Incoming(Node);
                GraphNode node = sameStateNode.get();
                node.incomingEdges.addAll(this.incomingEdges);
                // REF=figure1:line7 = return(Nodes Set);
                return; // TODO Does this work? Ref type etc...???
            } else {
                // REF=figure1:line8,9,10 = 
                // else return(expand( [ Name ⇐ Father ⇐ new name(),
                // Incoming ⇐ { Name(Node) } , New ⇐ Next(Node),
                //  Old ⇐ ∅ , Next ⇐ ∅] , { Node }∪ Nodes Set))
                GraphNode newNode = new GraphNode("Node" + getNextNodeId());
                newNode.fatherNode = this;
                newNode.incomingEdges.add(this);
                newNode.newTemporalFormullas.addAll(this.nextTemporalFormullas);

                // Yes??
                this.fatherNode.childNodes.add(this);

                graphNodeSet.add(this);

                newNode.expand(graphNodeSet);
            }
            // Do C1
        } else {
            // C2
            TemporalFormulla temporalFormulla = this.newTemporalFormullas.iterator().next();
            this.newTemporalFormullas.remove(temporalFormulla);

            if (temporalFormulla.isLeafFormulla()) {
                System.out.println("Executing split option Leaf.");
                if ((temporalFormulla.truthValue != null && temporalFormulla.truthValue) // Is false truthValue
                        || this.oldTemporalFormullas.contains(temporalFormulla.getNegation())) // Negation is in old nodes
                {
                    System.out.println("Contradicting leaf found, ignoring.");
                } else {
                    this.oldTemporalFormullas.add(temporalFormulla);
                    // TODO Call expand recursively?? See row 19??
                    // YES!YES
                    this.expand(graphNodeSet);

                }
            } else if (temporalFormulla.operator == TemporalOperator.U
                    || temporalFormulla.operator == TemporalOperator.V
                    || temporalFormulla.operator == TemporalOperator.Or) {
                System.out.println("Action for U V Or(v) operators. Splitting nodes!");

                //21 Node1:= [ Name ⇐ new name(), Father ⇐ Name(Node), Incoming ⇐ Incoming(Node),
                //22 New ⇐ New(Node) ∪ ( { New1( η ) }\ Old(Node)),
                //23 Old ⇐ Old(Node) ∪{η} , Next=Next(Node) ∪{ Next1( η)}] ;
                GraphNode newNode1 = new GraphNode("Node" + getNextNodeId());
                newNode1.fatherNode = this.fatherNode;
                newNode1.incomingEdges = this.incomingEdges;

                newNode1.newTemporalFormullas = new HashSet(this.newTemporalFormullas);
                newNode1.newTemporalFormullas.addAll(this.getNew1(temporalFormulla));

                newNode1.oldTemporalFormullas = new HashSet(this.oldTemporalFormullas);
                newNode1.oldTemporalFormullas.add(temporalFormulla);

                newNode1.nextTemporalFormullas = new HashSet(this.nextTemporalFormullas);
                newNode1.nextTemporalFormullas.addAll(this.getNext1(temporalFormulla));

                //24 Node2:= [ Name ⇐ new name(), Father ⇐ Name(Node), Incoming ⇐ Incoming(Node),
                //25 New ⇐ New(Node) ∪({ New2( η)}\ Old(Node)),
                //26 Old ⇐ Old(Node) ∪{η} , Next ⇐ Next(Node) ] ;
                //27 return(expand(Node2, expand(Node1, Nodes Set)));
                GraphNode newNode2 = new GraphNode("Node" + getNextNodeId());
                newNode2.fatherNode = this.fatherNode;
                newNode2.incomingEdges = this.incomingEdges;

                newNode2.newTemporalFormullas = new HashSet(this.newTemporalFormullas);
                newNode2.newTemporalFormullas.addAll(this.getNew2(temporalFormulla));

                newNode2.oldTemporalFormullas = new HashSet(this.oldTemporalFormullas);
                newNode2.oldTemporalFormullas.add(temporalFormulla);

                newNode2.nextTemporalFormullas = new HashSet(this.nextTemporalFormullas);

                newNode1.expand(graphNodeSet);
                newNode2.expand(graphNodeSet);

            } else {

                //return(expand( [ Name ⇐ Name(Node), Father ⇐ Father(Node), Incoming ⇐ Incoming(Node),
                //30 New ⇐ New(Node) ∪({µ, ψ }\ Old(Node)),
                //31 Old ⇐ Old(Node) ∪{η} , Next=Next(Node) ] , Nodes Set))
                System.out.println("Action for And(^) operator.");

                GraphNode newNode = new GraphNode(this.name);
                newNode.fatherNode = this.fatherNode;
                newNode.incomingEdges.addAll(this.incomingEdges);
                newNode.newTemporalFormullas = new HashSet(this.newTemporalFormullas);

                if (!this.oldTemporalFormullas.contains(temporalFormulla.leftOperantFormulla)) {
                    newNode.newTemporalFormullas.add(temporalFormulla.leftOperantFormulla);
                }
                if (!this.oldTemporalFormullas.contains(temporalFormulla.rightOperantFormulla)) {
                    newNode.newTemporalFormullas.add(temporalFormulla.rightOperantFormulla);
                }

                newNode.oldTemporalFormullas = new HashSet(this.oldTemporalFormullas);
                newNode.oldTemporalFormullas.add(temporalFormulla);

                newNode.nextTemporalFormullas = new HashSet(this.nextTemporalFormullas);

                newNode.expand(graphNodeSet);
            }
        }
    }

    private Optional<GraphNode> getSameStateNode(Set<GraphNode> graphNodeSet) throws Exception {
        Stream<GraphNode> nodes = graphNodeSet
                .stream()
                .filter(graphNode
                        -> graphNode.oldTemporalFormullas.equals(this.oldTemporalFormullas)
                && graphNode.nextTemporalFormullas.equals(this.nextTemporalFormullas)
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

        if (!this.oldTemporalFormullas.contains(returnFormulla)) {
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
