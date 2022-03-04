package io.codelex.arithmetic.practice;
public class exercise6 {
    public static void main(String[] args) {


        for (int i = 1; i <= 110; i++){
            boolean number = true;
            System.out.print(" ");

            if (i % 3 == 0){
                System.out.print("Coza");
                number = false;
            }
            if (i % 5 == 0){
                System.out.print("Loza");
                number = false;
            }
            if (i % 7 == 0){
                System.out.print("Woza");
                number = false;
            }
            if (number) {
                System.out.print(i);
            }
            if (i % 11 == 0) {
                System.out.println();
            }
        }

    }
}
