package nl.florianslob.modelchecking.sandbox.protocolcodegeneration;

import nl.florianslob.modelchecking.sandbox.ISandboxingActivity;
import nl.florianslob.modelchecking.sandbox.protocolcodegeneration.definitiondatastructure.ProtocolMessageActionType;
import nl.florianslob.modelchecking.sandbox.protocolcodegeneration.definitiondatastructure.ProtocolStateNode;
import nl.florianslob.modelchecking.sandbox.protocolcodegeneration.definitiondatastructure.ProtocolTransaction;
import nl.florianslob.modelchecking.sandbox.protocolcodegeneration.definitiondatastructure.visitors.*;
import nl.florianslob.modelchecking.sandbox.protocolcodegeneration.syntaxtreedatastructure.ASTEnvironment;
import nl.florianslob.modelchecking.sandbox.protocolcodegeneration.syntaxtreedatastructure.ASTProtocol;
import nl.florianslob.modelchecking.sandbox.protocolcodegeneration.syntaxtreedatastructure.codewriters.SyntaxWriterProvider;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

public class ProtocolCodeGenerationSandboxingActivity implements ISandboxingActivity {
    @Override
    public void runActivity() throws Exception {
        // TODO Replace with some form of dependency injection
        var writerProvider = new SyntaxWriterProvider("Java11");

        var chessProtocolState0 = getInitialStateForChessProtocol();

        List<IProtocolDefinitionVisitor> visitorsFirstPass = new LinkedList<>();
        var plantUmlVisualizationVisitor =
            new CreatePlantUmlVisualizationProtocolDefinitionVisitor();
        var uniqueCommunicationChannelFinderVisitor =
            new FindUniqueCommunicationChannelsProtocolDefinitionVisitor(writerProvider.ChannelWriter);
        var findUniqueRoleNamesProtocolDefinitionVisitor =
            new FindUniqueRoleNamesProtocolDefinitionVisitor();

        visitorsFirstPass.add(plantUmlVisualizationVisitor);
        visitorsFirstPass.add(uniqueCommunicationChannelFinderVisitor);
        visitorsFirstPass.add(findUniqueRoleNamesProtocolDefinitionVisitor);

        chessProtocolState0.Accept(visitorsFirstPass);

        System.out.println("Printing PlantUml");
        System.out.println(plantUmlVisualizationVisitor.getPlantUmlSyntax());

        plantUmlVisualizationVisitor.savePlantUmlGraphToSvg();


        var visitorsSecondPass = new LinkedList<CreateEnvironmentForRoleProtocolDefinitionVisitor>();

        for(String roleName : findUniqueRoleNamesProtocolDefinitionVisitor.roleNames){
            visitorsSecondPass.add(new CreateEnvironmentForRoleProtocolDefinitionVisitor(roleName, writerProvider, uniqueCommunicationChannelFinderVisitor.ASTCommunicationChannels));
        }
        // pass2
        chessProtocolState0.Accept(visitorsSecondPass);

        var environments = new HashSet<ASTEnvironment>();

        for(CreateEnvironmentForRoleProtocolDefinitionVisitor visitor : visitorsSecondPass){
            environments.add(visitor.getASTStateCaseStatements());
        }

        var protocolSyntaxTree = new ASTProtocol(writerProvider.ProtocolWriter, "GeneratedChessProtocol",
            uniqueCommunicationChannelFinderVisitor.ASTCommunicationChannels, environments);

        var builder = new StringBuilder();
        protocolSyntaxTree.buildSyntax(builder,0);

        //append string buffer/builder to buffered writer
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("../model-checking-testproject/src/main/java/nl/florianslob/modelchecking/generated/GeneratedChessProtocol.java"))) {
            bw.append(builder);//Internally it does aSB.toString();
            bw.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private ProtocolStateNode getInitialStateForChessProtocol() {
        var state0 = new ProtocolStateNode(0);
        var state1 = new ProtocolStateNode(1);
        var state2 = new ProtocolStateNode(2);
        var state3 = new ProtocolStateNode(3);
        var state4 = new ProtocolStateNode(4);
        var state5 = new ProtocolStateNode(5);
        var state6 = new ProtocolStateNode(6);

        var roleWhiteName = "W";
        var roleBlackName = "B";
        var messageTypeName = "Move";

        state0.AddOutgoingTransaction(new ProtocolTransaction(state1, ProtocolMessageActionType.SEND, roleWhiteName, roleBlackName, messageTypeName));
        state1.AddOutgoingTransaction(new ProtocolTransaction(state2, ProtocolMessageActionType.RECEIVE, roleWhiteName, roleBlackName, messageTypeName));
        state2.AddOutgoingTransaction(new ProtocolTransaction(state3, ProtocolMessageActionType.SEND,  roleBlackName, roleWhiteName, messageTypeName));
        state3.AddOutgoingTransaction(new ProtocolTransaction(state4, ProtocolMessageActionType.RECEIVE, roleBlackName, roleWhiteName, messageTypeName));
        state4.AddOutgoingTransaction(new ProtocolTransaction(state5, ProtocolMessageActionType.SEND, roleWhiteName, roleBlackName, messageTypeName));
        state5.AddOutgoingTransaction(new ProtocolTransaction(state6, ProtocolMessageActionType.RECEIVE, roleWhiteName, roleBlackName, messageTypeName));
        state6.AddOutgoingTransaction(new ProtocolTransaction(state3, ProtocolMessageActionType.SEND, roleBlackName, roleWhiteName, messageTypeName));

        return state0;
    }
}
