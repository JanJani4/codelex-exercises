package io.codelex.arithmetic.practice;
import java.util.Scanner;
public class exercise5 {
    public static void main(String[] args) {

        double random = Math.random();
        double x = random * 100;
        int randomNum = (int) x + 1;


        Scanner input = new Scanner(System.in);
        System.out.println("Input your number from 1 - 100 and let`s see if it is the same with our number");
        int userNumber = input.nextInt();

        if (randomNum == userNumber ) {
            System.out.println("Congratulations you are that`s wright." );
        }
        else if (randomNum > userNumber) {
            System.out.println("Sorry, you are to low. I was thinking of  " + randomNum);
        }
        else if (randomNum < userNumber){
            System.out.println("Sorry, you are to high. I was thinking of  " + randomNum);
        }

    }
}
