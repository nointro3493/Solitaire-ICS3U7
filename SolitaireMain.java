import java.awt.*;

import javax.swing.*;
public class SolitaireMain {
	private JFrame frame1;
	
	SolitaireMain(){
		frame1 = new JFrame("Solitaire");
	    frame1.setSize(1200,600);
	    frame1.setVisible( true );
	    frame1.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );

        Deck deck = new Deck();
        HalfDeck halfDeck = new HalfDeck();
	    frame1.getContentPane().setBackground(Color.GREEN);
	    
	    deck.shuffle();
	    deck.deal();
	    halfDeck.deal();
	   
	    
	  
	}

}