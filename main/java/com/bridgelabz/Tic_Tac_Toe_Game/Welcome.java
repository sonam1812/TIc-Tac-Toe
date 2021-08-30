package com.bridgelabz.Tic_Tac_Toe_Game;

public class Welcome {
	
   public static final char[] charArray = new char[10];
	public static void main(String[] args) {
		printBoard();
	}
	public static void printBoard() {
		int count = 0;
		int i;
		for (i = 1; i < charArray.length; i++) {
			charArray[i] = ' ';
			System.out.println(charArray[i]);
			
		}
	}
}
		
		
			
		


