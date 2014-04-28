import java.util.Scanner;

public class ObjectStartingDeck {
	
	private static Scanner keyboard;
	
	
	public static void main(String[] args) {
		int tempvar = 0;
		DealingCards aRound;
		System.out.println("How many players? (between 2-4)");
		int numOfPlayers = keyboard.nextInt();
		while (numOfPlayers < 2 || numOfPlayers > 4)
		{			
			System.out.println("that is too few players");
			System.out.println("How many players? (between 2-4)");
			numOfPlayers = keyboard.nextInt();
		}
		Player begin= new Player(numOfPlayers);
		for (int winCount = 0; winCount == begin.winCondition;) //largest loop, loops for every deck dealt/won. Stops when winCondition is met
		{
			aRound = new DealingCards(numOfPlayers); //initiates the player count in the new hand and starting cards for all players\
			winCount = aRound.nextRound(); //starts dealing a rotation around all players until the round win condition is met
			tempvar = aRound.playerTurn;
		}
		//aRound.playerTurn doesn't work outside of the For statement above, don't know why
		System.out.println("Congrats Player" + tempvar); //lastWinner is a tempvar
	}
}