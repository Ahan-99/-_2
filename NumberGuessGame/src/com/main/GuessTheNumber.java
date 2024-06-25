package com.main;
public class GuessTheNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Game g = new Game();
		
			boolean b = false;
		    while(!b) {
            g.TakeUserInput();
            b = g.IsCorrectNumber();
		    } 
		
		
	}

}