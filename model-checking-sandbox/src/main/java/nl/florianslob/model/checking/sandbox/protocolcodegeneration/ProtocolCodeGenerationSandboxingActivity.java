package nl.florianslob.model.checking.sandbox.protocolcodegeneration;

import nl.florianslob.model.checking.sandbox.ISandboxingActivity;
import nl.florianslob.model.checking.sandbox.protocolcodegeneration.definitiondatastructure.*;

import java.util.LinkedList;
import java.util.List;

public class ProtocolCodeGenerationSandboxingActivity implements ISandboxingActivity {
    @Override
    public void runActivity() throws Exception {
        ProtocolStateNode chessProtocolState0 = getInitialStateForChessProtocol();

        List<IVisitor<ProtocolStateNode>> visitors = new LinkedList<>();
        PlantUmlVisualizationVisitor plantUmlVisualizationVisitor = new PlantUmlVisualizationVisitor();
        visitors.add(plantUmlVisualizationVisitor);
        // TODO add more visitors for code generation

        chessProtocolState0.Accept(visitors);
        System.out.println("Printing PlantUml");
        System.out.println(plantUmlVisualizationVisitor.getPlantUmlSyntax());

        plantUmlVisualizationVisitor.savePlantUmlGraphToSvg();
    }

    private ProtocolStateNode getInitialStateForChessProtocol() {
        ProtocolStateNode state0 = new ProtocolStateNode(0);
        ProtocolStateNode state1 = new ProtocolStateNode(1);
        ProtocolStateNode state2 = new ProtocolStateNode(2);
        ProtocolStateNode state3 = new ProtocolStateNode(3);
        ProtocolStateNode state4 = new ProtocolStateNode(4);
        ProtocolStateNode state5 = new ProtocolStateNode(5);
        ProtocolStateNode state6 = new ProtocolStateNode(6);

        String roleWhiteName = "W";
        String roleBlackName = "B";
        String messageTypeName = "Move";

        state0.AddOutgoingTransaction(new ProtocolTransaction(state1, ProtocolMessageAction.SEND, roleWhiteName, roleBlackName, messageTypeName));
        state1.AddOutgoingTransaction(new ProtocolTransaction(state2, ProtocolMessageAction.RECEIVE, roleWhiteName, roleBlackName, messageTypeName));
        state2.AddOutgoingTransaction(new ProtocolTransaction(state3, ProtocolMessageAction.SEND,  roleBlackName, roleWhiteName, messageTypeName));
        state3.AddOutgoingTransaction(new ProtocolTransaction(state4, ProtocolMessageAction.RECEIVE, roleBlackName, roleWhiteName, messageTypeName));
        state4.AddOutgoingTransaction(new ProtocolTransaction(state5, ProtocolMessageAction.SEND, roleWhiteName, roleBlackName, messageTypeName));
        state5.AddOutgoingTransaction(new ProtocolTransaction(state6, ProtocolMessageAction.RECEIVE, roleWhiteName, roleBlackName, messageTypeName));
        state6.AddOutgoingTransaction(new ProtocolTransaction(state3, ProtocolMessageAction.SEND, roleBlackName, roleWhiteName, messageTypeName));

        return state0;
    }
}
