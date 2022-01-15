import java.util.ArrayList;

public class HalfDeck extends Deck{
	
	public HalfDeck(){
		
	   deck = new ArrayList<Card>();
	   for(int rank = 1; rank <= 8; rank++)
       {
           for(int suit = HEARTS; suit <= CLUBS; suit++)
           {
               Card card = new Card(rank, suit);
               deck.add(card);
           }
       }
	}
}