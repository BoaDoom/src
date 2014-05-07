package cardGameV3;

import java.util.Scanner;

public class Players {
	//hopefully will store cards for comparison, keep score and do the comparisons
	int currentCard = 0;
	int nextCard = 0;
	int playerScore = 0;
	int playerName = 0;
	int playedCard = 0;
	int keptCard = 0;
	Scanner keyboard = new Scanner(System.in);
	
	public void getNewCard(int drawnCard)
	{
		System.out.println("Your turn player number " + playerName);
		System.out.println("Which card would you like to keep? the other will be played");
		System.out.println("1:" + currentCard);
		System.out.println("2:" + drawnCard);
		int cardChoice = keyboard.nextInt();
		if (cardChoice != 1 && cardChoice != 2)
		{
			System.out.println("please choose option 1 or 2");
			getNewCard(nextCard);
		}
		playedCard = nextCard; //card assigned for being activated and used
		if (cardChoice == 2)
		{
			playedCard = currentCard;
			currentCard = nextCard;
		}
	}
	/*
	public boolean compareCards(Players otherPlayers) //unused card comparer
	{
		if (otherPlayers.currentCard < currentCard)
		{
			return true;
		}
		if (otherPlayers.currentCard == currentCard)
		{
			return false;
		}
		return false;
	}
	*/
	public void scored()
	{
		playerScore++;
	}
	public void getStartingCard(int startingCard)
	{
		currentCard = startingCard;
	}
	
	Players(int playerNameTemp)
	{
		playerName = playerNameTemp+1;
	}
}
