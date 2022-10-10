package fr.lernejo.logger;

public class CompositeLogger implements Logger{

    private Logger logger;
    private Logger log;

    public CompositeLogger(Logger logger, Logger log){
        this.log = log;
        this.logger = logger;
    }

    @Override
    public void log(String message) {
        logger.log(message);
        log.log(message);
    }
}
