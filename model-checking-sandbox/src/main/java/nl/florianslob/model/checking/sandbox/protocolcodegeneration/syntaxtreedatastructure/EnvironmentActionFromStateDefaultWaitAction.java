package nl.florianslob.model.checking.sandbox.protocolcodegeneration.syntaxtreedatastructure;

public class EnvironmentActionFromStateDefaultWaitAction extends  EnvironmentActionFromState {
    public static EnvironmentActionFromState defaultWaitAction = new EnvironmentActionFromStateDefaultWaitAction(); // TODO Add some specific type.

    @Override
    public String getSyntax(int numberOfPrependingTabs) {
        return "Syntax for default wait action;\n";
    }
}
