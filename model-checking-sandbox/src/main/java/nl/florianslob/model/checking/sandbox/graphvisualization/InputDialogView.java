package nl.florianslob.model.checking.sandbox.graphvisualization;

import com.kitfox.svg.SVGDiagram;
import com.kitfox.svg.SVGUniverse;
import net.sourceforge.plantuml.FileFormat;
import net.sourceforge.plantuml.FileFormatOption;
import net.sourceforge.plantuml.SourceStringReader;
import net.sourceforge.plantuml.core.DiagramDescription;
import nl.florianslob.model.checking.sandbox.modelchecking.ModelCheckingActivity;
import nl.florianslob.model.checking.sandbox.modelchecking.OnTheFlyLtlTestFormulaName;
import nl.florianslob.model.checking.sandbox.modelchecking.datastructure.LtlGraphNode;

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

    public void showInputDialog() {
        headerLabel.setText("Control in action: TextField");

        Label namelabel = new Label("Enter LTL Formula: ", Label.RIGHT);
        final TextField userText = new TextField(6);

        Button okButton = new Button("Go!");

        okButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                try {
                    String data = "LtlFormula: " + userText.getText();
                    statusLabel.setText(data);
                    mainFrame.setVisible(false);


                    String ltlFormulaText = "!XXXXa&(bUa)";

                    LtlGraphNode rootNode = ModelCheckingActivity.generateLtlAutomatonAndReturnInitialState(OnTheFlyLtlTestFormulaName.XXXXaAndB);

                    String plantUmlRepresentation = "@startuml\n";
                    plantUmlRepresentation += " header\n\n\n endheader\n"; // Add some new lines to prevent hiding behind window bar.

                    plantUmlRepresentation += "[*] -> "+rootNode.getPlantUmlNodesRecursively(); // Move to creating plant uml diagram
                    plantUmlRepresentation  +=  "@enduml\n";

                    System.out.println("Plant uml syntax");
                    System.out.print(plantUmlRepresentation);

                    SourceStringReader reader = new SourceStringReader(plantUmlRepresentation);
                    final OutputStream svgFileOutputStream = new FileOutputStream("test.svg");

                    DiagramDescription desc = reader.outputImage(svgFileOutputStream, new FileFormatOption(FileFormat.SVG));
                    // TODO check result in desc
                    svgFileOutputStream.close();

                    SVGUniverse universe = new SVGUniverse();

                    String executionPath = System.getProperty("user.dir");

                    SVGDiagram d = universe.getDiagram(new URL("file:///" + executionPath + "/test.svg").toURI(), true);
                    d.setIgnoringClipHeuristic(true);
                    GraphDrawer frame = new GraphDrawer("Graph visualisation", d);
                    frame.setVisible(true);

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
