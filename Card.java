import javax.swing.*;
import java.awt.*;
public class Card {
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
    
    public int getPilePos() {
    	return pilePos;
    }
    
    public void setPilePos( int newPilePos) {
    	pilePos = newPilePos;
    }
    
    public int getColor() {
    	return color;
    }
    
    public void setColor(int newColor){
    	color = newColor;
    }

    
    public int getRank()
    {
        return rank;
    }
    
    public int getSuit()
    {
        return suit;
    }
    
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
    
    public JLabel getImage() 
    {
    	return image;
    }
    
    public String rankToString(int r)
    {
        return ranks[r];
    }
    
    public String suitToString(int s)
    {
        return suits[s];
    }
    
    public String getSuitAsString()
    {
        return suitToString(suit);
    }
    
    public String getRankAsString()
    {
        return rankToString(rank);
    }
    public String getName() {
    	 String rankString = ranks[rank];
         
         String suitString = suits[suit];
         
         return rankString + suitString;
    }
    public void setX(int newX) {
    	x = newX;
  
    }
    public void setY(int newY) {
    	y = newY;
  
    }
    
    public int getX() {
    	
    	return x;
    }
    public int getY() {
    	
    	return y;
    }
    
    public void setPileNum(int newPileNum){
    	pileNum = newPileNum;
    	
    }
    public int getPileNum(){
    	return pileNum;
    	
    }
    
   
	 public String toString()
	    {
	        String rankString = ranks[rank];
	        
	        String suitString = suits[suit];
	        
	        return rankString + suitString;
	    }
	

}