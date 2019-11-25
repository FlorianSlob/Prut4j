package nl.florianslob.model.checking.sandbox.modelchecking;

import nl.florianslob.model.checking.sandbox.modelchecking.datastructure.LtlFormula;
import nl.florianslob.model.checking.sandbox.modelchecking.datastructure.ModelcheckingAlphabet;
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
        formulla.leftOperantFormulla = new LtlFormula("LeftProperty", ModelcheckingAlphabet.A);
        formulla.operator = TemporalOperator.U;
        formulla.rightOperantFormulla = new LtlFormula("RightProperty", ModelcheckingAlphabet.B);
        return formulla;
    }

    public static LtlFormula getTestFormula_bVa() {
        LtlFormula formulla = new LtlFormula("RootFormulla");
        formulla.leftOperantFormulla = new LtlFormula("LeftProperty", ModelcheckingAlphabet.B);
        formulla.operator = TemporalOperator.V;
        formulla.rightOperantFormulla = new LtlFormula("RightProperty", ModelcheckingAlphabet.A);
        return formulla;
    }

    public static LtlFormula getTestFormula_aOrb() {
        LtlFormula formulla = new LtlFormula("RootFormulla");
        formulla.leftOperantFormulla = new LtlFormula("LeftProperty", ModelcheckingAlphabet.A);
        formulla.operator = TemporalOperator.Or;
        formulla.rightOperantFormulla = new LtlFormula("RightProperty", ModelcheckingAlphabet.B);
        return formulla;
    }

    public static LtlFormula getTestFormula_aAndb() {
        LtlFormula formulla = new LtlFormula("RootFormulla");
        formulla.leftOperantFormulla = new LtlFormula("LeftProperty", ModelcheckingAlphabet.A);
        formulla.operator = TemporalOperator.And;
        formulla.rightOperantFormulla = new LtlFormula("RightProperty", ModelcheckingAlphabet.B);
        return formulla;
    }

    public static LtlFormula getTestFormula_Xa() {
        LtlFormula formulla = new LtlFormula("RootFormulla");
        formulla.operator = TemporalOperator.X;
        formulla.rightOperantFormulla = new LtlFormula("RightProperty", ModelcheckingAlphabet.A);
        return formulla;
    }

    public static LtlFormula getTestFormula_XXXXaAndB() {
        LtlFormula aAndb = getTestFormula_aAndb();

        LtlFormula next3 = new LtlFormula("next3");
        next3.operator = TemporalOperator.X;
        next3.rightOperantFormulla = aAndb;

        LtlFormula next2 = new LtlFormula("next2");
        next2.operator = TemporalOperator.X;
        next2.rightOperantFormulla = next3;

        LtlFormula next1 = new LtlFormula("next1");
        next1.operator = TemporalOperator.X;
        next1.rightOperantFormulla = next2;

        LtlFormula root = new LtlFormula("RootFormulla");
        root.operator = TemporalOperator.X;
        root.rightOperantFormulla = next1;

        return root;
    }

    public static LtlFormula getTestFormula_Xb() {
        LtlFormula formulla = new LtlFormula("RootFormulla");
        formulla.operator = TemporalOperator.X;
        formulla.rightOperantFormulla = new LtlFormula("RightProperty", ModelcheckingAlphabet.B);
        return formulla;
    }

    public static LtlFormula getTestFormulla_a() {
        LtlFormula formulla = new LtlFormula("RootFormulla", ModelcheckingAlphabet.A);
        return formulla;
    }

    public static LtlFormula getTestFormula_b() {
        LtlFormula formulla = new LtlFormula("RootFormulla", ModelcheckingAlphabet.B);
        return formulla;
    }
}
