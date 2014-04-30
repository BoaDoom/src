package cardGameV3;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainCardGameV3 {
	public static final int MINIMUM_NUM_PLAYERS = 2;
	public static final int MAXIMUM_NUM_PLAYERS = 4;
	public static void main(String[] args) 
	{
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("How many players? (between 2-4)"); //asking for the amount of players
		int numOfPlayers = keyboard.nextInt();
		while (numOfPlayers < MINIMUM_NUM_PLAYERS || numOfPlayers > MAXIMUM_NUM_PLAYERS)
		{			
			System.out.println("that is not the right number of players");
			System.out.println("How many players? (between 2-4)");
			numOfPlayers = keyboard.nextInt();
		}
		DeckOfCards Deck = new DeckOfCards(); //makes a deck object
		List<Players> AllPlayers = new ArrayList<Players>();
		for (int i = 0; i < numOfPlayers; i++)
		{
			Players PlayerNum = new Players(/*constructor*/); //creates a new object PlayerNum, one for each player count
			AllPlayers.add(PlayerNum);  //adds each player object to the list AllPlayers
		}
		
		/* "AllPlayers.get(i)" when i = 2-4 it will refer to each of the objects that are the players hands*/
	}
}
