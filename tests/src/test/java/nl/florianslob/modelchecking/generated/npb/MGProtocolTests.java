package nl.florianslob.modelchecking.generated.npb;

import Helpers.ProtocolTestingHelper;
import discourje.examples.npb3.impl.CGThreads.CGMessage;
import discourje.examples.npb3.impl.DoneMessage;
import discourje.examples.npb3.impl.ExitMessage;
import discourje.examples.npb3.impl.FTThreads.EvolveMessage;
import discourje.examples.npb3.impl.FTThreads.FFTMessage;
import discourje.examples.npb3.impl.FTThreads.FFTSetVariablesMessage;
import discourje.examples.npb3.impl.MGThreads.InterpMessage;
import discourje.examples.npb3.impl.MGThreads.PsinvMessage;
import discourje.examples.npb3.impl.MGThreads.ResidMessage;
import discourje.examples.npb3.impl.MGThreads.RprjMessage;
import nl.florianslob.modelchecking.base.api.v2.IProtocol;
import nl.florianslob.modelchecking.base.runtime.v2.Engine;
import nl.florianslob.modelchecking.generated.CGProtocol_n_2;
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