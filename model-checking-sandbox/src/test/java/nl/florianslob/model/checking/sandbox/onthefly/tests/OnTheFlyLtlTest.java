package nl.florianslob.model.checking.sandbox.onthefly.tests;

import java.util.HashSet;
import java.util.Set;
import nl.florianslob.model.checking.sandbox.onthefly.OnTheFlyLtlTestMethods;
import nl.florianslob.model.checking.sandbox.onthefly.datastructure.LtlFormulla;
import nl.florianslob.model.checking.sandbox.onthefly.datastructure.LtlGraphNode;
import static org.junit.Assert.*;
import org.junit.Test;

/**
 * Unit test for the LTL expansion algorithm.
 */
public class OnTheFlyLtlTest {

    public LtlGraphNode getRootNode(final LtlFormulla formullaUnderTest) {

        final LtlGraphNode initialNode = new LtlGraphNode("InitialNode");
        initialNode.isInitialState = true;

        final LtlGraphNode rootNode = new LtlGraphNode("RootNode", formullaUnderTest);
        rootNode.fatherNode = initialNode;
        return rootNode;
    }

    /**
     * @throws java.lang.Exception
     */
    @Test
    public void TestExpandFormulla_aUb() throws Exception {
        // We start with an empty set, that will contain all nodes
        final Set<LtlGraphNode> graphNodeSet = new HashSet<>();
        final LtlFormulla formullaUnderTest = OnTheFlyLtlTestMethods.getTestFormulla_aUb();
        final LtlGraphNode rootNode = getRootNode(formullaUnderTest);
        rootNode.expand(graphNodeSet); // This is where the magic happens

        // We must have found three nodes
        assertTrue(graphNodeSet.size() == 3);
        // The 'Initial' node is not part of the set
        assertTrue(graphNodeSet.stream().filter(n -> n.isInitialState == true).findFirst().isEmpty());
        // There is only one node with new, old and next empty
        assertTrue(graphNodeSet.stream().filter(n
                -> n.newFormullas.isEmpty()
                && n.oldFormullas.isEmpty()
                && n.nextFormullas.isEmpty()
        ).count() == 1); // compare to 1
        // There is only one node where :
        assertTrue(graphNodeSet.stream().filter(n
                -> n.newFormullas.isEmpty()
                && n.oldFormullas.size() == 2
                && // old contains 2 items
                n.oldFormullas.contains(formullaUnderTest)
                && // old contains aUb
                n.oldFormullas.contains(formullaUnderTest.leftOperantFormulla)
                && // old contains a
                n.nextFormullas.size() == 1
                && //next has the size of 1
                n.nextFormullas.contains(formullaUnderTest) // contains the formulla under test (aUb).
        ).count() == 1 // compare to 1
        );
        // There is only one node where :
        assertTrue(graphNodeSet.stream().filter(n
                -> n.newFormullas.isEmpty()
                && n.oldFormullas.size() == 2
                && // old contains 2 items
                n.oldFormullas.contains(formullaUnderTest)
                && // old contains aUb
                n.oldFormullas.contains(formullaUnderTest.rightOperantFormulla)
                &&// old contains b
                n.nextFormullas.isEmpty() //next is empty
        ).count() == 1 // compare to 1
        );
    }

    /**
     * @throws java.lang.Exception
     */
    @Test
    public void TestExpandFormulla_aVb() throws Exception {
        // We start with an empty set, that will contain all nodes
        final Set<LtlGraphNode> graphNodeSet = new HashSet<>();
        final LtlFormulla formullaUnderTest = OnTheFlyLtlTestMethods.getTestFormulla_aVb();
        final LtlGraphNode rootNode = getRootNode(formullaUnderTest);
        rootNode.expand(graphNodeSet); // This is where the magic happens

        // We must have found three nodes
        assertTrue(graphNodeSet.size() == 3);
        // The 'Initial' node is not part of the set
        assertTrue(graphNodeSet.stream().filter(n -> n.isInitialState == true).findFirst().isEmpty());
        // There is only one node with new, old and next empty
        assertTrue(graphNodeSet.stream().filter(n
                -> n.newFormullas.isEmpty()
                && n.oldFormullas.isEmpty()
                && n.nextFormullas.isEmpty()
        ).count() == 1); // compare to 1
        // There is only one node where :
        assertTrue(graphNodeSet.stream().filter(n
                -> n.newFormullas.isEmpty()
                && n.oldFormullas.size() == 2
                && // old contains 2 items
                n.oldFormullas.contains(formullaUnderTest)
                && // old contains aVb
                n.oldFormullas.contains(formullaUnderTest.rightOperantFormulla)
                && // old contains a
                n.nextFormullas.size() == 1
                && //next has the size of 1
                n.nextFormullas.contains(formullaUnderTest) // contains the formulla under test (aVb).
        ).count() == 1 // compare to 1
        );
        // There is only one node where :
        assertTrue(graphNodeSet.stream().filter(n
                -> n.newFormullas.isEmpty()
                && n.oldFormullas.size() == 3
                && // old contains 3 items
                n.oldFormullas.contains(formullaUnderTest)
                && // old contains aVb
                n.oldFormullas.contains(formullaUnderTest.leftOperantFormulla)
                &&// old contains a
                n.oldFormullas.contains(formullaUnderTest.rightOperantFormulla)
                &&// old contains b
                n.nextFormullas.isEmpty() //next is empty
        ).count() == 1 // compare to 1
        );
    }

    /**
     * @throws java.lang.Exception
     */
    @Test
    public void TestExpandFormulla_aOrb() throws Exception {
        // We start with an empty set, that will contain all nodes
        final Set<LtlGraphNode> graphNodeSet = new HashSet<>();
        final LtlFormulla formullaUnderTest = OnTheFlyLtlTestMethods.getTestFormulla_aOrb();
        final LtlGraphNode rootNode = getRootNode(formullaUnderTest);
        rootNode.expand(graphNodeSet); // This is where the magic happens

        // We must have found three nodes
        assertTrue(graphNodeSet.size() == 3);
        // The 'Initial' node is not part of the set
        assertTrue(graphNodeSet.stream().filter(n -> n.isInitialState == true).findFirst().isEmpty());
        // There is only one node with new, old and next empty
        assertTrue(graphNodeSet.stream().filter(n
                -> n.newFormullas.isEmpty()
                && n.oldFormullas.isEmpty()
                && n.nextFormullas.isEmpty()
        ).count() == 1); // compare to 1
        // There is only one node where :
        assertTrue(graphNodeSet.stream().filter(n
                -> n.newFormullas.isEmpty()
                && n.oldFormullas.size() == 2
                && // old contains 2 items
                n.oldFormullas.contains(formullaUnderTest)
                && // old contains aOrb
                n.oldFormullas.contains(formullaUnderTest.rightOperantFormulla)
                && // old contains a
                n.nextFormullas.isEmpty() // next is empty
        ).count() == 1 // compare to 1
        );
        // There is only one node where :
        assertTrue(graphNodeSet.stream().filter(n
                -> n.newFormullas.isEmpty()
                && n.oldFormullas.size() == 2
                && // old contains 3 items
                n.oldFormullas.contains(formullaUnderTest)
                && // old contains aOrb
                n.oldFormullas.contains(formullaUnderTest.rightOperantFormulla)
                &&// old contains b
                n.nextFormullas.isEmpty() //next is empty
        ).count() == 1 // compare to 1
        );
    }

    /**
     * @throws java.lang.Exception
     */
    @Test
    public void TestExpandFormulla_aAndb() throws Exception {
        // We start with an empty set, that will contain all nodes
        final Set<LtlGraphNode> graphNodeSet = new HashSet<>();
        final LtlFormulla formullaUnderTest = OnTheFlyLtlTestMethods.getTestFormulla_aAndb();
        final LtlGraphNode rootNode = getRootNode(formullaUnderTest);
        rootNode.expand(graphNodeSet); // This is where the magic happens

        // We must have found three nodes
        assertTrue(graphNodeSet.size() == 2);
        // The 'Initial' node is not part of the set
        assertTrue(graphNodeSet.stream().filter(n -> n.isInitialState == true).findFirst().isEmpty());
        // There is only one node with new, old and next empty
        assertTrue(graphNodeSet.stream().filter(n
                -> n.newFormullas.isEmpty()
                && n.oldFormullas.isEmpty()
                && n.nextFormullas.isEmpty()
        ).count() == 1); // compare to 1
        // There is only one node where :
        assertTrue(graphNodeSet.stream().filter(n
                -> n.newFormullas.isEmpty()
                && n.oldFormullas.size() == 3
                && // old contains 3 items
                n.oldFormullas.contains(formullaUnderTest)
                && // old contains aAndb
                n.oldFormullas.contains(formullaUnderTest.rightOperantFormulla)
                && // old contains a
                n.oldFormullas.contains(formullaUnderTest.leftOperantFormulla)
                && // old contains b
                n.nextFormullas.isEmpty() // next is empty
        ).count() == 1 // compare to 1
        );
    }

    /**
     * @throws java.lang.Exception
     */
    @Test
    public void TestExpandFormulla_Xa() throws Exception {
        // We start with an empty set, that will contain all nodes
        final Set<LtlGraphNode> graphNodeSet = new HashSet<>();
        final LtlFormulla formullaUnderTest = OnTheFlyLtlTestMethods.getTestFormulla_Xa();
        final LtlGraphNode rootNode = getRootNode(formullaUnderTest);
        rootNode.expand(graphNodeSet); // This is where the magic happens

        // We must have found three nodes
        assertTrue(graphNodeSet.size() == 3);
        // The 'Initial' node is not part of the set
        assertTrue(graphNodeSet.stream().filter(n -> n.isInitialState == true).findFirst().isEmpty());
        // There is only one node with new, old and next empty
        assertTrue(graphNodeSet.stream().filter(n
                -> n.newFormullas.isEmpty()
                && n.oldFormullas.isEmpty()
                && n.nextFormullas.isEmpty()
        ).count() == 1); // compare to 1
        // There is only one node where :
        assertTrue(graphNodeSet.stream().filter(n
                -> n.newFormullas.isEmpty()
                && n.oldFormullas.size() == 1
                && // old contains 1 items
                n.oldFormullas.contains(formullaUnderTest)
                && // old contains Xa
                n.nextFormullas.size() == 1
                && // next has 1 element
                n.nextFormullas.contains(formullaUnderTest.rightOperantFormulla) // new contains a
        ).count() == 1 // compare to 1
        );

        // There is only one node where :
        assertTrue(graphNodeSet.stream().filter(n
                -> n.newFormullas.isEmpty()
                && n.oldFormullas.size() == 1
                && // old contains 1 items
                n.oldFormullas.contains(formullaUnderTest.rightOperantFormulla)
                && // old contains Xa
                n.nextFormullas.isEmpty() // next is empty
        ).count() == 1 // compare to 1
        );
    }

    /**
     * @throws java.lang.Exception
     */
    @Test
    public void TestExpandFormulla_a() throws Exception {
        // We start with an empty set, that will contain all nodes
        final Set<LtlGraphNode> graphNodeSet = new HashSet<>();
        final LtlFormulla formullaUnderTest = OnTheFlyLtlTestMethods.getTestFormulla_a();
        final LtlGraphNode rootNode = getRootNode(formullaUnderTest);
        rootNode.expand(graphNodeSet); // This is where the magic happens

        // We must have found three nodes
        assertTrue(graphNodeSet.size() == 2);
        // The 'Initial' node is not part of the set
        assertTrue(graphNodeSet.stream().filter(n -> n.isInitialState == true).findFirst().isEmpty());
        // There is only one node with new, old and next empty
        assertTrue(graphNodeSet.stream().filter(n
                -> n.newFormullas.isEmpty()
                && n.oldFormullas.isEmpty()
                && n.nextFormullas.isEmpty()
        ).count() == 1); // compare to 1
        // There is only one node where :
        assertTrue(graphNodeSet.stream().filter(n
                -> n.newFormullas.isEmpty()
                && n.oldFormullas.size() == 1
                && // old contains 1 items
                n.oldFormullas.contains(formullaUnderTest)
                && // old contains a
                n.nextFormullas.isEmpty() // no next formullas
        ).count() == 1 // compare to 1
        );

    }
}
