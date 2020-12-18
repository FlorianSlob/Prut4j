package nl.florianslob.modelchecking.sandbox.modelchecking;

import nl.florianslob.modelchecking.sandbox.modelchecking.datastructure.ModelCheckingAlphabet;
import nl.florianslob.modelchecking.sandbox.modelchecking.datastructure.StateNode;

public class ModelCheckingDemoData {

    // Some constants to easily switch between models and ltl formulas during
    // development.
    public static final int SIMPLE_MODEL = 0;

    public static final int EMPTY_MODEL = 1;
    public static final int MODEL_FROM_DEFINITION1 = 2;
    public static final int MODEL_FROM_DEFINITION2 = 3;
    public static final int MODEL_FROM_DEFINITION3 = 4;


    public static StateNode getStartingNode(int modelNumber) {
        try{
            String programDefinition1 = "NODE=1|AP=a,b\n" +
                "NODE=2|AP=a,b\n" +
                "NODE=3|AP=a,b\n" +
                "NODE=4|AP=a,b\n" +
                "NODE=5|AP=a,b\n" +
                "REL=1->2\n" +
                "REL=2->3\n" +
                "REL=3->4\n" +
                "REL=4->5\n" +
                "THE_END";

            String programDefinition2 = "NODE=0|AP=a\n" +
                "NODE=1|AP=a\n" +
                "NODE=2|AP=a\n" +
                "NODE=3|AP=a\n" +
                "NODE=4|AP=a\n" +
                "NODE=5|AP=a\n" +
                "NODE=6|AP=a\n" +
                "NODE=7|AP=a\n" +
                "NODE=8|AP=a\n" +
                "NODE=9|AP=a\n" +
                "NODE=10|AP=a\n" +
                "NODE=11|AP=a\n" +
                "NODE=12|AP=a\n" +
                "NODE=13|AP=a,b\n" +
                "NODE=14|AP=a\n" +
                "NODE=15|AP=a\n" +
                "REL=0->1\n" +
                "REL=0->15\n" +
                "REL=1->2\n" +
                "REL=2->3\n" +
                "REL=3->4\n" +
                "REL=4->5\n" +
                "REL=5->6\n" +
                "REL=6->2\n" +
                "REL=4->7\n" +
                "REL=7->8\n" +
                "REL=8->9\n" +
                "REL=9->10\n" +
                "REL=10->5\n" +
                "REL=1->11\n" +
                "REL=11->12\n" +
                "REL=12->13\n" +
                "REL=13->14\n" +
                "REL=14->15\n" +
                "REL=15->15\n" +
                "THE_END";

            String programDefinition3 = "NODE=0|AP=a\n" +
                "NODE=1|AP=b,a\n" +
                "NODE=2|AP=a\n" +
                "NODE=3|AP=a\n" +
                "NODE=4|AP=a\n" +
                "NODE=5|AP=a\n" +
                "NODE=6|AP=a\n" +
                "NODE=7|AP=a\n" +
                "NODE=8|AP=a\n" +
                "NODE=9|AP=a\n" +
                "NODE=10|AP=a\n" +
                "NODE=11|AP=a\n" +
                "NODE=12|AP=a\n" +
                "NODE=13|AP=a\n" +
                "NODE=14|AP=a\n" +
                "NODE=15|AP=j\n" +
                "REL=0->1\n" +
                "REL=1->2\n" +
                "REL=2->3\n" +
                "REL=3->4\n" +
                "REL=4->5\n" +
                "REL=5->6\n" +
                "REL=6->2\n" +
                "REL=4->7\n" +
                "REL=7->8\n" +
                "REL=8->9\n" +
                "REL=9->10\n" +
                "REL=10->5\n" +
                "REL=1->11\n" +
                "REL=11->12\n" +
                "REL=12->13\n" +
                "REL=13->14\n" +
                "REL=14->15\n" +
                "REL=15->15\n" +
                "THE_END";

            switch (modelNumber) {
                case SIMPLE_MODEL:
                    return generateSimpleModelAndReturnInitialState();
                case EMPTY_MODEL:
                    return generateEmptyModelAndReturnInitialState();
                case MODEL_FROM_DEFINITION1:
                    return ProgramParser.Parse(programDefinition1);
                case MODEL_FROM_DEFINITION2:
                    return ProgramParser.Parse(programDefinition2);
                case MODEL_FROM_DEFINITION3:
                    return ProgramParser.Parse(programDefinition3);
                default:
                    throw new Exception("Unknown definition");
            }
        }catch (Exception e)
        {
            e.printStackTrace();
        }
        return null;
    }

    public static StateNode generateEmptyModelAndReturnInitialState() {
        return new StateNode(0);
    }

    public static StateNode generateSimpleModelAndReturnInitialState() {
        StateNode state0 = new StateNode(0);
        state0.AtomicPropositions.add(ModelCheckingAlphabet.A);
        StateNode state1 = new StateNode(1);
        state1.AtomicPropositions.add(ModelCheckingAlphabet.A);
        StateNode state2 = new StateNode(2);
        state2.AtomicPropositions.add(ModelCheckingAlphabet.A);
        StateNode state3 = new StateNode(3);
        state3.AtomicPropositions.add(ModelCheckingAlphabet.A);
        StateNode state4 = new StateNode(4);
        state4.AtomicPropositions.add(ModelCheckingAlphabet.A);
        StateNode state5 = new StateNode(5);
        state5.AtomicPropositions.add(ModelCheckingAlphabet.A);
        StateNode state6 = new StateNode(6);
        state6.AtomicPropositions.add(ModelCheckingAlphabet.A);
        StateNode state7 = new StateNode(7);
        state7.AtomicPropositions.add(ModelCheckingAlphabet.A);
        StateNode state8 = new StateNode(8);
        state8.AtomicPropositions.add(ModelCheckingAlphabet.B);
        StateNode state9 = new StateNode(9);
        state9.AtomicPropositions.add(ModelCheckingAlphabet.A);
        StateNode state10 = new StateNode(10);
        state10.AtomicPropositions.add(ModelCheckingAlphabet.A);
        StateNode state11 = new StateNode(11);
        state11.AtomicPropositions.add(ModelCheckingAlphabet.A);
        StateNode state12 = new StateNode(12);
        state12.AtomicPropositions.add(ModelCheckingAlphabet.A);
        StateNode state13 = new StateNode(13);
        state13.AtomicPropositions.add(ModelCheckingAlphabet.A);
        state13.AtomicPropositions.add(ModelCheckingAlphabet.B);
        StateNode state14 = new StateNode(14);
        state14.AtomicPropositions.add(ModelCheckingAlphabet.A);
        StateNode state15 = new StateNode(15);
        state15.AtomicPropositions.add(ModelCheckingAlphabet.A);

        state0.Successors.add(state1);
        state0.Successors.add(state15);

        state1.Successors.add(state2);
        state2.Successors.add(state3);
        state3.Successors.add(state4);
        state4.Successors.add(state5);
        state5.Successors.add(state6);
        state6.Successors.add(state2);

        state4.Successors.add(state7);
        state7.Successors.add(state8);
        state8.Successors.add(state9);
        state9.Successors.add(state10);
        state10.Successors.add(state5);

        state1.Successors.add(state11);
        state11.Successors.add(state12);
        state12.Successors.add(state13);
        state13.Successors.add(state14);
        state14.Successors.add(state14);
        state15.Successors.add(state15);

        return state0;
    }

}
