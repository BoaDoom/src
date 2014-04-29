
public class Player //begin
{
	public int playerNum = 0;
	public int winCondition = 0;
	public Player(int numberOfPlayers)	
	{
		if (numberOfPlayers == 2)
		{
			winCondition = 8;
		}
		if (numberOfPlayers == 3)
		{
			winCondition = 6;
		}
		else
			winCondition = 4;
	}
}
