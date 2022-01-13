import java.awt.*;

import javax.swing.*;
public class SolitaireMain {
	private JFrame frame1;
	private static final int HEARTS = 0;
    private static final int DIAMONDS = 1;
    private static final int SPADES = 2;
    private static final int CLUBS = 3;

    private static final int JACK = 11;
    private static final int QUEEN = 12;
    private static final int KING = 13;
    private static final int ACE = 0;
	
	SolitaireMain(){
		frame1 = new JFrame("Solitaire");
	    frame1.setSize(1200,600);
	    frame1.setVisible( true );
	    frame1.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
	   
	    Card aceSpades = new Card(ACE, SPADES);
        System.out.println(aceSpades);


	    frame1.getContentPane().setBackground(Color.GREEN);
	    
	    
	  
	}

}
