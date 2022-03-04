package io.codelex.arrays.practice;

public class Exercise5 {

    //TODO: Write a Java program to find the index of an array element.
    public static void main(String[] args) {
        int[] myArray = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};

        //int indexOfElement36 = -1;
        //int indexOfElement29 = -1;

        //Expected output:
        //Index position of 36 is: 4
        //Index position of 29 is: 8



        System.out.println("Index position of 36 is: " + findIndexOf(myArray,36));
        System.out.println("Index position of 29 is: " + findIndexOf(myArray,29));

    }
    public static int findIndexOf(int[] array,int num){

        int i = 0;
        while (i < array.length){
            if(array[i] == num){
                return i;
            } else {
                i++;

            }
        }
        return -1;
    }
}
