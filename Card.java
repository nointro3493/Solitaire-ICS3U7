import javax.swing.*;
import java.awt.*;
/**
 * @authors Jade Marmash and Kabir Jain
 * Date: January 28th
 * Program Name: SpadeAce (version 16.0.2)
 * Description: The card class creates the card objects with lots of instance variables and getter
 * and setter methods which are used to check conditions in the deck class.
 */
public class Card {
	
	//declare variables
	private static final int HEARTS = 0;
	private static final int DIAMONDS = 1;
	private static final int SPADES = 2;
	private static final int CLUBS = 3;
	
	private static final int JACK = 11;
    private static final int QUEEN = 12;
    private static final int KING = 13;
    private static final int ACE = 0;
    
    private int rank;
    private int suit;
    private int value;
    private int x;
    private int y;
    private int color;

    public JLabel image;
    private int pileNum;
    private int pilePos;
    
    
    private String[] ranks = {"X", "A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
    
    private String[] suits = {"H", "D", "S", "C"};
    
    /**
     * Card constructor
     * @param r is the rank
     * @param s is the suit
     * @param image
     * @param x is the x coordinate of the card in the GUI
     * @param y is the y coordinate of the card in the GUI
     * @param pileNum
     * @param pilePos
     * @param color
     */
    public Card(int r, int s, JLabel image, int x, int y, int pileNum, int pilePos, int color)
    {
        rank = r;
        suit = s;
        this.x= x;
        this.y = y;
        this.image = image;
        this.pileNum = pileNum;
        this.pilePos = pilePos;
        this.color = color;   
    }
    
    /**
     * Getter method for card position
     * @return the card's position in it's pile
     */
    public int getPilePos() {
    	return pilePos;
    }
    
    /**
     * Setter method for card position
     * @param newPilePos
     */
    public void setPilePos(int newPilePos) {
    	pilePos = newPilePos;
    }
    
    /**
     * Getter method for card color
     * @return color of the card
     */
    public int getColor() {
    	return color;
    }
    
    /**
     * Setter method for card color
     * @param newColor
     */
    public void setColor(int newColor){
    	color = newColor;
    }

    /**
     * Getter method for card's rank
     * @return the card's rank
     */
    public int getRank()
    {
        return rank;
    }
    
    /**
     * Getter method for the card's suit
     * @return the card's suit
     */
    public int getSuit()
    {
        return suit;
    }
    
    /**
     * Getter method for card's value
     * @return card's value
     */
    public int getValue()
    {
        int value = rank;
        if(rank > 10)
        {
            value = 10;
        }
        
        if(rank == ACE)
        {
            value = 11;
        }
        
        return value;
    }
    
    /**
     * Getter method for card image
     * @return cards image
     */
    public JLabel getImage() 
    {
    	return image;
    }
    
    /**
     * Sets the card's rank to a string
     * @param r
     * @return The string version of the card's rank
     */
    public String rankToString(int r)
    {
        return ranks[r];
    }
    
    /**
     * Sets the card's suit to a string
     * @param s
     * @return The string version of the card's suit
     */
    public String suitToString(int s)
    {
        return suits[s];
    }
    
    /**
     * Getter method for string of card's suit
     * @return String of card's suit
     */
    public String getSuitAsString()
    {
        return suitToString(suit);
    }
    
    /**
     * Getter method for string of card's rank
     * @return String of card's rank
     */
    public String getRankAsString()
    {
        return rankToString(rank);
    }
    
    /**
     * Getter method for a card's name
     * @return The name of a card (eg. AC for the Ace of Clubs)
     */
    public String getName() {
    	 String rankString = ranks[rank];
         
         String suitString = suits[suit];
         
         return rankString + suitString;
    }
    
    /**
     * Setter method for the x coordinate of a card
     * @param newX
     */
    public void setX(int newX) {
    	x = newX;
    }
    
    /**
     * Setter method for the y coordinate of a card
     * @param newY
     */
    public void setY(int newY) {
    	y = newY;
    }
    
    /**
     * Getter method for the x coordinate of a card
     * @return the card's x coordinate
     */
    public int getX() {
    	return x;
    }
    
    /**
     * Getter method for the y coordinate of a card
     * @return the card's y coordinate
     */
    public int getY() {	
    	return y;
    }
    
    /**
     * Setter method for the pile number of the card
     * @param newPileNum
     */
    public void setPileNum(int newPileNum){
    	pileNum = newPileNum;	
    }
    
    /**
     * Getter method for the pile number of the card
     * @return the pile number of the card
     */
    public int getPileNum(){
    	return pileNum;
    	
    }
    
    /**
     * toString method for the card
     */
    public String toString()
    {
    	String rankString = ranks[rank];

    	String suitString = suits[suit];

    	return rankString + suitString;
    }


}