package cardGameV3;

public class CardCharacters extends SingleCards{
	
	CardCharacters(int valueImport)
	{
		super(valueImport);
	}
	public class guardCard extends CardCharacters
	{
		int tempvar = 10;

		public guardCard(int valueImport) //constructor for guardAbility
		{
			super(valueImport);
			System.out.println("You played a GUARD! good job");
		}
	}
	public class priestCard extends SingleCards
	{

		int tempvar = 65;
		public priestCard(int valueImport)
		{
			super(valueImport);
			System.out.println("You didn't play a GUARD! good job");
		}
	}
	
/*
 * -there will also be a method for every type of card abilities
 * -as well as a method for retreaving all availible players that can be interacted with with that card, including the player using the card
 * -there also needs to be a function to call and check for countess specials*/
//int currentPlayer = 0;
//int[] playerCardValues = {0,0,0,0};

/*public void updatePlayerCardValues(int playerNum, int cardValue)
{
	if (playerNum == 0)
	{
		playerCardValues[0] = cardValue;
	}
	if (playerNum == 1)
	{
		playerCardValues[1] = cardValue;
	}
	if (playerNum == 2)
	{
		playerCardValues[2] = cardValue;
	}
	if (playerNum == 3)
	{
		playerCardValues[3] = cardValue;
	}
	}
	*/
}

