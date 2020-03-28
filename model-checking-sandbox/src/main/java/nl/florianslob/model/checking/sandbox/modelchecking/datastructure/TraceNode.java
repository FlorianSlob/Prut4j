package nl.florianslob.model.checking.sandbox.modelchecking.datastructure;

import nl.florianslob.model.checking.sandbox.LoggingHelper;
import nl.florianslob.model.checking.sandbox.base.GraphNode;

public class TraceNode extends GraphNode {

    private static int counterHelper = 0;
    private final int counter;
    public final StateNode originalNode;
    public final LtlGraphNode ltlGraphNode;
    public TraceNode nextNode;

    public TraceNode(StateNode originalNode, LtlGraphNode ltlGraphNode){

        this.originalNode = originalNode;
        this.ltlGraphNode = ltlGraphNode;
        this.counter = counterHelper;
        counterHelper++;
    }

    private boolean nodeVisitedBefore = false;

    public String getName(){
        return "ProductNode"+this.counter; // Nasty I know.
    }

    public String getProgramStateName(){
        return this.originalNode.getName();

    }

    public String getLtlStateName(){
        return this.ltlGraphNode.name;
    }

    @Override
    public String getPlantUmlNodesRecursively() {
        // Add data fields
        String returnString = this.getName() + this.ltlGraphNode.getAcceptingPlantUmlPart()+"\n"; // finish current row.

        if (!nodeVisitedBefore) {

            returnString += this.getName() + " : Program state:  "+this.getProgramStateName()+" \n";
            returnString += this.getName() + " : ------------------- \n";
            returnString += this.getName() + " : "+this.originalNode.getDisplayValuesForAtomicPropositions()+" \n";

            returnString += this.getName() + " : Ltl state: "+this.getLtlStateName()+" \n";
            returnString += this.getName() + " : ------------------- \n";
            returnString += this.ltlGraphNode.writeFormulas(this.getName());

            nodeVisitedBefore = true;

            if (this.nextNode != null ) {
                  returnString += this.getName() +" --> "+ this.nextNode.getPlantUmlNodesRecursively();
            }

        }
        return returnString;
    }

    public void VisitAndLogRecursively() {
        LoggingHelper.logInfo("State hash number:  " + originalNode.HashingNumber);
        if(this.nextNode!= null){
            this.nextNode.VisitAndLogRecursively();
        }
    }
}
