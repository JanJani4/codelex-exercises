package io.codelex.loops.practice;
import java.util.Scanner;

public class exercise5 {


    public static void main(String[] args){

        String firstWord;
        String secondWord;
        String result;
        String dots;

        int difference = 0;
        int resultLength;
        int i;

        Scanner in = new Scanner(System.in);
        System.out.println("Input first word.");
        firstWord = in.next();
        System.out.println("Input second word.");
        secondWord = in.next();

        result = firstWord + "" + secondWord;
        resultLength = result.length();
        dots = "";

        if (resultLength < 30) {
            difference = 30 - resultLength;


        for (i = 1; i < difference; i++){
            dots +=".";
        }
        System.out.println(firstWord + dots + secondWord);

        } else System.out.println(firstWord + secondWord);



    }
}
