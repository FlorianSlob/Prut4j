package nl.fllorianslob.modelchecking.base.runtime;

import nl.florianslob.modelchecking.base.runtime.v2.datastructure.LtlTransitionExpressionAtomicPropositionDirection;
import nl.florianslob.modelchecking.base.runtime.v2.datastructure.LtlTransitionExpressionOperator;
import nl.florianslob.modelchecking.base.runtime.v2.ltlautomaton.OwlHelper;
import org.junit.Test;

import static org.junit.Assert.*;

public class OwlHelperTests {

    @Test
    public void TestLtlParsing(){
        //Arrange
        String ltlFormulaString = "\"w SEND dto.Move TO b\" -> X(!\"w SEND dto.Move TO b\")";

        //Act
        var ltlFormulaStartingNodes = OwlHelper.GetInitialLtlStatesForFormula(ltlFormulaString, true);

        //Assert
        assertEquals(1, ltlFormulaStartingNodes.size());
        var startingNode = ltlFormulaStartingNodes.get(0);
        assertEquals(1, startingNode.OutgoingTransitions.size());

        var firstTransaction = startingNode.OutgoingTransitions.get(0);
        assertTrue(firstTransaction.AcceptanceSet0);
        assertEquals(LtlTransitionExpressionOperator.ATOM, firstTransaction.Expression.Operator);
        assertEquals(LtlTransitionExpressionAtomicPropositionDirection.SEND, firstTransaction.Expression.AtomicProposition.Direction);
        assertEquals("w", firstTransaction.Expression.AtomicProposition.Participant);
        assertEquals("b", firstTransaction.Expression.AtomicProposition.Receiver);
        assertEquals("dto.Move", firstTransaction.Expression.AtomicProposition.MessageType);

        var nextTransaction = startingNode.OutgoingTransitions.get(0).ltlTargetState.OutgoingTransitions.get(0);
        assertTrue(nextTransaction.AcceptanceSet0);
        assertEquals(LtlTransitionExpressionOperator.ATOM, nextTransaction.Expression.Operator);
        assertEquals(LtlTransitionExpressionAtomicPropositionDirection.SEND, nextTransaction.Expression.AtomicProposition.Direction);
        assertEquals("w", nextTransaction.Expression.AtomicProposition.Participant);
        assertEquals("b", nextTransaction.Expression.AtomicProposition.Receiver);
        assertEquals("dto.Move", nextTransaction.Expression.AtomicProposition.MessageType);
    }
}
