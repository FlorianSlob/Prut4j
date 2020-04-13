package nl.florianslob.model.checking.sandbox.protocolcodegeneration.definitiondatastructure;

import java.util.HashSet;

public class UniqueRoleNameFinderVisitor implements IVisitor<ProtocolStateNode> {

    public HashSet<String> roleNames = new HashSet<>();

    @Override
    public void Visit(ProtocolStateNode host) {
        for(ProtocolTransaction transaction : host.outgoingTransactions){
            roleNames.add(transaction.fromRole);
            roleNames.add(transaction.toRole);
        }
    }
}
