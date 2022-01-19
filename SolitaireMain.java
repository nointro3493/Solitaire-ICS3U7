import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import javax.swing.*;
public class SolitaireMain extends Deck implements ActionListener{
	private JFrame frame1;
	private JButton backButton;
	private Icon backImage;
	private JLabel bug;
	
	SolitaireMain(){

  
		
		//backImage = new ImageIcon("images/back.jpeg");
		frame1 = new JFrame("Solitaire");
	    frame1.setSize(1200, 600);
	    frame1.setVisible(true);
	    frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame1.getContentPane().setBackground(Color.GREEN);

        Deck deck = new Deck();
        HalfDeck halfDeck = new HalfDeck();
        backButton = new JButton("Back");
        backButton.setPreferredSize(new Dimension(40, 40));
        backButton.setBounds(450, 375, 211, 50);
		backButton.setFont(new Font("Comic Sans MS", Font.BOLD, 25));
		backButton.setBorderPainted(false);
		backButton.setOpaque(true);
		backButton.setBackground(Color.GRAY);
		backButton.addActionListener(this);
//		backButton = new JButton(backImage);
//		backButton.addActionListener(this);		
	
		bug = new JLabel();
		frame1.add(bug);
		
		
	    
	    
	    deck.shuffle();
	    deck.deal(frame1);
	    halfDeck.shuffle();
		halfDeck.deal(frame1);
		
		
		
	}
	public static void main(String[] args) {
		//new SolitaireMain();
		new StartMenu();
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		StartMenu startmenu = new StartMenu();		
		frame1.setVisible(false);
	}

}