
public class DealingCards //aRound
{

	public static int playerCount = 0;	
	public int[] playerOnesHand = {0, 0};
	public int[] playerTwosHand = {0, 0};
	public int[] playerThreesHand = {0, 0};
	public int[] playerFoursHand = {0, 0};
	public Deck NewRoundOfCards;
	
	public void nextCard(int playerTurn) //puts out next card into the current players hand array
	{
		if (playerTurn == 1)
		{
		playerOnesHand[1] = NewRoundOfCards.dealCard();
		}
		if (playerTurn == 2)
		{
		playerTwosHand[1] = NewRoundOfCards.dealCard();
		}
		if (playerTurn == 3)
		{
		playerThreesHand[1] = NewRoundOfCards.dealCard();
		}
		else
		{
		playerFoursHand[1] = NewRoundOfCards.dealCard();
		}
	}
	
	public DealingCards(int playerNumImport)
	{
		if (playerNumImport == 2) //starting hands
		{
			playerOnesHand[0] = NewRoundOfCards.dealCard();
			playerTwosHand[0] = NewRoundOfCards.dealCard();
		}
		if (playerNumImport == 3)
		{
			playerOnesHand[0] = NewRoundOfCards.dealCard();
			playerTwosHand[0] = NewRoundOfCards.dealCard();
			playerThreesHand[0] = NewRoundOfCards.dealCard();
		}
		if (playerNumImport == 3)
		{
			playerOnesHand[0] = NewRoundOfCards.dealCard();
			playerTwosHand[0] = NewRoundOfCards.dealCard();
			playerThreesHand[0] = NewRoundOfCards.dealCard();
			playerFoursHand[0] = NewRoundOfCards.dealCard();
		}
		playerCount = playerNumImport;
	}

}

