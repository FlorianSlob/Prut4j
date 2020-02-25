package nl.florianslob.model.checking.sandbox.graphvisualization;

import com.kitfox.svg.SVGDiagram;
import com.kitfox.svg.SVGUniverse;
import net.sourceforge.plantuml.FileFormat;
import net.sourceforge.plantuml.FileFormatOption;
import net.sourceforge.plantuml.SourceStringReader;
import net.sourceforge.plantuml.core.DiagramDescription;
import nl.florianslob.model.checking.sandbox.base.GraphNode;
import nl.florianslob.model.checking.sandbox.modelchecking.ModelCheckingActivity;
import nl.florianslob.model.checking.sandbox.modelchecking.ModelCheckingDemoData;
import nl.florianslob.model.checking.sandbox.modelchecking.OnTheFlyLtlTestFormulaName;
import nl.florianslob.model.checking.sandbox.modelchecking.datastructure.LtlGraphNode;
import nl.florianslob.model.checking.sandbox.modelchecking.datastructure.StateNode;

import java.awt.*;
import java.awt.event.*;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.net.URL;

public class InputDialogView {

    private Frame mainFrame;
    private Label headerLabel;
    private Label statusLabel;
    private Panel controlPanel;

    private static final String formulaSvgFileName = "formula.svg";
    private static final String programSvgFileName = "program.svg";

    public InputDialogView() {
        prepareGUI();
    }

    private void prepareGUI() {
        mainFrame = new Frame("Select model etc.....");
        mainFrame.setSize(400, 400);
        mainFrame.setLayout(new GridLayout(3, 1));
        mainFrame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent windowEvent) {
                System.exit(0);
            }
        });
        headerLabel = new Label();
        headerLabel.setAlignment(Label.CENTER);
        statusLabel = new Label();
        statusLabel.setAlignment(Label.CENTER);
        statusLabel.setSize(350, 100);

        controlPanel = new Panel();
        controlPanel.setLayout(new FlowLayout());

        mainFrame.add(headerLabel);
        mainFrame.add(controlPanel);
        mainFrame.add(statusLabel);
        mainFrame.setVisible(true);
    }

    public String getPlantUmlRepresentation(GraphNode rootNode){

        String plantUmlRepresentation = "@startuml\n";
        plantUmlRepresentation += " header\n\n\n endheader\n"; // Add some new lines to prevent hiding behind window bar.

        plantUmlRepresentation += "[*] -> "+rootNode.getPlantUmlNodesRecursively(); // Move to creating plant uml diagram
        plantUmlRepresentation  +=  "@enduml\n";

        System.out.println("Plant uml syntax");
        System.out.print(plantUmlRepresentation);

        return plantUmlRepresentation;
    }

    public void saveToSvgFile(GraphNode rootNode, String fileName) throws Exception{
        SourceStringReader reader = new SourceStringReader(getPlantUmlRepresentation(rootNode));
        final OutputStream svgFileOutputStream = new FileOutputStream(fileName);
        DiagramDescription desc = reader.outputImage(svgFileOutputStream, new FileFormatOption(FileFormat.SVG));
        svgFileOutputStream.close();
    }

    public void showInFrame(String filename) throws Exception{
        SVGUniverse universe = new SVGUniverse();
        String executionPath = System.getProperty("user.dir");
        SVGDiagram d = universe.getDiagram(new URL("file:///" + executionPath + "/" +filename).toURI(), true);
        d.setIgnoringClipHeuristic(true);
        GraphDrawer frame = new GraphDrawer("Graph visualisation", d);
        frame.setVisible(true);
    }
    public void showInputDialog() {
        headerLabel.setText("Control in action: TextField");

        Label namelabel = new Label("Enter LTL Formula: ", Label.RIGHT);
        final TextField userText = new TextField(6);

        Button okButton = new Button("Go!");

        okButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                try{
                    String data = "LtlFormula: " + userText.getText();
                    statusLabel.setText(data);
                    mainFrame.setVisible(false);


                    String ltlFormulaText = "!XXXXa&(bUa)";

                    LtlGraphNode rootNode = ModelCheckingActivity.generateLtlAutomatonAndReturnInitialState(OnTheFlyLtlTestFormulaName.XXXXaAndB);

                    saveToSvgFile(rootNode, formulaSvgFileName);
                    //showInFrame(formulaSvgFileName); // TODO Constants

                    // TODO Wait for next?

                    StateNode programRootNode =  ModelCheckingDemoData.getStartingNode(ModelCheckingDemoData.SIMPLE_MODEL);
                    saveToSvgFile(programRootNode, programSvgFileName);
                    showInFrame(programSvgFileName); // TODO Constants



                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });

        controlPanel.add(namelabel);
        controlPanel.add(userText);
        controlPanel.add(okButton);
        mainFrame.setVisible(true);
    }
}
