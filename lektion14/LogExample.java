import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

// when using slf4j simple, you can configure output file
// using system property org.slf4j.simpleLogger.logFile
// ie java -Dorg.slf4j.simpleLogger.logFile=thefile.log ...

public class LogExample {
    static final Logger logger =
                    LoggerFactory.getLogger(LogExample.class);

    public static void main(String[] args) {
        int someData = 3;
        logger.debug("Detta är debuginfo");
        logger.info("Detta är bra information");
        logger.warn("Detta är en varning med data: {}", 
                    someData);
    }
}
