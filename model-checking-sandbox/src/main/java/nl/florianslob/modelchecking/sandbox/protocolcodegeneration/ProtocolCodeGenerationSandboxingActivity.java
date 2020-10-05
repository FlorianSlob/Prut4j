package nl.florianslob.modelchecking.sandbox.protocolcodegeneration;

import clojure.java.api.Clojure;
import clojure.lang.IFn;
import discourje.core.graph.Edge;
import discourje.core.graph.Florian;
import discourje.core.graph.Graph;
import discourje.core.graph.Vertex;
import nl.florianslob.modelchecking.sandbox.ISandboxingActivity;
import nl.florianslob.modelchecking.sandbox.protocolcodegeneration.definitiondatastructure.ProtocolMessageActionType;
import nl.florianslob.modelchecking.sandbox.protocolcodegeneration.definitiondatastructure.ProtocolStateNode;
import nl.florianslob.modelchecking.sandbox.protocolcodegeneration.definitiondatastructure.ProtocolTransition;
import nl.florianslob.modelchecking.sandbox.protocolcodegeneration.definitiondatastructure.visitors.*;
import nl.florianslob.modelchecking.sandbox.protocolcodegeneration.helpers.ClojureGraphToDtoHelper;
import nl.florianslob.modelchecking.sandbox.protocolcodegeneration.syntaxtreedatastructure.ASTEnvironment;
import nl.florianslob.modelchecking.sandbox.protocolcodegeneration.syntaxtreedatastructure.ASTProtocol;
import nl.florianslob.modelchecking.sandbox.protocolcodegeneration.syntaxtreedatastructure.codewriters.SyntaxWriterProvider;
import owl.translations.delag.State;

import javax.swing.*;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class ProtocolCodeGenerationSandboxingActivity implements ISandboxingActivity {
    @Override
    public void runActivity() throws Exception {
        // TODO Replace with some form of dependency injection
        var writerProvider = new SyntaxWriterProvider("Java11");

//        var allProtocolStateNodes = new LinkedList<ProtocolStateNode>();
        var protocolStateNodesResult = getInitialStateForChessProtocol();

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

        protocolStateNodesResult.InitialState.Accept(visitorsFirstPass);

        System.out.println("Printing PlantUml");
        System.out.println(plantUmlVisualizationVisitor.getPlantUmlSyntax());

        plantUmlVisualizationVisitor.savePlantUmlGraphToSvg();


        var visitorsSecondPass = new LinkedList<CreateEnvironmentForRoleProtocolDefinitionVisitor>();

        for(String roleName : findUniqueRoleNamesProtocolDefinitionVisitor.roleNames){
            visitorsSecondPass.add(new CreateEnvironmentForRoleProtocolDefinitionVisitor(roleName, writerProvider, uniqueCommunicationChannelFinderVisitor.ASTCommunicationChannels));
        }

        // Dirty fix to enable a second pass.
        for(var node : protocolStateNodesResult.AllProtocolStateNodes){
            node.VisitedBefore = false;
        }
        // pass2
        protocolStateNodesResult.InitialState.Accept(visitorsSecondPass);

        var environments = new HashSet<ASTEnvironment>();

        for(CreateEnvironmentForRoleProtocolDefinitionVisitor visitor : visitorsSecondPass){
            environments.add(visitor.getASTStateCaseStatements());
        }

        var protocolSyntaxTree = new ASTProtocol(writerProvider.ProtocolWriter, "CGProtocol",
            uniqueCommunicationChannelFinderVisitor.ASTCommunicationChannels, environments);

        var builder = new StringBuilder();
        protocolSyntaxTree.buildSyntax(builder,0);

        //append string buffer/builder to buffered writer
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("../model-checking-benchmarks/src/main/java/nl/florianslob/modelchecking/generated/CGProtocol.java"))) {
            bw.append(builder);//Internally it does aSB.toString();
            bw.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private ProtocolStateNodesResult getInitialStateForChessProtocol() {
        var result = new ProtocolStateNodesResult();
        // Call Clojure function
        IFn require = Clojure.var("clojure.core","require");
        require.invoke(Clojure.read("discourje.core.main"));

//        var pathToProtocolDefinition = "C:/src/study/model-checking-sandbox/model-checking-sandbox/protocol_definitions/chessWithPlayerNames.dcj";
        var pathToProtocolDefinition = "C:/src/study/model-checking-sandbox/model-checking-sandbox/protocol_definitions/cg.dcj";

        IFn toGraphFunction  = Clojure.var("discourje.core.main", "-test2");

        // Now we have the graph here
        var protocolDefinitionGraph = (Graph)toGraphFunction.invoke(pathToProtocolDefinition);

        System.out.println("Starting to parse to real DTO's for code generation.");
        System.out.println("TODO We should really support parameterization! (NPB!).");


        result = new ClojureGraphToDtoHelper()
                .parseGraphAndReturnInitialState(protocolDefinitionGraph);
        return result;
    }
}
