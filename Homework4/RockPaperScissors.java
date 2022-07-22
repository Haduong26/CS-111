package Homework4;

import java.util.Scanner;

public class RockPaperScissors {

    public static void main(String[] args) {
        int user = userChoice();
        int computer = computerChoice();
        if ((3+user-computer) % 3 == 2)
            System.out.println("You lose");
        else if ((3+user-computer) % 3 == 0)
            System.out.println("Draw");
        else
            System.out.println("You win");
    }

    public static int userChoice() {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter 0 (rock), 1 (paper), or 2 (scissors):");
        int userChoice = input.nextInt();
        return userChoice;

    }

    public static int computerChoice()
    {
        int computermove = (int) Math.random() * 3;
        if (computermove == 0)
            System.out.println("I played rock" );
        else if(computermove == 1)
            System.out.println("I played paper" );
        else
            System.out.println("I played scissors" );
            
        return (int) computermove;    
    }

}
