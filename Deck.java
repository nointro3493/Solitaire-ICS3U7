import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
/**
 * @authors Jade Marmash and Kabir Jain
 * Date: January 28th
 * Program Name: SpadeAce (version 16.0.2)
 * Description: The deck class creates the deck of cards in our game along with all of the methods
 * which allow the game to be played.
 */

public class Deck 
{
	//declare variables
	
	// Declaration of the suits into numbers
	public static final int HEARTS = 0;
	public static final int SPADES = 2;
	public static final int DIAMONDS = 1;
	public static final int CLUBS = 3;

	//Used to give the card object a color corresponding with number
	public static final int REDCARD = 5;
	public static final int BLACKCARD = 7;


	//Constants for cards that do not have numbers
	public static final int JACK = 11;
	public static final int QUEEN = 12;
	public static final int KING = 13;
	public static final int ACE = 0;

	//Variables used for movement and dealing of cards	
	int xAxis;
	int yAxis;
	int prevX;
	int prevY;
	int prevPile;
	int drawY = 50;

	// Used to count the amount of cards dealt
	private static int cardCnt = 0;

	// Declaration of all the cards
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
	public static JLabel aDTemp;
	public static JLabel aHTemp;
	public static JLabel aSTemp;
	public static JLabel aCTemp;
	public static int count = 0;

	public static int cardNum;
	public static String cardCom;

	//Lists for the 7 seven piles in the dealing of the cards
	// used to check for legal moves
	public static ArrayList<Card> pile1 = new ArrayList<Card>();
	public static ArrayList<Card> pile2 = new ArrayList<Card>();
	public static ArrayList<Card> pile3 = new ArrayList<Card>();
	public static ArrayList<Card> pile4 = new ArrayList<Card>();
	public static ArrayList<Card> pile5 = new ArrayList<Card>();
	public static ArrayList<Card> pile6 = new ArrayList<Card>();
	public static ArrayList<Card> pile7 = new ArrayList<Card>();

	//Lists for the 4 ace piles to check if user has won
	public static ArrayList<Card> pileAC = new ArrayList<Card>();
	public static ArrayList<Card> pileAS = new ArrayList<Card>();
	public static ArrayList<Card> pileAH = new ArrayList<Card>();
	public static ArrayList<Card> pileAD = new ArrayList<Card>();

	//Lists for the cards remaining to draw
	public static ArrayList<Card> drawPile = new ArrayList<Card>();
	public static ArrayList<Card> cardsDrawn = new ArrayList<Card>();
	public static ArrayList<String> totalCards = new ArrayList<String>();
	public static ArrayList<JLabel> cardImages = new ArrayList<JLabel>();
	
	//Arraylist for the entire deck
	public ArrayList<Card> deck;

	//constructor 
	public Deck() 

	{   
		//Assigns the images of every card and adds them to the ArrayList cardImages
		aH = new JLabel();
		aH.setIcon(new ImageIcon("images/AH.png"));
		cardImages.add(aH);

		aD = new JLabel();
		aD.setIcon(new ImageIcon("images/AD.png"));
		cardImages.add(aD);

		aS = new JLabel();
		aS.setIcon(new ImageIcon("images/AS.png"));
		cardImages.add(aS);

		aC = new JLabel();
		aC.setIcon(new ImageIcon("images/AC.png"));
		cardImages.add(aC);

		twoH = new JLabel();
		twoH.setIcon(new ImageIcon("images/2H.png"));
		cardImages.add(twoH);

		twoD = new JLabel();
		twoD.setIcon(new ImageIcon("images/2D.png"));
		cardImages.add(twoD);

		twoS = new JLabel();
		twoS.setIcon(new ImageIcon("images/2S.png"));
		cardImages.add(twoS);

		twoC = new JLabel();
		twoC.setIcon(new ImageIcon("images/2C.png"));
		cardImages.add(twoC);

		threeH = new JLabel();
		threeH.setIcon(new ImageIcon("images/3H.png"));
		cardImages.add(threeH);

		threeD = new JLabel();
		threeD.setIcon(new ImageIcon("images/3D.png"));
		cardImages.add(threeD);

		threeS = new JLabel();
		threeS.setIcon(new ImageIcon("images/3S.png"));
		cardImages.add(threeS);

		threeC = new JLabel();
		threeC.setIcon(new ImageIcon("images/3C.png"));
		cardImages.add(threeC);

		fourH = new JLabel();
		fourH.setIcon(new ImageIcon("images/4H.png"));
		cardImages.add(fourH);

		fourD = new JLabel();
		fourD.setIcon(new ImageIcon("images/4D.png"));
		cardImages.add(fourD);

		fourS = new JLabel();
		fourS.setIcon(new ImageIcon("images/4S.png"));
		cardImages.add(fourS);

		fourC = new JLabel();
		fourC.setIcon(new ImageIcon("images/4C.png"));
		cardImages.add(fourC);

		fiveH = new JLabel();
		fiveH.setIcon(new ImageIcon("images/5H.png"));
		cardImages.add(fiveH);

		fiveD = new JLabel();
		fiveD.setIcon(new ImageIcon("images/5D.png"));
		cardImages.add(fiveD);

		fiveS = new JLabel();
		fiveS.setIcon(new ImageIcon("images/5S.png"));
		cardImages.add(fiveS);

		fiveC = new JLabel();
		fiveC.setIcon(new ImageIcon("images/5C.png"));
		cardImages.add(fiveC);

		sixH = new JLabel();
		sixH.setIcon(new ImageIcon("images/6H.png"));
		cardImages.add(sixH);

		sixD = new JLabel();
		sixD.setIcon(new ImageIcon("images/6D.png"));
		cardImages.add(sixD);

		sixS = new JLabel();
		sixS.setIcon(new ImageIcon("images/6S.png"));
		cardImages.add(sixS);

		sixC = new JLabel();
		sixC.setIcon(new ImageIcon("images/6C.png"));
		cardImages.add(sixC);

		sevenH = new JLabel();
		sevenH.setIcon(new ImageIcon("images/7H.png"));
		cardImages.add(sevenH);

		sevenD = new JLabel();
		sevenD.setIcon(new ImageIcon("images/7D.png"));
		cardImages.add(sevenD);

		sevenS = new JLabel();
		sevenS.setIcon(new ImageIcon("images/7S.png"));
		cardImages.add(sevenS);

		sevenC = new JLabel();
		sevenC.setIcon(new ImageIcon("images/7C.png"));
		cardImages.add(sevenC);

		eightH = new JLabel();
		eightH.setIcon(new ImageIcon("images/8H.png"));
		cardImages.add(eightH);

		eightD = new JLabel();
		eightD.setIcon(new ImageIcon("images/8D.png"));
		cardImages.add(eightD);

		eightS = new JLabel();
		eightS.setIcon(new ImageIcon("images/8S.png"));
		cardImages.add(eightS);

		eightC = new JLabel();
		eightC.setIcon(new ImageIcon("images/8C.png"));
		cardImages.add(eightC);

		nineH = new JLabel();
		nineH.setIcon(new ImageIcon("images/9H.png"));
		cardImages.add(nineH);

		nineD = new JLabel();
		nineD.setIcon(new ImageIcon("images/9D.png"));
		cardImages.add(nineD);

		nineS = new JLabel();
		nineS.setIcon(new ImageIcon("images/9S.png"));
		cardImages.add(nineS);

		nineC = new JLabel();
		nineC.setIcon(new ImageIcon("images/9C.png"));
		cardImages.add(nineC);

		tenH = new JLabel();
		tenH.setIcon(new ImageIcon("images/10H.png"));
		cardImages.add(tenH);

		tenD = new JLabel();
		tenD.setIcon(new ImageIcon("images/10D.png"));
		cardImages.add(tenD);

		tenS = new JLabel();
		tenS.setIcon(new ImageIcon("images/10S.png"));
		cardImages.add(tenS);

		tenC = new JLabel();
		tenC.setIcon(new ImageIcon("images/10C.png"));
		cardImages.add(tenC);

		jH = new JLabel();
		jH.setIcon(new ImageIcon("images/JH.png"));
		cardImages.add(jH);

		jD = new JLabel();
		jD.setIcon(new ImageIcon("images/JD.png"));
		cardImages.add(jD);

		jS = new JLabel();
		jS.setIcon(new ImageIcon("images/JS.png"));
		cardImages.add(jS);

		jC = new JLabel();
		jC.setIcon(new ImageIcon("images/JC.png"));
		cardImages.add(jC);

		qH = new JLabel();
		qH.setIcon(new ImageIcon("images/QH.png"));
		cardImages.add(qH);

		qD = new JLabel();
		qD.setIcon(new ImageIcon("images/QD.png"));
		cardImages.add(qD);

		qS = new JLabel();
		qS.setIcon(new ImageIcon("images/QS.png"));
		cardImages.add(qS);

		qC = new JLabel();
		qC.setIcon(new ImageIcon("images/QC.png"));
		cardImages.add(qC);

		kH = new JLabel();
		kH.setIcon(new ImageIcon("images/KH.png"));
		cardImages.add(kH);

		kD = new JLabel();
		kD.setIcon(new ImageIcon("images/KD.png"));
		cardImages.add(kD);

		kS = new JLabel();
		kS.setIcon(new ImageIcon("images/KS.png"));
		cardImages.add(kS);

		kC = new JLabel();
		kC.setIcon(new ImageIcon("images/KC.png"));
		cardImages.add(kC);

		aHTemp = new JLabel();
		aHTemp.setIcon(new ImageIcon("images/AHTemp.png"));
		cardImages.add(aHTemp);

		aDTemp = new JLabel();
		aDTemp.setIcon(new ImageIcon("images/ADTemp.png"));
		cardImages.add(aDTemp);

		aSTemp = new JLabel();
		aSTemp.setIcon(new ImageIcon("images/ASTemp.png"));
		cardImages.add(aSTemp);

		aCTemp = new JLabel();
		aCTemp.setIcon(new ImageIcon("images/ACTemp.png"));
		cardImages.add(aCTemp);

		int imageNum = 0;
		deck = new ArrayList<Card>();

		//Blank cards to add into the ace piles to prevent logic errors in movement
		Card blank1 = new Card(0, 0, aHTemp, 0, 0, 0, 0, 0);
		Card blank2 = new Card(0, 1, aDTemp, 0, 0, 0, 0, 0);
		Card blank3 = new Card(0, 2, aSTemp, 0, 0, 0, 0, 0);
		Card blank4 = new Card(0, 3, aCTemp, 0, 0, 0, 0, 0);

		//adds these cards to the ace piles
		pileAC.add(blank4);
		pileAS.add(blank3);
		pileAH.add(blank1);
		pileAD.add(blank2);

		//for loop goes through every rank
		for(int rank = 1; rank <= KING; rank++) {
			
			//nested for loop goes through the four suits
			for(int suit = HEARTS; suit <= CLUBS; suit++) {
				
				//Adds rank, suit, image, x coordinate, y coordinate, pile Number, pile position, and if its a red card, adds 5 for its color
				if(suit == HEARTS || suit == DIAMONDS) {
					Card card = new Card(rank, suit, cardImages.get(imageNum), 0, 0,0,0, REDCARD);
					//adds card to deck
					deck.add(card);
					totalCards.add(rank+""+suit);

				}
				
				//Adds rank, suit, image, x coord, y coord, pile Number, pile position, and if its a black card, adds 7 for its color
				else if(suit == SPADES || suit == CLUBS) {
					Card card = new Card(rank, suit, cardImages.get(imageNum), 0, 0,0,0, BLACKCARD);
					//adds card to deck
					deck.add(card);
					totalCards.add(rank+""+suit);


				}
				
				//the images are assigned according to the order they were added into the cardImages ArrayList, so for every new card declared, the index counter increases
				imageNum++;
			}
		}
	}


	/**
	 * This method sorts a Deck object into a random order ("shuffles" the deck)
	 */
	public void shuffle()
	{
		for(int i = 0; i < deck.size(); i++)
		{
			//uses Math class to generate a random index in the deck
			int randomIndex = (int) (Math.random() * deck.size());
			Card x = deck.get(i);
			Card y = deck.get(randomIndex);

			//places that card randomly into the ArrayList
			deck.set(i, y);
			deck.set(randomIndex, x);
		}
	}

	/**
	 * This method "deals" out the cards into piles to start a new SpadeAce game.
	 * @param jframe
	 */
	public void deal(JLayeredPane jframe) 
	{	
		//adds background music
		File file  = new File("images/backgroundMusic.wav"); 
		AudioInputStream audioStream;

		try {
			audioStream = AudioSystem.getAudioInputStream(file);
			Clip clip = AudioSystem.getClip();
			clip.open(audioStream);
			clip.start();
		}
		
		catch (UnsupportedAudioFileException | IOException e) {
			e.printStackTrace();
		} 
		
		catch (LineUnavailableException e) {
			e.printStackTrace();
		}

		//each time this method is called on in our main program, total games is increased by one
		WinClass.setTotalGames(1);
		//keeps track of layer count
		int layerCnt = 0;
		//Keeps track of the pile number
		int pileNum = 0;
		//Starting coordinates for the deal
		xAxis = 50;
		yAxis = 50;

		//Adding templates for the Ace piles
		aCTemp.setBounds(40, 500, 100, 145);
		jframe.add(aCTemp, 0);

		aSTemp.setBounds(190, 500, 100, 145);
		jframe.add(aSTemp, 0);

		aHTemp.setBounds(340, 500, 100, 145);
		jframe.add(aHTemp, 0);

		aDTemp.setBounds(490, 500, 100, 145);
		jframe.add(aDTemp, 0);

		//Nested for loop to deals the cards in their respective piles by checking if piles are
		//less than 8 and the amount of cards in each pile are less than the pile number
		for(int piles = 1; piles < 8; piles++) {
			for(int cards = 1; cards <= piles; cards++) {

				deck.get(cardCnt).getImage().setBounds(xAxis, yAxis, 100, 147);// Sets the coordinates and size of the cards
				deck.get(cardCnt).getImage().setOpaque(true); //Sets it to opaque
				deck.get(cardCnt).setX(xAxis); // Sets the xAxis of the card to the passed in variable
				deck.get(cardCnt).setY(yAxis);// Sets the yAxis of the card to the passed in variable
				deck.get(cardCnt).setPileNum(pileNum); // sets the pile number of the card


				jframe.add(deck.get(cardCnt).getImage(), layerCnt); // Adds the card image to the frame
				jframe.validate(); //refresh of the frame
				//yAxis = yAxis +40;


				//Adds the cards into their respective pile lists
				if(pileNum == 0) { //for pile1
					pile1.add(deck.get(cardCnt));
				}
				
				else if(pileNum == 1) { //for pile2
					pile2.add(deck.get(cardCnt));

				}
				
				else if(pileNum == 2) { //for pile3
					pile3.add(deck.get(cardCnt));

				}
				
				else if(pileNum == 3) { //for pile4
					pile4.add(deck.get(cardCnt));

				}
				
				else if(pileNum == 4) { //for pile5
					pile5.add(deck.get(cardCnt));

				}
				
				else if(pileNum == 5) { //for pile6
					pile6.add(deck.get(cardCnt));

				}
				
				else { //for pile7
					pile7.add(deck.get(cardCnt));

				}
				
				//Increases card count to proceed to next card
				cardCnt++;
			}
			
			//Increases pile number to proceed to next pile
			pileNum++;

			//resets y axis position
			yAxis = 50;

			//adds 150 pixels to the x axis for next pile to be created
			xAxis+= 150;

		}

		//Adds all the unused cards into the drawPile ArrayList
		for (int i = cardCnt; i < 52; i++) {
			drawPile.add(deck.get(i));
		}

	}

	/**
	 * This method checks all of the conditions for a card movement inputed by the user
	 * @param cardType
	 * @param pileNum
	 * @param jframe
	 */
	public void moveCard(String cardType, int pileNum, JLayeredPane jframe) {
		//Boolean to check movement legality
		boolean isLegal = false;

		//For loop to iterate through every card and get its name
		for(int i = 0; i < deck.size(); i++) {
			cardCom = deck.get(i).getName();

			//Checks if the card inputted is in the deck class
			if(cardCom.equals(cardType)) {

				//Removes cards that are already in these decks to not interfere with movement
				if(pile1.contains(deck.get(i))) {
					pile1.remove(deck.get(i));
				}

				else if(pile2.contains(deck.get(i))) {
					pile2.remove(deck.get(i));
				}

				else if(pile3.contains(deck.get(i))) {
					pile3.remove(deck.get(i));
				}

				else if(pile4.contains(deck.get(i))) {
					pile4.remove(deck.get(i));
				}

				else if(pile5.contains(deck.get(i))) {
					pile5.remove(deck.get(i));
				}

				else if(pile6.contains(deck.get(i))) {
					pile6.remove(deck.get(i));
				}

				else if (pile7.contains(deck.get(i))){
					pile7.remove(deck.get(i));
				}
				else if(pileAC.contains(deck.get(i))) {
					pileAC.remove(deck.get(i));

				}
				else if(pileAS.contains(deck.get(i))) {
					pileAS.remove(deck.get(i));
				}
				else if(pileAH.contains(deck.get(i))) {
					pileAH.remove(deck.get(i));
				}
				else if(pileAD.contains(deck.get(i))) {
					pileAD.remove(deck.get(i));
				}

				//Checks for the valid movements into every pile
				if(pileNum == 1) { //If pile number is 1 then this procedure takes place
					//a set of conditions are used to see if valid movement is being done 
					if (pile1.size() > 0) {
						
						if(deck.get(i).getColor() != pile1.get(pile1.size()-1).getColor() && deck.get(i).getRank() + 1 == pile1.get(pile1.size() - 1).getRank()) {

							isLegal = true;
							prevX = 50;

							prevY = pile1.get(pile1.size()-1).getY()+30;

							deck.get(i).getImage().setBounds(prevX,prevY,100,147);
							deck.get(i).setX(prevX);
							deck.get(i).setY(prevY);

							jframe.add(deck.get(i).getImage(), 0);
							pile1.add(deck.get(i));
						}
					}
					
					// Movement if the pile is empty
					else if (pile1.size() == 0) {
						isLegal = true;
						prevX = 50;

						prevY = 50;

						deck.get(i).getImage().setBounds(prevX,prevY, 100, 147);
						deck.get(i).setX(prevX);
						deck.get(i).setY(prevY);

						jframe.add(deck.get(i).getImage(), 0);
						pile1.add(deck.get(i));
					}

				}

				//Checks for the valid movements into every pile
				if(pileNum == 2) {//If pile number is 1 then this procedure takes place
					//a set of conditions are used to see if valid movement is being done 
					if (pile2.size() > 0) {
						
						if(deck.get(i).getColor() != pile2.get(pile2.size()-1).getColor() && deck.get(i).getRank() + 1 == pile2.get(pile2.size() - 1).getRank()) {

							isLegal = true;
							prevX = 200;

							prevY = pile2.get(pile2.size()-1).getY()+30;

							deck.get(i).getImage().setBounds(prevX,prevY,100,147);
							deck.get(i).setX(prevX);
							deck.get(i).setY(prevY);

							jframe.add(deck.get(i).getImage(), 0);
							pile2.add(deck.get(i));
						}

					}
					
					// Movement if the pile is empty
					else if (pile2.size() == 0) {

						isLegal = true;
						prevX = 200;

						prevY = 50;

						deck.get(i).getImage().setBounds(prevX,prevY, 100, 147);
						
						deck.get(i).setX(prevX);
						
						deck.get(i).setY(prevY);

						jframe.add(deck.get(i).getImage(), 0);
						pile2.add(deck.get(i));
					}
				}

				//Checks for the valid movements into every pile
				if(pileNum == 3) {//If pile number is 1 then this procedure takes place
					//a set of conditions are used to see if valid movement is being done 
					if (pile3.size() > 0) {
						
						if(deck.get(i).getColor() != pile3.get(pile3.size()-1).getColor() && deck.get(i).getRank() + 1 == pile3.get(pile3.size() - 1).getRank()) {

							isLegal = true;
							prevX = 350;

							prevY = pile3.get(pile3.size()-1).getY()+30;

							deck.get(i).getImage().setBounds(prevX, prevY, 100, 147);
							
							deck.get(i).setX(prevX);
							
							deck.get(i).setY(prevY);

							jframe.add(deck.get(i).getImage(), 0);
							pile3.add(deck.get(i));
						}

					}
					
					// Movement if the pile is empty
					else if (pile3.size() == 0) {
						isLegal = true;
						prevX = 350;

						prevY = 50;

						deck.get(i).getImage().setBounds(prevX, prevY, 100, 147);
						deck.get(i).setX(prevX);
						deck.get(i).setY(prevY);

						jframe.add(deck.get(i).getImage(), 0);
						pile3.add(deck.get(i));
					}
				}
				//Checks for the valid movements into every pile
				if(pileNum == 4) {//If pile number is 1 then this procedure takes place
					//a set of conditions are used to see if valid movement is being done 
					if (pile4.size() > 0) {
						
						if(deck.get(i).getColor() != pile4.get(pile4.size()-1).getColor() && deck.get(i).getRank() + 1 == pile4.get(pile4.size() - 1).getRank()) {

							isLegal = true;

							prevX = 500;

							prevY = pile4.get(pile4.size()-1).getY()+30;

							deck.get(i).getImage().setBounds(prevX,prevY,100,147);
							deck.get(i).setX(prevX);
							deck.get(i).setY(prevY);

							jframe.add(deck.get(i).getImage(), 0);
							pile4.add(deck.get(i));
						}
					}
					
					// Movement if the pile is empty
					else if (pile4.size() == 0) {

						isLegal = true;

						prevX = 500;

						prevY = 50;

						deck.get(i).getImage().setBounds(prevX,prevY, 100, 147);
						deck.get(i).setX(prevX);
						deck.get(i).setY(prevY);

						jframe.add(deck.get(i).getImage(), 0);
						pile4.add(deck.get(i));
					}

				}
				
				//Checks for the valid movements into every pile
				if(pileNum == 5) {//If pile number is 1 then this procedure takes place
					//a set of conditions are used to see if valid movement is being done 
					if (pile5.size() > 0) {
						
						if(deck.get(i).getColor() != pile5.get(pile5.size()-1).getColor() && deck.get(i).getRank() + 1 == pile5.get(pile5.size() - 1).getRank()) {

							isLegal = true;

							prevX = 650;

							prevY = pile5.get(pile5.size()-1).getY()+30;

							deck.get(i).getImage().setBounds(prevX,prevY,100,147);
							deck.get(i).setX(prevX);
							deck.get(i).setY(prevY);

							jframe.add(deck.get(i).getImage(), 0);
							pile5.add(deck.get(i));

						}
					}
					
					// Movement if the pile is empty
					else if (pile5.size() == 0) {

						isLegal = true;

						prevX = 650;

						prevY = 50;

						deck.get(i).getImage().setBounds(prevX,prevY, 100, 147);
						deck.get(i).setX(prevX);
						deck.get(i).setY(prevY);

						jframe.add(deck.get(i).getImage(), 0);
						pile5.add(deck.get(i));
					}

				}

				//Checks for the valid movements into every pile
				if(pileNum == 6) {//If pile number is 1 then this procedure takes place
					//a set of conditions are used to see if valid movement is being done 
					if (pile6.size() > 0) {
						
						if(deck.get(i).getColor() != pile6.get(pile6.size()-1).getColor() && deck.get(i).getRank() + 1 == pile6.get(pile6.size() - 1).getRank()) {

							isLegal = true;

							prevX = 800;

							prevY = pile6.get(pile6.size()-1).getY()+30;

							deck.get(i).getImage().setBounds(prevX,prevY,100,147);
							deck.get(i).setX(prevX);
							deck.get(i).setY(prevY);

							jframe.add(deck.get(i).getImage(), 0);
							pile6.add(deck.get(i));
						}

					}
					
					// Movement if the pile is empty
					else if (pile6.size() == 0) {

						isLegal = true;

						prevX = 800;

						prevY = 50;

						deck.get(i).getImage().setBounds(prevX,prevY, 100, 147);
						deck.get(i).setX(prevX);
						deck.get(i).setY(prevY);

						jframe.add(deck.get(i).getImage(), 0);
						pile6.add(deck.get(i));
					}
				}
				
				//Checks for the valid movements into every pile
				if(pileNum == 7) {//If pile number is 1 then this procedure takes place
					//a set of conditions are used to see if valid movement is being done 
					if (pile7.size() > 0) {
						
						if(deck.get(i).getColor() != pile7.get(pile7.size()-1).getColor() && deck.get(i).getRank() + 1 == pile7.get(pile7.size() - 1).getRank()) {

							isLegal = true;

							prevX = 950;

							prevY = pile7.get(pile7.size()-1).getY()+30;

							deck.get(i).getImage().setBounds(prevX,prevY,100,147);
							deck.get(i).setX(prevX);
							deck.get(i).setY(prevY);

							jframe.add(deck.get(i).getImage(), 0);
							pile7.add(deck.get(i));

						}
					}

					// Movement if the pile is empty
					else if (pile7.size() == 0) {

						isLegal = true;

						prevX = 950;

						prevY = 50;

						deck.get(i).getImage().setBounds(prevX,prevY, 100, 147);
						deck.get(i).setX(prevX);
						deck.get(i).setY(prevY);

						jframe.add(deck.get(i).getImage(), 0);
						pile7.add(deck.get(i));
					}

				}
				
				//Checks for the valid movements into every pile
				if(pileNum == 8) {//If pile number is 1 then this procedure takes place
					//a set of conditions are used to see if valid movement is being done 
					if(!(pileAC.contains(deck.get(i)))) {
						
						if(deck.get(i).getSuit() == pileAC.get(pileAC.size()-1).getSuit()) {
							
							if(deck.get(i).getRank()  -1 ==  pileAC.get(pileAC.size() - 1).getRank()) {

								isLegal = true;
								prevX = 40;

								prevY = 500;

								deck.get(i).getImage().setBounds(prevX, prevY, 100, 147);
								deck.get(i).setX(prevX);
								deck.get(i).setY(prevY);

								jframe.add(deck.get(i).getImage(), 0);
								pileAC.add(deck.get(i));

							}
						}
					}
				}
				
				//Checks for the valid movements into every pile
				if(pileNum == 9) {//If pile number is 1 then this procedure takes place
					//a set of conditions are used to see if valid movement is being done 
					if(!(pileAS.contains(deck.get(i)))){
						
						if(deck.get(i).getSuit() == pileAS.get(pileAS.size()-1).getSuit()) {
							
							if(deck.get(i).getRank()  -1 ==  pileAS.get(pileAS.size() - 1).getRank()) {

								isLegal = true;
								prevX = 190;

								prevY = 500;

								deck.get(i).getImage().setBounds(prevX, prevY, 100, 147);
								deck.get(i).setX(prevX);
								deck.get(i).setY(prevY);

								jframe.add(deck.get(i).getImage(), 0);
								pileAS.add(deck.get(i));

							}
						}
					}
				}
				
				//Checks for the valid movements into every pile
				if(pileNum == 10) {//If pile number is 1 then this procedure takes place
					//a set of conditions are used to see if valid movement is being done 
					if(!(pileAH.contains(deck.get(i)))) {
						
						if(deck.get(i).getSuit() == pileAH.get(pileAH.size()-1).getSuit()) {
							
							if(deck.get(i).getRank()  -1 ==  pileAH.get(pileAH.size() - 1).getRank()) {

								isLegal = true;
								prevX = 340;

								prevY = 500;

								deck.get(i).getImage().setBounds(prevX, prevY, 100, 147);
								deck.get(i).setX(prevX);
								deck.get(i).setY(prevY);

								jframe.add(deck.get(i).getImage(), 0);
								pileAH.add(deck.get(i));

							}
						}
					}
				}

				//Checks for the valid movements into every pile
				if(pileNum == 11) {//If pile number is 1 then this procedure takes place
					//a set of conditions are used to see if valid movement is being done 
					if(!(pileAD.contains(deck.get(i)))) {
						
						if(deck.get(i).getSuit() == pileAD.get(pileAD.size()-1).getSuit()) {
							
							if(deck.get(i).getRank() -1 ==  pileAD.get(pileAD.size() - 1).getRank()) {

								isLegal = true;

								prevX = 490;

								prevY = 500;

								deck.get(i).getImage().setBounds(prevX, prevY, 100, 147);
								deck.get(i).setX(prevX);
								deck.get(i).setY(prevY);

								jframe.add(deck.get(i).getImage(), 0);
								pileAD.add(deck.get(i));


							}
						}
					}
				}
			}

		}

		//Gives an error message if movement requested is not valid
		if (!isLegal) {
			JOptionPane.showMessageDialog(jframe, "Illegal move. Try again.", "Illegal Movement", JOptionPane.ERROR_MESSAGE);
		}

	}

	/**
	 * This method "draws a card" or reveals the top card in the draw pile and puts its image on 
	 * the screen
	 * @param jframe
	 * @param buttonPress
	 * @return void
	 */
	public void drawCard(JLayeredPane jframe, int buttonPress) {

		//draws a card from the draw pile
		drawPile.get(0).getImage().setBounds(1200, drawY, 100, 147);
		jframe.add(drawPile.get(0).getImage(), 0);
		jframe.validate();
		//Adds 30 to the y axis
		drawY += 25;
		count++;
		//removes card from draw pile
		drawPile.remove(0);

		//To remove the last card in the pile
		if(count == 23) {
			drawPile.get(drawPile.size()-1).getImage().setBounds(1200, drawY, 100, 147);
			jframe.add(drawPile.get(drawPile.size()-1).getImage(), 0);
		}
	}

	/**
	 * This method checks if the user has all 13 cards in each ace pile and tells the winner if they
	 * won based on that
	 * @param jframe
	 */
	public void win(JFrame jframe) {
		
		//Checks if every pile is the correct size
		if (pileAC.size() == 15 && pileAS.size() == 15 && pileAH.size() == 15 && pileAD.size() == 15) {
			 //Opens the win class
			jframe.setVisible(false); // closes the main frame
			
			WinClass.setWins(1);
			WinClass win = new WinClass();		
		}
		
		else {	
			//gives an error message if they did not win
			JOptionPane.showMessageDialog(jframe,"Nope you didn't win. Try Again!!", "Not a Winner", JOptionPane.ERROR_MESSAGE);
		}
	}

}