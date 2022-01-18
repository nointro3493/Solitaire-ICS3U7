import java.util.ArrayList;

public class HalfDeck extends Deck{

	public HalfDeck(){
		int imageNumber = 0;
		deck = new ArrayList<Card>();
		for(int rank = 1; rank <= 8; rank++)
		{
			for(int suit = HEARTS; suit <= CLUBS; suit++)
			{
				//Card card = new Card(rank, suit, cardImages.get(imageNumber));
				//deck.add(card);
				imageNumber++;
			}
		}

	}
	public void shuffle()
	{
		for(int i = 0; i < deck.size(); i++)
		{
			int randomIndex = (int) (Math.random() * deck.size());
			Card x = deck.get(i);
			Card y = deck.get(randomIndex);

			deck.set(i, y);
			deck.set(randomIndex, x);
		}
	}
}