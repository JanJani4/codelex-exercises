package io.codelex.typesandvariables.practice;
import java.util.Scanner;
public class exercise9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Input distance in meters");
        int distance = input.nextInt();

        System.out.println("Input hours");
        int hours = input.nextInt();

        System.out.println("Input minutes");
        int minutes = input.nextInt();

        System.out.println("Input seconds");
        int seconds = input.nextInt();

        float timeInSeconds = (hours * 3600) + (minutes * 60) + seconds;
        float metersPerSecond = distance / timeInSeconds;
        float kmPerHour = (distance / 1000) / (timeInSeconds / 3600);
        float milesPerHour = kmPerHour / 1609;

        System.out.println("Your speed in meters/second  " + metersPerSecond);
        System.out.println("Your speed in km/h  " + kmPerHour );
        System.out.println("Your speed in miles/h " + milesPerHour );




    }
}
