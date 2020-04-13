package nl.florianslob.model.checking.sandbox.protocolcodegeneration.syntaxtreedatastructure;

import java.util.LinkedList;
import java.util.List;

public class EnvironmentStateCaseStatement implements ISyntaxTreeItem{
    private int stateIdCondition;

    private List<EnvironmentActionFromState> actionsFromState = new LinkedList<>();

    public EnvironmentStateCaseStatement(int stateIdCondition){

        this.stateIdCondition = stateIdCondition;
    }

    public void addAction(EnvironmentActionFromState actionFromState){
        actionsFromState.add(actionFromState);
    }

    @Override
    public String getSyntax(int numberOfPrependingTabs) {
        return "Syntax for EnvironmentStateCaseStatement";
    }
}
