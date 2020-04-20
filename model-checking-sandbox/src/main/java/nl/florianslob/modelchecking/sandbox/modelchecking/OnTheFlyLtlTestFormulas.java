package nl.florianslob.modelchecking.sandbox.modelchecking;

import nl.florianslob.modelchecking.sandbox.modelchecking.datastructure.LtlFormula;
import nl.florianslob.modelchecking.sandbox.modelchecking.datastructure.ModelCheckingAlphabet;
import nl.florianslob.modelchecking.sandbox.modelchecking.datastructure.TemporalOperator;

/**
 *
 * @author FlorianSlob
 */
public class OnTheFlyLtlTestFormulas {

    public static LtlFormula getTestFormula(OnTheFlyLtlTestFormulaName formulaName) {

        LtlFormula formula = null;

        switch (formulaName) {
        case aOrB:
            formula = getTestFormula_aOrb();
            break;
        case Xb:
            formula = getTestFormula_Xb();
            break;
        case Xa:
            formula = getTestFormula_Xa();
            break;
        case aUb:
            formula = getTestFormula_aUb();
            break;
        case aAndB:
            formula = getTestFormula_a_And_b();
            break;
        case bVa:
            formula = getTestFormula_bVa();
            break;
        case a:
            formula = getTestFormula_a();
            break;
        case b:
            formula = getTestFormula_b();
            break;
        case XXXXaAndB:
            formula = getTestFormula_XXXXaAndB();
        }

        return formula;
    }

    public static LtlFormula getTestFormula_aUb() {
        LtlFormula formula = new LtlFormula("RootFormula");
        formula.leftOperandFormula = new LtlFormula("LeftProperty", ModelCheckingAlphabet.A);
        formula.operator = TemporalOperator.U;
        formula.rightOperandFormula = new LtlFormula("RightProperty", ModelCheckingAlphabet.B);
        return formula;
    }

    public static LtlFormula getTestFormula_bVa() {
        LtlFormula formula = new LtlFormula("RootFormula");
        formula.leftOperandFormula = new LtlFormula("LeftProperty", ModelCheckingAlphabet.B);
        formula.operator = TemporalOperator.V;
        formula.rightOperandFormula = new LtlFormula("RightProperty", ModelCheckingAlphabet.A);
        return formula;
    }

    public static LtlFormula getTestFormula_aOrb() {
        LtlFormula formula = new LtlFormula("RootFormula");
        formula.leftOperandFormula = new LtlFormula("LeftProperty", ModelCheckingAlphabet.A);
        formula.operator = TemporalOperator.Or;
        formula.rightOperandFormula = new LtlFormula("RightProperty", ModelCheckingAlphabet.B);
        return formula;
    }

    public static LtlFormula getTestFormula_a_And_b() {
        LtlFormula formula = new LtlFormula("RootFormula");
        formula.leftOperandFormula = new LtlFormula("LeftProperty", ModelCheckingAlphabet.A);
        formula.operator = TemporalOperator.And;
        formula.rightOperandFormula = new LtlFormula("RightProperty", ModelCheckingAlphabet.B);
        return formula;
    }

    public static LtlFormula getTestFormula_Xa() {
        LtlFormula formula = new LtlFormula("RootFormula");
        formula.operator = TemporalOperator.X;
        formula.rightOperandFormula = new LtlFormula("RightProperty", ModelCheckingAlphabet.A);
        return formula;
    }

    public static LtlFormula getTestFormula_XXXXaAndB() {
        LtlFormula a_and_b = getTestFormula_a_And_b();

        LtlFormula next3 = new LtlFormula("next3");
        next3.operator = TemporalOperator.X;
        next3.rightOperandFormula = a_and_b;

        LtlFormula next2 = new LtlFormula("next2");
        next2.operator = TemporalOperator.X;
        next2.rightOperandFormula = next3;

        LtlFormula next1 = new LtlFormula("next1");
        next1.operator = TemporalOperator.X;
        next1.rightOperandFormula = next2;

        LtlFormula root = new LtlFormula("RootFormula");
        root.operator = TemporalOperator.X;
        root.rightOperandFormula = next1;

        return root;
    }

    public static LtlFormula getTestFormula_Xb() {
        LtlFormula formula = new LtlFormula("RootFormula");
        formula.operator = TemporalOperator.X;
        formula.rightOperandFormula = new LtlFormula("RightProperty", ModelCheckingAlphabet.B);
        return formula;
    }

    public static LtlFormula getTestFormula_a() {
        return new LtlFormula("RootFormula", ModelCheckingAlphabet.A);
    }

    public static LtlFormula getTestFormula_b() {
        return new LtlFormula("RootFormula", ModelCheckingAlphabet.B);
    }
}
