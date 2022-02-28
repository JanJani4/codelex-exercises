package io.codelex.loops.practice;
import java.util.Scanner;
import java.util.Random;

public class RollTwoDice {
    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);
        Random random = new Random();

        int desiredSum = 0;
        int firstDice = 0;
        int secondDice = 0;
        int rollSum = 0;
        boolean keepRolling;

        System.out.println("Input number from 2 to 12");
        desiredSum = in.nextInt();
        keepRolling = true;


        do {
            firstDice = random.nextInt(1,7);
            secondDice = random.nextInt(1,7);
            rollSum = firstDice + secondDice;
            System.out.println(firstDice + " and " + secondDice +
                    " = " + rollSum);
            if (desiredSum > 12 || desiredSum < 2)
                keepRolling = false;

            else if (desiredSum == rollSum){
                System.out.println(firstDice + " and " + secondDice +
                        " = " + rollSum);
                keepRolling = false;
            }


        } while (keepRolling);

    }
}
