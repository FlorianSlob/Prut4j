package nl.florianslob.model.checking.sandbox.modelchecking.datastructure;

public class NodeRelation {

    public final String fromNodeHashingNumber;
    public final String toNodeHashingNumber;
    public NodeRelation(String fromNodeHashingNumber, String toNodeHashingNumber){
        this.fromNodeHashingNumber = fromNodeHashingNumber;
        this.toNodeHashingNumber = toNodeHashingNumber;
    }
}
