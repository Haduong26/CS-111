package Homework5;

import java.util.Scanner;
public class PentagonArea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the length from the center to a vertex:");
        float r = input.nextFloat();
        float s = (float) (2*r*Math.sin(Math.PI/5));

        System.out.printf("%.2f", (5* Math.pow(s, 2))/ (4* Math.tan(Math.PI/5)) );
        System.out.println(" ");
        
    }
}
