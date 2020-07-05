package nl.fllorianslob.modelchecking.base.runtime;

import nl.florianslob.modelchecking.base.runtime.v2.StateSpaceExploringAction;
import nl.florianslob.modelchecking.base.runtime.v2.StateSpaceExploringActionsHelper;
import nl.florianslob.modelchecking.base.runtime.v2.datastructure.LtlState;
import nl.florianslob.modelchecking.base.runtime.v2.datastructure.LtlTransition;
import nl.florianslob.modelchecking.base.runtime.v2.datastructure.LtlTransitionExpression;
import nl.florianslob.modelchecking.base.runtime.v2.datastructure.LtlTransitionExpressionOperator;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class StateSpaceExploringActionsHelperTests {

    private final List<StateSpaceExploringAction> exploringActions = Arrays.asList(
            StateSpaceExploringAction.CreateReceiveStateSpaceExploringAction("w", String.class),
            StateSpaceExploringAction.CreateSendStateSpaceExploringAction("w", "test", "b"));

    @Test
    public void TestBasicNoErrors() throws Exception {
        var transition = new LtlTransition(new LtlState(1));
        transition.Expression = new LtlTransitionExpression();
        transition.Expression.Operator = LtlTransitionExpressionOperator.TRUE;
        assertNotNull(StateSpaceExploringActionsHelper.GetPossibleExploringActions(transition,exploringActions));
    }

    @Test
    public void TestBasicNoErrors2() throws Exception {
        var transition = new LtlTransition(new LtlState(1));
        transition.Expression = new LtlTransitionExpression();
        transition.Expression.Operator = LtlTransitionExpressionOperator.FALSE;
        assertNull(StateSpaceExploringActionsHelper.GetPossibleExploringActions(transition,exploringActions));
    }
}
