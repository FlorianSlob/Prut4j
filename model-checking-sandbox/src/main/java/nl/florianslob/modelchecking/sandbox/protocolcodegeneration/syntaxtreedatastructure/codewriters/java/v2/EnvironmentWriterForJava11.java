package nl.florianslob.modelchecking.sandbox.protocolcodegeneration.syntaxtreedatastructure.codewriters.java.v2;

import nl.florianslob.modelchecking.sandbox.protocolcodegeneration.syntaxtreedatastructure.ASTEnvironment;
import nl.florianslob.modelchecking.sandbox.protocolcodegeneration.syntaxtreedatastructure.ASTStateCaseStatement;
import nl.florianslob.modelchecking.sandbox.protocolcodegeneration.syntaxtreedatastructure.codewriters.ISyntaxWriter;
import nl.florianslob.modelchecking.sandbox.protocolcodegeneration.syntaxtreedatastructure.codewriters.StringBuilderSyntaxHelper;
import nl.florianslob.modelchecking.sandbox.protocolcodegeneration.syntaxtreedatastructure.codewriters.java.StringBuilderSyntaxHelperForJava11;

import java.util.*;
import java.util.stream.Collectors;

public class EnvironmentWriterForJava11 implements ISyntaxWriter<ASTEnvironment> {

    private Set<Integer> globalStartingSates;

    @Override
    public void buildSyntax(StringBuilder builder, int tabCount, ASTEnvironment syntaxTreeItem) {
        Set<Set<Integer>> combinedLocalStates = new HashSet<>();
        StringBuilderSyntaxHelperForJava11.addCodeInBlock(builder,"case \""+syntaxTreeItem.roleName+"\": return new IEnvironment() {", "};", tabCount,
            (tabCountLvl0) -> {
                FindStartingStateId(syntaxTreeItem.AllASTStateCaseStatements,combinedLocalStates);

                HashMap<String,Integer> globalToLocalStateMap = new HashMap<>();

                var statesAsLocalType = ProjectAsLocalType(syntaxTreeItem,combinedLocalStates,globalToLocalStateMap);

                var startingStateId =globalToLocalStateMap.get(GetKeyForLocalStateId(this.globalStartingSates));
                StringBuilderSyntaxHelper.addLine(builder, tabCountLvl0,"private int state = "+startingStateId+";"); // TODO Normalize state numbers!

                StringBuilderSyntaxHelperForJava11.addMethod(builder,"public void setState(int newState)", tabCountLvl0,
                        (tabCountLvl1) -> {
                            StringBuilderSyntaxHelper.addLine(builder, tabCountLvl1, "state = newState;");
                        }
                );

                StringBuilderSyntaxHelperForJava11.addMethodOverride(builder,"public String getName()", tabCountLvl0,
                    (tabCountLvl1) -> {
                        StringBuilderSyntaxHelper.addLine(builder, tabCountLvl1, "return environmentName;");
                    }
                );

                var numberOfStates = statesAsLocalType.size();
                var blockSize = 200;
                var numberOfBlocks = numberOfStates/blockSize;

                // Create blocks
                for(int i = 0; i <= numberOfBlocks; i++){
                    var startIndex = i*blockSize;
                    var endIndex = ((i+1) * blockSize)-1;
                    var blockEndIndex = endIndex +1;

                    if(endIndex > numberOfStates){
                        endIndex = numberOfStates;
                        blockEndIndex = numberOfStates;
                    }

                    var blockOfASTStateCaseStatements = statesAsLocalType.subList(startIndex, blockEndIndex);
                    StringBuilderSyntaxHelperForJava11.addMethod(builder,"public <Any, AnyInput> Optional<Any> exchange_"+startIndex+"_"+endIndex+"(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception", tabCountLvl0,
                            (tabCountLvl1) -> {
                                StringBuilderSyntaxHelperForJava11.addScopedBlock(builder,"switch (state)", tabCountLvl1,
                                        (tabCountLvl2) -> {
                                            // Handle all wait-action-only cases in one case statement.
                                            {
                                                var hasAtLeastOneCaseStatement = blockOfASTStateCaseStatements
                                                        .stream()
                                                        .filter(s -> s.actionsFromState.size() == 0).count() > 0;

                                                if(hasAtLeastOneCaseStatement){
                                                    blockOfASTStateCaseStatements
                                                        .stream()
                                                        .filter(s -> s.actionsFromState.size() == 0)
                                                        .forEach(s -> {
                                                            StringBuilderSyntaxHelper.addLine(builder, tabCountLvl2, "case "+s.stateIdCondition + " :");
                                                        });

                                                    StringBuilderSyntaxHelper.addLine(builder, (tabCountLvl2 + 1), "wait();");
                                                    StringBuilderSyntaxHelper.addLine(builder, (tabCountLvl2 + 1), "break;");
                                                }
                                            }

                                            // Select all case statements that at least have 1 action
                                            var caseStatementsWithMultipleActions = blockOfASTStateCaseStatements.stream().filter(s -> s.actionsFromState.size() > 0).collect(Collectors.toList());

                                            // Writing all case statements to the switch block
                                            for(ASTStateCaseStatement stateCaseStatement : caseStatementsWithMultipleActions)
                                                stateCaseStatement.buildSyntax(builder,tabCountLvl2);
                                        }
                                );
                                StringBuilderSyntaxHelper.addLine(builder, tabCountLvl1, "return null;");
                            });
                }

                StringBuilderSyntaxHelperForJava11.addMethodOverride(builder,"public <Any, AnyInput> Optional<Any> exchange(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception", tabCountLvl0,
                    (tabCountLvl1) -> {
//                        StringBuilderSyntaxHelperForJava11.addScopedBlock(builder,"synchronized (monitor)", tabCountLvl1,
//                            (tabCountLvl2) -> {
                                StringBuilderSyntaxHelperForJava11.addScopedBlock(builder,"while (true)", tabCountLvl1,
                                    (tabCountLvl3) -> {

                                        for(int i = 0; i <= numberOfBlocks; i++) {
                                            var startIndex = i * blockSize;
                                            int endIndex;
                                            if(((i+1) * blockSize)-1 > numberOfStates){
                                                endIndex = numberOfStates;
                                            }else{
                                                endIndex = ((i+1) * blockSize)-1;
                                            }

                                            StringBuilderSyntaxHelperForJava11.addScopedBlock(builder,"if (state >="+startIndex+" && state <= "+endIndex+")", tabCountLvl3,
                                                    (tabCountLvl4) -> {
                                                        StringBuilderSyntaxHelper.addLine(builder, tabCountLvl4, "Optional result = exchange_"+startIndex+"_"+endIndex+"(box, receiver, isCloseAction);");
                                                        StringBuilderSyntaxHelper.addLine(builder, tabCountLvl4, "if(result != null)");
                                                        StringBuilderSyntaxHelper.addLine(builder, tabCountLvl4, "  return (Optional<Any>) result;");
                                                    }
                                            );
                                        }
                                    }
                                );
//                            }
//                        );
                        StringBuilderSyntaxHelper.addEmptyLine(builder, tabCountLvl1);
                    }
                );
            }
        );
    }

    private void DetermineLocalStates(Set<Set<Integer>> combinedLocalStates, HashMap<String, Integer> globalToLocalStateMap) {
        var localStateCounter = 0;
        for (var localStateCombination: combinedLocalStates) {
            var key = GetKeyForLocalStateId(localStateCombination);
            globalToLocalStateMap.put(key, localStateCounter);
            localStateCounter++;
        }
    }

    private String GetKeyForLocalStateId(Set<Integer> localStateCombination) {
        return localStateCombination.stream().sorted().map(String::valueOf).collect(Collectors.joining(","));
    }

    private void FindStartingStateId(LinkedList<ASTStateCaseStatement> allASTStateCaseStatements, Set<Set<Integer>> combinedLocalStates) {
        var state0 = allASTStateCaseStatements.stream().filter(s -> s.stateIdCondition == 0).findFirst().get();

        HashSet<Integer> visitedStates = new HashSet<>();

        this.globalStartingSates = state0.FindAllPossibleGlobalStateIdsForLocalType(allASTStateCaseStatements,visitedStates, "");

        combinedLocalStates.add(this.globalStartingSates);
    }

    private List<ASTStateCaseStatement> ProjectAsLocalType(ASTEnvironment syntaxTreeItem, Set<Set<Integer>> combinedLocalStates, HashMap<String, Integer> globalToLocalStateMap) {
        var allNonWaitCaseStatementActions =
                syntaxTreeItem.ASTStateCaseStatements
                        .stream()
                        .filter(sa -> sa.actionsFromState.stream().count() > 0)
                        .sorted(Comparator.comparingInt(s -> s.stateIdCondition))
                        .collect(Collectors.toList());

        allNonWaitCaseStatementActions
                .forEach(state -> state.FillAllNextStatesForLocalType(syntaxTreeItem.AllASTStateCaseStatements, combinedLocalStates));

        DetermineLocalStates(combinedLocalStates,globalToLocalStateMap);
        var localStates = new LinkedList<ASTStateCaseStatement>();

        for (var localStateCombination: combinedLocalStates) {
            var states = allNonWaitCaseStatementActions
                    .stream()
                    .filter(s -> localStateCombination.contains(s.stateIdCondition))
                    .collect(Collectors.toList());


            var localStateIdKey = GetKeyForLocalStateId(localStateCombination);
            var localStateId = globalToLocalStateMap.get(localStateIdKey);

            var newLocalState = new ASTStateCaseStatement(new CaseStatementWriterForJava11(), localStateId);

            for (var globalState: states) {
                for (var actionFromState: globalState.actionsFromState) {
                    var nextLocalStateIdKey = GetKeyForLocalStateId(actionFromState.allNextStatesForLocalType);
                    actionFromState.nextLocalStateId = globalToLocalStateMap.get(nextLocalStateIdKey);
                    newLocalState.addAction(actionFromState);
                }
            }

            localStates.add(newLocalState);
        }

        return localStates;
    }
}
