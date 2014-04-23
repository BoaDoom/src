import java.util.Scanner;

public class ObjectStartingDeck {
	private static Scanner keyboard;
	public static void main(String[] args) {
		keyboard = new Scanner(System.in);
		System.out.println("How many players? (between 2-4)");
		int numOfPlayers = keyboard.nextInt();
		Deck firstDeal = new Deck(numOfPlayers);
	}
}
