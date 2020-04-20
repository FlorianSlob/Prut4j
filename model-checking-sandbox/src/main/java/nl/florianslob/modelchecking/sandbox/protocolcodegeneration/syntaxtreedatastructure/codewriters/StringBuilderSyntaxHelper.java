package nl.florianslob.modelchecking.sandbox.protocolcodegeneration.syntaxtreedatastructure.codewriters;

public class StringBuilderSyntaxHelper {
    public static void addIndentation(StringBuilder builder, int numberOfTabs){
        for(int i = 0; i < numberOfTabs; i++){
            builder.append("\t");
        }
    }

    public static void addEmptyLine(StringBuilder builder, int numberOfTabs) {
        addLine(builder,numberOfTabs,"");
    }

    public static void addLine(StringBuilder builder, int numberOfTabs, String lineOfCode) {
        addIndentation(builder,numberOfTabs);
        builder.append(lineOfCode);
        builder.append("\n");
    }
}
