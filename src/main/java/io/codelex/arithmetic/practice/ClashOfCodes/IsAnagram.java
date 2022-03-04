package io.codelex.arithmetic.practice.ClashOfCodes;

import java.util.Arrays;
import java.util.Scanner;

public class IsAnagram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String string1 = input.nextLine();
        String string2 = input.nextLine();




       char[] ch1 = string1.toCharArray();
       char[] ch2 = string2.toCharArray();


        Arrays.sort(ch1);
        Arrays.sort(ch2);
        if (Arrays.equals(ch1,ch2) && ch1.length == ch2.length)
            System.out.println("Poligrom");
        else System.out.println("NOT Poligrom");







    }
}
