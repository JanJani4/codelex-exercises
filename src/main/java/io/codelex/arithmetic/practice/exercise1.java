package io.codelex.arithmetic.practice;
import java.util.Scanner;
public class exercise1 {
    public static boolean isFifteen(int y, int x) {
        if(x == 15 || y == 15){
            return true;
        }
        else if (x - y == 15 || y - x == 15 ){
            return true;
        }
        else if (x + y == 15)
            return true;

        else return false;

    }

    public static void main(String[] args){
        System.out.println(isFifteen(5,10));

    }
}
