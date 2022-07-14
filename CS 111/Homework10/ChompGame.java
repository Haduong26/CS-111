package Homework10;

import java.util.Scanner;
public class ChompGame {

    int player1 = 1;
    int player2 = 2;
    int row, rol;
    boolean chomped = true;

    public static void main(String[] args) {
        Chomp object1 = new Chomp();
        printboard();

    }

    public ChompGame () {

    }

    public static void printboard() {
        Scanner input = new Scanner(System.in);
        System.out.println("Rows?");        
        int rows = input.nextInt();
        System.out.println("Columns?");  
        int columns = input.nextInt();
        String[][] matrix= new String[rows][columns];
    
        System.out.print(" ");     
        for (int i = 0; i < columns; i++) {
            System.out.print(i);
        }
        System.out.println("");              
    
        for(int j = 0; j < rows; j++){
            System.out.print(j);
            for(int k = 0; k < columns; k++){
                matrix[j][k] = "*";
                System.out.print(matrix[j][k]);
            }
            System.out.println("");              
        }

    }


}
