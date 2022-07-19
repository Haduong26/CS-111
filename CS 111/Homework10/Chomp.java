package Homework10;

import java.util.Scanner;
public class Chomp {
    int rows;
    int columns;
    int currentPlayer;
    String[][] matrix;

    public static void main(String[] args) {
        System.out.println("CHOMP");
        System.out.println("In the game of Chomp, players bite a rectangular cookie in turn.");
        System.out.println("The player chomping the last bite (0,0) loses.");
        System.out.println("Each chomp, a row and column, bites off all below and to the right.");
                
        Chomp game = new Chomp();

        while (!game.isGameOver()) {
            int row, col;
            while (true) {
                System.out.print("Player " + game.getCurrentPlayer() + " chomp? ");
                row = game.getTurn();
                col = game.getTurn();
                if (game.isLegalChomp(row, col)) {
                    break;
                } else {
                    System.out.println("That is not legal chomp position.");
                    game.PrintGame();
                }     
            } 
            game.chompAt(row, col);
            game.PrintGame();
        }

    }

    public int getTurn() {
        Scanner input = new Scanner(System.in);
        int newNumber = input.nextInt();
        return newNumber;
    }

    public int getCols(){
        return columns;
    }

    public int getRows(){
        return rows;
    }

    public boolean isLegalChomp(int row, int col) {
        if (matrix[row][col] == "*") {
            return true;
        }
        return false;
    }
    
    public boolean chompAt(int row, int col) {
        if (!isLegalChomp(row, col)){
            return false;
        }
        
        for(int i = 0; i < rows; i++)
            for(int j = 0; j < columns; j++)
                if (i >= row && j >= col && isLegalChomp(i, j)) {
                    matrix[i][j] = "x";
                }

        if (currentPlayer == 1) 
            currentPlayer = 2;
        else 
            currentPlayer = 1;

        return true;
    }

    public int getCurrentPlayer() {
        return currentPlayer;
    }

    public boolean isGameOver() {
        if (matrix[0][0] == "*")
            return false;
        return true;
    }

    public void ChampGame(int row, int col) {
        rows = row;
        columns = col;
    }

    public void PrintGame() {
        System.out.print(" ");     
        for (int i = 0; i < columns; i++) {
            System.out.print(i);
        }
        System.out.println("");              

        for(int j = 0; j < rows; j++){
            System.out.print(j);
            for(int k = 0; k < columns; k++){
                matrix[j][k] = "*";
                System.out.print(matrix [j][k]);
            }
            System.out.println("");
        }
    }

    public Chomp () {
        Scanner input = new Scanner(System.in);
        System.out.println("Rows?");        
        rows = input.nextInt();
        System.out.println("Columns?");  
        columns = input.nextInt();
        matrix = new String[rows][columns];
        currentPlayer = 1;
        
        PrintGame();
    }
    

}