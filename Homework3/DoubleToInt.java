package Homework3;

import java.util.Scanner;

public class DoubleToInt {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter a double value");
        double value = input.nextDouble();
        
        System.out.println((int)value);
        System.out.println(Math.round(value));
        System.out.println((int)Math.floor(value));
        System.out.println((int)Math.ceil(value));

    }
}
