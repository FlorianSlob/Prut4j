package nl.florianslob.modelchecking.base.runtime.v2.ltlautomaton;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Dictionary;
import java.util.HashMap;

public class LtlFormulaDefinitionHelper {


    // TODO replace with some user input?
    // TODO Move to static helper
    public static String GetFormulaStringFromFile(String absolutePathToFormulaFile, HashMap<String, String> shortTypeNameToFullClassNameMap) {
        String formulaString = null;
        // we use a demo formula from the Chess example
        try {
            formulaString = Files.readString(Path.of(absolutePathToFormulaFile))
                    .replace("\n"," ")
                    .replace("\r"," ");
        } catch (IOException e) {
            e.printStackTrace();
        }

        if(!shortTypeNameToFullClassNameMap.isEmpty()){
            for(var shortTypeNameToFullClass :
                    shortTypeNameToFullClassNameMap.entrySet()) {
                formulaString = formulaString.replace("<"+shortTypeNameToFullClass.getKey()+">",shortTypeNameToFullClass.getValue());
            }
        }

        return formulaString;
        // TODO replace with new syntax from Sandbox project
//        String formulaString = "G(\"SEND dto.Move TO b\" -> X(!\">SEND dto.Move TO b\" U \"SEND dto.Move TO w\"))  &  " +
//                "G(\"SEND dto.Move TO w\" -> X(!\"SEND dto.Move TO w\" U \"SEND dto.Move TO b\")) & " +
//                "G(!(\"SEND dto.Move TO w\" & \"SEND dto.Move TO b\") & !(!\"SEND dto.Move TO w\" & !\"SEND dto.Move TO b\"))";
//        // Other test formulas:
        // String formulaString = "G(\"Move to B\" -> X(!\"Move to B\" U \"Move to W\"))  &  G(\"Move to W\" -> X(!\"Move to W\" U \"Move to B\")) & G(!(\"Move to W\" & \"Move to B\"))";
        // String formulaString  = "G(\"Move to B\" -> X(!\"Move to B\"))";
        // String formulaString = "F G a | G F b";
//        System.out.println("Testing Formula:");
//        System.out.println(formulaString);
//
//        return formulaString;
    }

}
