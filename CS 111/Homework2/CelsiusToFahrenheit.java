package Homework2;

import java.util.Scanner;
public class CelsiusToFahrenheit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println(" Enter a degree in Celsius:");
        double celDe = input.nextDouble();
        double fahDe = (9.0/5) * celDe +32;
        
        System.out.println(celDe + " Celsius is " + fahDe + " Fahrenheit");
    }
}
