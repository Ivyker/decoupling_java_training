package fr.lernejo.guessgame;

import fr.lernejo.logger.Logger;
import fr.lernejo.logger.LoggerFactory;

public class ComputerPlayer implements Player{

    private final Logger logger = LoggerFactory.getLogger("computer");
    private long min = Long.MIN_VALUE;
    private long max = Long.MAX_VALUE;


    @Override
    public long askNextGuess() {
        return (min+max)/2;
    }

    @Override
    public void respond(boolean lowerOrGreater) {
        if (lowerOrGreater){
            logger.log("The age of the captaine is greater.");
            min = askNextGuess();
        }
        else {
            logger.log("The age of the captaine is lower.");
            max = askNextGuess();
        }

    }
}
