package nl.florianslob.modelchecking.generated.CG;

import Helpers.ProtocolTestingHelper;
import nl.florianslob.modelchecking.base.api.v2.IProtocol;
import nl.florianslob.modelchecking.base.runtime.v2.LtlModelChecker;
import nl.florianslob.modelchecking.generated.CGProtocol_strict_n_1;
import org.junit.Test;

public class CGProtocol_strict_n_1Tests {
    private static LtlModelChecker GetModelCheckerForChessProtocol(){
        return new LtlModelChecker(new CGProtocol_strict_n_1());
    }

    private IProtocol GetProtocol(){
        return new CGProtocol_strict_n_1();
    }

    @Test
    public void TestFormula1False() throws Exception {
        // TODO: Explain test here
        ProtocolTestingHelper.TestFormulaFromFile(
                "formulas/CG/CGProtocol_strict_1/formula1.ltl", false , GetProtocol());
    }

    @Test
    public void TestFormula2True() throws Exception {
        // TODO: Explain test here
        ProtocolTestingHelper.TestFormulaFromFile("formulas/CG/CGProtocol_strict_1/formula2.ltl", true , GetProtocol());
    }

    @Test
    public void TestFormula3True() throws Exception {
        // TODO: Explain test here
        ProtocolTestingHelper.TestFormulaFromFile("formulas/CG/CGProtocol_strict_1/formula3.ltl", true , GetProtocol());
    }

    @Test
    public void TestFormula4True() throws Exception {
        // TODO: Explain test here
        ProtocolTestingHelper.TestFormulaFromFile("formulas/CG/CGProtocol_strict_1/formula4.ltl", true , GetProtocol());
    }

    @Test
    public void TestFormula5True() throws Exception {
        // TODO: Explain test here
        ProtocolTestingHelper.TestFormulaFromFile("formulas/CG/CGProtocol_strict_1/formula5.ltl", true , GetProtocol());
    }

    @Test
    public void TestFormula6True() throws Exception {
        // TODO: Explain test here
        ProtocolTestingHelper.TestFormulaFromFile("formulas/CG/CGProtocol_strict_1/formula6.ltl", true , GetProtocol());
    }

    @Test
    public void TestFormula7True() throws Exception {
        // TODO: Explain test here
        ProtocolTestingHelper
                .TestFormulaFromFile("formulas/CG/CGProtocol_strict_1/formula7.ltl", true , GetProtocol());
    }

    @Test
    public void TestFormula8True() throws Exception {
        // TODO: Explain test here
        ProtocolTestingHelper.TestFormulaFromFile("formulas/CG/CGProtocol_strict_1/formula8.ltl", true , GetProtocol());
    }

    @Test
    public void TestFormula9False() throws Exception {
        // TODO: Explain test here
        ProtocolTestingHelper.TestFormulaFromFile(
                "formulas/CG/CGProtocol_strict_1/formula9.ltl", false , GetProtocol());
    }
}