package Helpers;

import nl.florianslob.modelchecking.base.api.v2.IProtocol;
import nl.florianslob.modelchecking.base.runtime.v2.Engine;
import nl.florianslob.modelchecking.base.runtime.v2.ltlautomaton.LtlFormulaDefinitionHelper;

import java.util.HashMap;

import static org.junit.Assert.assertTrue;

public class ProtocolTestingHelper {

    private static void LogTest(String formulaString){
        if(false)
            System.out.println("Testing the protocol for: "+formulaString);
    }

    public static void TestFormulaFromFile(String absolutePathToFormulaFile, boolean expectedResult, IProtocol protocol, HashMap<String,String> shortTypeNameToFullClassNameMap, Object[] dummies) throws Exception {
        // Arrange
        var formulaString = LtlFormulaDefinitionHelper.GetFormulaStringFromFile(absolutePathToFormulaFile, shortTypeNameToFullClassNameMap);

        LogTest(formulaString);
        // Act
        var result = GetModelCheckerForChessProtocol(protocol)
                .exec(formulaString, dummies);

        // Assert
        assertTrue(expectedResult == result);
    }

    private static Engine GetModelCheckerForChessProtocol(IProtocol protocol){
        return new Engine(protocol);
    }
}
