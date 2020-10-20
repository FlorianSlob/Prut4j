package nl.florianslob.modelchecking.sandbox.protocolcodegeneration.syntaxtreedatastructure;

import nl.florianslob.modelchecking.sandbox.protocolcodegeneration.syntaxtreedatastructure.codewriters.ISyntaxWriter;

public class ASTCloseAction extends ASTEnvironmentActionFromState<ASTCloseAction> {

    public final int nextStateId;
    public final String messageContentType;
    public final String environmentName;

    public ASTCloseAction(ISyntaxWriter<ASTCloseAction> syntaxWriter, int nextStateId, String messageContentType, String fromRoleName) {
        super(syntaxWriter);
        this.nextStateId = nextStateId;
        this.messageContentType = messageContentType;
        this.environmentName = ASTHelper.EscapeRoleName(fromRoleName);
    }

    @Override
    public boolean equals(Object obj) {
        if(obj.getClass() != ASTCloseAction.class){
            return false;
        }
        var castedObject = (ASTCloseAction)obj;
        // Return true if all conditions are met
        return  this.nextStateId == castedObject.nextStateId
                &&
                this.messageContentType.equals(castedObject.messageContentType);
    }
}
