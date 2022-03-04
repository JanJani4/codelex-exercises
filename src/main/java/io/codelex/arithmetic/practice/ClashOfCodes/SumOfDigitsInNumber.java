package io.codelex.arithmetic.practice.ClashOfCodes;

public class SumOfDigitsInNumber {
    public static void main(String[] args){
        int num = 434;
        int lastDigit = 0;
        int sum = 0;

        while (num > 0){
            lastDigit = num % 10;
            sum += lastDigit;
            num = num / 10;
        }
        System.out.println(sum);
    }
    }

