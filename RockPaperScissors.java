// Simple Rock Paper Scissors game
// By Fran
// Made in Java using Visual Studio Code

import java.util.Scanner;
import java.util.Random;
import java.util.concurrent.TimeUnit;



class RockPaperScissors
{
		public static void main(String[] args) throws InterruptedException 
		{ // "throws InterruptedException" prevents the While loop from erroring the code.
			while (true)
{
			@SuppressWarnings("resource") // This prevents Visual studio from giving a "Resource Leak" warning.
			Scanner sc = new Scanner(System.in); 
			Random rand = new Random();
			int num;
			String userChoice = "";
			String computerChoice = "";

			
			// Intro to the game

			System.out.println("╔═══╗        ╔╗      ╔═══╗                    ╔═══╗                         ");
			System.out.println("║╔═╗║        ║║      ║╔═╗║                    ║╔═╗║                         ");
			System.out.println("║╚═╝║╔══╗╔══╗║║╔╗    ║╚═╝║╔══╗ ╔══╗╔══╗╔═╗    ║╚══╗╔══╗╔╗╔══╗╔══╗╔══╗╔═╗╔══╗");
			System.out.println("║╔╗╔╝║╔╗║║╔═╝║╚╝╝    ║╔══╝╚ ╗║ ║╔╗║║╔╗║║╔╝    ╚══╗║║╔═╝╠╣║══╣║══╣║╔╗║║╔╝║══╣ ");
			System.out.println("║║║╚╗║╚╝║║╚═╗║╔╗╗    ║║   ║╚╝╚╗║╚╝║║║═╣║║     ║╚═╝║║╚═╗║║╠══║╠══║║╚╝║║║ ╠══║");
			System.out.println("╚╝╚═╝╚══╝╚══╝╚╝╚╝    ╚╝   ╚═══╝║╔═╝╚══╝╚╝     ╚═══╝╚══╝╚╝╚══╝╚══╝╚══╝╚╝ ╚══╝");
			System.out.println("                               ║║                                           ");
			System.out.println("                               ╚╝                                           			");
			System.out.println(" ");

			TimeUnit.MILLISECONDS.sleep(500);
			System.out.println("...loading ");
			TimeUnit.MILLISECONDS.sleep(100);
			System.out.println(" ");
			TimeUnit.MILLISECONDS.sleep(800);
			System.out.println("Tweaking the code...");
			TimeUnit.MILLISECONDS.sleep(700);
			System.out.println("Making sure cheating is impossible...");
			TimeUnit.MILLISECONDS.sleep(900);
			System.out.println("Being gay.. I mean cleaning the CPU.....");
			TimeUnit.MILLISECONDS.sleep(1000);
			System.out.println("Starting...");


			//System.out.println("Welcome to Rock, Paper, Scissors");
			TimeUnit.MILLISECONDS.sleep(400);
			System.out.println("Please choose from the following:");
			TimeUnit.MILLISECONDS.sleep(1500);
			System.out.print("R)ock, P)aper or S)cissors. > ");
			// Expecting an input from user
			userChoice = sc.nextLine();
			//sc.close();
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

			/* Ask user if they want to play again
			* If yes, restarts game
			* If no, thanks user for playing and exits after a few seconds
			*/

			System.out.print("Would you like to play again? (Y/N) > ");
			userChoice = sc.nextLine();

			if(userChoice.equals("Y"))
			{
				// Restarts game
				System.out.println("Restarting...");
				TimeUnit.MILLISECONDS.sleep(500);
				System.out.println("... ");
				TimeUnit.MILLISECONDS.sleep(500);
				System.out.println("...");
				TimeUnit.MILLISECONDS.sleep(500);
				System.out.println("...");
				TimeUnit.MILLISECONDS.sleep(500);
				System.out.println("...");
				TimeUnit.MILLISECONDS.sleep(3000);

			}
			else if(userChoice.equals("N")){
				// Exits game
				System.out.println("Exiting... thank you for playing <3");
				TimeUnit.MILLISECONDS.sleep(500);
				System.out.println("This game was created by FranFranJams (Fran[They/She]#0666 on discord)");
				TimeUnit.MILLISECONDS.sleep(2500);

				break; // Breaks the While Loop
			}
		
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
