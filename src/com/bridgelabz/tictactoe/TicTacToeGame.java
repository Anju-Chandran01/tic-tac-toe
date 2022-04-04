package com.bridgelabz.tictactoe;

import java.util.Scanner;

public class TicTacToeGame {

    char[] board = new char[10];
    static char playerGameInput,computerGameInput;

    // UC1 : Create Board
    TicTacToeGame(){
        for( int i = 1; i < 10; i++ ){
            board[i] = ' ';
        }
    }

    public static void main(String[] args) {

        System.out.println("--- Welcome to Tic Tac Toe Game ---");

        TicTacToeGame ticTacToeGame = new TicTacToeGame();
        ticTacToeGame.showBoard();
        ticTacToeGame.playerInput();
        System.out.println("Player input is -" + playerGameInput + " and Computer input is - " + computerGameInput);

    }

    // UC3 : Player Board Display
    private void showBoard() {
        System.out.println("The game Board ");
        System.out.println(" "+board[1] + " | "+ board[2] + " | " + board[3]);	//display first row
        System.out.println("---+---+---");
        System.out.println(" "+board[4] + " | "+ board[5] + " | " + board[6]);	//display second row
        System.out.println("---+---+---");
        System.out.println(" "+board[7] + " | "+ board[8] + " | " + board[9]);	//display third row
    }

    // UC2 : Select X or O from player at console
    private void playerInput() {

        System.out.print(" Enter 'X' or 'O' : ");
        Scanner input = new Scanner(System.in);
        char playerInput = input.next(".").toUpperCase().charAt(0);
        System.out.println(playerInput);
        if (playerInput == 'X') {
            playerGameInput = 'X';
            computerGameInput = 'O';
        } else if (playerInput == 'O') {
            computerGameInput = 'X';
            playerGameInput = 'O';
        } else {
            System.out.print("Enter a valid choice : ");
            playerInput();
        }
    }
}
