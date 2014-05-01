package cardGameV3;

import java.util.Scanner;

public class Players {
	//hopefully will store cards for comparison, keep score and do the comparisons
	int currentCard = 0;
	int nextCard = 0;
	int playerScore = 0;
	int playerName = 0;
	Scanner keyboard = new Scanner(System.in);
	
	public void getNewCard(int nextCard)
	{
		System.out.println("Your turn player number " + playerName);
		System.out.println("Which card would you like to play? the other will be kept");
		System.out.println("1:" + currentCard);
		System.out.println("2:" + nextCard);
		int cardChoice = keyboard.nextInt();
		if (cardChoice != 1 && cardChoice != 2)
		{
			System.out.println("please choose option 1 or 2");
			getNewCard(nextCard);
		}
		if (cardChoice == 2)
		{
			currentCard = nextCard;
		}
	}
	
	Players(int startingCard, int playerNameTemp)
	{
		currentCard = startingCard;
		playerName = playerNameTemp+1;
	}
}
