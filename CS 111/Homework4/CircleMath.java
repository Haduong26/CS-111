package Homework4;

import java.util.Scanner;

public class CircleMath {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Radius?");
        float rad = input.nextFloat();
        
        System.out.printf("%f\n", rad*2);
        System.out.printf("%f\n", Math.PI * (2 * rad));
        System.out.printf("%f\n", Math.PI * Math.pow(rad, 2));
        
    }

}
