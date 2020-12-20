package nl.florianslob.modelchecking.generated.NetworkTopologies;

import Helpers.ProtocolTestingHelper;
import nl.florianslob.modelchecking.base.api.v2.Pr;
import nl.florianslob.modelchecking.base.runtime.v2.Engine;
import nl.florianslob.modelchecking.generated.TokenFullMeshProtocol;
import org.junit.Test;

import java.util.HashMap;

public class TokenFullMeshProtocolTests {

    public TokenFullMeshProtocolTests(){
        Engine.IsProtocolOptimized = true;
    }

    private Pr GetProtocol(){
        return new TokenFullMeshProtocol();
    }

    private HashMap<String, String> ShortTypeNameToFullClassNameMap = new HashMap<>(){
        {
            put("Boolean", "java.lang.Boolean");
        }
    };

    private Object[] dummies = new Object[]{ true };

    @Test
    public void Test1() throws Exception {
        ProtocolTestingHelper.TestFormulaFromFile("formulas/NetworkTopologies/Test1.owl",
                false,
                GetProtocol(),
                ShortTypeNameToFullClassNameMap,
                dummies);
    }

    @Test
    public void Test2() throws Exception {
        ProtocolTestingHelper.TestFormulaFromFile("formulas/NetworkTopologies/Test2.owl",
                false,
                GetProtocol(),
                ShortTypeNameToFullClassNameMap,
                dummies);
    }

    @Test
    public void Test3() throws Exception {
        ProtocolTestingHelper.TestFormulaFromFile("formulas/NetworkTopologies/Test3.owl",
                false,
                GetProtocol(),
                ShortTypeNameToFullClassNameMap,
                dummies);
    }

    @Test
    public void Test4() throws Exception {
        ProtocolTestingHelper.TestFormulaFromFile("formulas/NetworkTopologies/Test4.owl",
                false,
                GetProtocol(),
                ShortTypeNameToFullClassNameMap,
                dummies);
    }

    @Test
    public void Test5() throws Exception {
        ProtocolTestingHelper.TestFormulaFromFile("formulas/NetworkTopologies/Test5.owl",
                true,
                GetProtocol(),
                ShortTypeNameToFullClassNameMap,
                dummies);
    }

    @Test
    public void Test6() throws Exception {
        ProtocolTestingHelper.TestFormulaFromFile("formulas/NetworkTopologies/Test6.owl",
                false,
                GetProtocol(),
                ShortTypeNameToFullClassNameMap,
                dummies);
    }
}
