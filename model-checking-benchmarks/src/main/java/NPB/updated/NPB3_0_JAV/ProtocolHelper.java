package NPB.updated.NPB3_0_JAV;

import nl.florianslob.modelchecking.base.api.v2.IProtocol;
import nl.florianslob.modelchecking.generated.CG.*;
import nl.florianslob.modelchecking.generated.FT.*;
import nl.florianslob.modelchecking.generated.ISProtocol_n_1;
import nl.florianslob.modelchecking.generated.ISProtocol_n_2;
import nl.florianslob.modelchecking.generated.ISProtocol_n_3;
import nl.florianslob.modelchecking.generated.MGProtocol_n_1;

public class ProtocolHelper {
    public static IProtocol GetProtocolImplementation(NpbType npbType, int numberOfThreads){
        System.out.println();
        switch (npbType){
            case CG:
                switch (numberOfThreads){
                    case 1:
                        return new CGProtocol_strict_n_1();
                    case 2:
                        return new CGProtocol_strict_n_2();
                    case 3:
                        return new CGProtocol_strict_n_3();
                    case 4:
                        return new CGProtocol_strict_n_4();
                    case 5:
                        return new CGProtocol_strict_n_5();
                    case 6:
                        return new CGProtocol_strict_n_6();
                    case 7:
                        return new CGProtocol_strict_n_7();
                    case 8:
                        return new CGProtocol_strict_n_8();
                    case 9:
                        return new CGProtocol_strict_n_9();
                    case 10:
                        return new CGProtocol_strict_n_10();
                    default:
                        throw new UnsupportedOperationException("This N is not supported");
                }
            case FT:
                switch (numberOfThreads){
                    case 1:
                        return new FTProtocol_n_1();
                    case 2:
                        return new FTProtocol_n_2();
                    default:
                        throw new UnsupportedOperationException("This N is not supported");
                }
            case IS:
                switch (numberOfThreads){
                    case 1:
                        return new ISProtocol_n_1();
                    case 2:
                        return new ISProtocol_n_2();
                    case 3:
                        return new ISProtocol_n_3();
                    default:
                        throw new UnsupportedOperationException("This N is not supported");
                }
            case MG:
                switch (numberOfThreads){
                    case 1:
                        return new MGProtocol_n_1();
                    default:
                        throw new UnsupportedOperationException("This N is not supported");
                }
            case BT:
            case LU:
            case SP:
            default:
                throw new UnsupportedOperationException("Not Supported");
        }
    }

}
