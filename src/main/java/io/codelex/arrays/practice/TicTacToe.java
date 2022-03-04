package io.codelex.arrays.practice;

import java.util.Scanner;

public class TicTacToe {

    private static char[][] board = new char[3][3];

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        initBoard();

        System.out.println("Input the name for player 1");
        String p1 = keyboard.nextLine();
        System.out.println("Input the name for player 2");
        String p2 = keyboard.nextLine();

        boolean isPlayer1 = true;
        boolean gameFinished = false;


        while (!gameFinished) {

            displayBoard();


            char symbol = ' ';

            if (isPlayer1) {
                symbol = 'X';
            } else {
                symbol = 'O';
            }

            // who make a turn
            if (isPlayer1) {
                System.out.println(p1 + " your turn and your symbol is X");
            } else System.out.println(p2 + " your turn and your symbol is O");

            // Get user input
            int row = 0;
            int col = 0;

            while (true) {

                System.out.println("Input row number");
                row = keyboard.nextInt();
                System.out.println("Input column number");
                col = keyboard.nextInt();
                // check if the input is valid
                if (row < 0 || col < 0 || row > 2 || col > 2) {
                    System.out.println("Enter number from 0 to 2");
                } else if (board[row][col] != ' ') {
                    System.out.println("This coordinates already taken, chose another one");
                } else {
                    break;
                }
            }
            board[row][col] = symbol;
            if (indicateWiner(board) == 'X') {
                System.out.println(p1 + "is the winner");
                gameFinished = true;

            } else if (indicateWiner(board) == 'O') {
                System.out.println(p2 + " is the winner");
                gameFinished = true;
            } else {
                if (theGameisTie(board)) {
                    System.out.println("The game is tie.");
                    gameFinished = true;
                } else {
                    isPlayer1 =! isPlayer1;

                }

            }
        }
    }




    public static void initBoard() {
        // fills up the board with blanks
        for (int r = 0; r < 3; r++)
            for (int c = 0; c < 3; c++)
                board[r][c] = ' ';
    }

    public static void displayBoard() {
        System.out.println("  0  " + board[0][0] + "|" + board[0][1] + "|" + board[0][2]);
        System.out.println("    --+-+--");
        System.out.println("  1  " + board[1][0] + "|" + board[1][1] + "|" + board[1][2]);
        System.out.println("    --+-+--");
        System.out.println("  2  " + board[2][0] + "|" + board[2][1] + "|" + board[2][2]);
        System.out.println("     0 1 2 ");
    }

    public static char indicateWiner(char[][] board) {
        // for rows
        for (int i = 0; i < 3; i++) {
            if (board[i][0] == board[i][1] && board[i][1] == board[i][2] && board[i][0] != ' ') {
                return board[i][0];
            }
        }
        //for columns
        for (int j = 0; j < 3; j++) {
            if (board[0][j] == board[1][j] && board[1][j] == board[2][j] && board[0][j] != ' ') {
                return board[0][j];
            }
        }
        // for dioganals
        if (board[0][0] == board[1][1] && board[1][1] == board[2][2] && board[0][0] != ' ') {
            return board[0][0];
        }
        if (board[2][0] == board[1][1] && board[1][1] == board[0][2] && board[2][0] != ' ') {
            return board[2][0];
        }
        return ' ';
    }

    public static boolean theGameisTie(char[][] board) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == ' ') {
                    return false;
                }
            }
        }
        return true;
    }

}