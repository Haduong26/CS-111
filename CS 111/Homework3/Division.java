package Homework3;

import java.util.Scanner;

public class  Division {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(" Enter an integer:");
        int int1 = input.nextInt();
        int int2 = input.nextInt();
        
        double result1 = (double) int1/int2;
        System.out.println("Floating point division: " + result1 );
        System.out.println("Floating point division: " + int1%int2 );
        

    }
    
}