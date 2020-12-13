package nl.florianslob.modelchecking.sandbox.protocolcodegeneration;

import clojure.java.api.Clojure;
import clojure.lang.IFn;
import discourje.core.graph.Graph;
import nl.florianslob.modelchecking.sandbox.ISandboxingActivity;
import nl.florianslob.modelchecking.sandbox.protocolcodegeneration.definitiondatastructure.visitors.*;
import nl.florianslob.modelchecking.sandbox.protocolcodegeneration.helpers.ClojureGraphToDtoHelper;
import nl.florianslob.modelchecking.sandbox.protocolcodegeneration.syntaxtreedatastructure.ASTEnvironment;
import nl.florianslob.modelchecking.sandbox.protocolcodegeneration.syntaxtreedatastructure.ASTProtocol;
import nl.florianslob.modelchecking.sandbox.protocolcodegeneration.syntaxtreedatastructure.codewriters.SyntaxWriterProvider;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class ProtocolCodeGenerationSandboxingActivity implements ISandboxingActivity {
    @Override
    public void runActivity() throws Exception {
        // Toggle what protocols need to be generated
        // Needs to be generated first in Florian.jar!
        boolean
                genCGProtocol = true,
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
                genRockPaperScissorsProtocol = false
                        ;
        boolean generateToTestBenchmarkProject = false;
        boolean generateToTestProject = true;

        var filePathForDemoProtocols = "../tests/src/main/java/nl/florianslob/modelchecking/generated/";

        if(genRingProtocol){
            var protocolName = "RingProtocol";
            var clojureFunctionName = "ring";
            GenerateProtocolFromDefinition(clojureFunctionName,3, filePathForDemoProtocols, protocolName, false);
        }

        if(genMeshProtocol){
            var protocolName = "MeshProtocol";
            var clojureFunctionName = "mesh";
            GenerateProtocolFromDefinition(clojureFunctionName,2, filePathForDemoProtocols, protocolName, false);
        }

        if(genStarProtocol){
            var protocolName = "StarProtocol";
            var clojureFunctionName = "star";
            GenerateProtocolFromDefinition(clojureFunctionName,3, filePathForDemoProtocols, protocolName, false);
        }

        if(genGoFishProtocol){
            var protocolName = "GoFishProtocol";
            var clojureFunctionName = "go-fish";
            GenerateProtocolFromDefinition(clojureFunctionName,3, filePathForDemoProtocols, protocolName, false);
        }


        if(genRockPaperScissorsProtocol){
            var protocolName = "RockPaperScissorsProtocol";
            var clojureFunctionName = "rock-paper-scissors";
            GenerateProtocolFromDefinition(clojureFunctionName,3, filePathForDemoProtocols, protocolName, false);
        }

        if(genCGProtocol){
            var clojureFunctionName = "cg";

            if(generateToTestBenchmarkProject) {
                for (int i = 1; i <= 24; i++) {
                    var protocolName = "CGProtocol_strict_n_" + i;
                    var filePath = "../benchmarks/src/main/java/nl/florianslob/modelchecking/generated/CG/";
                    GenerateProtocolFromDefinition(clojureFunctionName, i, filePath, protocolName, false);
                }
            }

            if(generateToTestProject){
                for(int i = 1; i <= 4; i++){
                    var protocolName = "CGProtocol_strict_n_"+i;
                    var filePath = "../tests/src/main/java/nl/florianslob/modelchecking/generated/CG/";
                    GenerateProtocolFromDefinition(clojureFunctionName, i, filePath, protocolName, false);
                }
            }
        }

        if(genFTProtocol) {
            var clojureFunctionName = "ft";

            if(generateToTestBenchmarkProject) {
                for (int i = 1; i <= 24; i++) {
                    var protocolName = "FTProtocol_n_" + i;
                    var filePath = "../benchmarks/src/main/java/nl/florianslob/modelchecking/generated/FT/";

                    GenerateProtocolFromDefinition(clojureFunctionName, i, filePath, protocolName, false);
                }
            }
            if (generateToTestProject) {
                for (int i = 1; i <= 4; i++) {
                    var protocolName = "FTProtocol_n_" + i;
                    var filePath = "../tests/src/main/java/nl/florianslob/modelchecking/generated/FT/";
                    GenerateProtocolFromDefinition(clojureFunctionName, i, filePath, protocolName, false);
                }
            }
        }

        if(genISProtocol){
            var clojureFunctionName = "is";


            if(generateToTestBenchmarkProject) {
                for (int i = 1; i <= 24; i++) {
                    var protocolName = "ISProtocol_n_" + i;
                    var filePath = "../benchmarks/src/main/java/nl/florianslob/modelchecking/generated/IS/";
                    GenerateProtocolFromDefinition(clojureFunctionName, i, filePath, protocolName, false);
                }
            }
            if (generateToTestProject) {
                for(int i = 1; i <= 4; i++){
                    var protocolName = "ISProtocol_n_"+i;
                    var filePath = "../tests/src/main/java/nl/florianslob/modelchecking/generated/IS/";
                    GenerateProtocolFromDefinition(clojureFunctionName, i, filePath, protocolName, false);
                }
            }
        }

        if(genMGProtocol){
            var clojureFunctionName = "mg";

            if(generateToTestBenchmarkProject) {
                for (int i = 1; i <= 24; i++) {
                    var protocolName = "MGProtocol_n_" + i;
                    var filePath = "../benchmarks/src/main/java/nl/florianslob/modelchecking/generated/MG/";
                    GenerateProtocolFromDefinition(clojureFunctionName, i, filePath, protocolName, false);
                }
            }

            if (generateToTestProject) {
                for(int i = 1; i <= 4; i++){
                    var protocolName = "MGProtocol_n_"+i;
                    var filePath = "../tests/src/main/java/nl/florianslob/modelchecking/generated/MG/";
                    GenerateProtocolFromDefinition(clojureFunctionName, i, filePath, protocolName, false);
                }
            }
        }

        if(genDemoProtocols){
            var protocolName2 = "GeneratedChessProtocol";
            var clojureFunctionName2 = "chess";
            var filePath2 = "../tests/src/main/java/nl/florianslob/modelchecking/generated/";
            GenerateProtocolFromDefinition(clojureFunctionName2, 0, filePath2, protocolName2, true);

            var protocolName3 = "GeneratedChessProtocolWithPlayerNames";
            var clojureFunctionName3 = "chess-with-player-names";
            var filePath3 = "../tests/src/main/java/nl/florianslob/modelchecking/generated/";
            GenerateProtocolFromDefinition(clojureFunctionName3,0, filePath3, protocolName3, true);
        }
    }

    public void GenerateProtocolFromDefinition(String clojureFunctionName, int n, String filePath, String protocolName, boolean generatePlantUmlFile) throws Exception{
        var writerProvider = new SyntaxWriterProvider("Java11");

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

            plantUmlVisualizationVisitor.savePlantUmlGraphToSvg();
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
