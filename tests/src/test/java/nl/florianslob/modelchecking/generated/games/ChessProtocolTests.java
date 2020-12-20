package nl.florianslob.modelchecking.generated.games;

import discourje.examples.chess.Move;
import nl.florianslob.modelchecking.base.api.v2.IProtocol;
import Helpers.ProtocolTestingHelper;
import nl.florianslob.modelchecking.generated.ChessProtocol;
import org.junit.Test;

import java.util.HashMap;

public class ChessProtocolTests {

    private IProtocol GetProtocol(){
        return new ChessProtocol();
    }

    private HashMap<String, String> ShortTypeNameToFullClassNameMap = new HashMap<>(){
        {
            put("Move", "discourje.examples.chess.Move");
        }
    };

    private Object[] dummies = new Object[]{ new Move()};

    @Test
    public void testBlackCannotSend() throws Exception {
        ProtocolTestingHelper.TestFormulaFromFile("formulas/ChessProtocol/Test1.owl",
                true,
                GetProtocol(),
                ShortTypeNameToFullClassNameMap,
                dummies);
    }

    @Test
    public void testBlackCannotSendUntil() throws Exception {
        ProtocolTestingHelper.TestFormulaFromFile("formulas/ChessProtocol/Test2.owl",
                true,
                GetProtocol(),
                ShortTypeNameToFullClassNameMap,
                dummies);
    }

    @Test
    public void testBlackCannotSendAgainUntil() throws Exception {
        ProtocolTestingHelper.TestFormulaFromFile("formulas/ChessProtocol/Test3.owl",
                true,
                GetProtocol(),
                ShortTypeNameToFullClassNameMap,
                dummies);
    }

    @Test
    public void TestWhiteReceivesInNextState_ShouldBeTrue() throws Exception {
        ProtocolTestingHelper.TestFormulaFromFile("formulas/ChessProtocol/TestWhiteReceivesInNextState.owl",
                true,
                GetProtocol(),
                ShortTypeNameToFullClassNameMap,
                dummies);
    }

    @Test
    public void TestBackSendMoveInNextState_ShouldBeFalse() throws Exception {
        ProtocolTestingHelper.TestFormulaFromFile("formulas/ChessProtocol/TestBackSendMoveInNextState.owl" ,
                false,
                GetProtocol(),
                ShortTypeNameToFullClassNameMap,
                dummies);
    }

    @Test
    public void TestGloballyWhenWhiteSendItWillNotSendInNextState_ShouldBeTrue() throws Exception {
        ProtocolTestingHelper.TestFormulaFromFile("formulas/ChessProtocol/TestGloballyWhenWhiteSendItWillNotSendInNextState.owl",
                true,
                GetProtocol(),
                ShortTypeNameToFullClassNameMap,
                dummies);
    }

    @Test
    public void TestAfterWhiteSendNoWhiteReceiveUntilBlackSend_ShouldBeTrue() throws Exception {
        ProtocolTestingHelper.TestFormulaFromFile("formulas/ChessProtocol/TestAfterWhiteSendNoWhiteReceiveUntilBlackSend.owl",
                true,
                GetProtocol(),
                ShortTypeNameToFullClassNameMap,
                dummies);
    }

    @Test
    public void TestGloballyBlackSendWillNotSendAgainUntilWhiteSend_ShouldBeTrue() throws Exception {
        ProtocolTestingHelper.TestFormulaFromFile("formulas/ChessProtocol/TestGloballyBlackSendWillNotSendAgainUntilWhiteSend.owl",
                true,
                GetProtocol(),
                ShortTypeNameToFullClassNameMap,
                dummies);
    }

    @Test
    public void TestGloballyBlackSendNextWhiteReceive_ShouldBeTrue() throws Exception {
        ProtocolTestingHelper.TestFormulaFromFile("formulas/ChessProtocol/TestGloballyBlackSendNextWhiteReceive.owl",
                true,
                GetProtocol(),
                ShortTypeNameToFullClassNameMap,
                dummies);
    }

    @Test
    public void TestCombinedComplexFormula() throws Exception {
        // Combines TestGloballyBlackSendNextWhiteReceive and its inverse
        ProtocolTestingHelper.TestFormulaFromFile("formulas/ChessProtocol/TestCombinedComplexFormula.owl",
                true,
                GetProtocol(),
                ShortTypeNameToFullClassNameMap,
                dummies);
    }

}
