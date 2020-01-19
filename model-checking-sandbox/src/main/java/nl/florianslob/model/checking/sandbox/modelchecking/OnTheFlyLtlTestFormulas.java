package nl.florianslob.model.checking.sandbox.modelchecking;

import nl.florianslob.model.checking.sandbox.modelchecking.datastructure.LtlFormula;
import nl.florianslob.model.checking.sandbox.modelchecking.datastructure.ModelCheckingAlphabet;
import nl.florianslob.model.checking.sandbox.modelchecking.datastructure.TemporalOperator;

/**
 *
 * @author FlorianSlob
 */
public class OnTheFlyLtlTestFormulas {

    public static LtlFormula getTestFormula(OnTheFlyLtlTestFormulaName formulaName) {

        LtlFormula formulla = null;

        switch (formulaName) {
        case aOrB:
            formulla = getTestFormula_aOrb();
            break;
        case Xb:
            formulla = getTestFormula_Xb();
            break;
        case Xa:
            formulla = getTestFormula_Xa();
            break;
        case aUb:
            formulla = getTestFormula_aUb();
            break;
        case aAndB:
            formulla = getTestFormula_aAndb();
            break;
        case bVa:
            formulla = getTestFormula_bVa();
            break;
        case a:
            formulla = getTestFormulla_a();
            break;
        case b:
            formulla = getTestFormula_b();
            break;
        case XXXXaAndB:
            formulla = getTestFormula_XXXXaAndB();
        }

        return formulla;
    }

    public static LtlFormula getTestFormula_aUb() {
        LtlFormula formulla = new LtlFormula("RootFormulla");
        formulla.leftOperandFormula = new LtlFormula("LeftProperty", ModelCheckingAlphabet.A);
        formulla.operator = TemporalOperator.U;
        formulla.rightOperandFormula = new LtlFormula("RightProperty", ModelCheckingAlphabet.B);
        return formulla;
    }

    public static LtlFormula getTestFormula_bVa() {
        LtlFormula formulla = new LtlFormula("RootFormulla");
        formulla.leftOperandFormula = new LtlFormula("LeftProperty", ModelCheckingAlphabet.B);
        formulla.operator = TemporalOperator.V;
        formulla.rightOperandFormula = new LtlFormula("RightProperty", ModelCheckingAlphabet.A);
        return formulla;
    }

    public static LtlFormula getTestFormula_aOrb() {
        LtlFormula formulla = new LtlFormula("RootFormulla");
        formulla.leftOperandFormula = new LtlFormula("LeftProperty", ModelCheckingAlphabet.A);
        formulla.operator = TemporalOperator.Or;
        formulla.rightOperandFormula = new LtlFormula("RightProperty", ModelCheckingAlphabet.B);
        return formulla;
    }

    public static LtlFormula getTestFormula_aAndb() {
        LtlFormula formulla = new LtlFormula("RootFormulla");
        formulla.leftOperandFormula = new LtlFormula("LeftProperty", ModelCheckingAlphabet.A);
        formulla.operator = TemporalOperator.And;
        formulla.rightOperandFormula = new LtlFormula("RightProperty", ModelCheckingAlphabet.B);
        return formulla;
    }

    public static LtlFormula getTestFormula_Xa() {
        LtlFormula formulla = new LtlFormula("RootFormulla");
        formulla.operator = TemporalOperator.X;
        formulla.rightOperandFormula = new LtlFormula("RightProperty", ModelCheckingAlphabet.A);
        return formulla;
    }

    public static LtlFormula getTestFormula_XXXXaAndB() {
        LtlFormula aAndb = getTestFormula_aAndb();

        LtlFormula next3 = new LtlFormula("next3");
        next3.operator = TemporalOperator.X;
        next3.rightOperandFormula = aAndb;

        LtlFormula next2 = new LtlFormula("next2");
        next2.operator = TemporalOperator.X;
        next2.rightOperandFormula = next3;

        LtlFormula next1 = new LtlFormula("next1");
        next1.operator = TemporalOperator.X;
        next1.rightOperandFormula = next2;

        LtlFormula root = new LtlFormula("RootFormulla");
        root.operator = TemporalOperator.X;
        root.rightOperandFormula = next1;

        return root;
    }

    public static LtlFormula getTestFormula_Xb() {
        LtlFormula formulla = new LtlFormula("RootFormulla");
        formulla.operator = TemporalOperator.X;
        formulla.rightOperandFormula = new LtlFormula("RightProperty", ModelCheckingAlphabet.B);
        return formulla;
    }

    public static LtlFormula getTestFormulla_a() {
        LtlFormula formulla = new LtlFormula("RootFormulla", ModelCheckingAlphabet.A);
        return formulla;
    }

    public static LtlFormula getTestFormula_b() {
        LtlFormula formulla = new LtlFormula("RootFormulla", ModelCheckingAlphabet.B);
        return formulla;
    }
}
