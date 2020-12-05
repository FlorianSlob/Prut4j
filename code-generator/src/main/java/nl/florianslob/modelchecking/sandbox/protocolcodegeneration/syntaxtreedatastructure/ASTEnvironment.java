package nl.florianslob.modelchecking.sandbox.protocolcodegeneration.syntaxtreedatastructure;

import nl.florianslob.modelchecking.sandbox.protocolcodegeneration.syntaxtreedatastructure.codewriters.ISyntaxWriter;

import java.util.LinkedList;

public class ASTEnvironment extends SyntaxTreeItemBase<ASTEnvironment> {

    public String roleName;
    public LinkedList<ASTStateCaseStatement> ASTStateCaseStatements;
    public LinkedList<ASTStateCaseStatement> AllASTStateCaseStatements;

    public ASTEnvironment(ISyntaxWriter<ASTEnvironment> syntaxWriter, String roleName, LinkedList<ASTStateCaseStatement> ASTStateCaseStatements, LinkedList<ASTStateCaseStatement> AllASTStateCaseStatements){
        super(syntaxWriter);
        this.roleName = ASTHelper.EscapeRoleName(roleName);
        this.ASTStateCaseStatements = ASTStateCaseStatements;
        this.AllASTStateCaseStatements = AllASTStateCaseStatements;
    }

}
