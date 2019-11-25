package nl.florianslob.model.checking.sandbox;

/**
 *
 * @author FlorianSlob
 */
public class LoggingHelper {

    public static int loggingLevel = LoggingLevel.DEBUG;

    public static void logDebug(String log) {
        if (loggingLevel >= LoggingLevel.DEBUG) {
            System.out.println(log);
        }
    }

    public static void logInfo(String log) {
        if (loggingLevel >= LoggingLevel.INFO) {
            System.out.println(log);
        }
    }
}
