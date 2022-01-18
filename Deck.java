import javax.swing.*;
import java.awt.*;
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
    
    protected static JLabel aH;
    protected static JLabel twoH;
    protected static JLabel threeH;
    protected static JLabel fourH;
    protected static JLabel fiveH;
    protected static JLabel sixH;
    protected static JLabel sevenH;
    protected static JLabel eightH;
    protected static JLabel nineH;
    protected static JLabel tenH;
    protected static JLabel jH;
    protected static JLabel qH;
    protected static JLabel kH;
    protected static JLabel aD;
    protected static JLabel twoD;
    protected static JLabel threeD;
    protected static JLabel fourD;
    protected static JLabel fiveD;
    protected static JLabel sixD;
    protected static JLabel sevenD;
    protected static JLabel eightD;
    protected static JLabel nineD;
    protected static JLabel tenD;
    protected static JLabel jD;
    protected static JLabel qD;
    protected static JLabel kD;
    protected static JLabel aS;
    protected static JLabel twoS;
    protected static JLabel threeS;
    protected static JLabel fourS;
    protected static JLabel fiveS;
    protected static JLabel sixS;
    protected static JLabel sevenS;
    protected static JLabel eightS;
    protected static JLabel nineS;
    protected static JLabel tenS;
    protected static JLabel jS;
    protected static JLabel qS;
    protected static JLabel kS;
    protected static JLabel aC;
    protected static JLabel twoC;
    protected static JLabel threeC;
    protected static JLabel fourC;
    protected static JLabel fiveC;
    protected static JLabel sixC;
    protected static JLabel sevenC;
    protected static JLabel eightC;
    protected static JLabel nineC;
    protected static JLabel tenC;
    protected static JLabel jC;
    protected static JLabel qC;
    protected static JLabel kC;
    
    
    public ArrayList<Card> deck;
    
    public Deck()
    {   
    	ArrayList<JLabel> cardImages = new ArrayList<JLabel>();
    	
    	aH = new JLabel();
    	aH.setIcon(new ImageIcon("images/AH.jpeg"));
    	cardImages.add(aH);
    	
    	aS = new JLabel();
    	aS.setIcon(new ImageIcon("images/AS.jpeg"));
    	cardImages.add(aS);
    	
    	aD = new JLabel();
    	aD.setIcon(new ImageIcon("images/AD.jpeg"));
    	cardImages.add(aD);
    	
    	aC = new JLabel();
    	aC.setIcon(new ImageIcon("images/AC.jpeg"));
    	cardImages.add(aC);
    	
    	twoH = new JLabel();
    	twoH.setIcon(new ImageIcon("images/2H.jpeg"));
    	cardImages.add(twoH);
    	
    	twoS = new JLabel();
    	twoS.setIcon(new ImageIcon("images/2S.jpeg"));
    	cardImages.add(twoS);
    	
    	twoD = new JLabel();
    	twoD.setIcon(new ImageIcon("images/2D.jpeg"));
    	cardImages.add(twoD);
    	
    	twoC = new JLabel();
    	twoC.setIcon(new ImageIcon("images/2C.jpeg"));
    	cardImages.add(twoC);
    	
    	threeH = new JLabel();
    	threeH.setIcon(new ImageIcon("images/3H.jpeg"));
    	cardImages.add(threeH);
    	
    	threeS = new JLabel();
    	threeS.setIcon(new ImageIcon("images/3S.jpeg"));
    	cardImages.add(threeS);
    	
    	threeD = new JLabel();
    	threeD.setIcon(new ImageIcon("images/3D.jpeg"));
    	cardImages.add(threeD);
    	
    	threeC = new JLabel();
    	threeC.setIcon(new ImageIcon("images/3C.jpeg"));
    	cardImages.add(threeC);
    	
    	fourH = new JLabel();
    	fourH.setIcon(new ImageIcon("images/4H.jpeg"));
    	cardImages.add(fourH);
    	
    	fourS = new JLabel();
    	fourS.setIcon(new ImageIcon("images/4S.jpeg"));
    	cardImages.add(fourS);
    	
    	fourD = new JLabel();
    	fourD.setIcon(new ImageIcon("images/4D.jpeg"));
    	cardImages.add(fourD);
    	
    	fourC = new JLabel();
    	fourC.setIcon(new ImageIcon("images/4C.jpeg"));
    	cardImages.add(fourC);
    	
    	fiveH = new JLabel();
    	fiveH.setIcon(new ImageIcon("images/5H.jpeg"));
    	cardImages.add(fiveH);
    	
    	fiveS = new JLabel();
    	fiveS.setIcon(new ImageIcon("images/5S.jpeg"));
    	cardImages.add(fiveS);
    	
    	fiveD = new JLabel();
    	fiveD.setIcon(new ImageIcon("images/5D.jpeg"));
    	cardImages.add(fiveD);
    	
    	fiveC = new JLabel();
    	fiveC.setIcon(new ImageIcon("images/5C.jpeg"));
    	cardImages.add(fiveC);
    	
    	sixH = new JLabel();
    	sixH.setIcon(new ImageIcon("images/6H.jpeg"));
    	cardImages.add(sixH);
    	
    	sixS = new JLabel();
    	sixS.setIcon(new ImageIcon("images/6S.jpeg"));
    	cardImages.add(sixS);
    	
    	sixD = new JLabel();
    	sixD.setIcon(new ImageIcon("images/6D.jpeg"));
    	cardImages.add(sixD);
    	
    	sixC = new JLabel();
    	sixC.setIcon(new ImageIcon("images/6C.jpeg"));
    	cardImages.add(sixC);
    	
    	sevenH = new JLabel();
    	sevenH.setIcon(new ImageIcon("images/7H.jpeg"));
    	cardImages.add(sevenH);
    	
    	sevenS = new JLabel();
    	sevenS.setIcon(new ImageIcon("images/7S.jpeg"));
    	cardImages.add(sevenS);
    	
    	sevenD = new JLabel();
    	sevenD.setIcon(new ImageIcon("images/7D.jpeg"));
    	cardImages.add(sevenD);
    	
    	sevenC = new JLabel();
    	sevenC.setIcon(new ImageIcon("images/7C.jpeg"));
    	cardImages.add(sevenC);
    	
    	eightH = new JLabel();
    	eightH.setIcon(new ImageIcon("images/8H.jpeg"));
    	cardImages.add(eightH);
    	
    	eightS = new JLabel();
    	eightS.setIcon(new ImageIcon("images/8S.jpeg"));
    	cardImages.add(eightS);
    	
    	eightD = new JLabel();
    	eightD.setIcon(new ImageIcon("images/8D.jpeg"));
    	cardImages.add(eightD);
    	
    	eightC = new JLabel();
    	eightC.setIcon(new ImageIcon("images/8C.jpeg"));
    	cardImages.add(eightC);
    	
    	nineH = new JLabel();
    	nineH.setIcon(new ImageIcon("images/9H.jpeg"));
    	cardImages.add(nineH);
    	
    	nineS = new JLabel();
    	nineS.setIcon(new ImageIcon("images/9S.jpeg"));
    	cardImages.add(nineS);
    	
    	nineD = new JLabel();
    	nineD.setIcon(new ImageIcon("images/9D.jpeg"));
    	cardImages.add(nineD);
    	
    	nineC = new JLabel();
    	nineC.setIcon(new ImageIcon("images/9C.jpeg"));
    	cardImages.add(nineC);
    	
    	tenH = new JLabel();
    	tenH.setIcon(new ImageIcon("images/10H.jpeg"));
    	cardImages.add(tenH);
    	
    	tenS = new JLabel();
    	tenS.setIcon(new ImageIcon("images/10S.jpeg"));
    	cardImages.add(tenS);
    	
    	tenD = new JLabel();
    	tenD.setIcon(new ImageIcon("images/10D.jpeg"));
    	cardImages.add(tenD);
    	
    	tenC = new JLabel();
    	tenC.setIcon(new ImageIcon("images/10C.jpeg"));
    	cardImages.add(tenC);
    	
    	jH = new JLabel();
    	jH.setIcon(new ImageIcon("images/JH.jpeg"));
    	cardImages.add(jH);
    	
    	jS = new JLabel();
    	jS.setIcon(new ImageIcon("images/JS.jpeg"));
    	cardImages.add(jS);
    	
    	jD = new JLabel();
    	jD.setIcon(new ImageIcon("images/JD.jpeg"));
    	cardImages.add(jD);
    	
    	jC = new JLabel();
    	jC.setIcon(new ImageIcon("images/JC.jpeg"));
    	cardImages.add(jC);
    	
    	qH = new JLabel();
    	qH.setIcon(new ImageIcon("images/QH.jpeg"));
    	cardImages.add(qH);
    	
    	qS = new JLabel();
    	qS.setIcon(new ImageIcon("images/QS.jpeg"));
    	cardImages.add(qS);
    	
    	qD = new JLabel();
    	qD.setIcon(new ImageIcon("images/QD.jpeg"));
    	cardImages.add(qD);
    	
    	qC = new JLabel();
    	qC.setIcon(new ImageIcon("images/QC.jpeg"));
    	cardImages.add(qC);
    	
    	kH = new JLabel();
    	kH.setIcon(new ImageIcon("images/KH.jpeg"));
    	cardImages.add(kH);
    	
    	kS = new JLabel();
    	kS.setIcon(new ImageIcon("images/KS.jpeg"));
    	cardImages.add(kS);
    	
    	kD = new JLabel();
    	kD.setIcon(new ImageIcon("images/KD.jpeg"));
    	cardImages.add(kD);
    	
    	kC = new JLabel();
    	kC.setIcon(new ImageIcon("images/KC.jpeg"));
    	cardImages.add(kC);
    	
    	int imageNum = 0;
        deck = new ArrayList<Card>();
        
        for(int rank = 1; rank <= KING; rank++)
        {
            for(int suit = HEARTS; suit <= CLUBS; suit++)
            {
                Card card = new Card(rank, suit, cardImages.get(imageNum));
                deck.add(card);
                imageNum++;
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

    public void deal() 
    {
    	int cardCnt = 0;
    	x = 20;
		y = 20;
    	for(int piles = 1; piles < 8; piles++) {

    		for(int cards = 1; cards <= piles; cards++) {
    			
    			cardCnt++;
    		}
    		System.out.println();
    	}
    }
	
    public static void main (String[] args) {
    	SolitaireMain main = new SolitaireMain();
    	//kC.setBounds(10, 10, 10, 10);
    	main.add(kC);
    }
}
