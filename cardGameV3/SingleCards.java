package cardGameV3;

public class SingleCards /*subclass of deckofcards object, each individual card made to put in the deck. Common label is aCard. 
Reference with Deck.AllCards.get(i) will access the single cards in order they are created here. 
Deck.AllCards.get(i).valueOfCard will return the value of the card*/
{
	public int valueOfCard = 0;
	
	SingleCards(int imported) //class constructor
	{
		valueOfCard = imported;
	}
	
}