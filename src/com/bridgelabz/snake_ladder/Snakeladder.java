package com.bridgelabz.snake_ladder;

public class Snakeladder {
	
	public static void main(String[] args) {
		
		int player_pos=0; //start position of player is initialised with 0.
		
		int ran_num = (int)((Math.random()*10) % 6) + 1 ; //Rolling of dice implemented by using random function generating random numbers (1-6). 
		
		System.out.println("The position of Player is " + player_pos);
		System.out.println("After rolling of die the number is " + ran_num);
	}
}
