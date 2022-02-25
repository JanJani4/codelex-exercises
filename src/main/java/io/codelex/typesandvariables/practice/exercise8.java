package io.codelex.typesandvariables.practice;
import java.util.Scanner;
public class exercise8 {
    public static void main(String[] args) {

        double minutesInYear = 60 * 24 * 365;

        Scanner input = new Scanner(System.in);
        System.out.println("Input minutes");
        double min = input.nextDouble();

        long years = (long) (min / minutesInYear);
        int days =  (int)(min / 60 / 24) % 365;

        System.out.println("Inputted minutes is equal to " + years + " years and " + days + " days" );

    }
}
