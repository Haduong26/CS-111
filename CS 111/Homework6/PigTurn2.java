package Homework6;


import java.util.Scanner;
public class PigTurn2 {
    static int turnTotal = 0;
    public static void main(String[] args) {
        dice();
        int score = dice();
        if (turnTotal > 0){
            System.out.println("Turn total: " + turnTotal);
            System.out.println("New score: " + score);
        }
    }

    public static int dice() {
        Scanner input = new Scanner(System.in);
        System.out.println("Score?");
        int score = input.nextInt();
        int dice;
        int hold;
        while (true) {
            hold = (int) (Math.random() * 2);
            dice =  (int) (1 + Math.random() * 6);
            System.out.println("Roll: " + dice);
            turnTotal = turnTotal + dice;
            score = turnTotal + score;
            if (dice == 1) {
                System.out.println("Turn total: " + 0);
                System.out.println("New score: " + (score-turnTotal));
                turnTotal = -turnTotal;
                break;
            }
            if (hold == 1) {
                break;
            }
        }
        return score;
    }
}
