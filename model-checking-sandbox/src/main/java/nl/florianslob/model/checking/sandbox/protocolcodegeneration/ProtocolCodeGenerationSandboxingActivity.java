package nl.florianslob.model.checking.sandbox.protocolcodegeneration;

import nl.florianslob.model.checking.sandbox.ISandboxingActivity;
import nl.florianslob.model.checking.sandbox.protocolcodegeneration.definitiondatastructure.*;
import nl.florianslob.model.checking.sandbox.protocolcodegeneration.syntaxtreedatastructure.EnvironmentSyntaxTreeItem;
import nl.florianslob.model.checking.sandbox.protocolcodegeneration.syntaxtreedatastructure.ProtocolSyntaxTreeItem;
import nl.florianslob.model.checking.sandbox.protocolcodegeneration.syntaxtreedatastructure.adapters.SyntaxBuilderAdapterProvider;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

public class ProtocolCodeGenerationSandboxingActivity implements ISandboxingActivity {
    @Override
    public void runActivity() throws Exception {
        // TODO Replace with some form of dependency injection
        SyntaxBuilderAdapterProvider adapterProvider = new SyntaxBuilderAdapterProvider("PseudoCode");

        ProtocolStateNode chessProtocolState0 = getInitialStateForChessProtocol();

        List<IVisitor<ProtocolStateNode>> visitorsFirstPass = new LinkedList<>();
        PlantUmlVisualizationVisitor plantUmlVisualizationVisitor = new PlantUmlVisualizationVisitor();
        UniqueCommunicationChannelFinderVisitor uniqueCommunicationChannelFinderVisitor = new UniqueCommunicationChannelFinderVisitor(adapterProvider);
        UniqueRoleNameFinderVisitor uniqueRolenameFinderVisitor = new UniqueRoleNameFinderVisitor();

        visitorsFirstPass.add(plantUmlVisualizationVisitor);
        visitorsFirstPass.add(uniqueCommunicationChannelFinderVisitor);
        visitorsFirstPass.add(uniqueRolenameFinderVisitor);

        chessProtocolState0.Accept(visitorsFirstPass);

        System.out.println("Printing PlantUml");
        System.out.println(plantUmlVisualizationVisitor.getPlantUmlSyntax());

        plantUmlVisualizationVisitor.savePlantUmlGraphToSvg();


        List<CreateEnvironmentForRoleVisitor> visitorsSecondPass = new LinkedList<>();

        for(String roleName : uniqueRolenameFinderVisitor.roleNames){
            visitorsSecondPass.add(new CreateEnvironmentForRoleVisitor(roleName, adapterProvider));
        }
        // pass2
        chessProtocolState0.Accept(visitorsSecondPass);

        HashSet<EnvironmentSyntaxTreeItem> environments = new HashSet<>();

        for(CreateEnvironmentForRoleVisitor visitor : visitorsSecondPass){
            environments.add(visitor.getEnvironmentStateCaseStatements());
        }

        ProtocolSyntaxTreeItem protocolSyntaxTree = new ProtocolSyntaxTreeItem("ChessProtocol",
            uniqueCommunicationChannelFinderVisitor.communicationChannelSyntaxTreeItems, environments, adapterProvider.ProtocolWriter);

        StringBuilder builder = new StringBuilder();
        protocolSyntaxTree.buildSyntax(builder,0);

        System.out.println(builder.toString()); // TODO This should be a write to a file.
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
