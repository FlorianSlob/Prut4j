package nl.florianslob.model.checking.sandbox.modelchecking;

import nl.florianslob.model.checking.sandbox.modelchecking.datastructure.LtlFormulla;
import nl.florianslob.model.checking.sandbox.modelchecking.datastructure.ModelcheckingAlphabet;
import nl.florianslob.model.checking.sandbox.modelchecking.datastructure.TemporalOperator;

/**
 *
 * @author FlorianSlob
 */
public class OnTheFlyLtlTestMethods {

    public static LtlFormulla getTestFormulla_aUb() {
        LtlFormulla formulla = new LtlFormulla("RootFormulla");
        formulla.leftOperantFormulla = new LtlFormulla("LeftProperty", ModelcheckingAlphabet.A);
        formulla.operator = TemporalOperator.U;
        formulla.rightOperantFormulla = new LtlFormulla("RightProperty", ModelcheckingAlphabet.B);
        return formulla;
    }

    public static LtlFormulla getTestFormulla_aVb() {
        LtlFormulla formulla = new LtlFormulla("RootFormulla");
        formulla.leftOperantFormulla = new LtlFormulla("LeftProperty", ModelcheckingAlphabet.A);
        formulla.operator = TemporalOperator.V;
        formulla.rightOperantFormulla = new LtlFormulla("RightProperty", ModelcheckingAlphabet.B);
        return formulla;
    }

    public static LtlFormulla getTestFormulla_aOrb() {
        LtlFormulla formulla = new LtlFormulla("RootFormulla");
        formulla.leftOperantFormulla = new LtlFormulla("LeftProperty", ModelcheckingAlphabet.A);
        formulla.operator = TemporalOperator.Or;
        formulla.rightOperantFormulla = new LtlFormulla("RightProperty", ModelcheckingAlphabet.B);
        return formulla;
    }

    public static LtlFormulla getTestFormulla_aAndb() {
        LtlFormulla formulla = new LtlFormulla("RootFormulla");
        formulla.leftOperantFormulla = new LtlFormulla("LeftProperty", ModelcheckingAlphabet.A);
        formulla.operator = TemporalOperator.And;
        formulla.rightOperantFormulla = new LtlFormulla("RightProperty", ModelcheckingAlphabet.B);
        return formulla;
    }

    public static LtlFormulla getTestFormulla_Xa() {
        LtlFormulla formulla = new LtlFormulla("RootFormulla");
        formulla.operator = TemporalOperator.X;
        formulla.rightOperantFormulla = new LtlFormulla("RightProperty", ModelcheckingAlphabet.A);
        return formulla;
    }

    public static LtlFormulla getTestFormulla_a() {
        LtlFormulla formulla = new LtlFormulla("RootFormulla", ModelcheckingAlphabet.A);
        return formulla;
    }
}
