package com.bridgelabz.Tic_Tac_Toe_Game;

import java.util.Scanner;

public class TicTacToeGame {
	public static char[] box= new char[10];
   public static final char[] charArray = new char[10];
   static Scanner sc = new Scanner(System.in);
   
   
   public static void main(String[] args) {
		printBoard();
		playGame();
		displayBoard();
		selectBox();
		
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


        public static void selectBox() {
        	
        	 System.out.println("Select from 1 to 9 : ");
             int boxValue = sc.nextInt();
             if (boxValue < 1 || boxValue > 9) {
                 System.out.println(" Invalid !!!!!! ");
                selectBox();
             } 
             
             else if (boxValue > 1 || boxValue < 9) {
            	 System.out.println(" Enter the Value ");
            	 
             }
                 displayBoard();      	
        	   }
           }

        		
            
        
		
			
		
		
		
			
		


