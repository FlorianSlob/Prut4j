package nl.florianslob.model.checking.sandbox.graphvisualization;

import com.kitfox.svg.SVGDiagram;
import com.kitfox.svg.SVGUniverse;
import net.sourceforge.plantuml.FileFormat;
import net.sourceforge.plantuml.FileFormatOption;
import net.sourceforge.plantuml.SourceStringReader;
import net.sourceforge.plantuml.core.DiagramDescription;
import nl.florianslob.model.checking.sandbox.ISandboxingActivity;

import java.io.*;
import java.net.URL;

public class GraphVisualizationSandboxingActivity implements ISandboxingActivity {
    @Override
    public void runActivity() throws Exception {

        InputDialogView inputDialogFrame = new InputDialogView();
        inputDialogFrame.showInputDialog();
    }
}
