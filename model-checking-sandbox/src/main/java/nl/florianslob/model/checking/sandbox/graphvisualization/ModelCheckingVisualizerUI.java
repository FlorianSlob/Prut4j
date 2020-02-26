package nl.florianslob.model.checking.sandbox.graphvisualization;

import com.kitfox.svg.SVGDiagram;
import com.kitfox.svg.SVGUniverse;
import net.sourceforge.plantuml.FileFormat;
import net.sourceforge.plantuml.FileFormatOption;
import net.sourceforge.plantuml.SourceStringReader;
import net.sourceforge.plantuml.core.DiagramDescription;
import nl.florianslob.model.checking.sandbox.LoggingHelper;
import nl.florianslob.model.checking.sandbox.base.GraphNode;
import nl.florianslob.model.checking.sandbox.modelchecking.*;
import nl.florianslob.model.checking.sandbox.modelchecking.datastructure.LtlFormula;
import nl.florianslob.model.checking.sandbox.modelchecking.datastructure.LtlGraphNode;
import nl.florianslob.model.checking.sandbox.modelchecking.datastructure.StateNode;
import nl.florianslob.model.checking.sandbox.modelchecking.datastructure.TraceInformation;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.net.URL;

public class ModelCheckingVisualizerUI {

    private Frame mainFrame;
    private Label headerLabel;
    private Panel controlPanel;

    private static final String rootFolderForSvgFiles = "generated_graph_svg_files";
    private static final String formulaSvgFileName = "formula.svg";
    private static final String programSvgFileName = "program.svg";
    private static final String productSvgFileName = "product.svg";
    private GraphDrawer graphFrame;

    private KeyListener listener = new KeyListener() {


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

        controlPanel = new Panel();
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
//    XXXX(a^b) -- Test for working counter example

                if(!ltlFormulaText.isEmpty()){
                    testLtlFormula = ltlFormulaText;
                }

                LtlFormula ltlFormula = LtlFormulaParser.Parse(testLtlFormula);

                // Create graphs
                LtlGraphNode rootNode = ModelCheckingActivity.generateLtlAutomatonAndReturnInitialState(ltlFormula);

                StateNode programRootNode = ModelCheckingDemoData.getStartingNode(ModelCheckingDemoData.MODEL_FROM_DEFINITION2);
                GraphNode productGraphRootNode = null; // TODO This is where the magic happens!

                TraceInformation traceInformation = new TraceInformation();
                // start in S0
                boolean doesFormulaHold = programRootNode.checkDepthFirst(rootNode.childNodes, traceInformation);

                LoggingHelper.logInfo("Does the formula hold for the model: " + doesFormulaHold);

                if (doesFormulaHold) {
                    LoggingHelper.logInfo("Printing the trace in the program: ");

                    productGraphRootNode = traceInformation.currentTraceNode;
                }

                // Save graphs to svg file for later analysis
                saveToSvgFile(rootNode, formulaSvgFileName);
                saveToSvgFile(programRootNode, programSvgFileName);
                saveToSvgFile(productGraphRootNode, productSvgFileName);

                if (doesFormulaHold) {
                    showInFrame(productSvgFileName);
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
        Button showProductGraph = new Button("Show product graph");

        controlPanel.add(showFormulaGraph);
        controlPanel.add(showProgramGraph);
        controlPanel.add(showProductGraph);

        showFormulaGraph.addActionListener(showFormulaGraphEvent -> {
            showInFrame(formulaSvgFileName);
        });
        showProgramGraph.addActionListener(showProgramGraphEvent -> {
            showInFrame(programSvgFileName);
        });
        showProductGraph.addActionListener(showProductGraphEvent -> {
            showInFrame(productSvgFileName);
        });

        mainFrame.setVisible(true);
    }

    public String getPlantUmlRepresentation(GraphNode rootNode) {

        String plantUmlRepresentation = "@startuml\n";
        plantUmlRepresentation += " header\n\n\n endheader\n"; // Add some new lines to prevent hiding behind window bar.

        if (rootNode == null) {
            // create a graph with a note for empty graphs
            plantUmlRepresentation += "Note:This graph does not contain any nodes. \n";

        } else {
            plantUmlRepresentation += "[*] -> " + rootNode.getPlantUmlNodesRecursively(); // Move to creating plant uml diagram
        }

        plantUmlRepresentation += "@enduml\n";

        System.out.println("Plant uml syntax");
        System.out.print(plantUmlRepresentation);

        return plantUmlRepresentation;
    }

    public void saveToSvgFile(GraphNode rootNode, String fileName) throws Exception {
        SourceStringReader reader = new SourceStringReader(getPlantUmlRepresentation(rootNode));
        final OutputStream svgFileOutputStream = new FileOutputStream(rootFolderForSvgFiles + "/" + fileName);
        DiagramDescription desc = reader.outputImage(svgFileOutputStream, new FileFormatOption(FileFormat.SVG));
        svgFileOutputStream.close();
    }

    public void showInFrame(String filename) {
        try {

            mainFrame.setVisible(false);
            SVGUniverse universe = new SVGUniverse();
            String executionPath = System.getProperty("user.dir");
            SVGDiagram d = universe.getDiagram(new URL("file:///" + executionPath + "/" + rootFolderForSvgFiles + "/" + filename).toURI(), true);
            d.setIgnoringClipHeuristic(true);
            graphFrame = new GraphDrawer("Graph visualisation", d);
            graphFrame.setVisible(true);
            graphFrame.addKeyListener(listener);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
