package nl.florianslob.model.checking.sandbox.onthefly.datastructure;

/**
 *
 * @author FlorianSlob
 */
public class TemporalProperty {
    public String content;

    public TemporalProperty(String content) {
        this.content = content;
    }
    
    public void Print(){
        System.out.println("Property: "+content);
    }
}
