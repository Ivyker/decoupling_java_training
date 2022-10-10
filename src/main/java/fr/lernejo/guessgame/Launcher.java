package fr.lernejo.guessgame;

import java.security.SecureRandom;
import java.sql.SQLOutput;

public class Launcher {



    public static void main (String args[]){


        HumanPlayer humanPlayer = new HumanPlayer();
        Simulation simulation = new Simulation(humanPlayer);
        //loopUntilPlayerSucceed();

        if (args[0].equals("-interactive")){
            simulation.loopUntilPlayerSucceed(Long.MAX_VALUE);
        }
        else if (args[0].equals("-auto")) {
            ComputerPlayer computerPlayer = new ComputerPlayer();
            Simulation simul = new Simulation(computerPlayer);
            simul.initialize(Long.parseLong(args[1]));
            simul.loopUntilPlayerSucceed(1000);
        }
        else{
            System.out.println("Two ways to launch the programme: ");
            System.out.println("args: -interactive");
            System.out.println("args: -auto");

        }


    }

}
