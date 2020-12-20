package nl.florianslob.modelchecking.generated.npb;

import Helpers.ProtocolTestingHelper;
import discourje.examples.npb3.impl.DoneMessage;
import discourje.examples.npb3.impl.ExitMessage;
import discourje.examples.npb3.impl.FTThreads.EvolveMessage;
import discourje.examples.npb3.impl.FTThreads.FFTMessage;
import discourje.examples.npb3.impl.FTThreads.FFTSetVariablesMessage;
import nl.florianslob.modelchecking.base.api.v2.Pr;
import nl.florianslob.modelchecking.base.runtime.v2.Engine;
import nl.florianslob.modelchecking.generated.FTProtocol_n_2;
import org.junit.Test;

import java.util.HashMap;

public class FTProtocolTests {
    public FTProtocolTests(){
        Engine.IsProtocolOptimized = true;
        Engine.IsLoggingEnabled = false;
    }

    private Pr GetProtocol(){
        return new FTProtocol_n_2();
    }

    private HashMap<String, String> ShortTypeNameToFullClassNameMap = new HashMap<>(){
        {
            put("EvolveMessage", "discourje.examples.npb3.impl.FTThreads.EvolveMessage");
            put("FFTMessage", "discourje.examples.npb3.impl.FTThreads.FFTMessage");
            put("FFTSetVariablesMessage", "discourje.examples.npb3.impl.FTThreads.FFTSetVariablesMessage");
            put("DoneMessage", "discourje.examples.npb3.impl.DoneMessage");
            put("ExitMessage", "discourje.examples.npb3.impl.ExitMessage");
        }
    };

    private Object[] dummies = new Object[]{
            EvolveMessage.GetTestDummyObject(),
            FFTMessage.GetTestDummyObject(),
            FFTSetVariablesMessage.GetTestDummyObject(),
            DoneMessage.GetTestDummyObject(),
            ExitMessage.GetTestDummyObject()
    };

    @Test // Disabled, long running test
    public void TestBoundness0() throws Exception {
        ProtocolTestingHelper.TestFormulaFromFile("formulas/npb/FT/TestBoundness0.owl",
                true ,
                GetProtocol(),
                ShortTypeNameToFullClassNameMap,
                dummies);
    }

    @Test // Disabled, long running test
    public void TestBoundness1() throws Exception {
        ProtocolTestingHelper.TestFormulaFromFile("formulas/npb/FT/TestBoundness1.owl",
                true ,
                GetProtocol(),
                ShortTypeNameToFullClassNameMap,
                dummies);
    }

    @Test // Disabled, long running test
    public void TestEventualReception0() throws Exception {
        ProtocolTestingHelper.TestFormulaFromFile("formulas/npb/FT/TestEventualReception0.owl",
                true ,
                GetProtocol(),
                ShortTypeNameToFullClassNameMap,
                dummies);
    }

    @Test // Disabled, long running test
    public void TestEventualReception1() throws Exception {
        ProtocolTestingHelper.TestFormulaFromFile("formulas/npb/FT/TestEventualReception1.owl",
                true ,
                GetProtocol(),
                ShortTypeNameToFullClassNameMap,
                dummies);
    }

    @Test // Disabled, long running test
    public void TestRequestResponse0() throws Exception {
        ProtocolTestingHelper.TestFormulaFromFile("formulas/npb/FT/TestRequestResponse0.owl",
                true ,
                GetProtocol(),
                ShortTypeNameToFullClassNameMap,
                dummies);
    }

    @Test // Disabled, long running test
    public void TestRequestResponse1() throws Exception {
        ProtocolTestingHelper.TestFormulaFromFile("formulas/npb/FT/TestRequestResponse1.owl",
                true ,
                GetProtocol(),
                ShortTypeNameToFullClassNameMap,
                dummies);
    }

    @Test // Disabled, long running test
    public void TestMax1Request0() throws Exception {
        ProtocolTestingHelper.TestFormulaFromFile("formulas/npb/FT/TestMax1Request0.owl",
                true ,
                GetProtocol(),
                ShortTypeNameToFullClassNameMap,
                dummies);
    }

    @Test // Disabled, long running test
    public void TestMax1Request1() throws Exception {
        ProtocolTestingHelper.TestFormulaFromFile("formulas/npb/FT/TestMax1Request1.owl",
                true ,
                GetProtocol(),
                ShortTypeNameToFullClassNameMap,
                dummies);
    }

    @Test // Disabled, long running test
    public void TestWorkersAreReactive0() throws Exception {
        ProtocolTestingHelper.TestFormulaFromFile("formulas/npb/FT/TestWorkersAreReactive0.owl",
                true ,
                GetProtocol(),
                ShortTypeNameToFullClassNameMap,
                dummies);
    }

    @Test // Disabled, long running test
    public void TestWorkersAreReactive1() throws Exception {
        ProtocolTestingHelper.TestFormulaFromFile("formulas/npb/FT/TestWorkersAreReactive1.owl",
                true ,
                GetProtocol(),
                ShortTypeNameToFullClassNameMap,
                dummies);
    }

    @Test // Disabled, long running test
    public void TestExitMeansExit() throws Exception {
        ProtocolTestingHelper.TestFormulaFromFile("formulas/npb/FT/TestExitMeansExit.owl",
                true ,
                GetProtocol(),
                ShortTypeNameToFullClassNameMap,
                dummies);
    }
}