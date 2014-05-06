package cardGameV3;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainCardGameV3 {
	public static final int MINIMUM_NUM_PLAYERS = 2;
	public static final int MAXIMUM_NUM_PLAYERS = 4;
	public static void main(String[] args) 
	{
		@SuppressWarnings("resource")
		Scanner keyboard = new Scanner(System.in);
		int turnCount = 0;
		int winCondition = 0;
		int winCount = 0;
		int playerScoreFirst = 0;
		int playerScoreSecond = 0;
		int highCard = 0;
		System.out.println("How many players? (between " + MINIMUM_NUM_PLAYERS + "-" + MAXIMUM_NUM_PLAYERS + ")"); //asking for the amount of players
		int numOfPlayers = keyboard.nextInt();
		while (numOfPlayers < MINIMUM_NUM_PLAYERS || numOfPlayers > MAXIMUM_NUM_PLAYERS)
		{			
			System.out.println("that is not the right number of players");
			System.out.println("How many players? (between " + MINIMUM_NUM_PLAYERS + "-" + MAXIMUM_NUM_PLAYERS + ")");
			numOfPlayers = keyboard.nextInt();
		}
		if (numOfPlayers == 2)		{ //sets win condition determined by the amount of players
			winCondition = 4;		}
		if (numOfPlayers == 3)		{
			winCondition = 3;		}
		if (numOfPlayers == 4)		{
			winCondition = 2;		}
		
		DeckOfCards Deck = new DeckOfCards(); //makes a deck object
		List<Players> AllPlayers = new ArrayList<Players>(); //creates a list of player objects
		for (int i = 0; i < numOfPlayers; i++)
		{
			Players PlayerNum = new Players(/*Deck.dealCard(), */i); //creates a new object PlayerNum, one for each player count. Gives them a card
			//Deck.dealCard() returns the value of the next card, the deck object auto selects next card
			AllPlayers.add(PlayerNum);  //adds each player object to the list AllPlayers			
		}
		
		while (winCount < winCondition) //round counting scores
		{
			
			highCard = 0; //reseting the counter to track who has the highest hand at the end
			turnCount = 0; //resetting the turn counter
			Deck.shuffle(); //shuffling for next hand
			for (int i = 0; i <numOfPlayers; i++) //first card dealt to all players, plus shows scores
			{
				AllPlayers.get(i).getStartingCard(Deck.dealCard());
				System.out.println("Player " + (i+1) + "'s score is " + AllPlayers.get(i).playerScore);
			}
			System.out.println("Play till " + winCondition + "\n");
			while (Deck.cardsDealt < DeckOfCards.cardCount - 1) //deals until all cards are gone
			{

				AllPlayers.get(turnCount).getNewCard(Deck.dealCard());//activates the choosing of the card
				turnCount++;
				if (turnCount == numOfPlayers) //rotates between player(0) and player(number of players - 1)
				{
					turnCount = 0;
				}
			}
			playerScoreFirst = AllPlayers.get(0).currentCard; //setting the initial value for the other cards to be tested against, player 1's card
			for (int i = 1; i < numOfPlayers; i++) //comparing final cards. Starts with player(0) and then replaces it if the next is higher
			{
				playerScoreSecond = AllPlayers.get(i).currentCard;
				if (playerScoreFirst < playerScoreSecond)
				{
					playerScoreFirst = playerScoreSecond;
					highCard = i;
					/*System.out.println("The test winner is player " + (highCard + 1));*/ //tester for sequential hand comparison
				}
			}
			System.out.println("The winner is player " + (highCard + 1));
			AllPlayers.get(highCard).scored();
			winCount = AllPlayers.get(highCard).playerScore;
			/*System.out.println("winning players current score " + AllPlayers.get(highCard).playerScore);*/ //winning players current score
		}
		System.out.println("Congrats to player " + (highCard+1) + ". You've won");
	}
}
