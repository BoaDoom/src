
public class SpecialActions 
{
	public int playerOneScore = 0;
	public int playerTwoScore = 0;
	public int playerThreeScore = 0;
	public int playerFourScore = 0;
	int winner = 0;
	public int calcing(int one, int two, int three, int four)
	{
		 	if (one > two && one > three && one > four)
		 	{
			 	System.out.println("The winner of this round is player one with " + one);
		 		playerOneScore++;
		 		winner = 1;
			 	return playerOneScore;
		 	}
		    if (two > one && two > three && two > four)
		    {
		    	System.out.println("The winner of this round is player two with " + two);
		    	playerTwoScore++;
			 	winner = 2;
			 	return playerTwoScore;
		    }
		    if (three > two && three > one && three > four)
		    {
		    	System.out.println("The winner of this round is player three with " + three);
		    	playerThreeScore++;
			 	winner = 3;
			 	return playerThreeScore;
		    }
		    //if (four > one && four > three && four > two)
		    else
		    {
		    	System.out.println("The winner of this round is player four with " + four);
		    	playerFourScore++; 
			 	winner = 4;
			 	return playerFourScore;
		    }
		 }
	}
