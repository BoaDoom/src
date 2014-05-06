package cardGameV3;

import java.util.ArrayList;
import java.util.Random;
import java.util.List;

public class DeckOfCards //name of object is Deck
{
	public static final int[] NUMBER_AND_VALUE_OF_GUARDS = {5, 1}; //first number is amount of cards, second is their value
	public static final int[] NUMBER_AND_VALUE_OF_PRIESTS = {2, 2};
	public static final int[] NUMBER_AND_VALUE_OF_BARONS = {2, 3};
	public static final int[] NUMBER_AND_VALUE_OF_HANDMAIDENS = {2, 4};
	public static final int[] NUMBER_AND_VALUE_OF_PRINCES = {2, 5};
	public static final int[] NUMBER_AND_VALUE_OF_KINGS = {1, 6};
	public static final int[] NUMBER_AND_VALUE_OF_COUNTESSES = {1, 7};
	public static final int[] NUMBER_AND_VALUE_OF_PRINCESSES = {1, 8};
	public static final int cardCount = NUMBER_AND_VALUE_OF_GUARDS[0] + NUMBER_AND_VALUE_OF_PRIESTS[0] + NUMBER_AND_VALUE_OF_BARONS[0] + NUMBER_AND_VALUE_OF_HANDMAIDENS[0]+ NUMBER_AND_VALUE_OF_PRINCES[0] + NUMBER_AND_VALUE_OF_KINGS[0] + NUMBER_AND_VALUE_OF_COUNTESSES[0] + NUMBER_AND_VALUE_OF_PRINCESSES[0];
    //previous huge like is the total card count given the previous amount values of each card
	public int cardsDealt = -1;
	Random randomizer = new Random(); //randomizer
	List<SingleCards> AllCards = new ArrayList<SingleCards>();
    

    public int dealCard()
    {
    	cardsDealt++;
    	return AllCards.get(cardsDealt).valueOfCard;
    }
    
    public void shuffle()
    {	
		for (int firstCardCount = cardCount; firstCardCount > 0; firstCardCount--) //shuffles deck array
		{
			int pickedCardNumber = randomizer.nextInt(firstCardCount); //randomizes a number of the deck size
			AllCards.add(AllCards.get(pickedCardNumber)); //assigns random card from AllCards list to end of the list
			/*System.out.println(AllCards.get(pickedCardNumber).valueOfCard);*/ //tester for printing out the randomized deck
			AllCards.remove(pickedCardNumber); //removes the card from the list so it wont get picked again
		}
		cardsDealt = -1;
    }
        
	DeckOfCards() //constructor for creating all the cards in the right amount of each
	{
		for (int i = 0; i < NUMBER_AND_VALUE_OF_GUARDS[0]; i++)
		{
			SingleCards Acard = new SingleCards(NUMBER_AND_VALUE_OF_GUARDS[1]); //creates a sub-object for every guard
			AllCards.add(Acard); //adds card into the array list AllCards
		}
		for (int i = 0; i < NUMBER_AND_VALUE_OF_PRIESTS[0]; i++)
		{
			SingleCards Acard = new SingleCards(NUMBER_AND_VALUE_OF_PRIESTS[1]);
			AllCards.add(Acard);
		}
		for (int i = 0; i < NUMBER_AND_VALUE_OF_BARONS[0]; i++)
		{
			SingleCards Acard = new SingleCards(NUMBER_AND_VALUE_OF_BARONS[1]);
			AllCards.add(Acard);
		}
		for (int i = 0; i < NUMBER_AND_VALUE_OF_HANDMAIDENS[0]; i++)
		{
			SingleCards Acard = new SingleCards(NUMBER_AND_VALUE_OF_HANDMAIDENS[1]);
			AllCards.add(Acard);
		}
		for (int i = 0; i < NUMBER_AND_VALUE_OF_PRINCES[0]; i++)
		{
			SingleCards Acard = new SingleCards(NUMBER_AND_VALUE_OF_PRINCES[1]);
			AllCards.add(Acard);
		}
		for (int i = 0; i < NUMBER_AND_VALUE_OF_KINGS[0]; i++)
		{
			SingleCards Acard = new SingleCards(NUMBER_AND_VALUE_OF_KINGS[1]);
			AllCards.add(Acard);
		}
		for (int i = 0; i < NUMBER_AND_VALUE_OF_COUNTESSES[0]; i++)
		{
			SingleCards Acard = new SingleCards(NUMBER_AND_VALUE_OF_COUNTESSES[1]);
			AllCards.add(Acard);
		}
		for (int i = 0; i < NUMBER_AND_VALUE_OF_PRINCESSES[0]; i++)
		{
			SingleCards Acard = new SingleCards(NUMBER_AND_VALUE_OF_PRINCESSES[1]);
			AllCards.add(Acard);
		}
		shuffle();
	}
	
}
