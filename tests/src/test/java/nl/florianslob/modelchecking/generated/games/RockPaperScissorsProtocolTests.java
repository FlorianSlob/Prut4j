package nl.florianslob.modelchecking.generated.games;

import Helpers.ProtocolTestingHelper;
import discourje.examples.gofish.*;
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

    private Object[] dummies = new Object[]{ new Card(), new Turn(), new Ask(), new Go(), new Fish(), new OutOfCards()};

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
}
