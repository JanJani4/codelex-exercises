package io.codelex.loops.practice;

import java.util.Scanner;
import java.util.Random;

public class Pige {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random random = new Random();

        int randomNum;
        int playerScore = 0;
        boolean rollAgain;
        String response;
        rollAgain = true;

        System.out.println("Welcome to the Piglet!");

        do {
            randomNum = random.nextInt(1, 7);
            System.out.println("You rolled " + randomNum);

            if (randomNum == 1) {
                playerScore = 0;
                System.out.println("You rolled 1!");
                System.out.println("You got 0 points");
                rollAgain = false;


            } else {
                playerScore += randomNum;
                System.out.println("Roll again?");
                response = in.nextLine();


                if (response.equals("yes")) {
                    System.out.println("You rolled  " + randomNum);
                } else if (response.equals("no")) {
                    System.out.println("You got " + playerScore + " points");
                    rollAgain = false;
                }

            }


        } while (rollAgain);
    }
}
