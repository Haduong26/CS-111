package Homework10;

import java.util.Scanner;
public class DiceHistogram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("How many rolls?");        
        int roll = input.nextInt();

 
        int total = 0;
        int numAsterisks;
        int dice2;
        int dice1; 
        int[] frequency = new int[13];

        for (int i=0; i<=roll; i++){

            dice2 = (int)(Math.random()*6) + 1;
            dice1 = (int)(Math.random()*6) + 1;
            total = dice2 + dice1;
            frequency[total]++;
        }
        System.out.println("Total number of rolls = " + frequency[total]);

        for(int j = 2; j<=frequency.length; j++){
            numAsterisks = 60 * frequency[j] / roll; 
            System.out.print(j);
            for(int k = 0; k < numAsterisks; k++){
                System.out.print("*");
            }
            System.out.println("");              
        }
        
        }

    }

