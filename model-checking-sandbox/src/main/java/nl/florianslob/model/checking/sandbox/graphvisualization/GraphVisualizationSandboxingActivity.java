package nl.florianslob.model.checking.sandbox.graphvisualization;

import nl.florianslob.model.checking.sandbox.ISandboxingActivity;
import nl.florianslob.model.checking.sandbox.modelchecking.ModelCheckingActivity;
import nl.florianslob.model.checking.sandbox.modelchecking.OnTheFlyLtlTestFormulaName;
import nl.florianslob.model.checking.sandbox.modelchecking.datastructure.LtlGraphNode;

public class GraphVisualizationSandboxingActivity implements ISandboxingActivity {
    @Override
    public void runActivity() throws Exception {
        GraphDrawer frame = new GraphDrawer("Graph visualisation");
        frame.setVisible(true);

        LtlGraphNode rootNode = ModelCheckingActivity.generateLtlAutomatonAndReturnInitialState(OnTheFlyLtlTestFormulaName.aOrB);

        rootNode.drawRecursively(frame, 100, 50) ;
    }
}
