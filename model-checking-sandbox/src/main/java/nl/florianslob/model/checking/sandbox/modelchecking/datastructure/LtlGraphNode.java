package nl.florianslob.model.checking.sandbox.modelchecking.datastructure;

import java.text.MessageFormat;
import java.util.HashSet;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Stream;
import nl.florianslob.model.checking.sandbox.LoggingHelper;
import nl.florianslob.model.checking.sandbox.base.GraphNode;

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
public class LtlGraphNode extends GraphNode {

    public LtlGraphNode fatherNode; // We only need this for proof of correctness.
    public final Set<LtlGraphNode> childNodes = new HashSet<>(); // TODO Make abstract?!

    public final String name;
    public Set<LtlGraphNode> incomingEdges = new HashSet<>();
    public Set<LtlFormula> newFormulas = new HashSet<>();
    public Set<LtlFormula> oldFormulas = new HashSet<>();
    public Set<LtlFormula> nextFormulas = new HashSet<>();
    public boolean isInitialState = false;
    private static int currentNodeId = 0;


    public LtlGraphNode(final String name) {
        this.name = name;
    }

    public LtlGraphNode(final String name, final LtlFormula property) {
        this.name = name;
        newFormulas.add(property);
    }

    /**
     * Expands the nodes according to the formulas in the formula sets as described
     * in figure 1 of the article. We use #Ref=line{line number of code in figure 1}
     * to refer to the code in the article.
     *
     * One slight difference is the handling of the graphNodeSet. In the article it
     * is always returned from the expand method. Since the set is a reference type,
     * we add nodes to the set as we go and do not need to return the set. The
     * return type of the method is therefore 'void'.
     *
     * @param graphNodeSet the set with nodes that are already processed.
     */
    public void expand(final Set<LtlGraphNode> graphNodeSet){

        LoggingHelper.logDebug("Expanding graphNode " + this.name);

        if (this.newFormulas.isEmpty()) { // #REF=line4
            LoggingHelper.logDebug("New temporal properties is empty.");

            final Optional<LtlGraphNode> sameStateNode = getSameStateNode(graphNodeSet); // #REF=line5
            if (sameStateNode.isPresent()) { // #REF=line5

                final LtlGraphNode node = sameStateNode.get();// #REF=line5
                node.incomingEdges.addAll(this.incomingEdges);// #REF=line6
                // TODO Validate this fix!
                this.fatherNode.childNodes.add(node);
                // #REF=line7 - Don't need to return the node set in Java.
            } else { // #REF=figure1:line8,9,10
                final LtlGraphNode newNode = new LtlGraphNode("LtlNode" + getNextNodeId());
                newNode.fatherNode = this;
                newNode.incomingEdges.add(this);
                newNode.newFormulas.addAll(this.nextFormulas);
                this.fatherNode.childNodes.add(this);

                graphNodeSet.add(this);

                newNode.expand(graphNodeSet);
            }
        } else // #REF=Line11
        {
            final LtlFormula temporalFormula = this.newFormulas.iterator().next(); // #REF=Line12
            this.newFormulas.remove(temporalFormula); // #REF=Line13
            // We take a transaction (or more) when we take a formula from the new list

            if (temporalFormula.isLeafFormula()) { // #REF=Line14,15
                LoggingHelper.logDebug("Executing split option Leaf.");

                if ((temporalFormula.truthValue != null && temporalFormula.truthValue) // #REF=Line16 Is false
                                                                                         // truthValue
                        || this.oldFormulas.contains(temporalFormula.getNegation())) // #REF=Line16 Negation is in old
                                                                                       // nodes
                {
                    // #REF=Line17 Discard current node
                    LoggingHelper.logDebug("Contradicting leaf found, ignoring.");
                } else { // #REF=Line18
                    this.oldFormulas.add(temporalFormula); // #REF=Line18
                    this.expand(graphNodeSet); // #REF=Line19

                }
            } else if (temporalFormula.operator == TemporalOperator.U
                    || temporalFormula.operator == TemporalOperator.V
                    || temporalFormula.operator == TemporalOperator.Or) { // #REF=Line20
                LoggingHelper.logDebug("Action for U V Or(v) operators. Splitting nodes!");

                // Splitting in to two new nodes
                // Node1 ---------------------------
                final LtlGraphNode newNode1 = new LtlGraphNode("LtlNode" + getNextNodeId()); // #REF=Line21
                newNode1.fatherNode = this.fatherNode; // #REF=Line21
                newNode1.incomingEdges = this.incomingEdges; // #REF=Line21

                newNode1.newFormulas = new HashSet<>(this.newFormulas); // #REF=Line22
                newNode1.newFormulas.addAll(this.getNew1(temporalFormula)); // #REF=Line22

                newNode1.oldFormulas = new HashSet<>(this.oldFormulas); // #REF=Line23

                // TODO Do we need this for model checking? I don't think so.
                newNode1.oldFormulas.add(temporalFormula); // #REF=Line23

                newNode1.nextFormulas = new HashSet<>(this.nextFormulas); // #REF=Line23
                newNode1.nextFormulas.addAll(this.getNext1(temporalFormula)); // #REF=Line23

                // Node2 ----------------------------
                final LtlGraphNode newNode2 = new LtlGraphNode("LtlNode" + getNextNodeId()); // #REF=Line24
                newNode2.fatherNode = this.fatherNode; // #REF=Line24
                newNode2.incomingEdges = this.incomingEdges; // #REF=Line24

                newNode2.newFormulas = new HashSet<>(this.newFormulas); // #REF=Line25
                newNode2.newFormulas.addAll(this.getNew2(temporalFormula)); // #REF=Line25

                newNode2.oldFormulas = new HashSet<>(this.oldFormulas); // #REF=Line26
                // TODO Do we need this for model checking? I don't think so.
                newNode2.oldFormulas.add(temporalFormula); // #REF=Line26

                newNode2.nextFormulas = new HashSet<>(this.nextFormulas); // #REF=Line26

                newNode1.expand(graphNodeSet); // #REF=Line27
                newNode2.expand(graphNodeSet); // #REF=Line27

            } else if (temporalFormula.operator == TemporalOperator.X) { // #REF=First paragraph of 3.4 (next operator)
                // #REF=First paragraph of 3.4 (next operator)
                oldFormulas.add(temporalFormula);
                nextFormulas.add(temporalFormula.rightOperandFormula);

                expand(graphNodeSet);
            } else { // #REF=Line28

                LoggingHelper.logDebug("Action for And(^) operator.");

                final LtlGraphNode newNode = new LtlGraphNode(this.name); // #REF=Line29
                newNode.fatherNode = this.fatherNode;// #REF=Line29
                newNode.incomingEdges.addAll(this.incomingEdges);// #REF=Line29
                newNode.newFormulas = new HashSet<>(this.newFormulas); // #REF=Line30

                if (!this.oldFormulas.contains(temporalFormula.leftOperandFormula)) {// #REF=Line30
                    newNode.newFormulas.add(temporalFormula.leftOperandFormula);
                }
                if (!this.oldFormulas.contains(temporalFormula.rightOperandFormula)) {// #REF=Line30
                    newNode.newFormulas.add(temporalFormula.rightOperandFormula);
                }

                newNode.oldFormulas = new HashSet<>(this.oldFormulas);// #REF=Line31
                newNode.oldFormulas.add(temporalFormula);// #REF=Line31

                newNode.nextFormulas = new HashSet<>(this.nextFormulas);// #REF=Line31

                newNode.expand(graphNodeSet); // #REF=Line29 - 31
            }
        }
    }

    /**
     *
     * @param graphNodeSet the set with all nodes to be checked for equality.
     * @return a node from the graphNodeSet if it is the same as the current node.
     */
    private Optional<LtlGraphNode> getSameStateNode(final Set<LtlGraphNode> graphNodeSet) {
        Stream<LtlGraphNode> nodes;
        nodes = graphNodeSet.stream().filter(graphNode -> graphNode.oldFormulas.equals(this.oldFormulas)
                && graphNode.nextFormulas.equals(this.nextFormulas));

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
     * @param inputFormula the input formula
     * @return the value for New1 in the algorithm
     */
    private Set<LtlFormula> getNew1(final LtlFormula inputFormula) {
        final HashSet<LtlFormula> returnValue = new HashSet<>();
        LtlFormula returnFormula;

        if (inputFormula.operator == TemporalOperator.U || inputFormula.operator == TemporalOperator.Or) {
            returnFormula = inputFormula.leftOperandFormula;
        } else {
            returnFormula = inputFormula.rightOperandFormula;
        }

        if (!this.oldFormulas.contains(returnFormula)) {
            returnValue.add(returnFormula);
        }

        return returnValue;
    }

    /**
     * Get Next1 formula as described in paragraph 3.2
     *
     * @param inputFormula the input formula
     * @return the value for Next1 in the algorithm
     */
    private Set<LtlFormula> getNext1(final LtlFormula inputFormula) {
        final HashSet<LtlFormula> returnValue = new HashSet<>();

        if (!(inputFormula.operator == TemporalOperator.Or)) {
            returnValue.add(inputFormula);
        }

        return returnValue;
    }

    /**
     * Get New2 formula as described in paragraph 3.2
     *
     * @param inputFormula the input formula
     * @return the value for New2 in the algorithm
     */
    private Set<LtlFormula> getNew2(final LtlFormula inputFormula) {
        final HashSet<LtlFormula> returnValue = new HashSet<>();

        returnValue.add(inputFormula.rightOperandFormula);

        if (inputFormula.operator == TemporalOperator.V) {
            returnValue.add(inputFormula.leftOperandFormula);
        }

        return returnValue;
    }

    /**
     * Method to print all graph nodes depth first.
     */
    public void printTreeDepthFirst() {
        if (!isInitialState) {
            LoggingHelper.logInfo(MessageFormat.format("Printing {0}", name));
            if (fatherNode != null) {
                LoggingHelper.logInfo("Father node: " + fatherNode.name);
            }

            if (incomingEdges.size() > 0) {
                LoggingHelper.logInfo("Incoming edges:");
                incomingEdges.forEach(edge -> LoggingHelper.logInfo(edge.name));
            }

            LoggingHelper.logInfo("Size new: " + newFormulas.size());
            newFormulas.forEach(this::printFormula);
            LoggingHelper.logInfo("Size old: " + oldFormulas.size());
            oldFormulas.forEach(this::printFormula);
            LoggingHelper.logInfo("Size of next: " + nextFormulas.size());
            nextFormulas.forEach(this::printFormula);

            LoggingHelper.logInfo("Children of : " + name);
        }
        childNodes.forEach(LtlGraphNode::printTreeDepthFirst);

        if (!isInitialState) {
            LoggingHelper.logInfo("End of : " + name);
        }
    }

    private void printFormula(final LtlFormula formula) {
        formula.printRecursive();
        LoggingHelper.logInfo(",");
    }

    private String getDisplayValues(Set<LtlFormula> formulas) {
        StringBuilder values = new StringBuilder();

        for(LtlFormula formula : formulas){
            values.append(formula.getDisplayValueRecursive()).append(", ");
        }

        return values.toString();
    }

    private boolean nodeVisitedBefore = false;

    @Override
    public String getPlantUmlNodesRecursively() {

        // Add data fields
        StringBuilder returnStringBuilder = new StringBuilder(this.name + "\n"); // finish current row.

        if (!nodeVisitedBefore) {
            returnStringBuilder.append(writeFormulas(this.name));
            nodeVisitedBefore = true;

            if (!this.childNodes.isEmpty()) {
                for (LtlGraphNode childNode : this.childNodes) {
                    returnStringBuilder.append(this.name).append(" --> ").append(childNode.getPlantUmlNodesRecursively());
                }
            }
        }

        return returnStringBuilder.toString();
    }


    public String writeFormulas(String name){
        return name + " : Old "+this.getDisplayValues(this.oldFormulas)+" \n" +
                name + " : Next "+this.getDisplayValues(this.nextFormulas)+" \n";
    }


}
