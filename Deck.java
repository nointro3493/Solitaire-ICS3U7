import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.Random;

public class Deck 
{
	public static final int HEARTS = 0;
	public static final int SPADES = 1;
	public static final int DIAMONDS = 2;
	public static final int CLUBS = 3;

	public static final int JACK = 11;
	public static final int QUEEN = 12;
	public static final int KING = 13;
	public static final int ACE = 1;
	int x;
	int y;

	public static JLabel aH;
	public static JLabel twoH;
	public static JLabel threeH;
	public static JLabel fourH;
	public static JLabel fiveH;
	public static JLabel sixH;
	public static JLabel sevenH;
	public static JLabel eightH;
	public static JLabel nineH;
	public static JLabel tenH;
	public static JLabel jH;
	public static JLabel qH;
	public static JLabel kH;
	public static JLabel aD;
	public static JLabel twoD;
	public static JLabel threeD;
	public static JLabel fourD;
	public static JLabel fiveD;
	public static JLabel sixD;
	public static JLabel sevenD;
	public static JLabel eightD;
	public static JLabel nineD;
	public static JLabel tenD;
	public static JLabel jD;
	public static JLabel qD;
	public static JLabel kD;
	public static JLabel aS;
	public static JLabel twoS;
	public static JLabel threeS;
	public static JLabel fourS;
	public static JLabel fiveS;
	public static JLabel sixS;
	public static JLabel sevenS;
	public static JLabel eightS;
	public static JLabel nineS;
	public static JLabel tenS;
	public static JLabel jS;
	public static JLabel qS;
	public static JLabel kS;
	public static JLabel aC;
	public static JLabel twoC;
	public static JLabel threeC;
	public static JLabel fourC;
	public static JLabel fiveC;
	public static JLabel sixC;
	public static JLabel sevenC;
	public static JLabel eightC;
	public static JLabel nineC;
	public static JLabel tenC;
	public static JLabel jC;
	public static JLabel qC;
	public static JLabel kC;


	public ArrayList<Card> deck;

	public Deck()
	
	{   
		ArrayList<JLabel> cardImages = new ArrayList<JLabel>();

		aH = new JLabel();
		aH.setIcon(new ImageIcon("images/AH.png"));
		cardImages.add(aH);

		aS = new JLabel();
		aS.setIcon(new ImageIcon("images/AS.png"));
		cardImages.add(aS);

		aD = new JLabel();
		aD.setIcon(new ImageIcon("images/AD.png"));
		cardImages.add(aD);

		aC = new JLabel();
		aC.setIcon(new ImageIcon("images/AC.png"));
		cardImages.add(aC);

		twoH = new JLabel();
		twoH.setIcon(new ImageIcon("images/2H.png"));
		cardImages.add(twoH);

		twoS = new JLabel();
		twoS.setIcon(new ImageIcon("images/2S.png"));
		cardImages.add(twoS);

		twoD = new JLabel();
		twoD.setIcon(new ImageIcon("images/2D.png"));
		cardImages.add(twoD);

		twoC = new JLabel();
		twoC.setIcon(new ImageIcon("images/2C.png"));
		cardImages.add(twoC);

		threeH = new JLabel();
		threeH.setIcon(new ImageIcon("images/3H.png"));
		cardImages.add(threeH);

		threeS = new JLabel();
		threeS.setIcon(new ImageIcon("images/3S.png"));
		cardImages.add(threeS);

		threeD = new JLabel();
		threeD.setIcon(new ImageIcon("images/3D.png"));
		cardImages.add(threeD);

		threeC = new JLabel();
		threeC.setIcon(new ImageIcon("images/3C.png"));
		cardImages.add(threeC);

		fourH = new JLabel();
		fourH.setIcon(new ImageIcon("images/4H.png"));
		cardImages.add(fourH);

		fourS = new JLabel();
		fourS.setIcon(new ImageIcon("images/4S.png"));
		cardImages.add(fourS);

		fourD = new JLabel();
		fourD.setIcon(new ImageIcon("images/4D.png"));
		cardImages.add(fourD);

		fourC = new JLabel();
		fourC.setIcon(new ImageIcon("images/4C.png"));
		cardImages.add(fourC);

		fiveH = new JLabel();
		fiveH.setIcon(new ImageIcon("images/5H.png"));
		cardImages.add(fiveH);

		fiveS = new JLabel();
		fiveS.setIcon(new ImageIcon("images/5S.png"));
		cardImages.add(fiveS);

		fiveD = new JLabel();
		fiveD.setIcon(new ImageIcon("images/5D.png"));
		cardImages.add(fiveD);

		fiveC = new JLabel();
		fiveC.setIcon(new ImageIcon("images/5C.png"));
		cardImages.add(fiveC);

		sixH = new JLabel();
		sixH.setIcon(new ImageIcon("images/6H.png"));
		cardImages.add(sixH);

		sixS = new JLabel();
		sixS.setIcon(new ImageIcon("images/6S.png"));
		cardImages.add(sixS);

		sixD = new JLabel();
		sixD.setIcon(new ImageIcon("images/6D.png"));
		cardImages.add(sixD);

		sixC = new JLabel();
		sixC.setIcon(new ImageIcon("images/6C.png"));
		cardImages.add(sixC);

		sevenH = new JLabel();
		sevenH.setIcon(new ImageIcon("images/7H.png"));
		cardImages.add(sevenH);

		sevenS = new JLabel();
		sevenS.setIcon(new ImageIcon("images/7S.png"));
		cardImages.add(sevenS);

		sevenD = new JLabel();
		sevenD.setIcon(new ImageIcon("images/7D.png"));
		cardImages.add(sevenD);

		sevenC = new JLabel();
		sevenC.setIcon(new ImageIcon("images/7C.png"));
		cardImages.add(sevenC);

		eightH = new JLabel();
		eightH.setIcon(new ImageIcon("images/8H.png"));
		cardImages.add(eightH);

		eightS = new JLabel();
		eightS.setIcon(new ImageIcon("images/8S.png"));
		cardImages.add(eightS);

		eightD = new JLabel();
		eightD.setIcon(new ImageIcon("images/8D.png"));
		cardImages.add(eightD);

		eightC = new JLabel();
		eightC.setIcon(new ImageIcon("images/8C.png"));
		cardImages.add(eightC);

		nineH = new JLabel();
		nineH.setIcon(new ImageIcon("images/9H.png"));
		cardImages.add(nineH);

		nineS = new JLabel();
		nineS.setIcon(new ImageIcon("images/9S.png"));
		cardImages.add(nineS);

		nineD = new JLabel();
		nineD.setIcon(new ImageIcon("images/9D.png"));
		cardImages.add(nineD);

		nineC = new JLabel();
		nineC.setIcon(new ImageIcon("images/9C.png"));
		cardImages.add(nineC);

		tenH = new JLabel();
		tenH.setIcon(new ImageIcon("images/10H.png"));
		cardImages.add(tenH);

		tenS = new JLabel();
		tenS.setIcon(new ImageIcon("images/10S.png"));
		cardImages.add(tenS);

		tenD = new JLabel();
		tenD.setIcon(new ImageIcon("images/10D.png"));
		cardImages.add(tenD);

		tenC = new JLabel();
		tenC.setIcon(new ImageIcon("images/10C.png"));
		cardImages.add(tenC);

		jH = new JLabel();
		jH.setIcon(new ImageIcon("images/JH.png"));
		cardImages.add(jH);

		jS = new JLabel();
		jS.setIcon(new ImageIcon("images/JS.png"));
		cardImages.add(jS);

		jD = new JLabel();
		jD.setIcon(new ImageIcon("images/JD.png"));
		cardImages.add(jD);

		jC = new JLabel();
		jC.setIcon(new ImageIcon("images/JC.png"));
		cardImages.add(jC);

		qH = new JLabel();
		qH.setIcon(new ImageIcon("images/QH.png"));
		cardImages.add(qH);

		qS = new JLabel();
		qS.setIcon(new ImageIcon("images/QS.png"));
		cardImages.add(qS);

		qD = new JLabel();
		qD.setIcon(new ImageIcon("images/QD.png"));
		cardImages.add(qD);

		qC = new JLabel();
		qC.setIcon(new ImageIcon("images/QC.png"));
		cardImages.add(qC);

		kH = new JLabel();
		kH.setIcon(new ImageIcon("images/KH.png"));
		cardImages.add(kH);

		kS = new JLabel();
		kS.setIcon(new ImageIcon("images/KS.png"));
		cardImages.add(kS);

		kD = new JLabel();
		kD.setIcon(new ImageIcon("images/KD.png"));
		cardImages.add(kD);

		kC = new JLabel();
		kC.setIcon(new ImageIcon("images/KC.png"));
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

	public void deal( JFrame jframe) 
	{
		kC.setBounds(10,10,10,10);
		jframe.add(kC);
		int cardCnt = 0;
		x = 20;
		y = 20;
		for(int piles = 1; piles < 8; piles++) {

			for(int cards = 1; cards <= piles; cards++) {
			
				
			}	
			cardCnt++;
		}
		System.out.println();
	}

}
