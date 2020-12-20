package nl.florianslob.modelchecking.generated.games;

import Helpers.ProtocolTestingHelper;
import discourje.examples.gofish.*;
import nl.florianslob.modelchecking.base.api.v2.Pr;
import nl.florianslob.modelchecking.base.runtime.v2.Engine;
import nl.florianslob.modelchecking.generated.GoFishProtocol;

import java.util.HashMap;

public class GoFishProtocolTests {
    public GoFishProtocolTests(){
        Engine.IsProtocolOptimized = true;
        Engine.IsLoggingEnabled = false;

    }
    private Pr GetProtocol(){
        return new GoFishProtocol();
    }

    private HashMap<String, String> ShortTypeNameToFullClassNameMap = new HashMap<>(){
        {
            put("Card", "discourje.examples.gofish.Card");
            put("Turn", "discourje.examples.gofish.Turn");
            put("Ask", "discourje.examples.gofish.Ask");
            put("Go", "discourje.examples.gofish.Go");
            put("Fish", "discourje.examples.gofish.Fish");
            put("OutOfCards", "discourje.examples.gofish.OutOfCards");
        }
    };

    private Object[] dummies = new Object[]{ new Card(), new Turn(), new Ask(), new Go(), new Fish(), new OutOfCards()};

    //@Test
    public void TestTermination1() throws Exception {
        ProtocolTestingHelper.TestFormulaFromFile("formulas/GoFishProtocol/TestTermination1.owl",
                true,
                GetProtocol(),
                ShortTypeNameToFullClassNameMap,
                dummies);
    }

    //@Test
    public void TestTermination2() throws Exception {
        ProtocolTestingHelper.TestFormulaFromFile("formulas/GoFishProtocol/TestTermination2.owl",
                true,
                GetProtocol(),
                ShortTypeNameToFullClassNameMap,
                dummies);
    }

    //@Test
    public void TestBoundness1() throws Exception {
        ProtocolTestingHelper.TestFormulaFromFile("formulas/GoFishProtocol/TestBoundness1.owl",
                true,
                GetProtocol(),
                ShortTypeNameToFullClassNameMap,
                dummies);
    }

    //@Test
    public void TestBoundness2() throws Exception {
        ProtocolTestingHelper.TestFormulaFromFile("formulas/GoFishProtocol/TestBoundness2.owl",
                true,
                GetProtocol(),
                ShortTypeNameToFullClassNameMap,
                dummies);
    }

    //@Test
    public void TestBoundness3() throws Exception {
        ProtocolTestingHelper.TestFormulaFromFile("formulas/GoFishProtocol/TestBoundness3.owl",
                true,
                GetProtocol(),
                ShortTypeNameToFullClassNameMap,
                dummies);
    }

    //@Test
    public void TestBoundness4() throws Exception {
        ProtocolTestingHelper.TestFormulaFromFile("formulas/GoFishProtocol/TestBoundness4.owl",
                true,
                GetProtocol(),
                ShortTypeNameToFullClassNameMap,
                dummies);
    }

    //@Test
    public void TestBoundness5() throws Exception {
        ProtocolTestingHelper.TestFormulaFromFile("formulas/GoFishProtocol/TestBoundness5.owl",
                true,
                GetProtocol(),
                ShortTypeNameToFullClassNameMap,
                dummies);
    }

    //@Test
    public void TestBoundness6() throws Exception {
        ProtocolTestingHelper.TestFormulaFromFile("formulas/GoFishProtocol/TestBoundness6.owl",
                true,
                GetProtocol(),
                ShortTypeNameToFullClassNameMap,
                dummies);
    }

    //@Test
    public void TestEventualReception1() throws Exception {
        ProtocolTestingHelper.TestFormulaFromFile("formulas/GoFishProtocol/TestEventualReception1.owl",
                true,
                GetProtocol(),
                ShortTypeNameToFullClassNameMap,
                dummies);
    }

    //@Test
    public void TestEventualReception2() throws Exception {
        ProtocolTestingHelper.TestFormulaFromFile("formulas/GoFishProtocol/TestEventualReception2.owl",
                true,
                GetProtocol(),
                ShortTypeNameToFullClassNameMap,
                dummies);
    }

    //@Test
    public void TestEventualReception3() throws Exception {
        ProtocolTestingHelper.TestFormulaFromFile("formulas/GoFishProtocol/TestEventualReception3.owl",
                true,
                GetProtocol(),
                ShortTypeNameToFullClassNameMap,
                dummies);
    }

    //@Test
    public void TestEventualReception4() throws Exception {
        ProtocolTestingHelper.TestFormulaFromFile("formulas/GoFishProtocol/TestEventualReception4.owl",
                true,
                GetProtocol(),
                ShortTypeNameToFullClassNameMap,
                dummies);
    }

    //@Test
    public void TestEventualReception5() throws Exception {
        ProtocolTestingHelper.TestFormulaFromFile("formulas/GoFishProtocol/TestEventualReception5.owl",
                true,
                GetProtocol(),
                ShortTypeNameToFullClassNameMap,
                dummies);
    }

    //@Test
    public void TestEventualReception6() throws Exception {
        ProtocolTestingHelper.TestFormulaFromFile("formulas/GoFishProtocol/TestEventualReception6.owl",
                true,
                GetProtocol(),
                ShortTypeNameToFullClassNameMap,
                dummies);
    }

    //@Test
    public void TestTurnTakingCurrentActivePlayerPerspective1() throws Exception {
        ProtocolTestingHelper.TestFormulaFromFile("formulas/GoFishProtocol/TestTurnTakingCurrentActivePlayerPerspective1.owl",
                true,
                GetProtocol(),
                ShortTypeNameToFullClassNameMap,
                dummies);
    }

    //@Test
    public void TestTurnTakingCurrentActivePlayerPerspective2() throws Exception {
        ProtocolTestingHelper.TestFormulaFromFile("formulas/GoFishProtocol/TestTurnTakingCurrentActivePlayerPerspective2.owl",
                true,
                GetProtocol(),
                ShortTypeNameToFullClassNameMap,
                dummies);
    }

    //@Test
    public void TestTurnTakingCurrentActivePlayerPerspective3() throws Exception {
        ProtocolTestingHelper.TestFormulaFromFile("formulas/GoFishProtocol/TestTurnTakingCurrentActivePlayerPerspective3.owl",
                true,
                GetProtocol(),
                ShortTypeNameToFullClassNameMap,
                dummies);
    }

    //@Test
    public void TestTurnTakingNextActivePlayerPerspective1() throws Exception {
        ProtocolTestingHelper.TestFormulaFromFile("formulas/GoFishProtocol/TestTurnTakingNextActivePlayerPerspective1.owl",
                true,
                GetProtocol(),
                ShortTypeNameToFullClassNameMap,
                dummies);
    }

    //@Test
    public void TestTurnTakingNextActivePlayerPerspective2() throws Exception {
        ProtocolTestingHelper.TestFormulaFromFile("formulas/GoFishProtocol/TestTurnTakingNextActivePlayerPerspective2.owl",
                true,
                GetProtocol(),
                ShortTypeNameToFullClassNameMap,
                dummies);
    }

    //@Test
    public void TestTurnTakingNextActivePlayerPerspective3() throws Exception {
        ProtocolTestingHelper.TestFormulaFromFile("formulas/GoFishProtocol/TestTurnTakingNextActivePlayerPerspective3.owl",
                true,
                GetProtocol(),
                ShortTypeNameToFullClassNameMap,
                dummies);
    }

    //@Test
    public void TestTurnTakingUniqueness1() throws Exception {
        ProtocolTestingHelper.TestFormulaFromFile("formulas/GoFishProtocol/TestTurnTakingUniqueness1.owl",
                true,
                GetProtocol(),
                ShortTypeNameToFullClassNameMap,
                dummies);
    }

    //@Test
    public void TestTurnTakingUniqueness2() throws Exception {
        ProtocolTestingHelper.TestFormulaFromFile("formulas/GoFishProtocol/TestTurnTakingUniqueness2.owl",
                true,
                GetProtocol(),
                ShortTypeNameToFullClassNameMap,
                dummies);
    }

    //@Test
    public void TestTurnTakingUniqueness3() throws Exception {
        ProtocolTestingHelper.TestFormulaFromFile("formulas/GoFishProtocol/TestTurnTakingUniqueness3.owl",
                true,
                GetProtocol(),
                ShortTypeNameToFullClassNameMap,
                dummies);
    }
}
