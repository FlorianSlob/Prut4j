package nl.florianslob.modelchecking.base.runtime.v2.ltlautomaton;

import it.unimi.dsi.fastutil.objects.Object2IntArrayMap;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import jhoafparser.ast.AtomLabel;
import jhoafparser.ast.BooleanExpression;
import nl.florianslob.modelchecking.base.runtime.v2.datastructure.*;
import owl.automaton.Automaton;
import owl.automaton.acceptance.GeneralizedBuchiAcceptance;
import owl.automaton.edge.Edge;
import owl.collections.ValuationSet;

import java.util.*;

public class LtlAutomatonVisitor<S> implements Automaton.EdgeVisitor<S>, Automaton.EdgeMapVisitor<S> {
    private final Object2IntMap<S> stateNumbers = new Object2IntArrayMap<>();

    private List<String> alphabet;
    private Automaton<S, GeneralizedBuchiAcceptance> automaton;
    private Map<Integer, LtlState> stateIdToState = new HashMap<>();

    public LtlAutomatonVisitor(Automaton<S, GeneralizedBuchiAcceptance> automaton) {
        this.alphabet = automaton.factory().alphabet();
        this.automaton = automaton;
    }

    public List<LtlState> getInitialStates(){
        List<LtlState> ltlStates = new ArrayList<>();
        for (var initialState :
                automaton.initialStates()) {
            var ltlState = getLtlState(initialState);

            ltlStates.add(ltlState);
        }

        return ltlStates;
    }

    private LtlState getLtlState(S state) {
        var stateNumber = stateNumbers.computeIntIfAbsent(state, k -> stateNumbers.size());
        var ltlState = stateIdToState.getOrDefault(stateNumber,null);
        if(ltlState == null){
            ltlState = new LtlState(stateNumber);
            stateIdToState.put(stateNumber,ltlState);
        }

        return ltlState;
    }

    @Override
    public void enter(S state) {
        getLtlState(state);
    }

    @Override
    public void visit(S state, Map<Edge<S>, ValuationSet> edgeMap) {
        edgeMap.forEach((edge, valuationSet) -> {

            S targetState = edge.successor();

            var ltlTargetState = getLtlState(targetState);
            var ltlState = getLtlState(state);
            var targetStateId = ltlTargetState.stateNumber;
            var newTransition = new LtlTransition(ltlTargetState);

            if (valuationSet.isEmpty()) {
                return;
            } else {
                newTransition.Expression = getExpressionRecursively( valuationSet.toExpression());
            }

            BitSet acceptanceSets = edge.acceptanceSets();
            var size = acceptanceSets.length();

            if (size > 0) {
                var accSet = new ArrayList<Integer>();

                for (int i = 0; i < size; i++) {
                    var acceptanceBit = acceptanceSets.get(i);
                    if (acceptanceBit) {
                        accSet.add(i);
                    }
                }

                if(accSet.contains(0)){
                    newTransition.AcceptanceSet0 = true;
                }

                if(accSet.contains(1)){
                    newTransition.AcceptanceSet1 = true;
                }
            }
            ltlState.OutgoingTransitions.add(newTransition);
        });
    }

    private LtlTransitionExpression getExpressionRecursively(BooleanExpression<AtomLabel> owlExpression){
        var expression = new LtlTransitionExpression();

        // Do magic here
        if(owlExpression.isAtom()){
            expression.Operator = LtlTransitionExpressionOperator.ATOM;

            var expressionString = owlExpression.getAtom().toString();

            // resetting the labels to the string... is this a good idea??
            // No, remove logic below and separate parsing logic.
            // TODO extract parsing logic.
            for (int i = 0; i< alphabet.size(); i++) {
                expressionString  = expressionString.replace(""+i, ""+alphabet.get(i)+"");
            }

            var atomicProposition = new LtlTransitionExpressionAtomicProposition();

            var expressionSplitted = expressionString.split(" "); // TODO Should we allow multiple spaces?
            atomicProposition.Participant = expressionSplitted[0]; // The first thing you find is the participant

            if(expressionSplitted.length >2) {
                // TODO make a nicer parser for this?
                // Move to separate method.
                if (expressionSplitted[1].equalsIgnoreCase("RECEIVE")) {
                    atomicProposition.Direction = LtlTransitionExpressionAtomicPropositionDirection.RECEIVE;
                } else if (expressionSplitted[1].equalsIgnoreCase("SEND")) {
                    atomicProposition.Direction = LtlTransitionExpressionAtomicPropositionDirection.SEND;
                    // Take the part after keyword TO and trim the rest
                    atomicProposition.Receiver = expressionSplitted[4];
                }
                atomicProposition.MessageType = expressionSplitted[2];

            }else{
                // TODO Throw exception??
            }

            expression.AtomicProposition = atomicProposition;
        }else if (owlExpression.isAND()){
            expression.Operator = LtlTransitionExpressionOperator.AND;
            expression.Left = getExpressionRecursively(owlExpression.getLeft());
            expression.Right = getExpressionRecursively(owlExpression.getRight());
        }else if (owlExpression.isOR()){
            expression.Operator = LtlTransitionExpressionOperator.OR;
            expression.Left = getExpressionRecursively(owlExpression.getLeft());
            expression.Right = getExpressionRecursively(owlExpression.getRight());
        }else if (owlExpression.isNOT()){
            expression.Operator = LtlTransitionExpressionOperator.NOT;
            expression.Left = getExpressionRecursively(owlExpression.getLeft());
        }else if (owlExpression.isFALSE()){
            expression.Operator = LtlTransitionExpressionOperator.FALSE;
        }else if (owlExpression.isTRUE()){
            expression.Operator = LtlTransitionExpressionOperator.TRUE;
        }
        return expression;
    }


    @Override
    public void visit(S state, BitSet valuation, Edge<S> edge) {
        // Do nothing.
    }
}
