package Homework2;

import java.util.Scanner;
import java.lang.Math;

public class FutureValue {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter investment amount:");
        double invest = input.nextDouble();
    
        System.out.println("Enter annual interest rate in percentage:");
        double interest = input.nextDouble();
        double monthlyInt = interest/12;
    
        System.out.println(" Enter number of years:");
        int year = input.nextInt();

        double futureValue = Math.round(invest*(Math.pow(1+monthlyInt, year*12)));
        System.out.println("Future value is: %s " + futureValue/100);
    }
}
