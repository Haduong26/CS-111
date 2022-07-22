package Homework6;

public class PigSolitaireGame {
    public static void main(String[] args) {
        int dice;
        int hold;
        int turnTotal = 0;
        int score = 0;
        while (score<100) {
            while (true) {
                hold = (int) (Math.random() * 2);
                dice =  (int) (1 + Math.random() * 6);
                System.out.println("Roll: " + dice);
                turnTotal = turnTotal + dice;
                score = turnTotal + score;
                if (dice == 1) {
                    System.out.println("Turn total: " + 0);
                    System.out.println("New score: " + (score-turnTotal));
                    turnTotal = 0;
                    break;
                }
                if (hold == 1) {
                    continue;
                }
            }
            if (turnTotal > 0 && score < 100){
                System.out.println("Turn total: " + turnTotal);
                System.out.println("New score: " + score);
            }
            if (score >= 100 && score < 110){
                System.out.println("Turn total: " + turnTotal);
                System.out.println("New score: " + score);
                break;
            }
        }

    }

}
