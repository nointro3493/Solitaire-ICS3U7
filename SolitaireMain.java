import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


import javax.swing.*;
public class SolitaireMain extends Deck implements ActionListener{
	private JFrame frame1;
	private JButton backButton;
	private JButton submit;
	public JButton draw;
	public JButton checkWin;
	private Icon deckImage;
	private Icon backImage;
	private JLabel bug;
	private JLayeredPane labelFrame;
	private Container cont;
	public JTextField t2;
	public JTextField t3;
	public String cardType;
	public String pileNumText;
	public int pileNum;
	public Deck deck;
	public static int buttonPress = 0;
	public JLabel gameBg = new JLabel();
	public static JLabel p1 = new JLabel("1");
	public static JLabel p2 = new JLabel("2");
	public static JLabel p3 = new JLabel("3");
	public static JLabel p4 = new JLabel("4");
	public static JLabel p5 = new JLabel("5");
	public static JLabel p6 = new JLabel("6");
	public static JLabel p7 = new JLabel("7");
	public static JLabel p8 = new JLabel("8");
	public static JLabel p9 = new JLabel("9");
	public static JLabel p10 = new JLabel("10");
	public static JLabel p11 = new JLabel("11");
	
	/**
	 * 
	 */

	SolitaireMain(){
		labelFrame = new JLayeredPane();		 //The label frame is a layered pane that is added into the main frame
		labelFrame.setBounds(0, 0, 1920, 1080); //It is used to make sure that all the cards are layered correctly when they are moved
		
		frame1 = new JFrame("Solitaire");		//Frame 1 is the main frame of the SpadeAce game. It contains all the necessary
		frame1.add(labelFrame);					// Buttons, and textfields needed to make sure of smooth gameplay.
	    frame1.setSize(1920, 1080);
	    frame1.setVisible(true);
	    frame1.setLayout(null);
	    frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		
		
		

		deck = new Deck();						// This line here calls upon the deck class method
		
		backButton = new JButton("Quit");		// The back button is used to allow the player to quit the game.
		backButton.setBounds(1290, 0, 150, 40); // it consists of actions listeners to check for actions
		backButton.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		backButton.setBorderPainted(false);
		backButton.setOpaque(true);
		backButton.setBackground(Color.GRAY);
		backButton.addActionListener(this);
		frame1.add(backButton);

		submit = new JButton("Sub");			// This is the submit button. Once a user enters their
		submit.setBounds(775, 560, 150, 50);	// card to move and the pile number, this method is used so that
												// computer can read what has been inputted.
		submit.setFont(new Font("Comic Sans MS", Font.BOLD, 25));
		submit.setBorderPainted(false);
		submit.setOpaque(true);
		submit.setBackground(Color.GRAY);
		submit.addActionListener(this);
		frame1.add(submit);
		
		checkWin = new JButton("Check Win");	// Once a user feels that they have completed the required tasks to win the game
		checkWin.setBounds(50, 700, 211, 50);	// They can ask the computer to check if they have won or not.
		checkWin.setFont(new Font("Comic Sans MS", Font.BOLD, 25));
		checkWin.setBorderPainted(false);
		checkWin.setOpaque(true);
		checkWin.setBackground(Color.GRAY);
		checkWin.addActionListener(this);
		frame1.add(checkWin);
		
		draw = new JButton();					// This button is used to access the cards 
		draw.setBounds(1100, 50, 100, 147);		// that have not been placed onto the deck
		draw.setIcon(new ImageIcon("images/CardBack.png"));
		draw.setBorderPainted(false);
		draw.setOpaque(true);
		draw.addActionListener(this);
		frame1.add(draw, 0);


		t2=new JTextField("");  			  //This text field reads the card type
		t2.setBounds(600, 525, 150,49);
		t2.addActionListener(this);
		frame1.add(t2, 0);

		t3=new JTextField("");  			// This text field reads the pile number
	    t3.setBounds(600, 600, 150,49);
	    t3.addActionListener(this);
	    frame1.add(t3, 0);
	    
	    JLabel xLabel = new JLabel("Enter the card"); 				//This label over here is help the user understand what the corresponding
	    xLabel.setFont(new Font("Comic Sans MS", Font.BOLD, 15));	//text field is for
	    xLabel.setBounds(600, 495, 500, 49);
		frame1.add(xLabel, 0);
		
		JLabel yLabel = new JLabel("Enter the pile number");		//This label over here is help the user understand what the corresponding
		yLabel.setFont(new Font("Comic Sans MS", Font.BOLD, 13));	//text field is for
		yLabel.setBounds(600, 570, 500, 49);
		frame1.add(yLabel, 0);
		
		
		//All of the labels starting with p are used to label the pile numbers
		// to provide simplicity for the user to understand their numbers
		p1.setBounds(95, 30, 100, 20);
		p1.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		frame1.add(p1, 0);
		
		p2.setBounds(245, 30, 100, 20);
		p2.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		frame1.add(p2, 0);
		
		p3.setBounds(395, 30, 100, 20);
		p3.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		frame1.add(p3, 0);
		
		p4.setBounds(545, 30, 100, 20);
		p4.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		frame1.add(p4, 0);
		
		p5.setBounds(695, 30, 100, 20);
		p5.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		frame1.add(p5, 0);
		
		p6.setBounds(845, 30, 100, 20);
		p6.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		frame1.add(p6, 0);
		
		p7.setBounds(995, 30, 100, 20);
		p7.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		frame1.add(p7, 0);
		
		p8.setBounds(85, 650, 100, 20);
		p8.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		frame1.add(p8, 0);
	  
		p9.setBounds(235, 650, 100, 20);
		p9.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		frame1.add(p9, 0);
		
		p10.setBounds(385, 650, 100, 20);
		p10.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		frame1.add(p10, 0);
		
		p11.setBounds(535, 650, 100, 20);
		p11.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		frame1.add(p11, 0);
		
		gameBg.setIcon(new ImageIcon("images/backgroundImage.jpg")); // These lines of the code are used to set the background image of the main file
		gameBg.setBounds(0, 0, 1920, 1080);
		frame1.add(gameBg);	
		frame1.validate();
		
	    deck.shuffle();
	    deck.deal(labelFrame);
	    
		
		
	}
	/**
	 * This Method is the main method for the spade ace game
	 * @param args
	 */
	public static void main(String[] args) {
		//new SolitaireMain();
		new StartMenu();
		
	}

	@Override
	/**
	 * This method check for the actions performed throughout the Mainframe
	 */
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource() == backButton) { // Checks if the exit button has been pressed
			frame1.setVisible(false);
		
		}
		if(e.getSource()== submit) {     // Checks the if the submit button has been pressed
			cardType = t2.getText().toUpperCase(); // Makes user input uppercase for the card type
			pileNumText = t3.getText();
			pileNum = Integer.parseInt(pileNumText); // turns the string pilenum into a number
			deck.moveCard(cardType, pileNum, labelFrame); //move card method is called
			
		}
		
		if(e.getSource() == draw && buttonPress < 23) {
			deck.drawCard(labelFrame, buttonPress);
			 buttonPress++;
		}
		
		if (e.getSource() == checkWin) {
			deck.win(frame1);
				
		}
	}
}