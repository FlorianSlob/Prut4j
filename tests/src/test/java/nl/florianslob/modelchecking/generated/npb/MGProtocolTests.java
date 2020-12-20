package nl.florianslob.modelchecking.generated.npb;

import Helpers.ProtocolTestingHelper;
import discourje.examples.npb3.impl.DoneMessage;
import discourje.examples.npb3.impl.ExitMessage;
import discourje.examples.npb3.impl.MGThreads.InterpMessage;
import discourje.examples.npb3.impl.MGThreads.PsinvMessage;
import discourje.examples.npb3.impl.MGThreads.ResidMessage;
import discourje.examples.npb3.impl.MGThreads.RprjMessage;
import nl.florianslob.modelchecking.base.api.v2.IProtocol;
import nl.florianslob.modelchecking.base.runtime.v2.Engine;
import nl.florianslob.modelchecking.generated.MGProtocol_n_2;
import org.junit.Test;

import java.util.HashMap;

public class MGProtocolTests {
    public MGProtocolTests(){
        Engine.IsProtocolOptimized = true;
        Engine.IsLoggingEnabled = false;
    }

    private IProtocol GetProtocol(){
        return new MGProtocol_n_2();
    }

    private HashMap<String, String> ShortTypeNameToFullClassNameMap = new HashMap<>(){
        {
            put("InterpMessage", "discourje.examples.npb3.impl.MGThreads.InterpMessage");
            put("PsinvMessage", "discourje.examples.npb3.impl.MGThreads.PsinvMessage");
            put("RprjMessage", "discourje.examples.npb3.impl.MGThreads.RprjMessage");
            put("ResidMessage", "discourje.examples.npb3.impl.MGThreads.ResidMessage");
            put("DoneMessage", "discourje.examples.npb3.impl.DoneMessage");
            put("ExitMessage", "discourje.examples.npb3.impl.ExitMessage");
        }
    };
    
    private Object[] dummies = new Object[]{
            InterpMessage.GetTestDummyObject(),
            PsinvMessage.GetTestDummyObject(),
            RprjMessage.GetTestDummyObject(),
            ResidMessage.GetTestDummyObject(),
            DoneMessage.GetTestDummyObject(),
            ExitMessage.GetTestDummyObject()
    };

    @Test
    public void TestBoundness0() throws Exception {
        ProtocolTestingHelper.TestFormulaFromFile("formulas/npb/MG/TestBoundness0.owl",
                true ,
                GetProtocol(),
                ShortTypeNameToFullClassNameMap,
                dummies);
    }

    @Test
    public void TestBoundness1() throws Exception {
        ProtocolTestingHelper.TestFormulaFromFile("formulas/npb/MG/TestBoundness1.owl",
                true ,
                GetProtocol(),
                ShortTypeNameToFullClassNameMap,
                dummies);
    }

    @Test
    public void TestEventualReception0() throws Exception {
        ProtocolTestingHelper.TestFormulaFromFile("formulas/npb/MG/TestEventualReception0.owl",
                true ,
                GetProtocol(),
                ShortTypeNameToFullClassNameMap,
                dummies);
    }

    @Test
    public void TestEventualReception1() throws Exception {
        ProtocolTestingHelper.TestFormulaFromFile("formulas/npb/MG/TestEventualReception1.owl",
                true ,
                GetProtocol(),
                ShortTypeNameToFullClassNameMap,
                dummies);
    }

    @Test
    public void TestRequestResponse0() throws Exception {
        ProtocolTestingHelper.TestFormulaFromFile("formulas/npb/MG/TestRequestResponse0.owl",
                true ,
                GetProtocol(),
                ShortTypeNameToFullClassNameMap,
                dummies);
    }

    @Test
    public void TestRequestResponse1() throws Exception {
        ProtocolTestingHelper.TestFormulaFromFile("formulas/npb/MG/TestRequestResponse1.owl",
                true ,
                GetProtocol(),
                ShortTypeNameToFullClassNameMap,
                dummies);
    }

    @Test
    public void TestMax1Request0() throws Exception {
        ProtocolTestingHelper.TestFormulaFromFile("formulas/npb/MG/TestMax1Request0.owl",
                true ,
                GetProtocol(),
                ShortTypeNameToFullClassNameMap,
                dummies);
    }

    @Test
    public void TestMax1Request1() throws Exception {
        ProtocolTestingHelper.TestFormulaFromFile("formulas/npb/MG/TestMax1Request1.owl",
                true ,
                GetProtocol(),
                ShortTypeNameToFullClassNameMap,
                dummies);
    }

//    @Test
    public void TestWorkersAreReactive0() throws Exception {
        ProtocolTestingHelper.TestFormulaFromFile("formulas/npb/MG/TestWorkersAreReactive0.owl",
                true ,
                GetProtocol(),
                ShortTypeNameToFullClassNameMap,
                dummies);
    }

//    @Test
    public void TestWorkersAreReactive1() throws Exception {
        ProtocolTestingHelper.TestFormulaFromFile("formulas/npb/MG/TestWorkersAreReactive1.owl",
                true ,
                GetProtocol(),
                ShortTypeNameToFullClassNameMap,
                dummies);
    }

    @Test
    public void TestExitMeansExit() throws Exception {
        ProtocolTestingHelper.TestFormulaFromFile("formulas/npb/MG/TestExitMeansExit.owl",
                true ,
                GetProtocol(),
                ShortTypeNameToFullClassNameMap,
                dummies);
    }
}