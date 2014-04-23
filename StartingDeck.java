import java.util.Random;
import java.util.Scanner;

public class StartingDeck {
	public static int changingCardNumber = 15;
	public static void main(String[] args) {
		byte totalPlayerNumber = 2;
		Scanner keyboard = new Scanner(System.in);  //makes keyboard object
		int[] deckArray = { 16, 15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1 };
		int currentPlayer = 0;
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
		System.out.print(playerOneHand);
		System.out.print(playerTwoHand);
		
		int playerTurn = 1;
		for (int cardsDealtCount = 0; cardsDealtCount < deckArray.length; cardsDealtCount++)	//a loop for each card dealt, stops when all cards used
		{
			if (playerTurn == 1)
			{
				int tempVar = playerOneHand;
				playerOneHand = dealAndSelectCard(tempVar, deckArray, deckPosition);
				deckPosition++;
				System.out.print(playerOneHand + "");
			}
			else if (playerTurn == 2)
			{
				int tempVar = playerTwoHand;
				playerTwoHand = dealAndSelectCard(tempVar, deckArray, deckPosition);
				deckPosition++;
				System.out.print(playerTwoHand + "");
			}
			playerTurn++;	//move to next player
			if (playerTurn > totalPlayerNumber)  //if variable goes above number of players, starts over at one
			{
				playerTurn = 1;
			}
			
		}

		
	}
		public static int dealAndSelectCard(int playerHand, int[] deckArray, int deckPosition)
		{	
			int[] tempTwoCardHand = {0, 0};
			tempTwoCardHand[0] = playerHand;
			tempTwoCardHand[1] = dealACard(deckArray, deckPosition);
			int singleCardReturn = tempTwoCardHand[1]; //temporarily always picking the second card
			return singleCardReturn;
		}

		public static int dealACard(int[] deckArray, int cardNumber) //dealing a card
		{
			int aCard = deckArray[cardNumber];
			return aCard;
		}
		
	    /*
		for (int i2 = 0; i2 < 8; i2++) //prints two players hands
		{
		System.out.print(playerOneHand[i2] + " ");
		}
		System.out.println();
		for (int i3 = 0; i3 < 8; i3++)
		{
		System.out.print(playerTwoHand[i3] + " ");
		}
		*/
		
}
	
