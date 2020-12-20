//package nl.florianslob.modelchecking.generated.CG;
//
//import Helpers.ProtocolTestingHelper;
//import discourje.examples.npb3.impl.CGThreads.CGMessage;
//import discourje.examples.npb3.impl.DoneMessage;
//import discourje.examples.npb3.impl.ExitMessage;
//import nl.florianslob.modelchecking.base.api.v2.IProtocol;
//import nl.florianslob.modelchecking.generated.CGProtocol_n_3;
//import org.junit.Test;
//
//import java.util.HashMap;
//
//public class CGProtocol_n_3Tests {
//    private IProtocol GetProtocol(){
//        return new CGProtocol_n_3();
//    }
//
//    private HashMap<String, String> ShortTypeNameToFullClassNameMap = new HashMap<>(){
//        {
//            put("CGMessage", "discourje.examples.npb3.impl.CGThreads.CGMessage");
//            put("DoneMessage", "discourje.examples.npb3.impl.DoneMessage");
//            put("ExitMessage", "discourje.examples.npb3.impl.ExitMessage");
//        }
//    };
//
//    private Object[] dummies = new Object[]{CGMessage.GetTestDummyObject(), DoneMessage.GetTestDummyObject(), ExitMessage.GetTestDummyObject()};
//
//    @Test
//    public void TestNextMasterSCGMessage_ShouldReturnFalse() throws Exception {
//        ProtocolTestingHelper.TestFormulaFromFile("formulas/CG/CGProtocol_3/TestNextMasterSCGMessage.owl",
//                false ,
//                GetProtocol(),
//                ShortTypeNameToFullClassNameMap,
//                dummies);
//    }
//
//    @Test
//    public void TestIfMessageToWorker0FinallyDoneMessageToMaster_ShouldReturnTrue() throws Exception {
//        ProtocolTestingHelper.TestFormulaFromFile("formulas/CG/CGProtocol_3/TestIfMessageToWorker0FinallyDoneMessageToMaster.owl",
//                true ,
//                GetProtocol(),
//                ShortTypeNameToFullClassNameMap,
//                dummies);
//    }
//
//    @Test
//    public void TestMasterSendGGMessageToWorker_0__ShouldReturnTrue() throws Exception {
//        ProtocolTestingHelper.TestFormulaFromFile("formulas/CG/CGProtocol_3/TestMasterSendGGMessageToWorker_0_.owl",
//                true ,
//                GetProtocol(),
//                ShortTypeNameToFullClassNameMap,
//                dummies);
//    }
//
////    @Test
//    public void TestWorker_0_AlwaysSendsDoneMessage_ShouldReturnTrue() throws Exception {
//        ProtocolTestingHelper.TestFormulaFromFile("formulas/CG/CGProtocol_3/TestWorker_0_AlwaysSendsDoneMessage.owl",
//                true ,
//                GetProtocol(),
//                ShortTypeNameToFullClassNameMap,
//                dummies);
//    }
//
////    @Test
//    public void TestMasterWillNotReceiveDoneUntilWorker_0_SendsDone_ShouldReturnTrue() throws Exception {
//        ProtocolTestingHelper.TestFormulaFromFile("formulas/CG/CGProtocol_3/TestMasterWillNotReceiveDoneUntilAWorkerSendsDone.owl",
//                true ,
//                GetProtocol(),
//                ShortTypeNameToFullClassNameMap,
//                dummies);
//    }
//
//    @Test
//    public void TestWorkerWillNotReceiveMessageUntilMasterSends_ShouldReturnTrue() throws Exception {
//        ProtocolTestingHelper
//                .TestFormulaFromFile("formulas/CG/CGProtocol_3/TestWorkerWillNotReceiveMessageUntilMasterSends.owl",
//                        true ,
//                        GetProtocol(),
//                        ShortTypeNameToFullClassNameMap,
//                        dummies);
//    }
//
//    @Test
//    public void TestWorkerOnlySendDoneWhenReceivedCGOrExit_ShouldReturnTrue() throws Exception {
//        ProtocolTestingHelper.TestFormulaFromFile("formulas/CG/CGProtocol_3/TestWorkerOnlySendDoneWhenReceivedCGOrExit.owl",
//                true ,
//                GetProtocol(),
//                ShortTypeNameToFullClassNameMap,
//                dummies);
//    }
//
//    @Test
//    public void TestWorkerWillNotSendDoneMessageUntilReceiveExit_ShouldBeFalse() throws Exception {
//        ProtocolTestingHelper.TestFormulaFromFile(
//                "formulas/CG/CGProtocol_3/TestWorkerWillNotSendDoneMessageUntilReceiveExit.owl",
//                false ,
//                GetProtocol(),
//                ShortTypeNameToFullClassNameMap,
//                dummies);
//    }
//}