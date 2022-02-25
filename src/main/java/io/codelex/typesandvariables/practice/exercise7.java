package io.codelex.typesandvariables.practice;
import java.util.Scanner;

public class exercise7 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char character = 'a';
        int uppercaseCount = 0;
        System.out.println("Input your string");
        String inputtedString = input.nextLine();

        for (int i = 0; i <= inputtedString.length() -1; i++) {
            character = inputtedString.charAt(i);
            if (Character.isUpperCase(character)) {
                uppercaseCount ++;
            }
        }
        System.out.println(uppercaseCount + " uppercase characters detected ir your string.");

    }
}
