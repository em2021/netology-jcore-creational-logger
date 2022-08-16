import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Logger {
    protected int num = 1;
    protected String datePattern = "dd.MM.yyyy HH:mm:s";
    private static Logger logger = null;

    private Logger() {
        logger = this;
    }

    public static Logger getInstance() {
        if (logger == null) logger = new Logger();
        return logger;
    }

    void log(String msg) {
        System.out.println("[" + LocalDateTime.now()
                .format(DateTimeFormatter
                        .ofPattern(datePattern)) + " " + num++ + "] " + msg);
    }
}