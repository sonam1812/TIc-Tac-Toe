package com.bridgelabz.Tic_Tac_Toe_Game;

import java.util.Scanner;

public class TicTacToeGame {
	public static char[] box= new char[10];
   public static final char[] charArray = new char[10];
   
	public static void main(String[] args) {
		printBoard();
		playGame();
		displayBoard();
		
	}


	public static void printBoard() {
		int count = 0;
		int i;
		for (i = 1; i < charArray.length; i++) {
			charArray[i] = ' ';
			box[i] = ' ';
			System.out.println(charArray[i]);
			
		}
	}
	public static void playGame() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter X or 0 ");
		char playGame = sc.next().charAt(0);
		
		if(playGame == 'X') {
			
			System.out.println("player turn x");
			System.out.println("Computer turn 0");
		}
		else if(playGame == '0') {
			
			System.out.println("player turn 0");
			System.out.println("Computer turn X");
		}
		else {
			System.out.println("Invalid!!!!");
		}
	}
		public static void displayBoard() {
			
			System.out.println("      |      |      ");
			System.out.println("   " + box[1] + "  |  " + box[2] + "   |  " + box[3] + "   ");
            System.out.println("______|______|_____");
            System.out.println("      |      |      ");
            System.out.println("   " + box[4] + "  |  " + box[5] + "   |  " + box[6] + "   ");
            System.out.println("______|______|_____");
            System.out.println("      |      |      ");
            System.out.println("   " + box[7] + "  |  " + box[8] + "   |  " + box[9] + "   ");
            System.out.println("      |      |      ");
		}
           
		}



		
			
		
		
		
			
		


