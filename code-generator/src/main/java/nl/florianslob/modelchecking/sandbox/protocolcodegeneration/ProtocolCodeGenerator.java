package nl.florianslob.modelchecking.sandbox.protocolcodegeneration;

import clojure.java.api.Clojure;
import clojure.lang.IFn;
import discourje.core.graph.Graph;
import nl.florianslob.modelchecking.sandbox.protocolcodegeneration.definitiondatastructure.visitors.*;
import nl.florianslob.modelchecking.sandbox.protocolcodegeneration.helpers.ClojureGraphToDtoHelper;
import nl.florianslob.modelchecking.sandbox.protocolcodegeneration.syntaxtreedatastructure.ASTEnvironment;
import nl.florianslob.modelchecking.sandbox.protocolcodegeneration.syntaxtreedatastructure.ASTProtocol;
import nl.florianslob.modelchecking.sandbox.protocolcodegeneration.syntaxtreedatastructure.codewriters.SyntaxWriterProvider;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class ProtocolCodeGenerator {

    public void runActivity() throws Exception {
        // Toggle what protocols need to be generated
        // Needs to be generated first in Florian.jar!
        boolean
                genCGProtocol = false,
                genFTProtocol = false,
                genISProtocol = false,
                genMGProtocol = false,
                genDemoProtocols = false,
                genRingProtocol = false,
                // genMeshProtocol will generate a very large file with large methods.
                // If we need to test this,
                // reduce block size to 10 in EnvironmentWriterForJava11.java (v5 namespace)
                genMeshProtocol = false,
                genStarProtocol = false,
                genGoFishProtocol = false,
                genRockPaperScissorsProtocol = false,
                genTicTacToeProtocol = true
                        ;
        boolean generateToTestBenchmarkProject = false;
        boolean generateToTestProject = false;

        var filePathForDemoProtocols = "../tests/src/main/java/nl/florianslob/modelchecking/generated/";

        if(genRingProtocol){
            GenerateProtocolFromDefinition("ring",3, filePathForDemoProtocols, "RingProtocol", false, true);
            GenerateProtocolFromDefinition("token-directed-ring",4, filePathForDemoProtocols, "TokenDirectedRingProtocol", false,true);
        }

        if(genMeshProtocol){
            GenerateProtocolFromDefinition("mesh",2, filePathForDemoProtocols, "MeshProtocol", false,true);
//            GenerateProtocolFromDefinition("token-directed-mesh",4, filePathForDemoProtocols, "TokenDirectedMeshProtocol", false);
        }

        if(genStarProtocol){
            GenerateProtocolFromDefinition("star",3, filePathForDemoProtocols, "StarProtocol", false, true);
//            GenerateProtocolFromDefinition("token-directed-star",4, filePathForDemoProtocols, "TokenDirectedStarProtocol", false);
        }

        if(genGoFishProtocol){
            GenerateProtocolFromDefinition("go-fish",3, filePathForDemoProtocols, "GoFishProtocol", true, true);
        }

        if(genRockPaperScissorsProtocol){
            GenerateProtocolFromDefinition("rock-paper-scissors",3, filePathForDemoProtocols, "RockPaperScissorsProtocol", false,true); // TODO N=4
        }

        if(genTicTacToeProtocol){
            GenerateProtocolFromDefinition("tic-tac-toe",-1, filePathForDemoProtocols, "TicTacToeProtocol", true, false);
            GenerateProtocolFromDefinition("tic-tac-toe",-1, filePathForDemoProtocols, "TicTacToeOptimizedProtocol", true, true);
        }

        if(genCGProtocol){
            var clojureFunctionName = "cg";

            if(generateToTestBenchmarkProject) {
                for (int i = 1; i <= 24; i++) {
                    var protocolName = "CGProtocol_n_" + i;
                    var filePath = "../benchmarks/src/main/java/nl/florianslob/modelchecking/generated/CG/";
                    GenerateProtocolFromDefinition(clojureFunctionName, i, filePath, protocolName, false, true);
                }
            }

            if(generateToTestProject){
                for(int i = 1; i <= 4; i++){
                    var protocolName = "CGProtocol_n_"+i;
                    var filePath = "../tests/src/main/java/nl/florianslob/modelchecking/generated/CG/";
                    GenerateProtocolFromDefinition(clojureFunctionName, i, filePath, protocolName, false,true);
                }
            }
        }

        if(genFTProtocol) {
            var clojureFunctionName = "ft";

            if(generateToTestBenchmarkProject) {
                for (int i = 1; i <= 24; i++) {
                    var protocolName = "FTProtocol_n_" + i;
                    var filePath = "../benchmarks/src/main/java/nl/florianslob/modelchecking/generated/FT/";

                    GenerateProtocolFromDefinition(clojureFunctionName, i, filePath, protocolName, false, true);
                }
            }
            if (generateToTestProject) {
                for (int i = 1; i <= 4; i++) {
                    var protocolName = "FTProtocol_n_" + i;
                    var filePath = "../tests/src/main/java/nl/florianslob/modelchecking/generated/FT/";
                    GenerateProtocolFromDefinition(clojureFunctionName, i, filePath, protocolName, false,true);
                }
            }
        }

        if(genISProtocol){
            var clojureFunctionName = "is";


            if(generateToTestBenchmarkProject) {
                for (int i = 1; i <= 24; i++) {
                    var protocolName = "ISProtocol_n_" + i;
                    var filePath = "../benchmarks/src/main/java/nl/florianslob/modelchecking/generated/IS/";
                    GenerateProtocolFromDefinition(clojureFunctionName, i, filePath, protocolName, false, true);
                }
            }
            if (generateToTestProject) {
                for(int i = 1; i <= 4; i++){
                    var protocolName = "ISProtocol_n_"+i;
                    var filePath = "../tests/src/main/java/nl/florianslob/modelchecking/generated/IS/";
                    GenerateProtocolFromDefinition(clojureFunctionName, i, filePath, protocolName, false, true);
                }
            }
        }

        if(genMGProtocol){
            var clojureFunctionName = "mg";

            if(generateToTestBenchmarkProject) {
                for (int i = 1; i <= 24; i++) {
                    var protocolName = "MGProtocol_n_" + i;
                    var filePath = "../benchmarks/src/main/java/nl/florianslob/modelchecking/generated/MG/";
                    GenerateProtocolFromDefinition(clojureFunctionName, i, filePath, protocolName, false, true);
                }
            }

            if (generateToTestProject) {
                for(int i = 1; i <= 4; i++){
                    var protocolName = "MGProtocol_n_"+i;
                    var filePath = "../tests/src/main/java/nl/florianslob/modelchecking/generated/MG/";
                    GenerateProtocolFromDefinition(clojureFunctionName, i, filePath, protocolName, false, true);
                }
            }
        }

        if(genDemoProtocols){
            var protocolName = "GeneratedChessProtocol";
            var clojureFunctionName = "chess";
            var filePath = "../tests/src/main/java/nl/florianslob/modelchecking/generated/";
            GenerateProtocolFromDefinition(clojureFunctionName, 0, filePath, protocolName, true, true);
        }
    }

    public void GenerateProtocolFromDefinition(String clojureFunctionName, int n, String filePath, String protocolName, boolean generatePlantUmlFile, boolean useOptimizedVersion) throws Exception{
        var writerProvider = new SyntaxWriterProvider("Java11", useOptimizedVersion);

        var protocolStateNodesResult = getInitialStateForChessProtocol(clojureFunctionName, n);

        List<IProtocolDefinitionVisitor> visitorsFirstPass = new LinkedList<>();
        var plantUmlVisualizationVisitor =
            new CreatePlantUmlVisualizationProtocolDefinitionVisitor();
        var uniqueCommunicationChannelFinderVisitor =
            new FindUniqueCommunicationChannelsProtocolDefinitionVisitor(writerProvider.ChannelWriter);
        var findUniqueRoleNamesProtocolDefinitionVisitor =
            new FindUniqueRoleNamesProtocolDefinitionVisitor();

        if(generatePlantUmlFile)
            visitorsFirstPass.add(plantUmlVisualizationVisitor);

        visitorsFirstPass.add(uniqueCommunicationChannelFinderVisitor);
        visitorsFirstPass.add(findUniqueRoleNamesProtocolDefinitionVisitor);

        protocolStateNodesResult.InitialState.Accept(visitorsFirstPass);

        if(generatePlantUmlFile){
            System.out.println("Printing PlantUml");
            System.out.println(plantUmlVisualizationVisitor.getPlantUmlSyntax());

            plantUmlVisualizationVisitor.savePlantUmlGraphToSvg(protocolName);
        }

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

        var protocolSyntaxTree = new ASTProtocol(writerProvider.ProtocolWriter, protocolName,
            uniqueCommunicationChannelFinderVisitor.ASTCommunicationChannels, environments);

        var builder = new StringBuilder();
        protocolSyntaxTree.buildSyntax(builder,0);

        //append string buffer/builder to buffered writer
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(filePath+protocolName+".java"))) {
            bw.append(builder);//Internally it does aSB.toString();
            bw.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private ProtocolStateNodesResult getInitialStateForChessProtocol(String clojureFunctionName, int n) {
        var result = new ProtocolStateNodesResult();

        // Call Clojure function
        IFn require = Clojure.var("clojure.core","require");
        require.invoke(Clojure.read("clojure.core"));

        require.invoke(Clojure.read("discourje.core.main"));

        IFn toGraphFunction  = Clojure.var("discourje.core.main", "-spec-to-lts-"+clojureFunctionName);

        // Now we have the graph here
        var protocolDefinitionGraph = (Graph)toGraphFunction.invoke(n);

        result = new ClojureGraphToDtoHelper()
                .parseGraphAndReturnInitialState(protocolDefinitionGraph);
        return result;
    }
}
