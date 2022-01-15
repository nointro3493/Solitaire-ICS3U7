import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import javax.swing.*;
public class SolitaireMain extends JFrame implements ActionListener{
	private JFrame frame1;
	private JButton backButton;
	private Icon backImage;
	
	SolitaireMain(){

  
		
		backImage = new ImageIcon("images/back.jpeg");
		frame1 = new JFrame("Solitaire");
	    frame1.setSize(1200,600);
	    frame1.setVisible( true );
	    frame1.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		frame1.getContentPane().setBackground(Color.GREEN);

        Deck deck = new Deck();
        HalfDeck halfDeck = new HalfDeck();

		backButton = new JButton(backImage);
		backButton.addActionListener(this);		
	    backButton.setPreferredSize(new Dimension(40, 40));

		frame1.add(backButton);
		
		
	    
	    
	    deck.shuffle();
	    deck.deal();
		halfDeck.deal();
		
	}
	public static void main(String[] args) {
		new SolitaireMain();
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		StartMenu startmenu = new StartMenu();		
		frame1.setVisible(false);
	}

}