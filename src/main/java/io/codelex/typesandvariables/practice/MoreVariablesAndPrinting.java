package io.codelex.typesandvariables.practice;
import java.math.RoundingMode;
import java.text.DecimalFormat;

public class MoreVariablesAndPrinting {
    private static final DecimalFormat df = new DecimalFormat("0.00");
    public static void main(String[] args) {
        String name;
        String eyes;
        String teeth;
        String hair;
        int age;
        int height;
        int weight;


        name = "Zed A. Shaw";
        age = 35;
        height = 74;  // inches
        weight = 180; // lbs
        eyes = "Blue";
        teeth = "White";
        hair = "Brown";
        double heightCm = height * 2.74;
        double weightKg = weight * 0.453592;



        System.out.println("Let's talk about " + name + ".");
        System.out.println("He's " + df.format(heightCm) + " cm tall.");
        System.out.println("He's " + df.format(weightKg) + " kg heavy.");
        System.out.println("Actually, that's not too heavy.");
        System.out.println("He's got " + eyes + " eyes and " + hair + " hair.");
        System.out.println("His teeth are usually " + teeth + " depending on the coffee.");

        System.out.println("If I add " + age + ", " + df.format(heightCm) + ", and " + df.format(weightKg)
                + " I get " + (age + df.format(heightCm) + df.format(weightKg)) + ".");


    }
}