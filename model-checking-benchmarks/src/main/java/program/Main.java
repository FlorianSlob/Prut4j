package program;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        if(args == null || args.length == 0){
            // Problem classes to choose from: S,W,A,B,C,D,E,F
//            args = new String[]{"-runOriginalBenchmark","-BM=CG-alt","class=B", "-np2"};
            args = new String[]{"-runUpdatedBenchmark","-runOriginalBenchmark","-BM=FT","class=A", "-np24"};
        }

        boolean runOriginalBenchmark = Arrays.asList(args).contains("-runOriginalBenchmark");
        boolean runUpdatedBenchmark = Arrays.asList(args).contains("-runUpdatedBenchmark");
        boolean runCG = Arrays.asList(args).contains("-BM=CG"); // DONE
        boolean runCG_Alt = Arrays.asList(args).contains("-BM=CG-alt");
        boolean runFT = Arrays.asList(args).contains("-BM=FT"); // Fail....
        boolean runIS = Arrays.asList(args).contains("-BM=IS"); // DONE
        boolean runMG = Arrays.asList(args).contains("-BM=MG"); // DONE

        if(!runOriginalBenchmark && !runUpdatedBenchmark){
            System.out.println("Unable to start benchmark. Pass one or both parameters ('-runOriginalBenchmark' 'runUpdatedBenchmark') ");
            System.exit(0);
        }

        if(!runCG && !runFT && !runIS && !runMG & !runCG_Alt){
            System.out.println("No benchmark is selected. Choose one or more benchmarks to run by passing one or more of the following parameters:" +
                    "\n" +
                    "'-BM=CG' \n" +
                    "'-BM=CG-alt' \n" +
                    "'-BM=FT' \n" +
                    "'-BM=IS' \n" +
                    "'-BM=MG' \n" +
                    " ");
            System.exit(0);
        }

        if(runOriginalBenchmark){
            System.out.println("Executing original benchmark.");
            if(runCG || runCG_Alt){
                NPB.original.NPB3_0_JAV.CG.main(args);
            }
            if(runFT){
                NPB.original.NPB3_0_JAV.FT.main(args);
            }
            if(runIS){
                NPB.original.NPB3_0_JAV.IS.main(args);
            }
            if(runMG){
                NPB.original.NPB3_0_JAV.MG.main(args);
            }
        }

        if(runUpdatedBenchmark){
            System.out.println("Executing update benchmark.");
            if(runCG_Alt){
                NPB.updated.NPB3_0_JAV.CG_alt.main(args);
            }
            if(runCG){
                NPB.updated.NPB3_0_JAV.CG.main(args);
            }
            if(runFT){
                NPB.updated.NPB3_0_JAV.FT.main(args);
            }
            if(runIS){
                NPB.updated.NPB3_0_JAV.IS.main(args);
            }
            if(runMG){
                NPB.updated.NPB3_0_JAV.MG.main(args);
            }
        }
    }
}
