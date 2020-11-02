package program;

public class Main {
    public static void main(String[] args) {
        // Override args for testing purposes.
        // Problem classes to choose from: S,W,A,B,C,D,E,F
        var BTArgs = new String[]{"class=B", "-np1"};

        System.out.println("Executing original benchmark.");
        NPB.original.NPB3_0_JAV.MG.main(BTArgs);
//
        System.out.println("Executing update benchmark.");
        NPB.updated.NPB3_0_JAV.MG.main(BTArgs);
    }
}
