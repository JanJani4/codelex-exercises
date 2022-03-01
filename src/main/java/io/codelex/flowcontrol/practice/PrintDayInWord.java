package io.codelex.flowcontrol.practice;
import java.util.Scanner;
public class PrintDayInWord {

    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        System.out.println("Input number from 0 to 6");
        int numOfDay = in.nextInt();

        if(numOfDay >= 0 && numOfDay <=6){
            switch (numOfDay) {
                case 0 -> System.out.println("Monday");
                case 1 -> System.out.println("Tuesday");
                case 2 -> System.out.println("Wednesday");
                case 3 -> System.out.println("Thursday");
                case 4 -> System.out.println("Friday");
                case 5 -> System.out.println("Saturday");
                case 6 -> System.out.println("Sunday");
            }
        } else System.out.println("Not a valid day.");

    }
}
