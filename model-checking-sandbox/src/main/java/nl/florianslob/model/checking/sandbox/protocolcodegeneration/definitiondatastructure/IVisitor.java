package nl.florianslob.model.checking.sandbox.protocolcodegeneration.definitiondatastructure;

public interface IVisitor<T> {
    void Visit(T host) throws Exception;
}
