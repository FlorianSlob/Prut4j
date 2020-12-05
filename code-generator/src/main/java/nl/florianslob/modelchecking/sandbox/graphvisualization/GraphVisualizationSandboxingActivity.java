package nl.florianslob.modelchecking.sandbox.graphvisualization;

import nl.florianslob.modelchecking.sandbox.ISandboxingActivity;

public class GraphVisualizationSandboxingActivity implements ISandboxingActivity {
    @Override
    public void runActivity() {
        new ModelCheckingVisualizerUI();
    }
}
