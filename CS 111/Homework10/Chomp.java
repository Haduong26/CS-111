package Homework10;

import java.util.Scanner;
public class Chomp {
    int rows;
    int columns;
    String[][] matrix;

    public static void main(String[] args) {
        System.out.println("CHOMP");
        System.out.println("In the game of Chomp, players bite a rectangular cookie in turn.");
        System.out.println("The player chomping the last bite (0,0) loses.");
        System.out.println("Each chomp, a row and column, bites off all below and to the right.");
                
        Chomp object1 = new Chomp();

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
        
        return true;
    }

>>>>>>> 908726993c5ae20783fdbb7f8cc942d36e1e526c
    public Chomp () {
        Scanner input = new Scanner(System.in);
        System.out.println("Rows?");        
        rows = input.nextInt();
        System.out.println("Columns?");  
        columns = input.nextInt();
        matrix = new String[rows][columns];

        System.out.print(" ");     
        for (int i = 0; i < columns; i++) {
            System.out.print(i);
        }
        System.out.println("");              

        for(int j = 0; j < rows; j++){
            System.out.print(j);
            for(int k = 0; k < columns; k++){
                matrix [j][k] = "*";
                System.out.print(matrix [j][k]);
            }
            System.out.println("");       
    }
    System.out.println(matrix[0][0]);



}

}