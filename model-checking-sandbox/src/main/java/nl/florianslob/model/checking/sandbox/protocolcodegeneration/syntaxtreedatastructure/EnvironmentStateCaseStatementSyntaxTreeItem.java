package nl.florianslob.model.checking.sandbox.protocolcodegeneration.syntaxtreedatastructure;

import nl.florianslob.model.checking.sandbox.protocolcodegeneration.syntaxtreedatastructure.adapters.ISyntaxWriter;

import java.util.LinkedList;
import java.util.List;

public class EnvironmentStateCaseStatementSyntaxTreeItem extends AbstractSyntaxTreeItem<EnvironmentStateCaseStatementSyntaxTreeItem>{
    public int stateIdCondition;

    public List<EnvironmentActionFromState> actionsFromState = new LinkedList<>();

    public EnvironmentStateCaseStatementSyntaxTreeItem(int stateIdCondition, ISyntaxWriter<EnvironmentStateCaseStatementSyntaxTreeItem> syntaxBuilderAdapter){
        super(syntaxBuilderAdapter);
        this.stateIdCondition = stateIdCondition;
    }

    public void addAction(EnvironmentActionFromState actionFromState){
        actionsFromState.add(actionFromState);
    }
}
