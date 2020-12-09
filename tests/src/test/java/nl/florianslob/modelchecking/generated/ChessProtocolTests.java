package nl.florianslob.modelchecking.generated;

import dto.Move;
import nl.florianslob.modelchecking.base.api.v2.IProtocol;
import org.junit.Test;

import Helpers.ProtocolTestingHelper;

import java.util.HashMap;
import java.util.Map;

public class ChessProtocolTests {

    private IProtocol GetProtocol(){
        return new GeneratedChessProtocol();
    }

    private HashMap<String, String> ShortTypeNameToFullClassNameMap = new HashMap<>(){
        {
            put("Move", "dto.Move");
            put("String", "java.lang.String");
        }
    };

    private Object[] dummies = new Object[]{ new Move(), new String()};

    @Test
    public void TestSimpleFormulaFalse() throws Exception {
        ProtocolTestingHelper.TestFormulaFromFile("formulas/ChessProtocol/formulaSimpleFalse.ltl", false, GetProtocol(),ShortTypeNameToFullClassNameMap, dummies);
    }

    @Test
    public void TestSimpleFormula() throws Exception {
        ProtocolTestingHelper.TestFormulaFromFile("formulas/ChessProtocol/formulaSimple.ltl", true, GetProtocol(),ShortTypeNameToFullClassNameMap, dummies);
    }

    @Test
    public void TestSimple2Formula() throws Exception {
        ProtocolTestingHelper.TestFormulaFromFile("formulas/ChessProtocol/formulaSimple2.ltl", true, GetProtocol(),ShortTypeNameToFullClassNameMap, dummies);
    }

    @Test
    public void TestComplexFormulaFull() throws Exception {
        ProtocolTestingHelper.TestFormulaFromFile("formulas/ChessProtocol/formula.ltl", true, GetProtocol(),ShortTypeNameToFullClassNameMap, dummies);
    }

    @Test
    public void TestComplexFormulaPart1() throws Exception {
        ProtocolTestingHelper.TestFormulaFromFile("formulas/ChessProtocol/formula2.ltl", true, GetProtocol(),ShortTypeNameToFullClassNameMap, dummies);
    }

    @Test
    public void TestComplexFormulaPart2() throws Exception {
        ProtocolTestingHelper.TestFormulaFromFile("formulas/ChessProtocol/formula3.ltl", true, GetProtocol(),ShortTypeNameToFullClassNameMap, dummies);
    }

    @Test
    public void TestComplexFormula4() throws Exception {
        ProtocolTestingHelper.TestFormulaFromFile("formulas/ChessProtocol/formula4.ltl", true, GetProtocol(),ShortTypeNameToFullClassNameMap, dummies);
    }
}
