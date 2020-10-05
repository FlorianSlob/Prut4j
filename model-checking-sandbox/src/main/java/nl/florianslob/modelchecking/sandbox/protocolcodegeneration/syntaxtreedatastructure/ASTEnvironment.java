package nl.florianslob.modelchecking.sandbox.protocolcodegeneration.syntaxtreedatastructure;

import nl.florianslob.modelchecking.sandbox.protocolcodegeneration.syntaxtreedatastructure.codewriters.ISyntaxWriter;

import java.util.LinkedList;

public class ASTEnvironment extends SyntaxTreeItemBase<ASTEnvironment> {

    public String roleName;
    public LinkedList<ASTStateCaseStatement> ASTStateCaseStatements;

    public ASTEnvironment(ISyntaxWriter<ASTEnvironment> syntaxWriter, String roleName, LinkedList<ASTStateCaseStatement> ASTStateCaseStatements){
        super(syntaxWriter);
        this.roleName = ASTHelper.EscapeRoleName(roleName);
        this.ASTStateCaseStatements = ASTStateCaseStatements;
    }

}
