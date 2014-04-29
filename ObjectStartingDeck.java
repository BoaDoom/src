import java.util.Scanner;

public class ObjectStartingDeck {
	public int aPlayersScore;
	private static Scanner keyboard;
	
	
	public static void main(String[] args) {
		int player1Score = 0;
		int player2Score = 0;
		int player3Score = 0;
		int player4Score = 0;
		int recentScore = 0;
		int winningPlayer = 0;
		DealingCards aRound;
		Scanner keyboard = new Scanner(System.in);
		System.out.println("How many players? (between 2-4)");
		int numOfPlayers = keyboard.nextInt();
		while (numOfPlayers < 2 || numOfPlayers > 4)
		{			
			System.out.println("that is too few players");
			System.out.println("How many players? (between 2-4)");
			numOfPlayers = keyboard.nextInt();
		}

		Player begin = new Player(numOfPlayers);

		for (boolean winCount = false; winCount == false;) //largest loop, loops for every deck dealt/won. Stops when winCondition is met
		{	
			aRound = new DealingCards(numOfPlayers); //initiates the player count in the new hand and starting cards for all players\
			aRound.nextRound(); //starts dealing a rotation around all players
			if (aRound.Holdings.amountCompare.winner == 1){
				player1Score++;
				recentScore = player1Score;
				}
			if (aRound.Holdings.amountCompare.winner == 2){
				player2Score++;
				recentScore = player2Score;
				}
			if (aRound.Holdings.amountCompare.winner == 3){
				player3Score++;
				recentScore = player3Score;
				}
			if (aRound.Holdings.amountCompare.winner == 4){
				player4Score++;
				recentScore = player4Score;
				}
			if (recentScore == begin.winCondition)
				{
				winCount = true;
				}
			winningPlayer = aRound.Holdings.amountCompare.winner;
		}
		//aRound.playerTurn doesn't work outside of the For statement above, don't know why
		System.out.println("Congrats Player " + winningPlayer + " You've won the game"); //lastWinner is a tempvar
	}
}