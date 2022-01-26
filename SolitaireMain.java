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

	SolitaireMain(){
		labelFrame = new JLayeredPane();
		labelFrame.setBounds(0,0,1920,1080);

  
		
		//backImage = new ImageIcon("images/back.jpeg");
		frame1 = new JFrame("Solitaire");
		frame1.add(labelFrame);
		
	    frame1.setSize(1920, 1080);
	    frame1.setVisible(true);
	    frame1.setLayout(null);
	    frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame1.getContentPane().setBackground(Color.GREEN);
		
		
		
		

		deck = new Deck();
		backButton = new JButton("Quit");
		//backButton.setPreferredSize(new Dimension(40, 40));
		backButton.setBounds(0, 0, 150, 40);
		backButton.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		backButton.setBorderPainted(false);
		backButton.setOpaque(true);
		backButton.setBackground(Color.GRAY);
		backButton.addActionListener(this);
		frame1.add(backButton);

		submit = new JButton("Sub");
		//submit.setPreferredSize(new Dimension(40, 40));
		submit.setBounds(775, 560, 150, 50);
		submit.setFont(new Font("Comic Sans MS", Font.BOLD, 25));
		submit.setBorderPainted(false);
		submit.setOpaque(true);
		submit.setBackground(Color.GRAY);
		submit.addActionListener(this);
		frame1.add(submit);
		
		checkWin = new JButton("Check Win");
		//submit.setPreferredSize(new Dimension(40, 40));
		checkWin.setBounds(50, 700, 211, 50);
		checkWin.setFont(new Font("Comic Sans MS", Font.BOLD, 25));
		checkWin.setBorderPainted(false);
		checkWin.setOpaque(true);
		checkWin.setBackground(Color.GRAY);
		checkWin.addActionListener(this);
		frame1.add(checkWin);
		
		draw = new JButton();
		//draw.setPreferredSize(new Dimension(40, 40));
		draw.setBounds(1100, 50, 100, 147);
		draw.setIcon(new ImageIcon("images/CardBack.png"));
		draw.setBorderPainted(false);
		draw.setOpaque(true);
		draw.addActionListener(this);
		frame1.add(draw);


		t2=new JTextField("");  
		t2.setBounds(600, 525, 150,49);
		t2.addActionListener(this);
		frame1.add(t2);

		t3=new JTextField("");  
	    t3.setBounds(600, 600, 150,49);
	    t3.addActionListener(this);
	    frame1.add(t3);
	    
	    JLabel xLabel = new JLabel("Enter the card");
	    xLabel.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
	    xLabel.setBounds(600, 495, 500, 49);
		frame1.add(xLabel);
		
		JLabel yLabel = new JLabel("Enter the pile number");
		yLabel.setFont(new Font("Comic Sans MS", Font.BOLD, 13));
		yLabel.setBounds(600, 570, 500, 49);
		frame1.add(yLabel);
	  
	    deck.shuffle();
	    deck.deal(labelFrame);
	    
		
		
	}
	public static void main(String[] args) {
		//new SolitaireMain();
		new StartMenu();
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource() == backButton) {
			frame1.setVisible(false);
		
		}
		if(e.getSource()== submit) {
			cardType = t2.getText();
			pileNumText = t3.getText();
			pileNum = Integer.parseInt(pileNumText);
			deck.moveCard(cardType, pileNum, labelFrame);
			
		}
		
		if(e.getSource() == draw && buttonPress < 23) {
			deck.drawCard(labelFrame, buttonPress);
			 buttonPress++;
		}
		
		if (e.getSource() == checkWin) {
			System.out.println(deck.win());
		}
	}
}