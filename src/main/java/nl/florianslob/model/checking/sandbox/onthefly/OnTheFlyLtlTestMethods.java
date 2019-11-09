package nl.florianslob.model.checking.sandbox.onthefly;

import nl.florianslob.model.checking.sandbox.onthefly.datastructure.TemporalFormulla;
import nl.florianslob.model.checking.sandbox.onthefly.datastructure.TemporalOperator;

/**
 *
 * @author FlorianSlob
 */
public class OnTheFlyLtlTestMethods {

    public static TemporalFormulla getTestFormulla_aUb() {
        TemporalFormulla formulla = new TemporalFormulla("RootFormulla");
        formulla.leftOperantFormulla = new TemporalFormulla("LeftProperty", "a");
        formulla.operator = TemporalOperator.U;
        formulla.rightOperantFormulla = new TemporalFormulla("RightProperty", "b");
        return formulla;
    }

    public static TemporalFormulla getTestFormulla_aVb() {
        TemporalFormulla formulla = new TemporalFormulla("RootFormulla");
        formulla.leftOperantFormulla = new TemporalFormulla("LeftProperty", "a");
        formulla.operator = TemporalOperator.V;
        formulla.rightOperantFormulla = new TemporalFormulla("RightProperty", "b");
        return formulla;
    }

    public static TemporalFormulla getTestFormulla_aOrb() {
        TemporalFormulla formulla = new TemporalFormulla("RootFormulla");
        formulla.leftOperantFormulla = new TemporalFormulla("LeftProperty", "a");
        formulla.operator = TemporalOperator.Or;
        formulla.rightOperantFormulla = new TemporalFormulla("RightProperty", "b");
        return formulla;
    }

    public static TemporalFormulla getTestFormulla_aAndb() {
        TemporalFormulla formulla = new TemporalFormulla("RootFormulla");
        formulla.leftOperantFormulla = new TemporalFormulla("LeftProperty", "a");
        formulla.operator = TemporalOperator.And;
        formulla.rightOperantFormulla = new TemporalFormulla("RightProperty", "b");
        return formulla;
    }

    public static TemporalFormulla getTestFormulla_Xa() {
        TemporalFormulla formulla = new TemporalFormulla("RootFormulla");
        formulla.operator = TemporalOperator.X;
        formulla.rightOperantFormulla = new TemporalFormulla("RightProperty", "a");
        return formulla;
    }

    public static TemporalFormulla getTestFormulla_a() {
        TemporalFormulla formulla = new TemporalFormulla("RootFormulla", "a");
        return formulla;
    }
}
