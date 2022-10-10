package fr.lernejo.logger;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.text.DateFormat;
import java.util.Date;

public class ContextualLogger implements Logger{

    private String callerClass;
    private Logger delegateLogger;

    public ContextualLogger(String callerClass, Logger delegateLogger){
        this.delegateLogger = delegateLogger;
        this.callerClass = callerClass;
    }
    @Override
    public void log(String message) {
        String format = "yyyy-MM-dd HH:mm:ss.SSS";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(format);
        delegateLogger.log(LocalDateTime.now().format(formatter) + " " + callerClass + " " + message);
    }

}
