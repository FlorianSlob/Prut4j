package nl.florianslob.model.checking.sandbox.modelchecking.tests;

import nl.florianslob.model.checking.sandbox.modelchecking.LtlFormulaParser;
import nl.florianslob.model.checking.sandbox.modelchecking.datastructure.LtlFormula;
import org.junit.Test;

public class LtlFormulaParserTests {
    @Test
    public void TestParseFormula() throws Exception {
        LtlFormula result = LtlFormulaParser.Parse("aUb");
        LtlFormula result2 = result;
    }

    @Test
    public void TestParseFormula2() throws Exception {
        LtlFormula result = LtlFormulaParser.Parse("!XXX((a^!b)Ub)");
        LtlFormula result2 = result;
    }
}
