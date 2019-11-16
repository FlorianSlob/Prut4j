package nl.florianslob.model.checking.sandbox.onthefly;

import nl.florianslob.model.checking.sandbox.onthefly.datastructure.LtlFormulla;
import nl.florianslob.model.checking.sandbox.onthefly.datastructure.TemporalOperator;

/**
 *
 * @author FlorianSlob
 */
public class OnTheFlyLtlTestMethods {

    public static LtlFormulla getTestFormulla_aUb() {
        LtlFormulla formulla = new LtlFormulla("RootFormulla");
        formulla.leftOperantFormulla = new LtlFormulla("LeftProperty", "a");
        formulla.operator = TemporalOperator.U;
        formulla.rightOperantFormulla = new LtlFormulla("RightProperty", "b");
        return formulla;
    }

    public static LtlFormulla getTestFormulla_aVb() {
        LtlFormulla formulla = new LtlFormulla("RootFormulla");
        formulla.leftOperantFormulla = new LtlFormulla("LeftProperty", "a");
        formulla.operator = TemporalOperator.V;
        formulla.rightOperantFormulla = new LtlFormulla("RightProperty", "b");
        return formulla;
    }

    public static LtlFormulla getTestFormulla_aOrb() {
        LtlFormulla formulla = new LtlFormulla("RootFormulla");
        formulla.leftOperantFormulla = new LtlFormulla("LeftProperty", "a");
        formulla.operator = TemporalOperator.Or;
        formulla.rightOperantFormulla = new LtlFormulla("RightProperty", "b");
        return formulla;
    }

    public static LtlFormulla getTestFormulla_aAndb() {
        LtlFormulla formulla = new LtlFormulla("RootFormulla");
        formulla.leftOperantFormulla = new LtlFormulla("LeftProperty", "a");
        formulla.operator = TemporalOperator.And;
        formulla.rightOperantFormulla = new LtlFormulla("RightProperty", "b");
        return formulla;
    }

    public static LtlFormulla getTestFormulla_Xa() {
        LtlFormulla formulla = new LtlFormulla("RootFormulla");
        formulla.operator = TemporalOperator.X;
        formulla.rightOperantFormulla = new LtlFormulla("RightProperty", "a");
        return formulla;
    }

    public static LtlFormulla getTestFormulla_a() {
        LtlFormulla formulla = new LtlFormulla("RootFormulla", "a");
        return formulla;
    }
}
