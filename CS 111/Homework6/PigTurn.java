package Homework6;

public class PigTurn {
    static int turnTotal = 0;
    public static void main(String[] args) {
        dice();
                if (turnTotal > 0)
                    System.out.println("Turn total: " + (turnTotal));
            }

    public static void dice() {
        int dice;
        int hold;
        while (true) {
            hold = (int) (Math.random() * 2);
            dice =  (int) (1 + Math.random() * 6);
            System.out.println("Roll: " + dice);
            turnTotal = turnTotal + dice;
            if (dice == 1) {
                System.out.println("Turn total: " + 0);
                turnTotal = -turnTotal;
                break;
            }
            if (hold == 1) {
                break;
            }

        }
    }
}
