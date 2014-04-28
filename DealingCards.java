
public class DealingCards //aRound
{

	int playerCount = 0;
	int playerTurn = 0;
	int cardsRemaining = 16;
	int highScore = 0;
	boolean somebodyWonAHand = false;
	Hands Holdings = new Hands(playerCount);
	Deck RoundOfCards = new Deck();	
	public DealingCards(int playerNumImport) //deals one card to every hand as the first card
	{
		if (playerNumImport == 2) 
		{
			Holdings.playerOnesHand = RoundOfCards.dealCard();
			Holdings.playerTwosHand = RoundOfCards.dealCard();
			cardsRemaining = cardsRemaining - 2;
		}
		if (playerNumImport == 3)
		{
			Holdings.playerOnesHand = RoundOfCards.dealCard();
			Holdings.playerTwosHand = RoundOfCards.dealCard();
			Holdings.playerThreesHand = RoundOfCards.dealCard();
			cardsRemaining = cardsRemaining - 3;
		}
		if (playerNumImport == 3)
		{
			Holdings.playerOnesHand = RoundOfCards.dealCard();
			Holdings.playerTwosHand = RoundOfCards.dealCard();
			Holdings.playerThreesHand = RoundOfCards.dealCard();
			Holdings.playerFoursHand = RoundOfCards.dealCard();
			cardsRemaining = cardsRemaining - 4;
		}
		playerCount = playerNumImport;
	}
	public int nextRound()
	{
		while (somebodyWonAHand == false) //deals cards between players in order until win condition for the hand is met
		{
			somebodyWonAHand = Holdings.cardAction(RoundOfCards.dealCard());		
		}
		playerTurn = Holdings.playerTurn;
		return Holdings.highScore;
		/* a line that sends out the winner of the round */
	}
}

