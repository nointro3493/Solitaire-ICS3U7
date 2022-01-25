import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


import javax.swing.*;
public class SolitaireMain extends Deck implements ActionListener{
	private JFrame frame1;
	private JButton backButton;
	private JButton submit;
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
        HalfDeck halfDeck = new HalfDeck();
        backButton = new JButton("Back");
        backButton.setPreferredSize(new Dimension(40, 40));
        backButton.setBounds(0, 0, 211, 50);
		backButton.setFont(new Font("Comic Sans MS", Font.BOLD, 25));
		backButton.setBorderPainted(false);
		backButton.setOpaque(true);
		backButton.setBackground(Color.GRAY);
		backButton.addActionListener(this);
		frame1.add(backButton);
		
		 submit = new JButton("Sub");
	     submit.setPreferredSize(new Dimension(40, 40));
	        submit.setBounds(0, 100, 211, 50);
			submit.setFont(new Font("Comic Sans MS", Font.BOLD, 25));
			submit.setBorderPainted(false);
			submit.setOpaque(true);
			submit.setBackground(Color.GRAY);
			submit.addActionListener(this);
			frame1.add(submit);
		
	
		t2=new JTextField("");  
	    t2.setBounds(1000, 450, 150,49);
	    t2.addActionListener(this);
	    frame1.add(t2);
	    
	    t3=new JTextField("");  
	    t3.setBounds(1000, 500, 150,49);
	    t3.addActionListener(this);
	    frame1.add(t3);
	    
	    JLabel xLabel = new JLabel("Enter First letter or number and suit");
	    xLabel.setBounds(760,450,500,49);
		frame1.add(xLabel);
		
		JLabel yLabel = new JLabel("Enter the pile number");
		yLabel.setBounds(760,475,500,49);
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
			StartMenu startmenu = new StartMenu();		
			frame1.setVisible(false);
		
		}
		if(e.getSource()== submit) {
			cardType = t2.getText();
			pileNumText = t3.getText();
			pileNum = Integer.parseInt(pileNumText);
			deck.moveCard(cardType,pileNum ,frame1);
			
		}
	}
}