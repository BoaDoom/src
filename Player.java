
public class Player
{
	public int playerCount = 0;
	public int winCondition = 0;
	public int playerOneScore = 0;
	public int playerTwoScore = 0;
	public int playerThreeScore = 0;
	public int playerFourScore = 0;
	public Player(int numberOfPlayers)	
	{
		playerCount = numberOfPlayers;
		if (playerCount == 2){
			winCondition = 8;
		}
		if (playerCount == 3){
			winCondition = 6;
		}
		if (playerCount == 4){
			winCondition = 4;
		}
	}
}
