package io.codelex.loops.practice;

import java.util.Scanner;

public class NumberSquare {
    public static void main(String[] args){

        int min;
        int max;

        Scanner in = new Scanner(System.in);
        System.out.println("Input min value.");
        min = in.nextInt();
        System.out.println("Input max value");
        max = in.nextInt();

        for (int i = min; i <= max; i++){

            for (int j = i; j <= max; j++){
                System.out.print(j);
            }
            for (int k = 0; k < i - min; k++){
                System.out.print(k + min);
            }
            System.out.println();

        }
    }
}
