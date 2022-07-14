package Homework9;

import java.util.Scanner;
public class Divisors {
    public static void main(String[] args) {
        System.out.println("Largest integer?");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        for (int i = 1; i <= n ; i++) {
            System.out.print(i + ": ");
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();

    }
    }
}
