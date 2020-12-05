package Helpers;

import nl.florianslob.modelchecking.base.api.v2.IProtocol;
import nl.florianslob.modelchecking.base.runtime.v2.LtlModelChecker;
import nl.florianslob.modelchecking.base.runtime.v2.ltlautomaton.LtlFormulaDefinitionHelper;

import static org.junit.Assert.assertTrue;

public class ProtocolTestingHelper {

    private static void LogTest(String formulaString){
        System.out.println("Testing the protocol for: "+formulaString);
    }

    public static void TestFormulaFromFile(String absolutePathToFormulaFile, boolean expectedResult, IProtocol protocol) throws Exception {
        // Arrange
        var formulaString = LtlFormulaDefinitionHelper.GetFormulaStringFromFile(absolutePathToFormulaFile);

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
