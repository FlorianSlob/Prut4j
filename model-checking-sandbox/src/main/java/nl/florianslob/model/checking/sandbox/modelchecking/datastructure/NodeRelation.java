package nl.florianslob.model.checking.sandbox.modelchecking.datastructure;

public class NodeRelation {

    public String fromNodeHashingNumber;
    public String toNodeHashingNumber;
    public NodeRelation(String fromNodeHashingNumber, String toNodeHashingNumber){
        this.fromNodeHashingNumber = fromNodeHashingNumber;
        this.toNodeHashingNumber = toNodeHashingNumber;
    }
}
