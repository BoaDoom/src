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
		System.out.println("How many players? (between 2-4)"); //asking for the amount of players
		int numOfPlayers = keyboard.nextInt();
		while (numOfPlayers < MINIMUM_NUM_PLAYERS || numOfPlayers > MAXIMUM_NUM_PLAYERS)
		{			
			System.out.println("that is not the right number of players");
			System.out.println("How many players? (between 2-4)");
			numOfPlayers = keyboard.nextInt();
		}
		if (numOfPlayers == 2)		{ //sets win condition determined by the amount of players
			winCondition = 8;		}
		if (numOfPlayers == 3)		{
			winCondition = 6;		}
		if (numOfPlayers == 4)		{
			winCondition = 4;		}
		
		DeckOfCards Deck = new DeckOfCards(); //makes a deck object
		List<Players> AllPlayers = new ArrayList<Players>(); //creates a list of player objects
		for (int i = 0; i < numOfPlayers; i++)
		{
			Players PlayerNum = new Players(Deck.dealCard(), i); //creates a new object PlayerNum, one for each player count. Gives them a card
			//Deck.dealCard() returns the value of the next card, the deck object auto selects next card
			AllPlayers.add(PlayerNum);  //adds each player object to the list AllPlayers			
		}
		
		while (winCount < winCondition) //round counting scores
		{
			while (Deck.cardsDealt < DeckOfCards.cardCount - 1) //deals until all cards are gone
			{

				AllPlayers.get(turnCount).getNewCard(Deck.dealCard());
				turnCount++;
				if (turnCount == numOfPlayers) //rotates between player(0) and player(number of players)-1
				{
					turnCount = 0;
				}
			}
			System.out.println(AllPlayers.get(CompareHands(AllPlayers.get(0).currentCard, AllPlayers.get(1).currentCard, AllPlayers.get(2).currentCard, AllPlayers.get(3).currentCard)).playerScore);
			AllPlayers.get(CompareHands(AllPlayers.get(0).currentCard, AllPlayers.get(1).currentCard, AllPlayers.get(2).currentCard, AllPlayers.get(3).currentCard)).playerScore++;
			winCount = AllPlayers.get(CompareHands(AllPlayers.get(0).currentCard, AllPlayers.get(1).currentCard, AllPlayers.get(2).currentCard, AllPlayers.get(3).currentCard)).playerScore;
			
		}
		//there needs to be a count down for the
		
	}
		public static int CompareHands(int Scoreone, int Scoretwo, int Scorethree, int Scorefour)
		{
		 	if (Scoreone > Scoretwo && Scoreone > Scorethree && Scoreone > Scorefour)
		 	{
			 	System.out.println("The winner of this round is player one with " + Scoreone);
		 		return 0;
		 	}
		    if (Scoretwo > Scoreone && Scoretwo > Scorethree && Scoretwo > Scorefour)
		    {
		    	System.out.println("The winner of this round is player two with " + Scoretwo);
		    	return 1;
		    }
		    if (Scorethree > Scoretwo && Scorethree > Scoreone && Scorethree > Scorefour)
		    {
		    	System.out.println("The winner of this round is player three with " + Scorethree);
		    	return 2;
		    }
		    	return 3; 
		}
		/* "AllPlayers.get(i)" when i = 2-4 it will refer to each of the objects that are the players hands*/
}
