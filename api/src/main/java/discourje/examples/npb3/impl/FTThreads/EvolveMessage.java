package discourje.examples.npb3.impl.FTThreads;

public class EvolveMessage {
    public final int kt;

    public EvolveMessage(int kt) {
        this.kt = kt;
    }

    public static Object GetTestDummyObject(){
        return new EvolveMessage(0);
    }
}
