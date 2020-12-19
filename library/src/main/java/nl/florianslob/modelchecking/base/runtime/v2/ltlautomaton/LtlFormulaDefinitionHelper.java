package nl.florianslob.modelchecking.base.runtime.v2.ltlautomaton;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Dictionary;
import java.util.HashMap;

public class LtlFormulaDefinitionHelper {
    public static String GetFormulaStringFromFile(String absolutePathToFormulaFile, HashMap<String, String> shortTypeNameToFullClassNameMap) {
        String formulaString = null;
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
    }
}
