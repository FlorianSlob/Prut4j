package program;

public class Main {
    public static void main(String[] args) {
        // Override args for testing purposes.
        var BTArs = new String[]{"class=W", "-np22"};

        // execute a couple of times
        for(int i = 0; i < 1; i++){
            System.out.println("Executing original benchmark.");
            NPB3_0_JAV.BT.main(BTArs);

            System.out.println("Executing update benchmark.");
            NPB.updated.NPB3_0_JAV.BT.main(BTArs);
        }

    }
}
