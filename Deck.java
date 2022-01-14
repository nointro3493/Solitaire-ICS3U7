import java.util.ArrayList;
import java.util.Random;

public class Deck {
	private static final int HEARTS = 0;
    private static final int DIAMONDS = 1;
    private static final int SPADES = 2;
    private static final int CLUBS = 3;

    private static final int JACK = 11;
    private static final int QUEEN = 12;
    private static final int KING = 13;
    private static final int ACE = 1;
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
