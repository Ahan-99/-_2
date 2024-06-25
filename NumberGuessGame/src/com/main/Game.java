package com.main;
import java.util.Scanner;
import java.util.Random;

class Game{
	public int random_num;
	public int guess;
	public int noOfGuesses = 0;
	public int attempts=0;
	
	public void setNoOfGuesses(int noOfGuesses) {
		this.noOfGuesses = noOfGuesses;
	}
	
	public int getNoOfGuesses() {
	      return noOfGuesses;
	}
	
	 Game(){
        Random rand = new Random();
        random_num = rand.nextInt(100);
       // System.out.println(random_num);
	}
	
	 void TakeUserInput() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Guess the number");
		
		guess = sc.nextInt();
	}
	
	 boolean IsCorrectNumber() {
		noOfGuesses++;
		attempts++;
		if(attempts==10)
		{
			System.out.println("five attempts completed please try again");
			System.exit(attempts);
		}
	    
		if(guess == random_num ) {
			System.out.format("Yes you get it right , it was %d \nYou guessed in %d chance",guess,noOfGuesses);
		    return true;
		}
		else if( guess < random_num) {
			System.out.println("Too low ...");
		}
		else if(guess > random_num) {
			System.out.println("Too high ...");
		}
		return false;
	}
	 
}