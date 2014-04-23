import java.util.Random;

public class Randomization {
	public static void main(String[] args) {
		int[] deckArray = { 16, 15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2,
				1 };
		shuffleCards(deckArray);
		//= for (int i = 0; i < deckArray.length; i++) //prints out the series of
		//= random numbers
		//= {
		//= System.out.print(deckArray[i] + " ");
		//= }
	}

	static void shuffleCards(int[] deckArray) {
		Random rand = new Random(); // random number generator
		for (int currentCardCount = deckArray.length - 1; currentCardCount > 0; currentCardCount--)
		// making currentcardcount 15 and then decreasing it by 1 every time it
		// loops till it hits 0
		{
			int pickedCardNumber = rand.nextInt(currentCardCount + 1);
			// assigning the random number (1-16) or 1(-15) etc to
			// pickedcardnumber, which is the chosen position in the array
			int tempVar = deckArray[pickedCardNumber];
			// making tempvar the assigned string position's value (if the
			// position chosen was 4, then the value of tempVar is 13)
			deckArray[pickedCardNumber] = deckArray[currentCardCount];
			// currentcardcount, which is decreasing by 1 every time this loops.
			// The first time through, it replaces the last value of the array,
			// in this case 1, with whichever value was chosen by the random
			// generator. The last value is preserved in position because it
			// can't be chosen next loop because the generator can't go that
			// high.
			deckArray[currentCardCount] = tempVar;
			// assigning the randomly selected location with the end of the
			// array's number in this case 1. This gives the odd effect of
			// picking the last card of the deck first.
		}
	}
}
