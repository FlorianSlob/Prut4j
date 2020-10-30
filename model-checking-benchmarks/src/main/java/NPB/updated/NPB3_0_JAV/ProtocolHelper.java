package NPB.updated.NPB3_0_JAV;

import nl.florianslob.modelchecking.base.api.v2.IProtocol;
import nl.florianslob.modelchecking.generated.*;

public class ProtocolHelper {
    public static IProtocol GetProtocolImplementation(NpbType npbType, int numberOfThreads){
        switch (npbType){
            case CG:
                switch (numberOfThreads){
                    case 1:
                        return new CGProtocol_n_1();
                    case 2:
                        return new CGProtocol_n_2();
                    case 3:
                        return new CGProtocol_n_3();
//                    case 4: code to big??
//                        return new CGProtocol_n_4();
                    default:
                        throw new UnsupportedOperationException("This N is not supported");
                }
            default:
                throw new UnsupportedOperationException("Not Supported");
        }
    }

}
