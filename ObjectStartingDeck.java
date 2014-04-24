import java.util.Scanner;

public class ObjectStartingDeck {
	
	private static Scanner keyboard;
	
	
	public static void main(String[] args) {
		System.out.println("How many players? (between 2-4)");
		int numOfPlayers = keyboard.nextInt();
		while (numOfPlayers < 2 || numOfPlayers > 4)
		{			
			System.out.println("that is too few players");
			System.out.println("How many players? (between 2-4)");
			numOfPlayers = keyboard.nextInt();
		}
		Player begin = new Player(numOfPlayers);
		for (int winCount = 0; winCount == begin.winCondition;) //largest loop, loops for every deck dealt and won
		{
			Deck newStack = new Deck();//create a deck object somehow and deal out 1 card per player

			winCount = lastWinnersWinCount;//tempvar, needs to be the last line in the for loop
		}
		System.out.println("Congrats Player" + lastWinner) //lastWinner is a tempvar
	}
}