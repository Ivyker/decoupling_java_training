package fr.lernejo.guessgame;

import fr.lernejo.logger.Logger;
import fr.lernejo.logger.LoggerFactory;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;
import java.util.Date;

public class Simulation {

    private final Logger logger = LoggerFactory.getLogger("simulation");
    private final Player player;  //TODO add variable type
    private int numberToGuess; //TODO add variable type

    public Simulation(Player player) {
        //TODO implement me
        this.player = player;

    }

    public void initialize(long numberToGuess) {
        //TODO implement me
        Random rand = new Random();
        this.numberToGuess = rand.nextInt(100);
    }

    /**
     * @return true if the player have guessed the right number
     */
    private boolean nextRound() {
        //TODO implement me
        Scanner scanner = new Scanner(System.in);
        int numberPlayer = scanner.nextInt();
        scanner.nextLine();

        if (numberPlayer==numberToGuess){
            logger.log("Bravo vous avez trouvé l'âge du capitaine");
            return true;
        }
        else if (numberPlayer > numberToGuess) {
            logger.log("L'âge du capitaine est inférieur à "+numberPlayer);
            return false;
        }
        else {
            logger.log("L'âge du capitaine est supérieur à "+numberPlayer);
            return false;
        }

    }

    public void loopUntilPlayerSucceed(long maxIterations) {
        //TODO implement me
        DateFormat dateFormat = new SimpleDateFormat("mm:ss:SSS");
        long time = System.currentTimeMillis();
        long counter = 0;
        while (nextRound()!=true) {
            nextRound();
            counter = maxIterations --;
        }
        long executionTime = System.currentTimeMillis() - time;
        Date date = new Date(executionTime);
        logger.log("Execution time: "+ dateFormat.format(date));

        if (nextRound()==true){
            logger.log("Player has found the number in " + counter + " iterations");
        }
        else {
            logger.log("Player has not found the number within " + maxIterations +
                " iterations");
        }

    }
}
