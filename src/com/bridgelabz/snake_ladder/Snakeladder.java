package com.bridgelabz.snake_ladder;

public class Snakeladder {
	
	public static final int no_play = 0; //variable for no play
	public static final int ladder = 1; //variable for ladder
	public static final int snake = 2; //variable for snake
	
	public static void main(String[] args) {
		
		int player_pos=0; //start position of player is initialised with 0.
		
		int ran_num = (int)((Math.random()*10) % 6) + 1 ; //Rolling of dice implemented by using random function generating random numbers (1-6). 
		
		int times_roll = 0;  //variable for number of times dice rolled.  
		
		while ( player_pos < 100 ) {  //condition for player till reaching winning mark 100.
			
			int option_num = (int)((Math.random()*10) % 3); //Option number generated for next move between snake, ladder and no play.
			
			switch(option_num) {
			case no_play:         //case for move regarding no play
				break;  
			case ladder:         //case for move regarding ladder   
				int temp = player_pos;  //temp variable for storing current player position.
				player_pos = player_pos + ran_num;
				if (player_pos>100) player_pos = temp;  //condition for exact winning condition so that position won't go beyond 100. 
				break;
			case snake:        //case for move regarding snake
				player_pos = player_pos - ran_num;
				if (player_pos<0) player_pos=0;  //condition for checking and making player position 0 if it goes below 0.
				break;
			}
			
			times_roll+=1;
			System.out.println("The current position of Player is " + player_pos);
		}
		
		System.out.println("The number of times dice rolled = " + times_roll);
	}
}
