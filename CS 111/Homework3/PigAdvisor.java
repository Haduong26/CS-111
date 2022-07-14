package Homework3;

import java.util.Scanner;

public class PigAdvisor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Player's score?");
        int playerScore = input.nextInt();
        
        System.out.println("Opponent's score?");
        int oppenentScore = input.nextInt();

        System.out.println("Turn total?");
        int turnTotal = input.nextInt();
        float v = (float) (oppenentScore-playerScore)/8;

        if (playerScore + turnTotal >= 100) 
            System.out.println("hold");
        else if (playerScore >= 71 || oppenentScore >= 71)
            System.out.println("roll");
        else if (turnTotal < 21 +  Math.round(v))
            System.out.println("roll");
        else
           System.out.println("hold");

    }
}
