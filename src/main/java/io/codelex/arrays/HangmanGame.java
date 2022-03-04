package io.codelex.arrays;
import java.util.Scanner;
import java.util.Random;

public class HangmanGame {


    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

       //String[] words = {"apple", "dog", "smile", "magic", "party", "summer", "volcano", "instagram", "mountain"};

        String word = "apple"; //(words);

        int attemptsCount = 3;

        String incorrectLetters = "";
        String guessedLetters = "";

        int attempts = 0;
        while (attempts <= attemptsCount){
            printTurn(word,guessedLetters,incorrectLetters);
            String guess = keyboard.nextLine();
            if(guessedLetters.toUpperCase().contains(guess.toUpperCase())){
                if(!guessedLetters.toUpperCase().contains(guess.toUpperCase())){
                    guessedLetters += guess;
                } else {
                    incorrectLetters += guess;
                    attempts++;
                }
                if(playerWon(word,guessedLetters)){
                    System.out.println("You win");
                    System.out.println(word);
                    break;
                }
            }
            if (!playerWon(word,guessedLetters)){
                System.out.println("You loose try another word.");
            }
        }


    }

    public static String randomWords(String[] words) {
        Random random = new Random();
        return words[random.nextInt(0, 9)];
    }


    public static void printWord(String word, String guessedLetters) {
        for (char a : word.toCharArray()) {
            if (guessedLetters.toUpperCase().contains(String.valueOf(a).toUpperCase())) {
                System.out.println(a);
            } else {
                System.out.print('_');
            }
        }
        System.out.println();
    }
    public static boolean playerWon(String word, String guessedLetters){
        boolean hasWon = true;
        for (char a : word.toCharArray()) {
            if (!guessedLetters.contains(String.valueOf(a))){
                hasWon = false;
                break;
            }
        }
        return hasWon;
    }


    public static void printTurn(String word, String guessedLetter, String incorrectLetters){
        System.out.println("==========================");
        System.out.println("Word:");
        printWord(word,guessedLetter);
        System.out.println("Misses: " + incorrectLetters);
        System.out.println("Guess");
        System.out.println("==========================");
    }
}








