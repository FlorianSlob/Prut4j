package nl.florianslob.modelchecking.generated.npb;

import Helpers.ProtocolTestingHelper;
import discourje.examples.npb3.impl.CGThreads.CGMessage;
import discourje.examples.npb3.impl.DoneMessage;
import discourje.examples.npb3.impl.ExitMessage;
import nl.florianslob.modelchecking.base.api.v2.Pr;

import nl.florianslob.modelchecking.base.runtime.v2.Engine;
import nl.florianslob.modelchecking.generated.CGProtocol_n_2;
import org.junit.Test;

import java.util.HashMap;

public class CGProtocolTests {
    public CGProtocolTests(){
        Engine.IsProtocolOptimized = true;
        Engine.IsLoggingEnabled = false;
    }

    private Pr GetProtocol(){
        return new CGProtocol_n_2();
    }

    private HashMap<String, String> ShortTypeNameToFullClassNameMap = new HashMap<>(){
        {
            put("CGMessage", "discourje.examples.npb3.impl.CGThreads.CGMessage");
            put("DoneMessage", "discourje.examples.npb3.impl.DoneMessage");
            put("ExitMessage", "discourje.examples.npb3.impl.ExitMessage");
        }
    };
    
    private Object[] dummies = new Object[]{
            CGMessage.GetTestDummyObject(),
            DoneMessage.GetTestDummyObject(),
            ExitMessage.GetTestDummyObject()
    };

    @Test
    public void TestBoundness0() throws Exception {
        ProtocolTestingHelper.TestFormulaFromFile("formulas/npb/CG/TestBoundness0.owl",
                true ,
                GetProtocol(),
                ShortTypeNameToFullClassNameMap,
                dummies);
    }

    @Test
    public void TestBoundness1() throws Exception {
        ProtocolTestingHelper.TestFormulaFromFile("formulas/npb/CG/TestBoundness1.owl",
                true ,
                GetProtocol(),
                ShortTypeNameToFullClassNameMap,
                dummies);
    }

    @Test
    public void TestEventualReception0() throws Exception {
        ProtocolTestingHelper.TestFormulaFromFile("formulas/npb/CG/TestEventualReception0.owl",
                true ,
                GetProtocol(),
                ShortTypeNameToFullClassNameMap,
                dummies);
    }

    @Test
    public void TestEventualReception1() throws Exception {
        ProtocolTestingHelper.TestFormulaFromFile("formulas/npb/CG/TestEventualReception1.owl",
                true ,
                GetProtocol(),
                ShortTypeNameToFullClassNameMap,
                dummies);
    }

    @Test
    public void TestRequestResponse0() throws Exception {
        ProtocolTestingHelper.TestFormulaFromFile("formulas/npb/CG/TestRequestResponse0.owl",
                true ,
                GetProtocol(),
                ShortTypeNameToFullClassNameMap,
                dummies);
    }

    @Test
    public void TestRequestResponse1() throws Exception {
        ProtocolTestingHelper.TestFormulaFromFile("formulas/npb/CG/TestRequestResponse1.owl",
                true ,
                GetProtocol(),
                ShortTypeNameToFullClassNameMap,
                dummies);
    }

    @Test
    public void TestMax1Request0() throws Exception {
        ProtocolTestingHelper.TestFormulaFromFile("formulas/npb/CG/TestMax1Request0.owl",
                true ,
                GetProtocol(),
                ShortTypeNameToFullClassNameMap,
                dummies);
    }

    @Test
    public void TestMax1Request1() throws Exception {
        ProtocolTestingHelper.TestFormulaFromFile("formulas/npb/CG/TestMax1Request1.owl",
                true ,
                GetProtocol(),
                ShortTypeNameToFullClassNameMap,
                dummies);
    }

    @Test
    public void TestWorkersAreReactive0() throws Exception {
        ProtocolTestingHelper.TestFormulaFromFile("formulas/npb/CG/TestWorkersAreReactive0.owl",
                true ,
                GetProtocol(),
                ShortTypeNameToFullClassNameMap,
                dummies);
    }

    @Test
    public void TestWorkersAreReactive1() throws Exception {
        ProtocolTestingHelper.TestFormulaFromFile("formulas/npb/CG/TestWorkersAreReactive1.owl",
                true ,
                GetProtocol(),
                ShortTypeNameToFullClassNameMap,
                dummies);
    }

    @Test
    public void TestExitMeansExit() throws Exception {
        ProtocolTestingHelper.TestFormulaFromFile("formulas/npb/CG/TestExitMeansExit.owl",
                true ,
                GetProtocol(),
                ShortTypeNameToFullClassNameMap,
                dummies);
    }
}