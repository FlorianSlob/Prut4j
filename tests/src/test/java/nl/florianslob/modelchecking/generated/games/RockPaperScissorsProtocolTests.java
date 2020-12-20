package nl.florianslob.modelchecking.generated.games;

import Helpers.ProtocolTestingHelper;
import discourje.examples.gofish.*;
import discourje.examples.rockpaperscissors.Paper;
import discourje.examples.rockpaperscissors.Rock;
import discourje.examples.rockpaperscissors.Scissors;
import nl.florianslob.modelchecking.base.api.v2.IProtocol;
import nl.florianslob.modelchecking.base.runtime.v2.Engine;
import nl.florianslob.modelchecking.generated.RockPaperScissorsProtocol;
import org.junit.Test;

import java.util.HashMap;

public class RockPaperScissorsProtocolTests {
    public RockPaperScissorsProtocolTests(){
        Engine.IsProtocolOptimized = true;
        Engine.IsLoggingEnabled = false;

    }
    private IProtocol GetProtocol(){
        return new RockPaperScissorsProtocol();
    }

    private HashMap<String, String> ShortTypeNameToFullClassNameMap = new HashMap<>(){
        {
            put("Paper", "discourje.examples.rockpaperscissors.Paper");
            put("Rock", "discourje.examples.rockpaperscissors.Rock");
            put("Scissors", "discourje.examples.rockpaperscissors.Scissors");
        }
    };

    private Object[] dummies = new Object[]{ new Paper(), new Rock(), new Scissors()};

    @Test
    public void TestLiveness() throws Exception {
        ProtocolTestingHelper.TestFormulaFromFile("formulas/RockPaperScissors/TestLiveness.owl",
                true,
                GetProtocol(),
                ShortTypeNameToFullClassNameMap,
                dummies);
    }

    @Test
    public void TestBoundness1() throws Exception {
        ProtocolTestingHelper.TestFormulaFromFile("formulas/RockPaperScissors/TestBoundness1.owl",
                true,
                GetProtocol(),
                ShortTypeNameToFullClassNameMap,
                dummies);
    }

    @Test
    public void TestBoundness2() throws Exception {
        ProtocolTestingHelper.TestFormulaFromFile("formulas/RockPaperScissors/TestBoundness2.owl",
                true,
                GetProtocol(),
                ShortTypeNameToFullClassNameMap,
                dummies);
    }

    @Test
    public void TestBoundness3() throws Exception {
        ProtocolTestingHelper.TestFormulaFromFile("formulas/RockPaperScissors/TestBoundness3.owl",
                true,
                GetProtocol(),
                ShortTypeNameToFullClassNameMap,
                dummies);
    }

    @Test
    public void TestBoundness4() throws Exception {
        ProtocolTestingHelper.TestFormulaFromFile("formulas/RockPaperScissors/TestBoundness4.owl",
                true,
                GetProtocol(),
                ShortTypeNameToFullClassNameMap,
                dummies);
    }

    @Test
    public void TestBoundness5() throws Exception {
        ProtocolTestingHelper.TestFormulaFromFile("formulas/RockPaperScissors/TestBoundness5.owl",
                true,
                GetProtocol(),
                ShortTypeNameToFullClassNameMap,
                dummies);
    }

    @Test
    public void TestBoundness6() throws Exception {
        ProtocolTestingHelper.TestFormulaFromFile("formulas/RockPaperScissors/TestBoundness6.owl",
                true,
                GetProtocol(),
                ShortTypeNameToFullClassNameMap,
                dummies);
    }

    @Test
    public void TestEventualReception1() throws Exception {
        ProtocolTestingHelper.TestFormulaFromFile("formulas/RockPaperScissors/TestEventualReception1.owl",
                true,
                GetProtocol(),
                ShortTypeNameToFullClassNameMap,
                dummies);
    }

    @Test
    public void TestEventualReception2() throws Exception {
        ProtocolTestingHelper.TestFormulaFromFile("formulas/RockPaperScissors/TestEventualReception2.owl",
                true,
                GetProtocol(),
                ShortTypeNameToFullClassNameMap,
                dummies);
    }

    @Test
    public void TestEventualReception3() throws Exception {
        ProtocolTestingHelper.TestFormulaFromFile("formulas/RockPaperScissors/TestEventualReception3.owl",
                true,
                GetProtocol(),
                ShortTypeNameToFullClassNameMap,
                dummies);
    }

    @Test
    public void TestEventualReception4() throws Exception {
        ProtocolTestingHelper.TestFormulaFromFile("formulas/RockPaperScissors/TestEventualReception4.owl",
                true,
                GetProtocol(),
                ShortTypeNameToFullClassNameMap,
                dummies);
    }

    @Test
    public void TestEventualReception5() throws Exception {
        ProtocolTestingHelper.TestFormulaFromFile("formulas/RockPaperScissors/TestEventualReception5.owl",
                true,
                GetProtocol(),
                ShortTypeNameToFullClassNameMap,
                dummies);
    }

    @Test
    public void TestEventualReception6() throws Exception {
        ProtocolTestingHelper.TestFormulaFromFile("formulas/RockPaperScissors/TestEventualReception6.owl",
                true,
                GetProtocol(),
                ShortTypeNameToFullClassNameMap,
                dummies);
    }

    @Test
    public void TestSameItem1() throws Exception {
        ProtocolTestingHelper.TestFormulaFromFile("formulas/RockPaperScissors/TestSameItem1.owl",
                true,
                GetProtocol(),
                ShortTypeNameToFullClassNameMap,
                dummies);
    }


    @Test
    public void TestSameItem2() throws Exception {
        ProtocolTestingHelper.TestFormulaFromFile("formulas/RockPaperScissors/TestSameItem2.owl",
                true,
                GetProtocol(),
                ShortTypeNameToFullClassNameMap,
                dummies);
    }


    @Test
    public void TestSameItem3() throws Exception {
        ProtocolTestingHelper.TestFormulaFromFile("formulas/RockPaperScissors/TestSameItem3.owl",
                true,
                GetProtocol(),
                ShortTypeNameToFullClassNameMap,
                dummies);
    }

    @Test
    public void TestDropOut1() throws Exception {
        ProtocolTestingHelper.TestFormulaFromFile("formulas/RockPaperScissors/TestDropOut1.owl",
                true,
                GetProtocol(),
                ShortTypeNameToFullClassNameMap,
                dummies);
    }

    @Test
    public void TestDropOut2() throws Exception {
        ProtocolTestingHelper.TestFormulaFromFile("formulas/RockPaperScissors/TestDropOut2.owl",
                true,
                GetProtocol(),
                ShortTypeNameToFullClassNameMap,
                dummies);
    }

    @Test
    public void TestDropOut3() throws Exception {
        ProtocolTestingHelper.TestFormulaFromFile("formulas/RockPaperScissors/TestDropOut3.owl",
                true,
                GetProtocol(),
                ShortTypeNameToFullClassNameMap,
                dummies);
    }

    @Test
    public void TestSendBeforeReceive1() throws Exception {
        ProtocolTestingHelper.TestFormulaFromFile("formulas/RockPaperScissors/TestSendBeforeReceive1.owl",
                true,
                GetProtocol(),
                ShortTypeNameToFullClassNameMap,
                dummies);
    }

    @Test
    public void TestSendBeforeReceive2() throws Exception {
        ProtocolTestingHelper.TestFormulaFromFile("formulas/RockPaperScissors/TestSendBeforeReceive2.owl",
                true,
                GetProtocol(),
                ShortTypeNameToFullClassNameMap,
                dummies);
    }

    @Test
    public void TestSendBeforeReceive3() throws Exception {
        ProtocolTestingHelper.TestFormulaFromFile("formulas/RockPaperScissors/TestSendBeforeReceive3.owl",
                true,
                GetProtocol(),
                ShortTypeNameToFullClassNameMap,
                dummies);
    }
}
