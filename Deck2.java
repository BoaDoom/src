public class Deck 
{
    public int [] deckArray;
    public int deckPosition;

    /* This is a constructor. This function is called when you do:
            Deck thisDeck = new Deck();    

            that Deck(); is calling this function to create the Deck object
            So any intialization code for a Deck object goes in this constructor
    */
    public Deck()
    {
    	deckArray = { 16, 15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1 };
        deckPosition = 0;
    }

    public int dealCard()
    {
        // put deal function here
    }

}
