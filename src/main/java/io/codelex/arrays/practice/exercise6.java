package io.codelex.arrays.practice;
import java.util.Arrays;
import java.util.Random;

public class exercise6 {


    public static void main(String[] args){

        Random random = new Random();
        int[] array = new int[10];
        int[] copy = new int[array.length];
        int i;
        int j;

        for (i = 0; i < array.length; i++){
            array[i] = random.nextInt(1,101);
        }
        for (j = 0; j < array.length; j++){
            copy[j] = array[j];
        }
        array[array.length - 1] = -7;


        System.out.println("Array 1: " + Arrays.toString(array));
        System.out.println("Array 2: " + Arrays.toString(copy));

    }

}
