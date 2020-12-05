package nl.florianslob.modelchecking.base.runtime.v2.datastructure;

import java.util.ArrayList;
import java.util.List;

public class LtlState {
    public List<LtlTransition> OutgoingTransitions = new ArrayList<>();
    public int stateNumber;

    public LtlState(int stateNumber) {

        this.stateNumber = stateNumber;
    }
}
