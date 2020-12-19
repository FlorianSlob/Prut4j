package nl.florianslob.modelchecking.generated.FT;

import Helpers.ProtocolTestingHelper;
import discourje.examples.npb3.impl.DoneMessage;
import discourje.examples.npb3.impl.ExitMessage;
import discourje.examples.npb3.impl.FTThreads.FFTMessage;
import nl.florianslob.modelchecking.base.api.v2.IProtocol;
import nl.florianslob.modelchecking.generated.FTProtocol_n_3;
import org.junit.Test;

import java.util.HashMap;

public class FTProtocol_n_3Tests {
    private IProtocol GetProtocol(){
        return new FTProtocol_n_3();
    }

    private HashMap<String, String> ShortTypeNameToFullClassNameMap = new HashMap<>(){
        {
            put("FFTMessage", "discourje.examples.npb3.impl.FTThreads.FFTMessage");
            put("DoneMessage", "discourje.examples.npb3.impl.DoneMessage");
            put("ExitMessage", "discourje.examples.npb3.impl.ExitMessage");
        }
    };
    
    private Object[] dummies = new Object[]{FFTMessage.GetTestDummyObject(), DoneMessage.GetTestDummyObject(), ExitMessage.GetTestDummyObject()};

    @Test
    public void TestNextMasterSFTMessage_ShouldReturnFalse() throws Exception {
        ProtocolTestingHelper.TestFormulaFromFile("formulas/FT/FTProtocol_strict_3/TestNextMasterSFTMessage.owl",
                false ,
                GetProtocol(),
                ShortTypeNameToFullClassNameMap,
                dummies);
    }

    @Test
    public void TestIfMessageToWorker0FinallyDoneMessageToMaster_ShouldReturnTrue() throws Exception {
        ProtocolTestingHelper.TestFormulaFromFile("formulas/FT/FTProtocol_strict_3/TestIfMessageToWorker0FinallyDoneMessageToMaster.owl",
                true ,
                GetProtocol(),
                ShortTypeNameToFullClassNameMap,
                dummies);
    }

    @Test
    public void TestMasterSendGGMessageToWorker_0__ShouldReturnTrue() throws Exception {
        ProtocolTestingHelper.TestFormulaFromFile("formulas/FT/FTProtocol_strict_3/TestMasterSendGGMessageToWorker_0_.owl",
                true ,
                GetProtocol(),
                ShortTypeNameToFullClassNameMap,
                dummies);
    }

    @Test
    public void TestWorker_0_AlwaysSendsDoneMessage_ShouldReturnTrue() throws Exception {
        ProtocolTestingHelper.TestFormulaFromFile("formulas/FT/FTProtocol_strict_3/TestWorker_0_AlwaysSendsDoneMessage.owl",
                true ,
                GetProtocol(),
                ShortTypeNameToFullClassNameMap,
                dummies);
    }

    @Test
    public void TestMasterWillNotReceiveDoneUntilWorker_0_SendsDone_ShouldReturnTrue() throws Exception {
        ProtocolTestingHelper.TestFormulaFromFile("formulas/FT/FTProtocol_strict_3/TestMasterWillNotReceiveDoneUntilAWorkerSendsDone.owl",
                true ,
                GetProtocol(),
                ShortTypeNameToFullClassNameMap,
                dummies);
    }

    @Test
    public void TestWorkerWillNotReceiveMessageUntilMasterSends_ShouldReturnTrue() throws Exception {
        ProtocolTestingHelper
                .TestFormulaFromFile("formulas/FT/FTProtocol_strict_3/TestWorkerWillNotReceiveMessageUntilMasterSends.owl",
                        true ,
                        GetProtocol(),
                        ShortTypeNameToFullClassNameMap,
                        dummies);
    }

    @Test
    public void TestWorkerOnlySendDoneWhenReceivedFTOrExit_ShouldReturnTrue() throws Exception {
        ProtocolTestingHelper.TestFormulaFromFile("formulas/FT/FTProtocol_strict_3/TestWorkerOnlySendDoneWhenReceivedFTOrExit.owl",
                true ,
                GetProtocol(),
                ShortTypeNameToFullClassNameMap,
                dummies);
    }

    @Test
    public void TestWorkerWillNotSendDoneMessageUntilReceiveExit_ShouldBeFalse() throws Exception {
        ProtocolTestingHelper.TestFormulaFromFile(
                "formulas/FT/FTProtocol_strict_3/TestWorkerWillNotSendDoneMessageUntilReceiveExit.owl",
                false ,
                GetProtocol(),
                ShortTypeNameToFullClassNameMap,
                dummies);
    }
}