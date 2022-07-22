package Homework3;

import java.util.Scanner;
public class  WindChill {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Degrees Fahrenheit?");
        double t = input.nextDouble();
        
        System.out.println("Wind miles per hour?");
        double v = input.nextDouble();

        System.out.println("The wind chill temperature is: " + String.format( "%.2f", 35.74 + 0.6215 * t - Math.pow(35.75 * v, 0.16)+ 0.4275 * t * Math.pow(v, 0.16)) + " degrees Fahrenheit.");

    }
}
