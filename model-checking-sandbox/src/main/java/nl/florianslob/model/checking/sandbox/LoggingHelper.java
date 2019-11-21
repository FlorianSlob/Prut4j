package nl.florianslob.model.checking.sandbox;

/**
 *
 * @author FlorianSlob
 */
public class LoggingHelper {

    public static boolean isDebuggingEnabled = false;

    public static void logDebug(String log) {
        if (isDebuggingEnabled) {
            System.out.println(log);
        }
    }

    public static void logInfoLine(String log) {
        System.out.println(log);
    }

    public static void logInfo(String log) {
        System.out.print(log);
    }
}
