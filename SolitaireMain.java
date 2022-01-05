import java.awt.*;
import javax.swing.*;
public class SolitaireMain {
	public static void main(String[] args) {
		JFrame frame = new JFrame("Solitaire");
	    frame.setSize(1200,600);
	    frame.setVisible( true );
	    frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
	    frame.setBackground(Color. GREEN);
	    frame.getContentPane().setBackground(Color.GREEN);
	    
	   CardObject card1 = new CardObject( "g", "Spades");
	   System.out.println(card1);
	   
	   System.out.println(card1.getCardFace());
	}

}
