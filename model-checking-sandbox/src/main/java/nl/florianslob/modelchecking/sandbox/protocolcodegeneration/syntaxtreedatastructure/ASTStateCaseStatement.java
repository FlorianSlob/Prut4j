package nl.florianslob.modelchecking.sandbox.protocolcodegeneration.syntaxtreedatastructure;

import nl.florianslob.modelchecking.sandbox.protocolcodegeneration.syntaxtreedatastructure.codewriters.ISyntaxWriter;

import java.util.LinkedList;
import java.util.List;

public class ASTStateCaseStatement extends SyntaxTreeItemBase<ASTStateCaseStatement> {
    public int stateIdCondition;

    public List<ASTEnvironmentActionFromState<?>> actionsFromState = new LinkedList<>();

    public ASTStateCaseStatement(ISyntaxWriter<ASTStateCaseStatement> syntaxWriter, int stateIdCondition){
        super(syntaxWriter);
        this.stateIdCondition = stateIdCondition;
    }

    public void addAction(ASTEnvironmentActionFromState<?> actionFromState){
        // Only add action if it is not already present in the list.
        var existingActionFromState
                = actionsFromState.stream().filter(a -> a.equals(actionFromState)).findAny();
        if(existingActionFromState.isEmpty()){
            actionsFromState.add(actionFromState);
        }
    }
}
