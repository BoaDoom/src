package cardGameV3;

//import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//import cardGameV3.Cards.Players; //no idea where this came from

public class SingleCards /*invoked by deckofcards object, each individual card made to put in the deck. Common label is aCard. 
Reference with Deck.AllCards.get(i) will access the single cards in order they are created here. 
Deck.AllCards.get(i).valueOfCard will return the value of the card*/
{
	public int valueOfCard;
	public int choice;
	public String nameOfCard;
	public int numberOfNonNullPlayers = 0;
	protected Scanner keyboard = new Scanner(System.in);
	protected SingleCards()
	{
	}
	
	public String nameThisCard(int theCardValueToBeNamed)
	{
		if (theCardValueToBeNamed == 1)
		{
			return "Guard";
		}
		if (theCardValueToBeNamed == 2)
		{
			return "Prince";
		}
		if (theCardValueToBeNamed == 3)
		{
			return "Baron";
		}
		if (theCardValueToBeNamed == 4)
		{
			return "Handmaid";
		}
		if (theCardValueToBeNamed == 5)
		{
			return "Prince";
		}
		if (theCardValueToBeNamed == 6)
		{
			return "King";
		}
		if (theCardValueToBeNamed == 7)
		{
			return "Countess";
		}
		if (theCardValueToBeNamed == 8)
		{
			return "Princess";
		}
		return "UNKNOWN!!";
	}
	public int attackWithCard(Players AttackingPlayer, Players DefendingPlayer)
	{		
		return 0;
	}
	
	public int checkForAttack(List<Players> AllPlayers, int turnCount) //importing all players to check availibilty for attack with card ability
	{
		System.out.println("Please pick an availible player you would like to use your card on");
		for (int i = 0; i < AllPlayers.size(); i++)
		{
			if ((AllPlayers.get(i).playerName) == (AllPlayers.get(turnCount).playerName)) //if this is the player himself
			{
				System.out.println((i+1) + ": Player " + (i+1) + " you are unable to play this on yourself");
				continue;
			}
			if ((AllPlayers.get(i).blocked == 1))
			{
				System.out.println((i+1) + ": Player " + (i+1) + " is protected"); //if player has a handmaid
				continue;
			}
			if ((AllPlayers.get(i).playerState == 0))
			{
				System.out.println((i+1) + ": Player " + (i+1) + " is out of the round"); //if player is out of the round
				continue;
			}
			else
			{
				System.out.println((i+1) + ": Player " + (i+1));
				numberOfNonNullPlayers++;
			}
		}
		if (numberOfNonNullPlayers == 0)
		{
			System.out.println("There is nobody to use this card on, you will have to discard it without effect\n");
			return 0;
		}
			
		choice =  keyboard.nextInt() - 1;
		if ((AllPlayers.get(choice).blocked == 1) || (AllPlayers.get(choice).playerState == 0) || (AllPlayers.get(choice).playerName == AllPlayers.get(turnCount).playerName)) //checking to see if player selection is valid
		{
			System.out.println("That is not a valid player selection, please try again\n\n");
			checkForAttack(AllPlayers, turnCount);
		}
		numberOfNonNullPlayers = 0; //sets checker back to 0
		return choice;	
	}
	

	


	
}
