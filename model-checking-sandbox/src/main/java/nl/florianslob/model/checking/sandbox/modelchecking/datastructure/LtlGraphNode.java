package nl.florianslob.model.checking.sandbox.modelchecking.datastructure;

import java.text.MessageFormat;
import java.util.HashSet;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Stream;
import nl.florianslob.model.checking.sandbox.LoggingHelper;

/**
 *
 * @author FlorianSlob
 *
 * Java implementation of the 'Expand' algorithm as described in figure 1 of the
 * the following article:
 * -------------------------------------------------------------------- Gerth
 * R., Peled D., Vardi M.Y., Wolper P. (1996) Simple On-the-fly Automatic
 * Verification of Linear Temporal Logic. In: Dembiński P., Średniawa M. (eds)
 * Protocol Specification, Testing and Verification XV. PSTV 1995. IFIP Advances
 * in Information and Communication Technology. Springer, Boston, MA
 * --------------------------------------------------------------------
 *
 */
public class LtlGraphNode {

    public LtlGraphNode fatherNode; // We only need this for proof of correctness.
    public Set<LtlGraphNode> childNodes = new HashSet<>();

    public String name;
    public Set<LtlGraphNode> incomingEdges = new HashSet();
    public Set<LtlFormulla> newFormullas = new HashSet();
    public Set<LtlFormulla> oldFormullas = new HashSet();
    public Set<LtlFormulla> nextFormullas = new HashSet();
    public boolean isInitialState = false;
    private static int currentNodeId = 0;

    public LtlGraphNode(String name) {
        this.name = name;
    }

    public LtlGraphNode(String name, LtlFormulla property) {
        this.name = name;
        newFormullas.add(property);
    }

    public LtlGraphNode(String name, LtlFormulla property, Boolean isInitialState) {
        this.name = name;
        this.isInitialState = isInitialState;
        newFormullas.add(property);
    }

    /**
     * Expands the nodes according to the formulas in the formula sets as
     * described in figure 1 of the article. We use #Ref=line{line number of
     * code in figure 1} to refer to the code in the article.
     *
     * One slight difference is the handling of the graphNodeSet. In the article
     * it is always returned from the expand method. Since the set is a
     * reference type, we add nodes to the set as we go and do not need to
     * return the set. The return type of the method is therefore 'void'.
     *
     * @param graphNodeSet
     * @throws Exception
     */
    public void expand(Set<LtlGraphNode> graphNodeSet) throws Exception {

        LoggingHelper.logDebug("Expanding graphNode " + this.name);

        if (this.newFormullas.isEmpty()) { // #REF=line4
            LoggingHelper.logDebug("New temporal properties is empty.");

            Optional<LtlGraphNode> sameStateNode = getSameStateNode(graphNodeSet); // #REF=line5
            if (sameStateNode.isPresent()) { // #REF=line5

                LtlGraphNode node = sameStateNode.get();// #REF=line5
                node.incomingEdges.addAll(this.incomingEdges);// #REF=line6
                // #REF=line7 - Don't need to return the node set in Java.
            } else { // #REF=figure1:line8,9,10                 
                LtlGraphNode newNode = new LtlGraphNode("Node" + getNextNodeId());
                newNode.fatherNode = this;
                newNode.incomingEdges.add(this);
                newNode.newFormullas.addAll(this.nextFormullas);
                this.fatherNode.childNodes.add(this);

                graphNodeSet.add(this);

                newNode.expand(graphNodeSet);
            }
        } else // #REF=Line11
        {
            LtlFormulla temporalFormulla = this.newFormullas.iterator().next(); // #REF=Line12
            this.newFormullas.remove(temporalFormulla); // #REF=Line13
            // We take a transaction (or more) when we take a formulla from the new list

            if (temporalFormulla.isLeafFormulla()) { // #REF=Line14,15
                LoggingHelper.logDebug("Executing split option Leaf.");

                if ((temporalFormulla.truthValue != null && temporalFormulla.truthValue) // #REF=Line16 Is false truthValue
                        || this.oldFormullas.contains(temporalFormulla.getNegation())) // #REF=Line16 Negation is in old nodes
                {
                    // #REF=Line17 Discard current node
                    LoggingHelper.logDebug("Contradicting leaf found, ignoring.");
                } else { // #REF=Line18
                    this.oldFormullas.add(temporalFormulla); // #REF=Line18
                    this.expand(graphNodeSet); // #REF=Line19

                }
            } else if (temporalFormulla.operator == TemporalOperator.U
                    || temporalFormulla.operator == TemporalOperator.V
                    || temporalFormulla.operator == TemporalOperator.Or) { // #REF=Line20
                LoggingHelper.logDebug("Action for U V Or(v) operators. Splitting nodes!");

                // Splitting in to two new nodes
                // Node1 ---------------------------
                LtlGraphNode newNode1 = new LtlGraphNode("Node" + getNextNodeId()); // #REF=Line21
                newNode1.fatherNode = this.fatherNode; // #REF=Line21
                newNode1.incomingEdges = this.incomingEdges; // #REF=Line21

                newNode1.newFormullas = new HashSet(this.newFormullas); // #REF=Line22
                newNode1.newFormullas.addAll(this.getNew1(temporalFormulla)); // #REF=Line22

                newNode1.oldFormullas = new HashSet(this.oldFormullas); // #REF=Line23
                // TODO Do we need this for model checking? I don't think so. 
                newNode1.oldFormullas.add(temporalFormulla); // #REF=Line23

                newNode1.nextFormullas = new HashSet(this.nextFormullas); // #REF=Line23
                newNode1.nextFormullas.addAll(this.getNext1(temporalFormulla)); // #REF=Line23

                // Node2 ----------------------------
                LtlGraphNode newNode2 = new LtlGraphNode("Node" + getNextNodeId()); // #REF=Line24
                newNode2.fatherNode = this.fatherNode; // #REF=Line24
                newNode2.incomingEdges = this.incomingEdges; // #REF=Line24

                newNode2.newFormullas = new HashSet(this.newFormullas); // #REF=Line25
                newNode2.newFormullas.addAll(this.getNew2(temporalFormulla)); // #REF=Line25

                newNode2.oldFormullas = new HashSet(this.oldFormullas); // #REF=Line26
                // TODO Do we need this for model checking? I don't think so. 
                newNode2.oldFormullas.add(temporalFormulla); // #REF=Line26

                newNode2.nextFormullas = new HashSet(this.nextFormullas); // #REF=Line26

                newNode1.expand(graphNodeSet); // #REF=Line27
                newNode2.expand(graphNodeSet); // #REF=Line27

            } else if (temporalFormulla.operator == TemporalOperator.X) { //#REF=First paragraph of 3.4 (next operator)
                //#REF=First paragraph of 3.4 (next operator)
                oldFormullas.add(temporalFormulla);
                nextFormullas.add(temporalFormulla.rightOperantFormulla);

                expand(graphNodeSet);
            } else { // #REF=Line28

                LoggingHelper.logDebug("Action for And(^) operator.");

                LtlGraphNode newNode = new LtlGraphNode(this.name); // #REF=Line29
                newNode.fatherNode = this.fatherNode;// #REF=Line29
                newNode.incomingEdges.addAll(this.incomingEdges);// #REF=Line29
                newNode.newFormullas = new HashSet(this.newFormullas); // #REF=Line30

                if (!this.oldFormullas.contains(temporalFormulla.leftOperantFormulla)) {// #REF=Line30
                    newNode.newFormullas.add(temporalFormulla.leftOperantFormulla);
                }
                if (!this.oldFormullas.contains(temporalFormulla.rightOperantFormulla)) {// #REF=Line30
                    newNode.newFormullas.add(temporalFormulla.rightOperantFormulla);
                }

                newNode.oldFormullas = new HashSet(this.oldFormullas);// #REF=Line31
                newNode.oldFormullas.add(temporalFormulla);// #REF=Line31

                newNode.nextFormullas = new HashSet(this.nextFormullas);// #REF=Line31

                newNode.expand(graphNodeSet); // #REF=Line29 - 31
            }
        }
    }

    /**
     *
     * @param graphNodeSet
     * @return a node from the graphNodeSet if it is the same as the current
     * node
     * @throws Exception
     */
    private Optional<LtlGraphNode> getSameStateNode(Set<LtlGraphNode> graphNodeSet) throws Exception {
        Stream<LtlGraphNode> nodes;
        nodes = graphNodeSet
                .stream()
                .filter(graphNode
                        -> graphNode.oldFormullas.equals(this.oldFormullas)
                && graphNode.nextFormullas.equals(this.nextFormullas)
                );

        return nodes.findFirst();
    }

    /**
     * @return an incremented node id, used for generating new node names.
     */
    private static int getNextNodeId() {
        LtlGraphNode.currentNodeId++;
        return LtlGraphNode.currentNodeId;
    }

    /**
     * Get New1 formula as described in paragraph 3.2
     *
     * @param inputFormulla
     * @return the value for New1 in the algorithm
     */
    private Set<LtlFormulla> getNew1(LtlFormulla inputFormulla) {
        HashSet<LtlFormulla> returnValue = new HashSet();
        LtlFormulla returnFormulla;

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

    /**
     * Get Next1 formula as described in paragraph 3.2
     *
     * @param inputFormulla
     * @return the value for Next1 in the algorithm
     */
    private Set<LtlFormulla> getNext1(LtlFormulla inputFormulla) {
        HashSet<LtlFormulla> returnValue = new HashSet();

        if (!(inputFormulla.operator == TemporalOperator.Or)) {
            returnValue.add(inputFormulla);
        }

        return returnValue;
    }

    /**
     * Get New2 formula as described in paragraph 3.2
     *
     * @param inputFormulla
     * @return the value for New2 in the algorithm
     */
    private Set<LtlFormulla> getNew2(LtlFormulla inputFormulla) {
        HashSet<LtlFormulla> returnValue = new HashSet();

        returnValue.add(inputFormulla.rightOperantFormulla);

        if (inputFormulla.operator == TemporalOperator.V) {
            returnValue.add(inputFormulla.leftOperantFormulla);
        }

        return returnValue;
    }

    /**
     * Method to print all graph nodes depth first.
     */
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

    private void printFormulla(LtlFormulla formulla) {
        formulla.printRecursive();
        LoggingHelper.logInfoLine(",");
    }
}
