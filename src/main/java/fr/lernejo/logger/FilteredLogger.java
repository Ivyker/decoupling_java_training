package fr.lernejo.logger;

import java.util.function.Predicate;

public class FilteredLogger implements Logger{
    private Logger delegate;
    private Predicate<String> condition;

    public FilteredLogger(Logger delegate, Predicate<String> condition){
        this.delegate = delegate;
        this.condition = condition;
    }
    @Override
    public void log(String message) {

    }
}
