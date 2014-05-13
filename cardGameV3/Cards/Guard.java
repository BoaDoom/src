package cardGameV3.Cards;
import cardGameV3.Players;
import cardGameV3.SingleCards;

import java.util.ArrayList;

public class Guard extends SingleCards{
	

	public Guard()
	{
		super();
		valueOfCard = 1;
		nameOfCard = "Guard";
	}
	public void attackWithCard(Players AttackingPlayer, Players DefendingPlayer)
	{		
		System.out.println("Player " + AttackingPlayer.playerName + ", what card do you think Player " + DefendingPlayer.playerName + "\nhas in his hand?");
		System.out.println("\n1.Priest" + "\n2.Baron" + "\n3.Handmaid" + "\n4.Prince" + "\n5.King" + "\n6.Countess" + "\nPrincess");
	}

	{
		
	}

}
