package Homework5;

import java.util.Scanner;
public class ChuckALuck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Place your bet on a number 1-6:");
        int bet = input.nextInt();
        if (bet < 7 && bet > 0) {
            int roll;
            int count = 0;
            System.out.print( "Roll: ");
            for (int i = 1; i <= 3; i++) {
                roll = (int) (1 + Math.random() * 6);
                if (i == 3) {
                    System.out.print(roll + " ");
                }
                else {
                    System.out.print(roll + ", ");
                }
                if (roll == bet) {
                    count ++ ;
                }
            }
            if (count > 0) {
                System.out.println("--> The banker pays you " + count+ " to 1!");
            }
            else {
                System.out.println("--> You lose your stake.");
            }

        }    
        else {
            System.out.println("Invalid bet.");
        }

        
    }
}
