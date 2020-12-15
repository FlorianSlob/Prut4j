package nl.florianslob.modelchecking.generated.CG;

import Helpers.ProtocolTestingHelper;
import discourje.examples.npb3.impl.CGThreads.CGMessage;
import discourje.examples.npb3.impl.DoneMessage;
import discourje.examples.npb3.impl.ExitMessage;
import nl.florianslob.modelchecking.base.api.v2.IProtocol;
import nl.florianslob.modelchecking.base.runtime.v2.LtlModelChecker;
import nl.florianslob.modelchecking.generated.CGProtocol_strict_n_1;
import org.junit.Test;

import java.util.HashMap;

public class CGProtocol_strict_n_1Tests {
    private static LtlModelChecker GetModelCheckerForChessProtocol(){
        return new LtlModelChecker(new CGProtocol_strict_n_1());
    }

    private IProtocol GetProtocol(){
        return new CGProtocol_strict_n_1();
    }


    private HashMap<String, String> ShortTypeNameToFullClassNameMap = new HashMap<>(){
        {
            put("CGMessage", "discourje.examples.npb3.impl.CGThreads.CGMessage");
            put("DoneMessage", "discourje.examples.npb3.impl.DoneMessage");
            put("ExitMessage", "discourje.examples.npb3.impl.ExitMessage");
        }
    };
    
    private Object[] dummies = new Object[]{CGMessage.GetTestDummyObject(), DoneMessage.GetTestDummyObject(), ExitMessage.GetTestDummyObject()};

    @Test
    public void TestFormula1False() throws Exception {
        // TODO: Explain test here
        ProtocolTestingHelper.TestFormulaFromFile(
                "formulas/CG/CGProtocol_strict_1/formula1, false , GetProtocol(),ShortTypeNameToFullClassNameMap, dummies);
    }

    @Test
    public void TestFormula2True() throws Exception {
        // TODO: Explain test here
        ProtocolTestingHelper.TestFormulaFromFile("formulas/CG/CGProtocol_strict_1/formula2, true , GetProtocol(), ShortTypeNameToFullClassNameMap, dummies);
    }

    @Test
    public void TestFormula3True() throws Exception {
        // TODO: Explain test here
        ProtocolTestingHelper.TestFormulaFromFile("formulas/CG/CGProtocol_strict_1/formula3, true , GetProtocol(), ShortTypeNameToFullClassNameMap, dummies);
    }

    @Test
    public void TestFormula4True() throws Exception {
        // TODO: Explain test here
        ProtocolTestingHelper.TestFormulaFromFile("formulas/CG/CGProtocol_strict_1/formula4, true , GetProtocol(),ShortTypeNameToFullClassNameMap, dummies);
    }

    @Test
    public void TestFormula5True() throws Exception {
        // TODO: Explain test here
        ProtocolTestingHelper.TestFormulaFromFile("formulas/CG/CGProtocol_strict_1/formula5, true , GetProtocol(),ShortTypeNameToFullClassNameMap, dummies);
    }

    @Test
    public void TestFormula6True() throws Exception {
        // TODO: Explain test here
        ProtocolTestingHelper.TestFormulaFromFile("formulas/CG/CGProtocol_strict_1/formula6, true , GetProtocol(),ShortTypeNameToFullClassNameMap, dummies);
    }

    @Test
    public void TestFormula7True() throws Exception {
        // TODO: Explain test here
        ProtocolTestingHelper
                .TestFormulaFromFile("formulas/CG/CGProtocol_strict_1/formula7, true , GetProtocol(),ShortTypeNameToFullClassNameMap, dummies);
    }

    @Test
    public void TestFormula8True() throws Exception {
        // TODO: Explain test here
        ProtocolTestingHelper.TestFormulaFromFile("formulas/CG/CGProtocol_strict_1/formula8, true , GetProtocol(),ShortTypeNameToFullClassNameMap, dummies);
    }

    @Test
    public void TestFormula9False() throws Exception {
        // TODO: Explain test here
        ProtocolTestingHelper.TestFormulaFromFile(
                "formulas/CG/CGProtocol_strict_1/formula9, false , GetProtocol(),ShortTypeNameToFullClassNameMap, dummies);
    }
}