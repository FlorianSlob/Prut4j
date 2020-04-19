package nl.florianslob.model.checking.sandbox.protocolcodegeneration.syntaxtreedatastructure;

import nl.florianslob.model.checking.sandbox.protocolcodegeneration.syntaxtreedatastructure.adapters.ISyntaxWriter;

import java.util.LinkedList;
import java.util.List;

public class ASTStateCaseStatement extends SyntaxTreeItemBase<ASTStateCaseStatement> {
    public int stateIdCondition;

    public List<ASTEnvironmentActionFromState> actionsFromState = new LinkedList<>();

    public ASTStateCaseStatement(ISyntaxWriter<ASTStateCaseStatement> syntaxWriter, int stateIdCondition){
        super(syntaxWriter);
        this.stateIdCondition = stateIdCondition;
    }

    public void addAction(ASTEnvironmentActionFromState actionFromState){
        actionsFromState.add(actionFromState);
    }
}
