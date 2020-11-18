package program;

public class Main {
    public static void main(String[] args) {
        // Override args for testing purposes.
        // Problem classes to choose from: S,W,A,B,C,D,E,F
        var BTArgs = new String[]{"class=B", "-np3"};
        var BTArgsWithStrict = new String[]{"class=B", "-np3", "-strict"};
//
        System.out.println("Executing original benchmark.");
        NPB.original.NPB3_0_JAV.CG.main(BTArgs);

//        System.out.println("Executing update benchmark.");
//        NPB.updated.NPB3_0_JAV.CG.main(BTArgs);

        System.out.println("Executing update benchmark (Strict).");
        NPB.updated.NPB3_0_JAV.CG.main(BTArgsWithStrict);
    }
}
