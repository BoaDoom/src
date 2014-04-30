package cardGameV3;

import java.util.ArrayList;
import java.util.List;

public class DeckOfCards 
{
	public static final int[] NUMBER_AND_VALUE_OF_GUARDS = {5, 1}; //first number is amount of cards, second is their value
	public static final int[] NUMBER_AND_VALUE_OF_PRIESTS = {2, 2};
	public static final int[] NUMBER_AND_VALUE_OF_BARONS = {2, 3};
	public static final int[] NUMBER_AND_VALUE_OF_HANDMAIDENS = {2, 4};
	public static final int[] NUMBER_AND_VALUE_OF_PRINCES = {2, 5};
	public static final int[] NUMBER_AND_VALUE_OF_KINGS = {1, 6};
	public static final int[] NUMBER_AND_VALUE_OF_COURTESANS = {1, 7};
	public static final int[] NUMBER_AND_VALUE_OF_PRINCESSES = {1, 8};
	public static final int TOTAL_NUMBER_OF_CARDS = 16;
    public int [] deckArray = { 16, 15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1 };
    
    
	DeckOfCards() //constructor
	{
		List<singleCards> AllCards = new ArrayList<singleCards>();
		for (int i = 0; i < TOTAL_NUMBER_OF_CARDS -1; i++)
		{
			singleCards Acard = new singleCards(i); //creates a sub-object for every TOALNUMBEROFCARDS, throwing card number into the constructor
		}
	}
	
	
	public class singleCards //subclass of deckofcards object, each individual card
	{
		public int i = 0;
		public int valueOfCard = 0;
		public int cardCounter = 0;
		singleCards(int i) //subclass constructor
		{
			if (i < NUMBER_AND_VALUE_OF_GUARDS[0])
			{
				valueOfCard =NUMBER_AND_VALUE_OF_GUARDS[1];
				cardCounter + 1;
			}
			if ((i == NUMBER_AND_VALUE_OF_PRIESTS[0] + cardCounter) || (i == NUMBER_AND_VALUE_OF_PRIESTS[0] + 1));
			{
				valueOfCard =NUMBER_AND_VALUE_OF_PRIESTS[1];
				cardCounter++;
			}
			if (i == NUMBER_AND_VALUE_OF_BARONS[0] || (i == NUMBER_AND_VALUE_OF_BARONS[0] + 1))
			{
				valueOfCard =NUMBER_AND_VALUE_OF_BARONS[1];
			}
			if (i == NUMBER_AND_VALUE_OF_HANDMAIDENS[0] || (i == NUMBER_AND_VALUE_OF_HANDMAIDENS[0] + 1))
			{
				valueOfCard =NUMBER_AND_VALUE_OF_HANDMAIDENS[1];
			}
			if (i == NUMBER_AND_VALUE_OF_PRINCES[0] || (i == NUMBER_AND_VALUE_OF_PRINCES[0] + 1))
			{
				valueOfCard =NUMBER_AND_VALUE_OF_PRINCES[1];
			}
			if (i == NUMBER_AND_VALUE_OF_KINGS[0] || (i == NUMBER_AND_VALUE_OF_KINGS[0] + 1))
			{
				valueOfCard =NUMBER_AND_VALUE_OF_KINGS[1];
			}
			if (i == NUMBER_AND_VALUE_OF_COURTESANS[0])
			{
				valueOfCard =NUMBER_AND_VALUE_OF_COURTESANS[1];
			}
			if (i == NUMBER_AND_VALUE_OF_PRINCESSES[0])
			{
				valueOfCard =NUMBER_AND_VALUE_OF_PRINCESSES[1];
			}
			
		}
			
		
	}
}
