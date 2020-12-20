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
                genCGProtocol = true,
                genFTProtocol = true,
                genISProtocol = true,
                genMGProtocol = true,
                genDemoProtocols = false,
                genRingProtocol = false,
                // genMeshProtocol will generate a very large file with large methods.
                // If we need to test this,
                // reduce block size to 10 in EnvironmentWriterForJava11.java (v5 namespace)
                genMeshProtocol = false,
                genStarProtocol = false,
                genBinaryTreeProtocol = false,
                genGoFishProtocol = false,
                genRockPaperScissorsProtocol = true,
                genTicTacToeProtocol = false
                        ;
        boolean generateToTestBenchmarkProject = true;
        boolean generateToTestProject = true;

        var filePathForDemoProtocolsGames = "../tests/src/main/java/nl/florianslob/modelchecking/generated/games/";
        var filePathForDemoProtocolsNetworkTopologies = "../tests/src/main/java/nl/florianslob/modelchecking/generated/network_topologies/";

        if(genRingProtocol){
            GenerateProtocolFromDefinition("ring",3, filePathForDemoProtocolsNetworkTopologies , "RingProtocol", false, true);
            GenerateProtocolFromDefinition("token-directed-ring",4, filePathForDemoProtocolsNetworkTopologies , "TokenDirectedRingProtocol", false,true);
            GenerateProtocolFromDefinition("token-undirected-ring",4, filePathForDemoProtocolsNetworkTopologies , "TokenUndirectedRingProtocol", false,true);
        }

        if(genMeshProtocol){
            GenerateProtocolFromDefinition("mesh",2, filePathForDemoProtocolsNetworkTopologies , "MeshProtocol", false,true);
            GenerateProtocolFromDefinition("token-full-mesh",4, filePathForDemoProtocolsNetworkTopologies , "TokenFullMeshProtocol", false,true);
            GenerateProtocolFromDefinition("token-2d-mesh",4, filePathForDemoProtocolsNetworkTopologies , "TokenTwoDMeshProtocol", false,true);
        }

        if(genStarProtocol){
            GenerateProtocolFromDefinition("star",3, filePathForDemoProtocolsNetworkTopologies , "StarProtocol", false, true);
            GenerateProtocolFromDefinition("token-star",4, filePathForDemoProtocolsNetworkTopologies , "TokenStarProtocol", false, true);
        }

        if(genBinaryTreeProtocol){
            GenerateProtocolFromDefinition("token-binary-tree",4, filePathForDemoProtocolsNetworkTopologies , "TokenBinaryTreeProtocol", false, true);
        }

        if(genGoFishProtocol){
            GenerateProtocolFromDefinition("go-fish",3, filePathForDemoProtocolsGames, "GoFishProtocol", true, true);
        }

        if(genRockPaperScissorsProtocol){
            GenerateProtocolFromDefinition("rock-paper-scissors",3, filePathForDemoProtocolsGames, "RockPaperScissorsOptimizedProtocol", false,true);
            GenerateProtocolFromDefinition("rock-paper-scissors",3, filePathForDemoProtocolsGames, "RockPaperScissorsProtocol", false,false);
        }

        if(genTicTacToeProtocol){
            GenerateProtocolFromDefinition("tic-tac-toe",-1, filePathForDemoProtocolsGames, "TicTacToeProtocol", true, false);
            GenerateProtocolFromDefinition("tic-tac-toe",-1, filePathForDemoProtocolsGames, "TicTacToeOptimizedProtocol", true, true);
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
                var protocolName = "CGProtocol_n_2";
                var filePath = "../tests/src/main/java/nl/florianslob/modelchecking/generated/npb/";
                GenerateProtocolFromDefinition(clojureFunctionName, 2, filePath, protocolName, false,true);
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
                var protocolName = "FTProtocol_n_2";
                var filePath = "../tests/src/main/java/nl/florianslob/modelchecking/generated/npb/";
                GenerateProtocolFromDefinition(clojureFunctionName, 2, filePath, protocolName, false,true);
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
                var protocolName = "ISProtocol_n_2";
                var filePath = "../tests/src/main/java/nl/florianslob/modelchecking/generated/npb/";
                GenerateProtocolFromDefinition(clojureFunctionName, 2, filePath, protocolName, false, true);
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
                    var protocolName = "MGProtocol_n_2";
                    var filePath = "../tests/src/main/java/nl/florianslob/modelchecking/generated/npb/";
                    GenerateProtocolFromDefinition(clojureFunctionName, 2, filePath, protocolName, false, true);
            }
        }

        if(genDemoProtocols){
            var protocolName = "ChessProtocol";
            var clojureFunctionName = "chess";
            GenerateProtocolFromDefinition(clojureFunctionName, 0, filePathForDemoProtocolsGames, protocolName, true, true);
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
        require.invoke(Clojure.read("discourje.core.main"));
        require.invoke(Clojure.read("clojure.core"));

        IFn toGraphFunction  = Clojure.var("discourje.core.main", "-spec-to-lts-"+clojureFunctionName);

        // Now we have the graph here
        var protocolDefinitionGraph = (Graph)toGraphFunction.invoke(n);

        result = new ClojureGraphToDtoHelper()
                .parseGraphAndReturnInitialState(protocolDefinitionGraph);
        return result;
    }
}
