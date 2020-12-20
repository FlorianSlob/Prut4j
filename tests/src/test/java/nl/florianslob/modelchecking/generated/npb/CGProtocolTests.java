package nl.florianslob.modelchecking.generated.npb;

import Helpers.ProtocolTestingHelper;
import discourje.examples.npb3.impl.CGThreads.CGMessage;
import discourje.examples.npb3.impl.DoneMessage;
import discourje.examples.npb3.impl.ExitMessage;
import nl.florianslob.modelchecking.base.api.v2.IProtocol;

import nl.florianslob.modelchecking.base.runtime.v2.Engine;
import nl.florianslob.modelchecking.generated.CGProtocol_n_2;
import org.junit.Test;

import java.util.HashMap;

public class CGProtocolTests {
    public CGProtocolTests(){
        Engine.IsProtocolOptimized = true;
        Engine.IsLoggingEnabled = false;
    }

    private IProtocol GetProtocol(){
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