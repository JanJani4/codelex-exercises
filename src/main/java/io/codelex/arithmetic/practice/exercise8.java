package io.codelex.arithmetic.practice;

public class exercise8 {

    public static double totalPay(double basePay, double hoursWorked){
        int normalHours = 40;
        double overHours = 0;
        double salary = 0;

        if (basePay < 8 || hoursWorked > 60){
            System.out.println("Error");
        }
        else if (hoursWorked > normalHours) {
            overHours = hoursWorked - normalHours;
            salary = (normalHours * basePay) + (overHours * (basePay * 1.5));
        }
        else if (hoursWorked <= normalHours){
           salary = basePay * hoursWorked;
        }
        return salary;
    }


    public static void main(String[] args){

    }
}
