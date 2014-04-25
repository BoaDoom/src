
public class Player
{
	public int playerNum = 0;
	public int winCondition = 0;
	public int playerOneScore = 0;
	public int playerTwoScore = 0;
	public int playerThreeScore = 0;
	public int playerFourScore = 0;
	public Player(int numberOfPlayers)	
	{
		playerNum = numberOfPlayers;
		if (playerNum == 2){
			winCondition = 8;
		}
		if (playerNum == 3){
			winCondition = 6;
		}
		if (playerNum == 4){
			winCondition = 4;
		}
	}
}
