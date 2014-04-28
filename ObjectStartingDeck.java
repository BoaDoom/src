import java.util.Scanner;

public class ObjectStartingDeck {
	
	private static Scanner keyboard;
	
	
	public static void main(String[] args) {
		System.out.println("How many players? (between 2-4)");
		int numOfPlayers = keyboard.nextInt();
		int playerTurn = 0;
		while (numOfPlayers < 2 || numOfPlayers > 4)
		{			
			System.out.println("that is too few players");
			System.out.println("How many players? (between 2-4)");
			numOfPlayers = keyboard.nextInt();
		}
		Player begin = new Player(numOfPlayers);
		DealingCards aRound;
		for (int winCount = 0; winCount == begin.winCondition;) //largest loop, loops for every deck dealt/won. Stops when winCondition is met
		{
			aRound = new DealingCards(numOfPlayers); //initiates the player count in the new hand and starting cards for all players\
			boolean somebodyWonAHand;
			while (somebodyWonAHand =! true) //deals cards between players in order until win condition for the hand is met
			{
				playerTurn++;
				aRound.nextCard(playerTurn);
				
				if (playerTurn == numOfPlayers)
				{
					playerTurn = 0;
				}
			}
			winCount = lastWinnersWinCount;//wincount is total number of hands won. needs to be the last line in the for loop
		}
		System.out.println("Congrats Player" + lastWinner); //lastWinner is a tempvar
	}
}