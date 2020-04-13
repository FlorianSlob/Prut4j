package nl.florianslob.model.checking.sandbox.protocolcodegeneration;

import nl.florianslob.model.checking.sandbox.ISandboxingActivity;
import nl.florianslob.model.checking.sandbox.protocolcodegeneration.definitiondatastructure.*;
import nl.florianslob.model.checking.sandbox.protocolcodegeneration.syntaxtreedatastructure.EnvironmentSyntaxTreeItem;
import nl.florianslob.model.checking.sandbox.protocolcodegeneration.syntaxtreedatastructure.ProtocolSyntaxTreeItem;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

public class ProtocolCodeGenerationSandboxingActivity implements ISandboxingActivity {
    @Override
    public void runActivity() throws Exception {
        ProtocolStateNode chessProtocolState0 = getInitialStateForChessProtocol();

        List<IVisitor<ProtocolStateNode>> visitorsFirstPass = new LinkedList<>();
        PlantUmlVisualizationVisitor plantUmlVisualizationVisitor = new PlantUmlVisualizationVisitor();
        UniqueCommunicationChannelFinderVisitor uniqueCommunicationChannelFinderVisitor = new UniqueCommunicationChannelFinderVisitor();
        UniqueRoleNameFinderVisitor uniqueRolenameFinderVisitor = new UniqueRoleNameFinderVisitor();

        visitorsFirstPass.add(plantUmlVisualizationVisitor);
        visitorsFirstPass.add(uniqueCommunicationChannelFinderVisitor);
        visitorsFirstPass.add(uniqueRolenameFinderVisitor);

        chessProtocolState0.Accept(visitorsFirstPass);

        System.out.println("Printing PlantUml");
        System.out.println(plantUmlVisualizationVisitor.getPlantUmlSyntax());

        plantUmlVisualizationVisitor.savePlantUmlGraphToSvg();


        List<IVisitor<ProtocolStateNode>> visitorsSecondPass = new LinkedList<>();

        for(String roleName : uniqueRolenameFinderVisitor.roleNames){
            visitorsSecondPass.add(new CreateEnvironmentForRoleVisitor(roleName));
        }
        // pass2
        chessProtocolState0.Accept(visitorsSecondPass);


        HashSet<EnvironmentSyntaxTreeItem> environments = new HashSet<>();

        for(IVisitor<ProtocolStateNode> visitor : visitorsSecondPass){
            environments.add(((CreateEnvironmentForRoleVisitor) visitor).getEnvironmentStateCaseStatements());
        }

        ProtocolSyntaxTreeItem protocolSyntaxTree = new ProtocolSyntaxTreeItem(uniqueCommunicationChannelFinderVisitor.communicationChannels, environments);

        System.out.println(protocolSyntaxTree.getSyntax(0));

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
