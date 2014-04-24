import java.util.Random;
import java.util.Scanner;

public class StartingDeck0 {
	public static int changingCardNumber = 15;
	public static void main(String[] args) {
		byte totalPlayerNumber = 2;
		int[] deckArray = { 16, 15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1 };
		//int currentPlayer = 0;
		int deckPosition = 0;
		int playerOneHand = 0;
		int playerTwoHand = 0;
		Random rand = new Random(); // random number generator
		for (int currentCardCount = deckArray.length - 1; currentCardCount > 0; currentCardCount--) //shuffles deck array
		{
			int pickedCardNumber = rand.nextInt(currentCardCount + 1);
			int tempVar = deckArray[pickedCardNumber];
			deckArray[pickedCardNumber] = deckArray[currentCardCount];
			deckArray[currentCardCount] = tempVar;
		}
		for (int i = 0; i < deckArray.length; i++) //prints out shuffled array
	    {
	      System.out.print(deckArray[i] + " ");
	    }
		System.out.println();

		if (totalPlayerNumber == 2) //checking to see how many players there are and dealing all their first card
		{
			playerOneHand = dealACard(deckArray, deckPosition);
			deckPosition++;
			playerTwoHand = dealACard(deckArray, deckPosition);
			deckPosition++;
		}
		else if (totalPlayerNumber != 2)
		{
			System.out.print("something got screwed up, try again");				
		}
		
		int playerTurn = 1;
		for (int cardsDealtCount = 14; cardsDealtCount > 0; cardsDealtCount--)	//a loop for each card dealt, stops when all cards used
		{
			if (playerTurn == 1)
			{
				int tempVar = playerOneHand;
				playerOneHand = dealAndSelectCard(tempVar, deckArray, deckPosition, playerTurn);
				deckPosition++;
				System.out.print(playerOneHand + " ");
			}
			else if (playerTurn == 2)
			{
				int tempVar = playerTwoHand;
				playerTwoHand = dealAndSelectCard(tempVar, deckArray, deckPosition, playerTurn);
				deckPosition++;
				System.out.print(playerTwoHand + " ");
			}
			playerTurn++;	//move to next player
			if (playerTurn > totalPlayerNumber)  //if variable goes above number of players, starts over at one
			{
				playerTurn = 1;
			}
			
		}
		System.out.print("\nPlayer one's card is:" + playerOneHand);
		System.out.print("\nPlayer two's card is:" + playerTwoHand);

		
	}
		public static int dealAndSelectCard(int playerHand, int[] deckArray, int deckPosition, int pNameNum)
		{	
			Scanner keyboard = new Scanner(System.in);  //makes keyboard object
			int[] tempTwoCardHand = {0, 0};
			tempTwoCardHand[0] = playerHand;
			tempTwoCardHand[1] = dealACard(deckArray, deckPosition);
			int cardChoice = -1;
			String pName = null;
			if (pNameNum == 1)
			{
				pName = "Player One";
			}
			else if (pNameNum == 2)
			{
				pName = "Player Two";
			}
			while ((cardChoice != 0) && (cardChoice != 1))
			{
				System.out.println("\n" + pName + " which card would you like?\n" + "1. " + tempTwoCardHand[0] + "\n2. " + tempTwoCardHand[1]);
				cardChoice = keyboard.nextInt() - 1;
			}
				return tempTwoCardHand[cardChoice];
			
		}

		public static int dealACard(int[] deckArray, int cardNumber) //dealing a card
		{
			int aCard = deckArray[cardNumber];
			return aCard;
		}

		
}