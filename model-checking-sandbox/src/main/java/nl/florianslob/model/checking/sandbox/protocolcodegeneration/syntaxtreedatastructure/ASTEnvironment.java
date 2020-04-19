package nl.florianslob.model.checking.sandbox.protocolcodegeneration.syntaxtreedatastructure;

import nl.florianslob.model.checking.sandbox.protocolcodegeneration.syntaxtreedatastructure.adapters.ISyntaxWriter;

import java.util.LinkedList;

public class ASTEnvironment extends SyntaxTreeItemBase {

    public String roleName;
    public LinkedList<ASTStateCaseStatement> ASTStateCaseStatements;

    public ASTEnvironment(ISyntaxWriter<ASTEnvironment> syntaxWriter, String roleName, LinkedList<ASTStateCaseStatement> ASTStateCaseStatements){
        super(syntaxWriter);
        this.roleName = roleName;
        this.ASTStateCaseStatements = ASTStateCaseStatements;
    }
}
