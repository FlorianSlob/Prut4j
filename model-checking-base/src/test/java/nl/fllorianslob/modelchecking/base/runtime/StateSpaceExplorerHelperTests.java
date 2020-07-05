package nl.fllorianslob.modelchecking.base.runtime;

import nl.florianslob.modelchecking.base.api.v2.IEnvironment;
import nl.florianslob.modelchecking.base.api.v2.IProtocol;
import nl.florianslob.modelchecking.base.runtime.v2.StateSpaceExplorerHelper;
import org.junit.Test;
import static org.junit.Assert.*;

public class StateSpaceExplorerHelperTests {
    @Test
    public void TestDetermineExploringActions(){
        // ARRANGE
        IProtocol protocol = new IProtocol() {
            @Override
            public IEnvironment getEnvironment(String threadName) throws Exception {
                return null;
            }

            @Override
            public String[] threadNames() {
                return new String[0];
            }

            @Override
            public Object[] dummies() {
                return new Object[0];
            }

            @Override
            public int getState() {
                return 0;
            }
        };

        // ACT
        var exploringActions = StateSpaceExplorerHelper.getExploringActions(protocol);

        // ASSERT
        assertNotNull(exploringActions);
    }
}
