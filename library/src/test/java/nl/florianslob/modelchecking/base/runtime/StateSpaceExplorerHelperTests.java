package nl.florianslob.modelchecking.base.runtime;

import nl.florianslob.modelchecking.base.api.v2.IEnvironment;
import nl.florianslob.modelchecking.base.api.v2.IProtocol;
import nl.florianslob.modelchecking.base.runtime.v2.StateSpaceExplorerHelper;
import nl.florianslob.modelchecking.base.runtime.v2.StateSpaceExploringActionsHelper;
import nl.florianslob.modelchecking.base.runtime.v2.ltlautomaton.OwlHelper;
import org.junit.Test;
import static org.junit.Assert.*;

public class StateSpaceExplorerHelperTests {

    private IProtocol GetSimpleTestProtocol(){
        return new IProtocol() {
            @Override
            public IEnvironment getEnvironment(String threadName) throws Exception {
                return null;
            }

            @Override
            public <Any> void send(String threadName, Any m, String receiver) throws Exception {

            }

            @Override
            public <Any> void send(String threadName, Any m) throws Exception {

            }

            @Override
            public <Any> Any receive(String threadName) throws Exception {
                return null;
            }

            @Override
            public void close(String threadName) throws Exception {

            }

            @Override
            public String[] threadNames() {
                return new String[]{"w", "b"};
            }

            @Override
            public String getState() {
                return "";
            }
        };
    }

    @Test
    public void TestDetermineExploringActions(){
        // ARRANGE
        IProtocol protocol = GetSimpleTestProtocol();

        // ACT
        var exploringActions = StateSpaceExplorerHelper.getExploringActions(protocol,  new Object[]{"TestObject"});

        // ASSERT
        assertNotNull(exploringActions);
    }

    @Test
    public void TestDetermineExploringActionsFromRealProtocolAndFormula(){
        // ARRANGE
        IProtocol protocol = GetSimpleTestProtocol();
        String ltlFormulaString = "\"w RECEIVE java.lang.String TO b\"";


        var ltlFormulaStartingNodes = OwlHelper.GetInitialLtlStatesForFormula(ltlFormulaString, true);
        var exploringActions = StateSpaceExplorerHelper.getExploringActions(protocol,  new Object[]{"TestObject"});
        var firstTransition = ltlFormulaStartingNodes.get(0).OutgoingTransitions.get(0);

        // ACT
        var possibleExploringActions =
                StateSpaceExploringActionsHelper.GetPossibleExploringActions(
                        firstTransition,exploringActions);

        // ASSERT
        assertNotNull(exploringActions);
        assertNotNull(possibleExploringActions);
    }
}
