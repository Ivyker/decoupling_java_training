package fr.lernejo.logger;

import java.util.function.Predicate;
public class LoggerFactory {

    public LoggerFactory(String player) {
        Predicate<String> condition = message->message.contains("simulation");
        return new ContextualLogger(name, new CompositeLogger(new ConsoleLogger(), new FilteredLogger(new FileLogger("logs"), condition)));
    }

    public static Logger getLogger(String name){

    }

}
