package nl.florianslob.modelchecking.sandbox.protocolcodegeneration.definitiondatastructure;

public enum ProtocolMessageActionType {
    SEND,
    RECEIVE,
    CLOSE, // TODO What to do with this state?
    SYNC /// Will be send to target & receive from target
}
