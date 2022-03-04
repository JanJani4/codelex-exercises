package io.codelex.arithmetic.practice;
import java.util.Scanner;
public class exercise9 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Input your weight in kilograms");
        int weightKg = input.nextInt();
        System.out.println("Input your height in centimeters");
        int heightCm = input.nextInt();

        double weightPound = weightKg * 2.205;
        double heightInch = heightCm /  2.54;
        double indexBmi = weightPound * 703 / (heightInch * heightInch);

        if (indexBmi < 18.5){
            System.out.println("Your weight is to small, try to get more calories during the day.");
        } else if (indexBmi > 25){
            System.out.println("Your weight is above the limit, try to reduce amount of calories per day.");
        } else System.out.println("Your weight is optimal for your height.");

    }
}
