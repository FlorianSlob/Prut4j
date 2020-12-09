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
        boolean genCGProtocol = true, genFTProtocol = true, genISProtocol = true, genMGProtocol = true, genDemoProtocols = true;
        boolean generateToTestBenchmarkProject = true;
        boolean generateToTestProject = true;
        String versionString = "strict";

        if(genCGProtocol){
            if(generateToTestBenchmarkProject) {
                for (int i = 1; i <= 24; i++) {
                    var protocolName = "CGProtocol_strict_n_" + i;
                    var pathToProtocolDefinition = "C:/src/study/model-checking-sandbox/code-generator/protocol_definitions/npb/cg/" + versionString + "/cg_n_" + i + ".dcj";
                    var filePath = "../benchmarks/src/main/java/nl/florianslob/modelchecking/generated/CG/";
                    GenerateProtocolFromDefinition(pathToProtocolDefinition, filePath, protocolName, false);
                }
            }

            if(generateToTestProject){
                for(int i = 1; i <= 4; i++){
                    var protocolName = "CGProtocol_strict_n_"+i;
                    var pathToProtocolDefinition = "C:/src/study/model-checking-sandbox/code-generator/protocol_definitions/npb/cg/"+versionString+"/cg_n_"+i+".dcj";
                    var filePath = "../tests/src/main/java/nl/florianslob/modelchecking/generated/CG/";
                    GenerateProtocolFromDefinition(pathToProtocolDefinition, filePath, protocolName, false);
                }
            }
        }

        if(genFTProtocol) {
            if(generateToTestBenchmarkProject) {
                for (int i = 1; i <= 24; i++) {
                    var protocolName = "FTProtocol_n_" + i;
                    var pathToProtocolDefinition = "C:/src/study/model-checking-sandbox/code-generator/protocol_definitions/npb/ft/" + versionString + "/ft_n_" + i + ".dcj";
                    var filePath = "../benchmarks/src/main/java/nl/florianslob/modelchecking/generated/FT/";
                    GenerateProtocolFromDefinition(pathToProtocolDefinition, filePath, protocolName, false);
                }
            }
            if (generateToTestProject) {
                for (int i = 1; i <= 4; i++) {
                    var protocolName = "FTProtocol_n_" + i;
                    var pathToProtocolDefinition = "C:/src/study/model-checking-sandbox/code-generator/protocol_definitions/npb/ft/" + versionString + "/ft_n_" + i + ".dcj";
                    var filePath = "../tests/src/main/java/nl/florianslob/modelchecking/generated/FT/";
                    GenerateProtocolFromDefinition(pathToProtocolDefinition, filePath, protocolName, false);
                }
            }
        }

        if(genISProtocol){
            if(generateToTestBenchmarkProject) {
                for (int i = 1; i <= 24; i++) {
                    var protocolName = "ISProtocol_n_" + i;
                    var pathToProtocolDefinition = "C:/src/study/model-checking-sandbox/code-generator/protocol_definitions/npb/is/" + versionString + "/is_n_" + i + ".dcj";
                    var filePath = "../benchmarks/src/main/java/nl/florianslob/modelchecking/generated/IS/";
                    GenerateProtocolFromDefinition(pathToProtocolDefinition, filePath, protocolName, false);
                }
            }
            if (generateToTestProject) {
                for(int i = 1; i <= 4; i++){
                    var protocolName = "ISProtocol_n_"+i;
                    var pathToProtocolDefinition = "C:/src/study/model-checking-sandbox/code-generator/protocol_definitions/npb/is/"+versionString+"/is_n_"+i+".dcj";
                    var filePath = "../tests/src/main/java/nl/florianslob/modelchecking/generated/IS/";
                    GenerateProtocolFromDefinition(pathToProtocolDefinition, filePath, protocolName, false);
                }
            }
        }

        if(genMGProtocol){
            if(generateToTestBenchmarkProject) {
                for (int i = 1; i <= 24; i++) {
                    var protocolName = "MGProtocol_n_" + i;
                    var pathToProtocolDefinition = "C:/src/study/model-checking-sandbox/code-generator/protocol_definitions/npb/mg/" + versionString + "/mg_n_" + i + ".dcj";
                    var filePath = "../benchmarks/src/main/java/nl/florianslob/modelchecking/generated/MG/";
                    GenerateProtocolFromDefinition(pathToProtocolDefinition, filePath, protocolName, false);
                }
            }

            if (generateToTestProject) {
                for(int i = 1; i <= 4; i++){
                    var protocolName = "MGProtocol_n_"+i;
                    var pathToProtocolDefinition = "C:/src/study/model-checking-sandbox/code-generator/protocol_definitions/npb/mg/"+versionString+"/mg_n_"+i+".dcj";
                    var filePath = "../tests/src/main/java/nl/florianslob/modelchecking/generated/MG/";
                    GenerateProtocolFromDefinition(pathToProtocolDefinition, filePath, protocolName, false);
                }
            }
        }

        if(genDemoProtocols){
            var protocolName2 = "GeneratedChessProtocol";
            var pathToProtocolDefinition2 = "C:/src/study/model-checking-sandbox/code-generator/protocol_definitions/chess.dcj";
            var filePath2 = "../tests/src/main/java/nl/florianslob/modelchecking/generated/";
            GenerateProtocolFromDefinition(pathToProtocolDefinition2, filePath2, protocolName2, true);

            var protocolName3 = "GeneratedChessProtocolWithPlayerNames";
            var pathToProtocolDefinition3 = "C:/src/study/model-checking-sandbox/code-generator/protocol_definitions/chessWithPlayerNames.dcj";
            var filePath3 = "../tests/src/main/java/nl/florianslob/modelchecking/generated/";
            GenerateProtocolFromDefinition(pathToProtocolDefinition3, filePath3, protocolName3, true);
        }
    }

    public void GenerateProtocolFromDefinition(String pathToProtocolDefinition, String filePath, String protocolName, boolean generatePlantUmlFile) throws Exception{
        var writerProvider = new SyntaxWriterProvider("Java11");

        var protocolStateNodesResult = getInitialStateForChessProtocol(pathToProtocolDefinition);

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

    private ProtocolStateNodesResult getInitialStateForChessProtocol(String pathToProtocolDefinition) {
        var result = new ProtocolStateNodesResult();
        // Call Clojure function
        IFn require = Clojure.var("clojure.core","require");
        require.invoke(Clojure.read("discourje.core.main"));

        IFn toGraphFunction  = Clojure.var("discourje.core.main", "-test2");

        // Now we have the graph here
        var protocolDefinitionGraph = (Graph)toGraphFunction.invoke(pathToProtocolDefinition);

        result = new ClojureGraphToDtoHelper()
                .parseGraphAndReturnInitialState(protocolDefinitionGraph);
        return result;
    }
}