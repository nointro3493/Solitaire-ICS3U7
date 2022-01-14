import java.util.ArrayList;
import java.util.Random;

public class Deck {
	protected static final int HEARTS = 0;
    protected static final int SPADES = 1;
    protected static final int DIAMONDS = 2;
    protected static final int CLUBS = 3;

    protected static final int JACK = 11;
    protected static final int QUEEN = 12;
    protected static final int KING = 13;
    protected static final int ACE = 1;
    int x;
    int y;
    
    public ArrayList<Card> deck;
    
    public Deck()
    {   
        deck = new ArrayList<Card>();
        
        for(int rank = 1; rank <= KING; rank++)
        {
            for(int suit = HEARTS; suit <= CLUBS; suit++)
            {
                Card card = new Card(rank, suit);
                deck.add(card);
            }
        }
    }
    
    
    

    public void shuffle()
    {
        for(int i = 0; i < deck.size(); i++)
        {
            int randomIndex = (int) (Math.random() * 52);
            Card x = deck.get(i);
            Card y = deck.get(randomIndex);
            
            deck.set(i, y);
            deck.set(randomIndex, x);
        }
    }

    public void deal() 
    {
    	int cardCnt = 0;
    	for(int piles = 1; piles < 8; piles++) {

    		for(int cards = 1; cards <= piles; cards++) {
    			System.out.print(deck.get(cardCnt) + " ");
    			cardCnt++;
    		}
    		System.out.println();
    	}
    }
	 

}
