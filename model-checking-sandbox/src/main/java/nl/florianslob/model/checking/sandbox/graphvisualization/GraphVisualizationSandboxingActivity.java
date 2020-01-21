package nl.florianslob.model.checking.sandbox.graphvisualization;

import net.sourceforge.plantuml.FileFormat;
import net.sourceforge.plantuml.FileFormatOption;
import net.sourceforge.plantuml.SourceStringReader;
import nl.florianslob.model.checking.sandbox.ISandboxingActivity;
import nl.florianslob.model.checking.sandbox.modelchecking.ModelCheckingActivity;
import nl.florianslob.model.checking.sandbox.modelchecking.OnTheFlyLtlTestFormulaName;
import nl.florianslob.model.checking.sandbox.modelchecking.datastructure.LtlGraphNode;

import java.awt.*;
import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.URI;
import java.nio.charset.Charset;

public class GraphVisualizationSandboxingActivity implements ISandboxingActivity {
    @Override
    public void runActivity() throws Exception {
        GraphDrawer frame = new GraphDrawer("Graph visualisation");

        frame.setVisible(true);

        LtlGraphNode rootNode = ModelCheckingActivity.generateLtlAutomatonAndReturnInitialState(OnTheFlyLtlTestFormulaName.aOrB);

        rootNode.drawRecursively(frame, 100, 50);

        String source = "@startuml\n";
        source += "Bob -> Alice : hello\n";
        source += "@enduml\n";

        SourceStringReader reader = new SourceStringReader(source);
        final OutputStream os = new FileOutputStream("test.svg");
// Write the first image to "os"
        String desc = reader.generateImage(os, new FileFormatOption(FileFormat.SVG));
        os.close();

    }
}
