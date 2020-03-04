package nl.florianslob.model.checking.sandbox.modelchecking.tests;

import java.util.HashSet;
import java.util.Set;

import nl.florianslob.model.checking.sandbox.modelchecking.datastructure.LtlFormula;
import nl.florianslob.model.checking.sandbox.modelchecking.datastructure.LtlGraphNode;
import nl.florianslob.model.checking.sandbox.modelchecking.OnTheFlyLtlTestFormulas;
import static org.junit.Assert.*;
import org.junit.Test;

/**
 * Unit test for the LTL expansion algorithm.
 */
public class OnTheFlyLtlTest {

    public LtlGraphNode getRootNode(final LtlFormula formulaUnderTest) {

        final LtlGraphNode initialNode = new LtlGraphNode("InitialNode");
        initialNode.isInitialState = true;

        final LtlGraphNode rootNode = new LtlGraphNode("RootNode", formulaUnderTest);
        rootNode.fatherNode = initialNode;
        return rootNode;
    }

    /**
     */
    @Test
    public void TestExpandFormula_aUb() {
        // We start with an empty set, that will contain all nodes
        final Set<LtlGraphNode> graphNodeSet = new HashSet<>();
        final LtlFormula formulaUnderTest = OnTheFlyLtlTestFormulas.getTestFormula_aUb();
        final LtlGraphNode rootNode = getRootNode(formulaUnderTest);
        rootNode.expand(graphNodeSet); // This is where the magic happens

        // We must have found three nodes
        assertEquals(3, graphNodeSet.size());
        // The 'Initial' node is not part of the set
        assertTrue(graphNodeSet.stream().filter(n -> n.isInitialState).findFirst().isEmpty());
        // There is only one node with new, old and next empty
        assertEquals(1, graphNodeSet.stream().filter(n
            -> n.newFormulas.isEmpty()
            && n.oldFormulas.isEmpty()
            && n.nextFormulas.isEmpty()
        ).count()); // compare to 1
        // There is only one node where :
        assertEquals(1, graphNodeSet.stream().filter(n
            -> n.newFormulas.isEmpty()
            && n.oldFormulas.size() == 2
            && // old contains 2 items
            n.oldFormulas.contains(formulaUnderTest)
            && // old contains aUb
            n.oldFormulas.contains(formulaUnderTest.leftOperandFormula)
            && // old contains a
            n.nextFormulas.size() == 1
            && //next has the size of 1
            n.nextFormulas.contains(formulaUnderTest) // contains the formulla under test (aUb).
        ).count());
        // There is only one node where :
        assertEquals(1, graphNodeSet.stream().filter(n
            -> n.newFormulas.isEmpty()
            && n.oldFormulas.size() == 2
            && // old contains 2 items
            n.oldFormulas.contains(formulaUnderTest)
            && // old contains aUb
            n.oldFormulas.contains(formulaUnderTest.rightOperandFormula)
            &&// old contains b
            n.nextFormulas.isEmpty() //next is empty
        ).count());
    }

    /**
     */
    @Test
    public void TestExpandFormula_bVa() {
        // We start with an empty set, that will contain all nodes
        final Set<LtlGraphNode> graphNodeSet = new HashSet<>();
        final LtlFormula formulaUnderTest = OnTheFlyLtlTestFormulas.getTestFormula_bVa();
        final LtlGraphNode rootNode = getRootNode(formulaUnderTest);
        rootNode.expand(graphNodeSet); // This is where the magic happens

        // We must have found three nodes
        assertEquals(3, graphNodeSet.size());
        // The 'Initial' node is not part of the set
        assertTrue(graphNodeSet.stream().filter(n -> n.isInitialState).findFirst().isEmpty());
        // There is only one node with new, old and next empty
        assertEquals(1, graphNodeSet.stream().filter(n
            -> n.newFormulas.isEmpty()
            && n.oldFormulas.isEmpty()
            && n.nextFormulas.isEmpty()
        ).count()); // compare to 1
        // There is only one node where :
        assertEquals(1, graphNodeSet.stream().filter(n
            -> n.newFormulas.isEmpty()
            && n.oldFormulas.size() == 2
            && // old contains 2 items
            n.oldFormulas.contains(formulaUnderTest)
            && // old contains aVb
            n.oldFormulas.contains(formulaUnderTest.rightOperandFormula)
            && // old contains a
            n.nextFormulas.size() == 1
            && //next has the size of 1
            n.nextFormulas.contains(formulaUnderTest) // contains the formulla under test (aVb).
        ).count());
        // There is only one node where :
        assertEquals(1, graphNodeSet.stream().filter(n
            -> n.newFormulas.isEmpty()
            && n.oldFormulas.size() == 3
            && // old contains 3 items
            n.oldFormulas.contains(formulaUnderTest)
            && // old contains aVb
            n.oldFormulas.contains(formulaUnderTest.leftOperandFormula)
            &&// old contains a
            n.oldFormulas.contains(formulaUnderTest.rightOperandFormula)
            &&// old contains b
            n.nextFormulas.isEmpty() //next is empty
        ).count());
    }

    /**
     */
    @Test
    public void TestExpandFormula_aOrb() {
        // We start with an empty set, that will contain all nodes
        final Set<LtlGraphNode> graphNodeSet = new HashSet<>();
        final LtlFormula formulaUnderTest = OnTheFlyLtlTestFormulas.getTestFormula_aOrb();
        final LtlGraphNode rootNode = getRootNode(formulaUnderTest);
        rootNode.expand(graphNodeSet); // This is where the magic happens

        // We must have found three nodes
        assertEquals(3, graphNodeSet.size());
        // The 'Initial' node is not part of the set
        assertTrue(graphNodeSet.stream().filter(n -> n.isInitialState).findFirst().isEmpty());
        // There is only one node with new, old and next empty
        assertEquals(1, graphNodeSet.stream().filter(n
            -> n.newFormulas.isEmpty()
            && n.oldFormulas.isEmpty()
            && n.nextFormulas.isEmpty()
        ).count()); // compare to 1
        // There is only one node where :
        assertEquals(1, graphNodeSet.stream().filter(n
            -> n.newFormulas.isEmpty()
            && n.oldFormulas.size() == 2
            && // old contains 2 items
            n.oldFormulas.contains(formulaUnderTest)
            && // old contains aOrb
            n.oldFormulas.contains(formulaUnderTest.rightOperandFormula)
            && // old contains a
            n.nextFormulas.isEmpty() // next is empty
        ).count());
        // There is only one node where :
        assertEquals(1, graphNodeSet.stream().filter(n
            -> n.newFormulas.isEmpty()
            && n.oldFormulas.size() == 2
            && // old contains 3 items
            n.oldFormulas.contains(formulaUnderTest)
            && // old contains aOrb
            n.oldFormulas.contains(formulaUnderTest.rightOperandFormula)
            &&// old contains b
            n.nextFormulas.isEmpty() //next is empty
        ).count());
    }

    /**
     */
    @SuppressWarnings("SpellCheckingInspection") // 'Andb' is in our syntax correct
    @Test
    public void TestExpandFormula_aAndb() {
        // We start with an empty set, that will contain all nodes
        final Set<LtlGraphNode> graphNodeSet = new HashSet<>();
        final LtlFormula formulaUnderTest = OnTheFlyLtlTestFormulas.getTestFormula_aAndb();
        final LtlGraphNode rootNode = getRootNode(formulaUnderTest);
        rootNode.expand(graphNodeSet); // This is where the magic happens

        // We must have found three nodes
        assertEquals(2, graphNodeSet.size());
        // The 'Initial' node is not part of the set
        assertTrue(graphNodeSet.stream().filter(n -> n.isInitialState).findFirst().isEmpty());
        // There is only one node with new, old and next empty
        assertEquals(1, graphNodeSet.stream().filter(n
            -> n.newFormulas.isEmpty()
            && n.oldFormulas.isEmpty()
            && n.nextFormulas.isEmpty()
        ).count()); // compare to 1
        // There is only one node where :
        assertEquals(1, graphNodeSet.stream().filter(n
            -> n.newFormulas.isEmpty()
            && n.oldFormulas.size() == 3
            && // old contains 3 items
            n.oldFormulas.contains(formulaUnderTest)
            && // old contains aAndb
            n.oldFormulas.contains(formulaUnderTest.rightOperandFormula)
            && // old contains a
            n.oldFormulas.contains(formulaUnderTest.leftOperandFormula)
            && // old contains b
            n.nextFormulas.isEmpty() // next is empty
        ).count());
    }

    /**
     */
    @Test
    public void TestExpandFormula_Xa() {
        // We start with an empty set, that will contain all nodes
        final Set<LtlGraphNode> graphNodeSet = new HashSet<>();
        final LtlFormula formulaUnderTest = OnTheFlyLtlTestFormulas.getTestFormula_Xa();
        final LtlGraphNode rootNode = getRootNode(formulaUnderTest);
        rootNode.expand(graphNodeSet); // This is where the magic happens

        // We must have found three nodes
        assertEquals(3, graphNodeSet.size());
        // The 'Initial' node is not part of the set
        assertTrue(graphNodeSet.stream().filter(n -> n.isInitialState).findFirst().isEmpty());
        // There is only one node with new, old and next empty
        assertEquals(1, graphNodeSet.stream().filter(n
            -> n.newFormulas.isEmpty()
            && n.oldFormulas.isEmpty()
            && n.nextFormulas.isEmpty()
        ).count()); // compare to 1
        // There is only one node where :
        assertEquals(1, graphNodeSet.stream().filter(n
            -> n.newFormulas.isEmpty()
            && n.oldFormulas.size() == 1
            && // old contains 1 items
            n.oldFormulas.contains(formulaUnderTest)
            && // old contains Xa
            n.nextFormulas.size() == 1
            && // next has 1 element
            n.nextFormulas.contains(formulaUnderTest.rightOperandFormula) // new contains a
        ).count());

        // There is only one node where :
        assertEquals(1, graphNodeSet.stream().filter(n
            -> n.newFormulas.isEmpty()
            && n.oldFormulas.size() == 1
            && // old contains 1 items
            n.oldFormulas.contains(formulaUnderTest.rightOperandFormula)
            && // old contains Xa
            n.nextFormulas.isEmpty() // next is empty
        ).count());
    }

    /**
     */
    @Test
    public void TestExpandFormula_a() {
        // We start with an empty set, that will contain all nodes
        final Set<LtlGraphNode> graphNodeSet = new HashSet<>();
        final LtlFormula formulaUnderTest = OnTheFlyLtlTestFormulas.getTestFormula_a();
        final LtlGraphNode rootNode = getRootNode(formulaUnderTest);
        rootNode.expand(graphNodeSet); // This is where the magic happens

        // We must have found three nodes
        assertEquals(2, graphNodeSet.size());
        // The 'Initial' node is not part of the set
        assertTrue(graphNodeSet.stream().filter(n -> n.isInitialState).findFirst().isEmpty());
        // There is only one node with new, old and next empty
        assertEquals(1, graphNodeSet.stream().filter(n
            -> n.newFormulas.isEmpty()
            && n.oldFormulas.isEmpty()
            && n.nextFormulas.isEmpty()
        ).count()); // compare to 1
        // There is only one node where :
        assertEquals(1, graphNodeSet.stream().filter(n
            -> n.newFormulas.isEmpty()
            && n.oldFormulas.size() == 1
            && // old contains 1 items
            n.oldFormulas.contains(formulaUnderTest)
            && // old contains a
            n.nextFormulas.isEmpty() // no next formulas
        ).count());

    }
}
