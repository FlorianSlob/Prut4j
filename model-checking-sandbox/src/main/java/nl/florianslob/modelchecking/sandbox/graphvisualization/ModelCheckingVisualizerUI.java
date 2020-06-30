package nl.florianslob.modelchecking.sandbox.graphvisualization;

import com.kitfox.svg.SVGDiagram;
import com.kitfox.svg.SVGUniverse;
import nl.florianslob.modelchecking.sandbox.LoggingHelper;
import nl.florianslob.modelchecking.sandbox.base.GraphNode;
import nl.florianslob.modelchecking.base.helpers.GraphVisualizationHelpers;
import nl.florianslob.modelchecking.sandbox.modelchecking.LtlFormulaParser;
import nl.florianslob.modelchecking.sandbox.modelchecking.ModelCheckingActivity;
import nl.florianslob.modelchecking.sandbox.modelchecking.ModelCheckingDemoData;
import nl.florianslob.modelchecking.sandbox.modelchecking.datastructure.LtlFormula;
import nl.florianslob.modelchecking.sandbox.modelchecking.datastructure.LtlGraphNode;
import nl.florianslob.modelchecking.sandbox.modelchecking.datastructure.StateNode;
import nl.florianslob.modelchecking.sandbox.modelchecking.datastructure.TraceInformation;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.net.URL;
import java.util.Objects;
import java.util.Set;

public class ModelCheckingVisualizerUI {

    private final Frame mainFrame;

    private static final String formulaSvgFileName = "formula.svg";
    private static final String programSvgFileName = "program.svg";
    private static final String traceSvgFileName = "trace.svg";
    private GraphDrawer graphFrame;

    private final KeyListener listener = new KeyListener() {


        @Override
        public void keyTyped(KeyEvent keyEvent) {
            // ignore
        }

        @Override
        public void keyPressed(KeyEvent keyEvent) {
            if (keyEvent.getKeyCode() != KeyEvent.VK_BACK_SPACE) {
                return;
            }

            if (graphFrame.isVisible()) {
                graphFrame.setVisible(false);
                mainFrame.setVisible(true);
            }
        }

        @Override
        public void keyReleased(KeyEvent keyEvent) {
            // ignore
        }
    };

    public ModelCheckingVisualizerUI() {
        mainFrame = new Frame("Select model etc.....");
        mainFrame.setSize(800, 800);
        mainFrame.setLayout(new GridLayout(3, 1));
        mainFrame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent windowEvent) {
                System.exit(0);
            }
        });

        Panel controlPanel = new Panel();
        controlPanel.setLayout(new FlowLayout());
        mainFrame.add(controlPanel);

        Label nameLabel = new Label("Enter LTL Formula: ", Label.RIGHT);
        final TextField userText = new TextField(6);

        Button okButton = new Button("Go!");
        okButton.addActionListener(event -> {

            try {
                // Add buttons to screen to enable fast debugging.
                String ltlFormulaText = userText.getText();

                String testLtlFormula = "XXX(a^b)";
                //    !XXX((a^!b)Ub) -- Test for big model
                //    X XXX(a^b) -- Test for working counter example
                //    aU(bU(cUj))

                if (!ltlFormulaText.isEmpty()) {
                    testLtlFormula = ltlFormulaText;
                }

                LtlFormula ltlFormula = LtlFormulaParser.Parse(testLtlFormula);

                // Create graphs
                LtlGraphNode ltlRootNode = ModelCheckingActivity.generateLtlAutomatonAndReturnInitialState(ltlFormula);

                StateNode programRootNode = ModelCheckingDemoData.getStartingNode(ModelCheckingDemoData.MODEL_FROM_DEFINITION3);
                GraphNode traceGraphRootNode = null; // This is where the magic happens!

                TraceInformation traceInformation = new TraceInformation();
                // start in S0
                boolean doesFormulaHold = Objects.requireNonNull(programRootNode).checkDepthFirst(ltlRootNode.childNodes, traceInformation);

                LoggingHelper.logInfo("Does the formula hold for the model: " + doesFormulaHold);

                if (doesFormulaHold) {
                    LoggingHelper.logInfo("Printing the trace in the program: ");

                    traceGraphRootNode = traceInformation.currentTraceNode;
                }

                // Save graphs to svg file for later analysis
                saveToSvgFile(null, ltlRootNode.childNodes, formulaSvgFileName);
                saveToSvgFile(programRootNode, null, programSvgFileName);
                saveToSvgFile(traceGraphRootNode, null, traceSvgFileName);

                if (doesFormulaHold) {
                    showInFrame(traceSvgFileName);
                }

            } catch (Exception e) {
                e.printStackTrace();
            }
        });


        controlPanel.add(nameLabel);
        controlPanel.add(userText);
        controlPanel.add(okButton);

        Button showFormulaGraph = new Button("Show formula graph");
        Button showProgramGraph = new Button("Show program graph");
        Button showTraceGraph = new Button("Show trace graph");

        controlPanel.add(showFormulaGraph);
        controlPanel.add(showProgramGraph);
        controlPanel.add(showTraceGraph);

        showFormulaGraph.addActionListener(showFormulaGraphEvent -> showInFrame(formulaSvgFileName));
        showProgramGraph.addActionListener(showProgramGraphEvent -> showInFrame(programSvgFileName));
        showTraceGraph.addActionListener(showTraceGraphEvent -> showInFrame(traceSvgFileName));

        mainFrame.setVisible(true);
    }

    @SuppressWarnings("SpellCheckingInspection")
    private static final String PlantUmlFileHeader = "@startuml\n header\n\n\n endheader\n \n" +
        "skinparam state{\n" +
        "\tbackgroundColor<<accepting>> Lime\n" +
        "}\n\n"; // Add some new lines to prevent hiding behind window bar and add styling rule for accepting states.


    @SuppressWarnings("SpellCheckingInspection")
    private static final String PlantUmlFileFooter = "@enduml\n";

    public String getPlantUmlRepresentation(GraphNode rootNode, Set<? extends GraphNode> rootNodes) {

        StringBuilder plantUmlRepresentation = new StringBuilder(PlantUmlFileHeader);

        if ((rootNodes == null || rootNodes.isEmpty()) && rootNode == null) {
            // create a graph with a note for empty graphs
            plantUmlRepresentation.append("Note:This graph does not contain any nodes. \n");

        }

        if (rootNodes != null && !rootNodes.isEmpty()) {

            for (GraphNode node : rootNodes) {
                plantUmlRepresentation.append("[*] -> ").append(node.getPlantUmlNodesRecursively()); // Move to creating plant uml diagram
            }
        }

        if (rootNode != null) {
            plantUmlRepresentation.append("[*] -> ").append(rootNode.getPlantUmlNodesRecursively()); // Move to creating plant uml diagram
        }

        plantUmlRepresentation.append(PlantUmlFileFooter);

        System.out.println("Plant uml syntax");
        System.out.print(plantUmlRepresentation);

        return plantUmlRepresentation.toString();
    }

    public void saveToSvgFile(GraphNode rootNode, Set<? extends GraphNode> rootNodes, String fileName) throws Exception {

        GraphVisualizationHelpers.saveSvgStringToFile(getPlantUmlRepresentation(rootNode, rootNodes), fileName);
    }

    public void showInFrame(String filename) {
        try {

            mainFrame.setVisible(false);
            SVGUniverse universe = new SVGUniverse();
            String executionPath = System.getProperty("user.dir");
            SVGDiagram d = universe.getDiagram(new URL("file:///" + executionPath + "/" + GraphVisualizationHelpers.rootFolderForSvgFiles + "/" + filename).toURI(), true);
            d.setIgnoringClipHeuristic(true);
            graphFrame = new GraphDrawer("Graph visualisation", d);
            graphFrame.setVisible(true);
            graphFrame.addKeyListener(listener);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
