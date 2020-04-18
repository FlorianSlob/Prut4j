package nl.florianslob.model.checking.sandbox.protocolcodegeneration.syntaxtreedatastructure;

public class StringBuilderSyntaxHelper {
    public static void addIndentation(StringBuilder builder, int numberOfTabs){
        for(int i = 0; i < numberOfTabs; i++){
            builder.append("\t");
        }
    }
}
