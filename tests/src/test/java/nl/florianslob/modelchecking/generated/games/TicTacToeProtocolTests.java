package nl.florianslob.modelchecking.generated.games;

import Helpers.ProtocolTestingHelper;
import discourje.examples.chess.Move;
import nl.florianslob.modelchecking.base.api.v2.IProtocol;
import nl.florianslob.modelchecking.base.runtime.v2.Engine;
import org.junit.Test;

import java.util.HashMap;

public class TicTacToeProtocolTests {

    public TicTacToeProtocolTests(){
        Engine.IsProtocolOptimized = false;
    }

    private IProtocol GetProtocol(){
        return new TicTacToeProtocol();
    }

    private HashMap<String, String> ShortTypeNameToFullClassNameMap = new HashMap<>(){
        {
            put("Move", "discourje.examples.chess.Move");
        }
    };

    private Object[] dummies = new Object[]{ new Move()};

    @Test
    public void TestLiveness() throws Exception {
        ProtocolTestingHelper.TestFormulaFromFile("formulas/TicTacToeProtocol/TestLiveness.owl",
                true,
                GetProtocol(),
                ShortTypeNameToFullClassNameMap,
                dummies);
    }

    @Test
    public void TestBoundness1() throws Exception {
        ProtocolTestingHelper.TestFormulaFromFile("formulas/TicTacToeProtocol/TestBoundness1.owl",
                true,
                GetProtocol(),
                ShortTypeNameToFullClassNameMap,
                dummies);
    }

    @Test
    public void TestBoundness2() throws Exception {
        ProtocolTestingHelper.TestFormulaFromFile("formulas/TicTacToeProtocol/TestBoundness2.owl",
                true,
                GetProtocol(),
                ShortTypeNameToFullClassNameMap,
                dummies);
    }

    @Test
    public void TestEventualReception1() throws Exception {
        ProtocolTestingHelper.TestFormulaFromFile("formulas/TicTacToeProtocol/TestEventualReception1.owl",
                true,
                GetProtocol(),
                ShortTypeNameToFullClassNameMap,
                dummies);
    }

    @Test
    public void TestEventualReception2() throws Exception {
        ProtocolTestingHelper.TestFormulaFromFile("formulas/TicTacToeProtocol/TestEventualReception2.owl",
                true,
                GetProtocol(),
                ShortTypeNameToFullClassNameMap,
                dummies);
    }

    @Test
    public void TestTurnTaking1() throws Exception {
        ProtocolTestingHelper.TestFormulaFromFile("formulas/TicTacToeProtocol/TestTurnTaking1.owl",
                true,
                GetProtocol(),
                ShortTypeNameToFullClassNameMap,
                dummies);
    }

    @Test
    public void TestTurnTaking2() throws Exception {
        ProtocolTestingHelper.TestFormulaFromFile("formulas/TicTacToeProtocol/TestTurnTaking2.owl",
                true,
                GetProtocol(),
                ShortTypeNameToFullClassNameMap,
                dummies);
    }
}

