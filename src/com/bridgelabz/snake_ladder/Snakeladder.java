package com.bridgelabz.snake_ladder;

public class Snakeladder {
	
	public static final int no_play = 0; //variable for no play
	public static final int ladder = 1; //variable for ladder
	public static final int snake = 2; //variable for snake
	
	public static void main(String[] args) {
		
		int player1_pos=0; //start position of player 1 is initialised with 0.
		int player2_pos=0; //start position of player 2 is initialised with 0.
		 
		int times1_roll = 0;  //variable for number of times dice rolled by player 1.
		int times2_roll = 0;  //variable for number of times dice rolled by player 2.
		
		final int p1 = 1 ; 	 //variable for loop for player 1
		final int p2 = 2 ;   //variable for loop for player 2  
		
		int x = p1;
		
		while(player1_pos < 100 && player2_pos < 100)
		{
			
			int ran_num = (int)((Math.random()*10) % 6) + 1 ; //Rolling of dice implemented by using random function generating random numbers (1-6).
			int option_num = (int)((Math.random()*10) % 3); //Option number generated for next move between snake, ladder and no play.
			
			switch(option_num) {
			
			case no_play:  //case for move regarding no play
				if ( x == p1 ) times1_roll += 1 ;
				else times2_roll += 1 ;
				break;
				
			case ladder:         //case for move regarding ladder
				if ( x == p1 ) {
					int temp = player1_pos ;  //temp variable for storing current player position.
					player1_pos = player1_pos + ran_num;
					if (player1_pos>100) player1_pos = temp;  //condition for exact winning condition so that position won't go beyond 100. 
					times1_roll += 1 ;
				}
				else {
					int temp = player2_pos;  //temp variable for storing current player position.
					player2_pos = player2_pos + ran_num;
					if (player2_pos>100) player2_pos = temp;  //condition for exact winning condition so that position won't go beyond 100.
					times2_roll += 1 ;
				}
				break;
				
			case snake:        //case for move regarding snake
				if ( x == p1 ) {
					player1_pos = player1_pos - ran_num;
					if (player1_pos<0) player1_pos=0;  //condition for checking and making player position 0 if it goes below 0.
					times1_roll += 1 ; 
				}
				else {
					player2_pos = player2_pos - ran_num;
					if (player2_pos<0) player2_pos=0;  //condition for checking and making player position 0 if it goes below 0.
					times2_roll += 1 ;
				}
				break;
			}
			
			// condition for switching between players
			if ( x == p1 ) x = p2 ;
			else x = p1 ;
			
		}
		
		if ( player1_pos == 100 ) System.out.println("Player 1 won by rolling dice " + times1_roll + " times.");
		else System.out.println("Player 2 won by rolling dice " + times2_roll + " times.");
	}
}
