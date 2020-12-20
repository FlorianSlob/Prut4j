package nl.florianslob.modelchecking.sandbox.protocolcodegeneration.syntaxtreedatastructure;

public class ASTHelper {

    public static String EscapeRoleName(String input){
        return input.replace('[','_').replace(']','_');
    }
}
