package Homework9;

import java.util.Scanner;
public class GCD {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Integer a?");        
        int a = input.nextInt();
        System.out.println("Integer b?");
        int b = input.nextInt();
        while (a != b) {
            if(a > b)
                a = a - b;
            else
                b = b - a;
        }
        System.out.printf("Greatest common divisor of a and b: %d", b);
        System.out.println();

    }
}

