package fr.lernejo.guessgame;


import fr.lernejo.logger.Logger;
import fr.lernejo.logger.LoggerFactory;
import java.util.Scanner;

public class HumanPlayer implements Player{

    Logger logger =  LoggerFactory.getLogger("Player");

    @Override
    public long askNextGuess() {
        return 0;
    }

    @Override
    public void respond(boolean lowerOrGreater) {

    }
}
