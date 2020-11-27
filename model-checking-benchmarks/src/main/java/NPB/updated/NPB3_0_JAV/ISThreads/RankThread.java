/*
!-------------------------------------------------------------------------!
!									  !
!	 N  A  S     P A R A L L E L	 B E N C H M A R K S  3.0	  !
!									  !
!			J A V A 	V E R S I O N			  !
!									  !
!                         R a n k T h r e a d                             !
!                                                                         !
!-------------------------------------------------------------------------!
!                                                                         !
!    RankThread implements thread for RankThread subroutine of IS         !    
!    benchmark.                                                           !
!									  !
!    Permission to use, copy, distribute and modify this software	  !
!    for any purpose with or without fee is hereby granted.  We 	  !
!    request, however, that all derived work reference the NAS  	  !
!    Parallel Benchmarks 3.0. This software is provided "as is" 	  !
!    without express or implied warranty.				  !
!									  !
!    Information on NPB 3.0, including the Technical Report NAS-02-008	  !
!    "Implementation of the NAS Parallel Benchmarks in Java",		  !
!    original specifications, source code, results and information	  !
!    on how to submit new results, is available at:			  !
!									  !
!	    http://www.nas.nasa.gov/Software/NPB/			  !
!									  !
!    Send comments or suggestions to  npb@nas.nasa.gov  		  !
!									  !
!	   NAS Parallel Benchmarks Group				  !
!	   NASA Ames Research Center					  !
!	   Mail Stop: T27A-1						  !
!	   Moffett Field, CA   94035-1000				  !
!									  !
!	   E-mail:  npb@nas.nasa.gov					  !
!	   Fax:     (650) 604-3957					  !
!									  !
!-------------------------------------------------------------------------!
! Translation to Java and MultiThreaded Code				  !
!	   M. Frumkin							  !
!	   M. Schultz							  !
!-------------------------------------------------------------------------!
*/
package NPB.updated.NPB3_0_JAV.ISThreads;
import NPB.updated.NPB3_0_JAV.*;
import discourje.examples.npb3.impl.DoneMessage;
import discourje.examples.npb3.impl.ExitMessage;
import discourje.examples.npb3.impl.ISThreads.RankMessage;
import nl.florianslob.modelchecking.base.api.v2.IEnvironment;
import nl.florianslob.modelchecking.base.api.v2.IProtocol;

public class RankThread extends ISBase {
    private final IEnvironment environment;
    public int id;
    protected int local_hist[];
    int start, end;
    int rstart, rend;

    public boolean done=true;
    public static int iteration=0;
    public int state;

    public RankThread(IS is, int Id, int s1, int e1, int s2, int e2, IEnvironment environment, IProtocol protocol) {
        super(protocol);
        Init(is);
        master=is;
        id=Id;
        start=s1;
        end=e1;
        rstart=s2;
        rend=e2;
        local_hist = new int[MAX_KEY];
        state=0;
        setPriority(MAX_PRIORITY);
        setDaemon(true);
        this.environment = environment;
    }
    void Init(IS is){
        //initialize shared data
        num_threads=is.num_threads;
        MAX_KEY=is.MAX_KEY;

        key_array=is.key_array;
        test_index_array=is.test_index_array;
        master_hist=is.master_hist;
        partial_verify_vals=is.partial_verify_vals;
    }

    public void run() {
        for (; ; ) {
//        synchronized(this){
//          while(done==true){
//        	try{
//        	  wait();
//        	  synchronized(master){ master.notify();}
//        	}catch(InterruptedException ie){}
//          }
            try {
                Object o = environment.receive();
                if (o instanceof RankMessage) {
                    switch (state) {
                        case 0:
                            step1();
                            state = 1;
                            break;
                        case 1:
                            step2();
                            state = 0;
                            break;
                    }
                    environment.send(new DoneMessage());
                }
                if (o instanceof ExitMessage) {
                    environment.send(new DoneMessage());
                    return;
                }
            } catch (Exception e) {
                e.printStackTrace();
                System.exit(0);
            }
//  	  synchronized(master){done=true;master.notify();}
//        }
        }
    }

    protected void step1(){
//  protected synchronized void step1(){
        key_array[iteration] = iteration;
        key_array[iteration+MAX_ITERATIONS] = MAX_KEY - iteration;
        for(int i=0; i<TEST_ARRAY_SIZE; i++ ){
            partial_verify_vals[i] = key_array[test_index_array[i]];
        }

        for(int i=0;i<MAX_KEY;i++) local_hist[i]=0;
        for(int i=start; i<=end; i++ ) local_hist[key_array[i]]++;
        for(int i=0; i<MAX_KEY-1; i++ ) local_hist[i+1] += local_hist[i];
    }

    public void step2(){
        //Parallel calculation of the master's histogram
        for(int i=rstart;i<=rend;i++){
            for(int j=0;j<num_threads;j++){
                master_hist[i]+=rankthreads[j].local_hist[i];
            }
        }
    }
}
