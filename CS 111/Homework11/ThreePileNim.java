package Homework11;

import java.util.Arrays;
import java.util.Scanner;

public class ThreePileNim {
    int column1;
    int column2;
    int column3;
    int currentPlayer;
    String[][] matrix;
    int[] pile = {column1,column2,column3};

    public static void main(String[] args) {
        ThreePileNim game = new ThreePileNim();
        }


    public void PrintGame() {
        Arrays.sort(pile);
        for(int j = 0; j < matrix.length; j++){
            System.out.print(j + ":");
            for(int k = 0; k <  matrix[j].length; k++){
                System.out.print(matrix[j][k]);
            }
            System.out.println("");
        }
    }

    public ThreePileNim () {
        Scanner input = new Scanner(System.in);
        System.out.println("Columns?");  
        column1 = input.nextInt();
        column2 = input.nextInt();
        column3 = input.nextInt();
        matrix = new String[3][pile.length];

        for(int i = 0; i < matrix.length; i ++)
            for(int j = 0; j < matrix[i].length; j++){
                matrix[i][j] = "*";

            }

        PrintGame();
    }
}
