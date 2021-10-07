//Simple Rock Paper Scissors game
// by Fran
// Java using Geany Editor

import java.util.Scanner;
import java.util.Random;

class RockPaperScissors
{
		public static void main(String[] args) 
		{
			Scanner sc = new Scanner(System.in); 
			Random rand = new Random();
			int num;
			String userChoice = "";
			String computerChoice = "";

			
			// Intro to the game
			System.out.println("Welcome to Rock, Paper, Scissors");
			System.out.print("Please choose from the following:\nR)ock, P)aper or S)cissors. > ");
			
			// Expecting an input from user
			userChoice = sc.nextLine();
			sc.close();
			// CPU select random choice
			num = rand.nextInt(3);
			
			if(num == 0)
			{
			computerChoice = "R";	
			}

			else if(num == 1)
			{
			computerChoice = "P";	
			}

			else if(num == 2)
			{
			computerChoice = "S";	
			}


			// Print CPU choice

			if(computerChoice.equals("R")){
				System.out.println("Your opponent chose Rock.");
			}
			else if(computerChoice.equals("P")){
				System.out.println("Your opponent chose Paper.");
			}
			else if(computerChoice.equals("S")){
				System.out.println("Your opponent chose Scissors.");
			}	

			// Determine a winner

			if(userChoice.equals("R") && computerChoice.equals("S"))
			{
				System.out.println("You Won!");
			}
			else if(userChoice.equals("P") && computerChoice.equals("R"))
			{
				System.out.println("You Won!");
			}
			else if(userChoice.equals("S") && computerChoice.equals("P"))
			{
				System.out.println("You Won!");
			}

			// This checks if the Computer has won against the Player.
			if(userChoice.equals("S") && computerChoice.equals("R"))
			{
				System.out.println("The Computer Won! Better luck next time <3");
			}
			else if(userChoice.equals("R") && computerChoice.equals("P"))
			{
				System.out.println("The Computer Won! Better luck next time <3");
			}
			else if(userChoice.equals("P") && computerChoice.equals("S"))
			{
				System.out.println("The Computer Won! Better luck next time <3");
			}


			if(userChoice.equals(computerChoice))
			{
				System.out.println("It looks like a Tie! Better luck next time <3");
			}
	}
}

			/*
				This code works perfectly fine but it is big and inefficient.
				I have replaced this code with the smaller, more efficent code above.
			 
			if(userChoice.equals("S") && computerChoice.equals("S"))
			{
				System.out.println("It looks like a Tie! Better luck next time <3");
			}
			else if(userChoice.equals("R") && computerChoice.equals("R"))
			{
				System.out.println("It looks like a Tie! Better luck next time <3");
			}*/
