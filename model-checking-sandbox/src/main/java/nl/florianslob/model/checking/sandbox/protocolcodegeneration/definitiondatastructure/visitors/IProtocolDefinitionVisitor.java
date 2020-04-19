package nl.florianslob.model.checking.sandbox.protocolcodegeneration.definitiondatastructure.visitors;

import nl.florianslob.model.checking.sandbox.protocolcodegeneration.definitiondatastructure.ProtocolStateNode;

public interface IProtocolDefinitionVisitor {
    void Visit(ProtocolStateNode host) throws Exception;
}
