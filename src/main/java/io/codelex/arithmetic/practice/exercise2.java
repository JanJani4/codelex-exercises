package io.codelex.arithmetic.practice;
import java.util.Scanner;
public class exercise2 {

    public static void main(String[] args){
        int num;
        Scanner input = new Scanner(System.in);
        System.out.println("Input number");
        num = input.nextInt();


        if (num % 2 == 0){
            System.out.println("Your number is even");
        }
        else System.out.println("Your number is odd ");

        System.out.println("Buy");

    }
}
