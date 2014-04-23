import java.util.Random;

public class Deck 
{
    public int [] deckArray = { 16, 15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1 };
    public int deckPosition;
    public int playerCount;
    public Deck(int numOfPlayers)
    {	
        deckPosition = -1;
        playerCount = numOfPlayers;
        Random rand = new Random();
		for (int currentCardCount = deckArray.length - 1; currentCardCount > 0; currentCardCount--) //shuffles deck array
		{
			int pickedCardNumber = rand.nextInt(currentCardCount + 1);
			int tempVar = deckArray[pickedCardNumber];
			deckArray[pickedCardNumber] = deckArray[currentCardCount];
			deckArray[currentCardCount] = tempVar;
		}
		
    }

    public int dealCard()
    {
    	deckPosition++;
    	return deckArray[deckPosition];
    }

}

