package nl.florianslob.modelchecking.generated.npb;

import Helpers.ProtocolTestingHelper;
import discourje.examples.npb3.impl.CGThreads.CGMessage;
import discourje.examples.npb3.impl.DoneMessage;
import discourje.examples.npb3.impl.ExitMessage;
import discourje.examples.npb3.impl.FTThreads.EvolveMessage;
import discourje.examples.npb3.impl.FTThreads.FFTMessage;
import discourje.examples.npb3.impl.FTThreads.FFTSetVariablesMessage;
import nl.florianslob.modelchecking.base.api.v2.IProtocol;
import nl.florianslob.modelchecking.base.runtime.v2.Engine;
import nl.florianslob.modelchecking.generated.CGProtocol_n_2;
import nl.florianslob.modelchecking.generated.FTProtocol_n_2;
import org.junit.Test;

import java.util.HashMap;

public class FTProtocolTests {
    public FTProtocolTests(){
        Engine.IsProtocolOptimized = true;
        Engine.IsLoggingEnabled = false;
    }

    private IProtocol GetProtocol(){
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

    @Test
    public void TestAlwaysResponse0() throws Exception {
        ProtocolTestingHelper.TestFormulaFromFile("formulas/npb/TestAlwaysResponse0.owl",
                true ,
                GetProtocol(),
                ShortTypeNameToFullClassNameMap,
                dummies);
    }

    @Test
    public void TestAlwaysResponse1() throws Exception {
        ProtocolTestingHelper.TestFormulaFromFile("formulas/npb/TestAlwaysResponse1.owl",
                true ,
                GetProtocol(),
                ShortTypeNameToFullClassNameMap,
                dummies);
    }

    @Test
    public void TestMasterDoesNotSendTwice0() throws Exception {
        ProtocolTestingHelper.TestFormulaFromFile("formulas/npb/TestMasterDoesNotSendTwice0.owl",
                true ,
                GetProtocol(),
                ShortTypeNameToFullClassNameMap,
                dummies);
    }

    @Test
    public void TestMasterDoesNotSendTwice1() throws Exception {
        ProtocolTestingHelper.TestFormulaFromFile("formulas/npb/TestMasterDoesNotSendTwice1.owl",
                true ,
                GetProtocol(),
                ShortTypeNameToFullClassNameMap,
                dummies);
    }

    @Test
    public void TestWorkerNotSendBeforeReceive0() throws Exception {
        ProtocolTestingHelper.TestFormulaFromFile("formulas/npb/TestWorkerNotSendBeforeReceive0.owl",
                true ,
                GetProtocol(),
                ShortTypeNameToFullClassNameMap,
                dummies);
    }

    @Test
    public void TestWorkerNotSendBeforeReceive1() throws Exception {
        ProtocolTestingHelper.TestFormulaFromFile("formulas/npb/TestWorkerNotSendBeforeReceive1.owl",
                true ,
                GetProtocol(),
                ShortTypeNameToFullClassNameMap,
                dummies);
    }
}