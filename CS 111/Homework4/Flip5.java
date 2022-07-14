package Homework4;
import java.util.Random;

import java.util.Scanner;

public class Flip5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Bet (0) more tails, or (1) more heads:");
        int bet = input.nextInt();
        String chars = "HT";
        StringBuilder sb = new StringBuilder();

        Random random = new Random();
        if (bet != 0 || bet != 1)
            System.out.print("Invalid bet");
        else if (bet == 0)
            for (int i = 0; i < 5; i++) {
                int index = random.nextInt(chars.length());
                char randomChar = chars.charAt(index);
                sb.append(randomChar);
            }
            String randomString = sb.toString();

            int totalCharacters = 0;
            char temp;
            for (int i = 0; i < randomString.length(); i++) {

                temp = randomString.charAt(i);
                if (temp == 'H')
                    totalCharacters++;
            }

            if ( totalCharacters == 0 ||totalCharacters == 5)
                System.out.println(randomString + " --> All flips are the same. You lose.");
            else if (totalCharacters > 2)
                System.out.println(randomString + " --> You lose.");
        else 
            if ( totalCharacters == 0 ||totalCharacters == 5)
                System.out.println(randomString + " --> All flips are the same. You lose.");
            else if (totalCharacters > 2)
                System.out.println(randomString + " --> You win.");
        
    }
}
