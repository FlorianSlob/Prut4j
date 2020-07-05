package nl.florianslob.modelchecking.generated;

import nl.florianslob.modelchecking.base.runtime.v2.LtlModelChecker;
import nl.florianslob.modelchecking.base.runtime.v2.ltlautomaton.LtlFormulaDefinitionHelper;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class ChessProtocolTests {

    private LtlModelChecker GetModelCheckerForChessProtocol(){
        return new LtlModelChecker(new GeneratedChessProtocolDebug());
    }

    private void LogTest(String formulaString){
        System.out.println("Testing the protocol for: "+formulaString);
    }

    @Test
    public void TestSimpleFormula() throws Exception {
        TestFormulaFromFile("formulas/formulaSimple.ltl", true);
    }

    @Test
    public void TestComplexFormula() throws Exception {
        TestFormulaFromFile("formulas/formula.ltl", true);
    }

    public void TestFormulaFromFile(String absolutePathToFormulaFile, boolean expectedResult) throws Exception {
        // Arrange
        var formulaString = LtlFormulaDefinitionHelper.GetFormulaStringFromFile(absolutePathToFormulaFile);
        LogTest(formulaString);

        // Act
        var result = GetModelCheckerForChessProtocol()
                        .CheckProtocolForLtlFormula(formulaString);

        // Assert
        assertTrue(expectedResult == result);
    }
}
