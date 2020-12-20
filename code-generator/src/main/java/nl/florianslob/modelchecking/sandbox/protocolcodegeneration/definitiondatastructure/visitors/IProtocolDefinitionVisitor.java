package nl.florianslob.modelchecking.sandbox.protocolcodegeneration.definitiondatastructure.visitors;

import nl.florianslob.modelchecking.sandbox.protocolcodegeneration.definitiondatastructure.ProtocolStateNode;

public interface IProtocolDefinitionVisitor {
    void Visit(ProtocolStateNode host) throws Exception;
}
