package nl.florianslob.model.checking.sandbox.protocolimplementations;

import nl.florianslob.model.checking.sandbox.ISandboxingActivity;

public class ProtocolImplementationsSandboxActivity implements ISandboxingActivity {
    @Override
    public void runActivity() throws Exception {
        System.out.println("Starting protocol implementation sandboxing activity");

        Chess.play(true);
        //SomeNonDeterministicGame.play();
    }
}
