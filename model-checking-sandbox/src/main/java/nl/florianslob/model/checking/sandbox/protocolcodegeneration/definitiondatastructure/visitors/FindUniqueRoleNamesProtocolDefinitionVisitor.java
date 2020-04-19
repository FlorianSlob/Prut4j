package nl.florianslob.model.checking.sandbox.protocolcodegeneration.definitiondatastructure.visitors;

import nl.florianslob.model.checking.sandbox.protocolcodegeneration.definitiondatastructure.ProtocolStateNode;
import nl.florianslob.model.checking.sandbox.protocolcodegeneration.definitiondatastructure.ProtocolTransaction;

import java.util.HashSet;

public class FindUniqueRoleNamesProtocolDefinitionVisitor implements IProtocolDefinitionVisitor {

    public HashSet<String> roleNames = new HashSet<>();

    @Override
    public void Visit(ProtocolStateNode protocolStateNode) {
        for(ProtocolTransaction transaction : protocolStateNode.outgoingTransactions){
            // We don't have to check for duplicates since we use a set, no list.
            roleNames.add(transaction.fromRole);
            roleNames.add(transaction.toRole);
        }
    }
}
