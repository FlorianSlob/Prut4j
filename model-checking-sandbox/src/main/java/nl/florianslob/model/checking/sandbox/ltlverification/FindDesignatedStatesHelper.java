package nl.florianslob.model.checking.sandbox.ltlverification;

import java.util.HashSet;
import java.util.Set;
import nl.florianslob.model.checking.sandbox.LoggingHelper;
import nl.florianslob.model.checking.sandbox.ltlverification.datastructure.StateNode;

/**
 *
 * @author FlorianSlob
 */
public class FindDesignatedStatesHelper {

    public static Set<StateNode> DfsPass1(StateNode initialState, Set<StateNode> F) {
        LoggingHelper.logDebug("Starting Pass1");

        Set<StateNode> S = new HashSet<>();
        S.add(initialState);

        // 'istinguished set of accepting nodes F'
        Set<StateNode> Q = new HashSet<>(); // TODO what is Q?

        while (!S.isEmpty()) {
            StateNode v = S.stream().findFirst().get();

            if (v.Successors.stream().allMatch((successor) -> successor.MarkedAsVisitedPass1)) {
                S.remove(v);
                if (F.contains(v)) {
                    Q.add(v);
                }
            } else {
                StateNode w = v.Successors.stream().filter((successor) -> !successor.MarkedAsVisitedPass1).findFirst().get();
                w.MarkedAsVisitedPass1 = true;
                S.add(w);
            }
        }

        return Q;
    }

    public static boolean DfsPass2(Set<StateNode> Q) {
        LoggingHelper.logDebug("Starting Pass2");

        Set<StateNode> S = new HashSet<>();

        while (!Q.isEmpty()) {
            StateNode f = Q.stream().findFirst().get();
            Q.remove(f);
            S.add(f);
            while (!S.isEmpty()) {
                StateNode v = S.stream().findFirst().get();
                if (v.Successors.contains(f)) {
                    return true;
                }

                if (v.Successors.stream().allMatch((successor) -> successor.MarkedAsVisitedPass2)) {
                    S.remove(v);
                } else {
                    StateNode w = v.Successors.stream().filter((successor) -> !successor.MarkedAsVisitedPass2).findFirst().get();
                    w.MarkedAsVisitedPass2 = true;
                    S.add(w);
                }
            }
        }

        return false;
    }
}
