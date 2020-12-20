package nl.florianslob.modelchecking.generated.npb;

import Helpers.ProtocolTestingHelper;
import discourje.examples.npb3.impl.DoneMessage;
import discourje.examples.npb3.impl.ExitMessage;
import discourje.examples.npb3.impl.ISThreads.RankMessage;
import nl.florianslob.modelchecking.base.api.v2.IProtocol;
import nl.florianslob.modelchecking.base.runtime.v2.Engine;
import nl.florianslob.modelchecking.generated.ISProtocol_n_2;
import org.junit.Test;

import java.util.HashMap;

public class ISProtocolTests {
    public ISProtocolTests(){
        Engine.IsProtocolOptimized = true;
        Engine.IsLoggingEnabled = false;
    }

    private IProtocol GetProtocol(){
        return new ISProtocol_n_2();
    }

    private HashMap<String, String> ShortTypeNameToFullClassNameMap = new HashMap<>(){
        {
            put("RankMessage", "discourje.examples.npb3.impl.ISThreads.RankMessage");
            put("DoneMessage", "discourje.examples.npb3.impl.DoneMessage");
            put("ExitMessage", "discourje.examples.npb3.impl.ExitMessage");
        }
    };
    
    private Object[] dummies = new Object[]{RankMessage.GetTestDummyObject(), DoneMessage.GetTestDummyObject(), ExitMessage.GetTestDummyObject()};

    @Test
    public void TestBoundness0() throws Exception {
        ProtocolTestingHelper.TestFormulaFromFile("formulas/npb/IS/TestBoundness0.owl",
                true ,
                GetProtocol(),
                ShortTypeNameToFullClassNameMap,
                dummies);
    }

    @Test
    public void TestBoundness1() throws Exception {
        ProtocolTestingHelper.TestFormulaFromFile("formulas/npb/IS/TestBoundness1.owl",
                true ,
                GetProtocol(),
                ShortTypeNameToFullClassNameMap,
                dummies);
    }

    @Test
    public void TestEventualReception0() throws Exception {
        ProtocolTestingHelper.TestFormulaFromFile("formulas/npb/IS/TestEventualReception0.owl",
                true ,
                GetProtocol(),
                ShortTypeNameToFullClassNameMap,
                dummies);
    }

    @Test
    public void TestEventualReception1() throws Exception {
        ProtocolTestingHelper.TestFormulaFromFile("formulas/npb/IS/TestEventualReception1.owl",
                true ,
                GetProtocol(),
                ShortTypeNameToFullClassNameMap,
                dummies);
    }

    @Test
    public void TestRequestResponse0() throws Exception {
        ProtocolTestingHelper.TestFormulaFromFile("formulas/npb/IS/TestRequestResponse0.owl",
                true ,
                GetProtocol(),
                ShortTypeNameToFullClassNameMap,
                dummies);
    }

    @Test
    public void TestRequestResponse1() throws Exception {
        ProtocolTestingHelper.TestFormulaFromFile("formulas/npb/IS/TestRequestResponse1.owl",
                true ,
                GetProtocol(),
                ShortTypeNameToFullClassNameMap,
                dummies);
    }

    @Test
    public void TestMax1Request0() throws Exception {
        ProtocolTestingHelper.TestFormulaFromFile("formulas/npb/IS/TestMax1Request0.owl",
                true ,
                GetProtocol(),
                ShortTypeNameToFullClassNameMap,
                dummies);
    }

    @Test
    public void TestMax1Request1() throws Exception {
        ProtocolTestingHelper.TestFormulaFromFile("formulas/npb/IS/TestMax1Request1.owl",
                true ,
                GetProtocol(),
                ShortTypeNameToFullClassNameMap,
                dummies);
    }

    @Test
    public void TestWorkersAreReactive0() throws Exception {
        ProtocolTestingHelper.TestFormulaFromFile("formulas/npb/IS/TestWorkersAreReactive0.owl",
                true ,
                GetProtocol(),
                ShortTypeNameToFullClassNameMap,
                dummies);
    }

    @Test
    public void TestWorkersAreReactive1() throws Exception {
        ProtocolTestingHelper.TestFormulaFromFile("formulas/npb/IS/TestWorkersAreReactive1.owl",
                true ,
                GetProtocol(),
                ShortTypeNameToFullClassNameMap,
                dummies);
    }

    @Test
    public void TestExitMeansExit() throws Exception {
        ProtocolTestingHelper.TestFormulaFromFile("formulas/npb/IS/TestExitMeansExit.owl",
                true ,
                GetProtocol(),
                ShortTypeNameToFullClassNameMap,
                dummies);
    }
}