package Homework5;

import java.util.Scanner;
public class Username {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter a first name, last name, and 1-2 digit positive integer separated by spaces:");
        String fname = input.nextLine().toLowerCase();
        String lname = input.nextLine().toLowerCase();
        int num = input.nextInt();
        String numWith0 = String.format("%02d", num).toLowerCase();

        System.out.println(lname.substring(0, 3) + fname.substring(0, 2) + numWith0);
        
    }
}
