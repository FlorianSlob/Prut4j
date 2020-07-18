package nl.fllorianslob.modelchecking.base.runtime;

import nl.florianslob.modelchecking.base.runtime.v2.StateSpaceExploringAction;
import nl.florianslob.modelchecking.base.runtime.v2.StateSpaceExploringActionsHelper;
import nl.florianslob.modelchecking.base.runtime.v2.datastructure.*;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class StateSpaceExploringActionsHelperTests {

    private final List<StateSpaceExploringAction> exploringActions = Arrays.asList(
            StateSpaceExploringAction.CreateReceiveStateSpaceExploringAction("w", String.class),
            StateSpaceExploringAction.CreateSendStateSpaceExploringAction("w", "test", "b"));

    @Test
    public void TrueOperatorAllAreReturned() throws Exception {
        var transition = new LtlTransition(new LtlState(1));
        transition.Expression = new LtlTransitionExpression();
        transition.Expression.Operator = LtlTransitionExpressionOperator.TRUE;
        assertEquals(exploringActions.size(),
                StateSpaceExploringActionsHelper.GetPossibleExploringActions(transition,exploringActions).size());
    }

    @Test
    public void FiltersReceivingCorrectlyForReceive() throws Exception {
        var transition = new LtlTransition(new LtlState(1));
        transition.Expression = new LtlTransitionExpression();

        // We are checking at atom level here
        transition.Expression.Operator = LtlTransitionExpressionOperator.ATOM;
        // create a receive action for 'w'
        transition.Expression.AtomicProposition
                = new LtlTransitionExpressionAtomicProposition
                        (LtlTransitionExpressionAtomicPropositionDirection.RECEIVE, "java.lang.String", "w", null);

        var result = StateSpaceExploringActionsHelper.GetPossibleExploringActions(transition,exploringActions);
        // Should have one result
        assertEquals(
                1,
                result.size());
        // with correct direction, messageType and participant
        assertEquals(LtlTransitionExpressionAtomicPropositionDirection.RECEIVE,result.get(0).direction);
        assertEquals("w",result.get(0).participant);
        assertEquals("java.lang.String",result.get(0).messageClass.getTypeName());
    }

    @Test
    public void FiltersReceivingCorrectlyForSend() throws Exception {
        var transition = new LtlTransition(new LtlState(1));
        transition.Expression = new LtlTransitionExpression();

        // We are checking at atom level here
        transition.Expression.Operator = LtlTransitionExpressionOperator.ATOM;
        // create a receive action for 'w'
        transition.Expression.AtomicProposition
                = new LtlTransitionExpressionAtomicProposition
                (LtlTransitionExpressionAtomicPropositionDirection.SEND, "java.lang.String", "w", "b");

        var result = StateSpaceExploringActionsHelper.GetPossibleExploringActions(transition,exploringActions);
        // Should have one result
        assertEquals(
                1,
                result.size());
        // with correct direction, messageType and participant
        assertEquals(LtlTransitionExpressionAtomicPropositionDirection.SEND,result.get(0).direction);
        assertEquals("w",result.get(0).participant);
        assertEquals("b",result.get(0).receiver);
        assertEquals("java.lang.String",result.get(0).messageClass.getTypeName());
    }
    @Test
    public void FalseOperatorNoneAreReturned() throws Exception {
        var transition = new LtlTransition(new LtlState(1));
        transition.Expression = new LtlTransitionExpression();
        transition.Expression.Operator = LtlTransitionExpressionOperator.FALSE;
        assertEquals(0,StateSpaceExploringActionsHelper.GetPossibleExploringActions(transition,exploringActions).size());
    }
}
