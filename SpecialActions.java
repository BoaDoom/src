
public class SpecialActions //amountCompare
{
	int winner;
	public void calcing(int one, int two, int three, int four)
	{
		 	if (one > two && one > three && one > four)
		 	{
			 	System.out.println("The winner of this round is player one with " + one);
		 		winner = 1;
		 	}
		    if (two > one && two > three && two > four)
		    {
		    	System.out.println("The winner of this round is player two with " + two);
		    	winner = 2;
		    }
		    if (three > two && three > one && three > four)
		    {
		    	System.out.println("The winner of this round is player three with " + three);
		    	winner = 3;
		    }
		    if (four > one && four > three && four > two)
		    {
		    	System.out.println("The winner of this round is player four with " + four);
		    	winner = 4; 
		    }
		 }
	}
