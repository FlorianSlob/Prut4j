package nl.florianslob.modelchecking.sandbox.protocolcodegeneration.definitiondatastructure.visitors;

import nl.florianslob.modelchecking.sandbox.protocolcodegeneration.definitiondatastructure.ProtocolStateNode;
import nl.florianslob.modelchecking.sandbox.protocolcodegeneration.definitiondatastructure.ProtocolTransition;

import java.util.HashSet;

public class FindUniqueRoleNamesProtocolDefinitionVisitor implements IProtocolDefinitionVisitor {

    public HashSet<String> roleNames = new HashSet<>();

    @Override
    public void Visit(ProtocolStateNode protocolStateNode) {
        for(ProtocolTransition transaction : protocolStateNode.outgoingTransactions){
            // We don't have to check for duplicates since we use a set, no list.
            roleNames.add(transaction.fromRole);
            roleNames.add(transaction.toRole);
        }
    }
}
