package cardGameV3;

import java.util.Scanner;

public class Players {
	//hopefully will store cards for comparison, keep score and do the comparisons
	int cardA = 0;
	int nextCard = 0;
	int playerScore = 0;
	int playerName = 0;
	int playedCard = 0;
	int playerListCount = 0;
	int playerState = 0; //0 is out of round, 1 is in, 2 is handmaiden
	/*Players playerOne;
	Players playerTwo;
	Players playerThree;
	Players playerFour;*/
	Scanner keyboard = new Scanner(System.in);
	
	public void setPlayerStateOn()
	{
		playerState = 1;
	}
	
	/*public void importPlayer(Players PList, int playerListNum)
	{
		if (playerListNum == 0)
		{
			playerOne = PList;
		}
		if (playerListNum == 1)
		{
			playerTwo = PList;
		}
		if (playerListNum == 2)
		{
			playerThree = PList;
		}
		if (playerListNum == 3)
		{
			playerFour = PList;
		}
	}
	*/
	public void getNewCard(int cardB)
	{
		System.out.println("Your turn player number " + playerName);
		System.out.println("Which card would you like to keep? the other will be played");
		System.out.println("1:" + cardA);
		System.out.println("2:" + cardB);
		int cardChoice = keyboard.nextInt();
		if (cardChoice != 1 && cardChoice != 2)
		{
			System.out.println("please choose option 1 or 2");
			getNewCard(cardB);
		}
		playedCard = cardB; //card assigned for being activated and used
		if (cardChoice == 2)
		{
			playedCard = cardA;
			cardA = cardB;
		}
	}
	public void activateTrapCard()
	{
		
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
		cardA = startingCard;
	}
	
	Players(int playerNameTemp)
	{
		playerName = playerNameTemp+1;
	}
}
