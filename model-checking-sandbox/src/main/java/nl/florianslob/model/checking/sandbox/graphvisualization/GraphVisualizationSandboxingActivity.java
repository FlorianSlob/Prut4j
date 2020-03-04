package nl.florianslob.model.checking.sandbox.graphvisualization;

import nl.florianslob.model.checking.sandbox.ISandboxingActivity;

public class GraphVisualizationSandboxingActivity implements ISandboxingActivity {
    @Override
    public void runActivity() {
        new ModelCheckingVisualizerUI();
    }
}
