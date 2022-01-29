import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/**
 * @authors Kabir Jain and Jade Marmash
 * Date: January 28th
 * Program Name: SpadeAce (version 16.0.2)
 * Description: The StartMenu class creates the start menu/title page in the program. 
 *
 */
public class StartMenu extends JFrame implements ActionListener{
	
	//declare variables
	private JFrame frame;
	private JLabel titleText;
	private JLabel bgPic;
	private JLabel creatorInfo;
	private JButton okbutton;
	private JButton exitbutton;
	private JButton helpbutton;

	//constructor
	public StartMenu(){
		
		//creates the start menu frame
		frame = new JFrame("Solitaire");
		frame.setSize(1200, 600);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//displays our creator info
		creatorInfo = new JLabel("ICS3U7-01 By: Kabir And Jade");
		creatorInfo.setBounds(50, 500, 1500, 49);
		creatorInfo.setForeground(Color.WHITE);
		creatorInfo.setFont(new Font("Comic Sans MS", Font.BOLD, 25));		
		frame.add(creatorInfo);
		
		//creates the title of the frame
		titleText=new JLabel("Welcome to SpadeAce; The Best Solitaire In Its Class!");  
		titleText.setBounds(50,50, 1500,49);  
		titleText.setFont(new Font("Comic Sans MS", Font.BOLD, 40));
		titleText.setForeground(Color.WHITE);
		frame.add(titleText);

		//creates a "Start" button
		okbutton = new JButton("Start");
		okbutton.setBounds(490, 200, 211, 50);
		okbutton.setFont(new Font("Comic Sans MS", Font.BOLD, 25));
		okbutton.setOpaque(true);
		okbutton.setBackground(Color.GREEN);
		okbutton.setBorderPainted(false);
		okbutton.addActionListener(this);
		frame.add(okbutton);

		//creates an "Exit" button
		exitbutton = new JButton("Exit");
		exitbutton.setBounds(490, 275, 211, 50);
		exitbutton.setFont(new Font("Comic Sans MS", Font.BOLD, 25));
		exitbutton.setBorderPainted(false);
		exitbutton.setOpaque(true);
		exitbutton.setBackground(Color.RED);
		exitbutton.addActionListener(this);
		frame.add(exitbutton);

		//creates a "Help" button
		helpbutton = new JButton("Help");
		helpbutton.setBounds(490, 350, 211, 50);
		helpbutton.setFont(new Font("Comic Sans MS", Font.BOLD, 25));
		helpbutton.setBorderPainted(false);
		helpbutton.setOpaque(true);
		helpbutton.setBackground(Color.YELLOW);
		helpbutton.addActionListener(this);
		frame.add(helpbutton);

		//creates the background image
		bgPic = new JLabel();
		bgPic.setIcon(new ImageIcon("images/StartPage.jpg"));
		bgPic.setBounds(1200, 600, 0, 0);
		frame.add(bgPic);	
		frame.validate();
	}

	/**
	 * Checks which actions the user has performed
	 * @return void
	 * @param e 
	 */
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource()== okbutton) {
			SolitaireMain main = new SolitaireMain();
			frame.setVisible(false);
		}

		if(e.getSource() == exitbutton) {
			System.exit(0);
		}

		if(e.getSource() == helpbutton) {
			TutorialClass tut = new TutorialClass();

		}

	}
}