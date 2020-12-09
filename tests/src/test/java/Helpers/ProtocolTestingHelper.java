package Helpers;

import nl.florianslob.modelchecking.base.api.v2.IProtocol;
import nl.florianslob.modelchecking.base.runtime.v2.LtlModelChecker;
import nl.florianslob.modelchecking.base.runtime.v2.ltlautomaton.LtlFormulaDefinitionHelper;

import java.util.Dictionary;
import java.util.HashMap;
import java.util.HashSet;

import static org.junit.Assert.assertTrue;

public class ProtocolTestingHelper {

    private static void LogTest(String formulaString){
        System.out.println("Testing the protocol for: "+formulaString);
    }

    public static void TestFormulaFromFile(String absolutePathToFormulaFile, boolean expectedResult, IProtocol protocol, HashMap<String,String> shortTypeNameToFullClassNameMap) throws Exception {
        // Arrange
        var formulaString = LtlFormulaDefinitionHelper.GetFormulaStringFromFile(absolutePathToFormulaFile, shortTypeNameToFullClassNameMap);

        LogTest(formulaString);
        // Act
        var result = GetModelCheckerForChessProtocol(protocol)
                .CheckProtocolForLtlFormula(formulaString);

        // Assert
        assertTrue(expectedResult == result);
    }

    private static LtlModelChecker GetModelCheckerForChessProtocol(IProtocol protocol){
        return new LtlModelChecker(protocol);
    }
}
