package nl.florianslob.modelchecking.sandbox.protocolimplementations;

import nl.florianslob.modelchecking.sandbox.ISandboxingActivity;

public class ProtocolImplementationsSandboxActivity implements ISandboxingActivity {
    @Override
    public void runActivity() {
        System.out.println("Starting protocol implementation sandboxing activity");

//        Chess.play(true);
//        SomeNonDeterministicGame.play(true);

        ChessWithGenericParticipant.play(true);

    }
}
