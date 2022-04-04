package com.bridgelabz.tictactoe;

import java.util.Locale;
import java.util.Scanner;

public class TicTacToeGame {

    int Arr[] = new int[10];

    public static void main(String[] args) {

        System.out.println("--- Welcome to Tic Tac Toe Game ---");

        TicTacToeGame ticTacToeGame = new TicTacToeGame();
        ticTacToeGame.boardCreate();
        ticTacToeGame.playerInput();
    }

    // UC2 : Select X or O from player at console
    private void playerInput() {

        System.out.print(" Enter 'X' or 'O' : ");
        Scanner input = new Scanner(System.in);
        char playerInput = input.next(".").toUpperCase().charAt(0);
        System.out.println(playerInput);

        if(playerInput == 'X'){
            System.out.println("Player chose 'X'");
            System.out.println("Computer chooses 'Y");
        }
        else{
            System.out.println("Player chose 'Y'");
            System.out.println("Computer chooses 'X'");
        }

    }

    // UC1 : Create Board
    private void boardCreate() {
        for( int i = 1; i < 10; i++ ){

        }
    }
}
