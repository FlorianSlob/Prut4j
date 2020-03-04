package nl.florianslob.model.checking.sandbox.modelchecking.tests;

import nl.florianslob.model.checking.sandbox.modelchecking.LtlFormulaParser;
import org.junit.Test;

public class LtlFormulaParserTests {
    @Test
    public void TestParseFormula() throws Exception {
        LtlFormulaParser.Parse("aUb");
        // TODO Add Assertions
    }

    @Test
    public void TestParseFormula2() throws Exception {
        LtlFormulaParser.Parse("!XXX((a^!b)Ub)");
        // TODO Add Assertions
    }
}
