import java.util.Scanner;
public class Hands //Holdings

{

	public int cardsRemaining = 16;
	public int playerTurn = 0;
	public int playerCount = 0;
	public int playerOnesHand = 0;
	public int playerTwosHand = 0;
	public int playerThreesHand = 0;
	public int playerFoursHand = 0;
	public int cardChoice = 0;
	public int highScore = 0;
	Scanner keyboard = new Scanner(System.in);
	SpecialActions amountCompare = new SpecialActions();

	public boolean cardAction(int newCard)
	{
		playerTurn++;
		if (playerTurn == 1)
		{
			playerOnesHand = theChoosing(newCard, playerOnesHand);
		}
		if (playerTurn == 2)
		{
			playerTwosHand = theChoosing(newCard, playerTwosHand);
		}
		if (playerTurn == 3)
		{
			playerThreesHand = theChoosing(newCard, playerThreesHand);
		}
		if (playerTurn == 4)
		{
			playerFoursHand = theChoosing(newCard, playerFoursHand);
		}
		
		if (playerTurn == playerCount)
		{
				playerTurn = 0;
		}
		if (cardsRemaining == 1)
		{

			highScore = amountCompare.calcing(playerOnesHand, playerTwosHand, playerThreesHand, playerFoursHand);
			boolean winCon = true;
			playerTurn = amountCompare.winner;
			return winCon;
		}
		cardsRemaining--;
		return false;
	}

	public Hands(int playerCounted)
	{
		cardsRemaining = cardsRemaining - playerCounted;
		playerCount = playerCounted;
	}
	public int theChoosing(int newCard, int playersOldHand)
	{
		System.out.println("Which card would you like to play? the other will be kept");
		System.out.println("1:" + newCard);
		System.out.println("2:" + playersOldHand);
		cardChoice = keyboard.nextInt();
		if (cardChoice != 1 && cardChoice != 2)
		{
			System.out.println("please choose option 1 or 2");
			theChoosing(newCard , playersOldHand);
		}
		if (cardChoice == 1) //this is where you would add in the use the card you play
		{
			return newCard;
		}
		else
			return playersOldHand;
	}
	
}

