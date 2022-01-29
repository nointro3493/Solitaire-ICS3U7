import java.awt.*;
import java.io.*;
import java.awt.event.*;
import javax.swing.*;

/**
 * @authors Jade Marmash and Kabir Jain
 * Date: January 28th
 * Program Name: SpadeAce (version 16.0.2)
 * Description: The TutorialClass class creates a window with the rules for our game which are
 * read from a txt file.
 */
public class TutorialClass extends JPanel implements ActionListener{

	//declare variables
	JFrame tutorialFrame;
	JLabel bgPicture;
	String line;
	JLabel stepTwo;
	JLabel stepThree;
	JLabel stepFour;
	JLabel tutorialImage;
	JLabel placeCardImage;
	JButton backButton;

	Color background = new Color(154, 180, 205);
	static int y = 10;


	//constructor
	TutorialClass() {

		//frame for the tutorial class
		tutorialFrame = new JFrame();
		tutorialFrame.setSize(1200, 600);
		tutorialFrame.getContentPane().setBackground(background);
		tutorialFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		tutorialFrame.setVisible(true);
		tutorialFrame.setLayout(null);

		backButton = new JButton("Back");// The back button is used to allow the player to go back to the game
		backButton.setBounds(1050, 0, 150, 40);
		backButton.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		backButton.setBorderPainted(false);
		backButton.setOpaque(true);
		backButton.setBackground(Color.GREEN);
		backButton.addActionListener(this);
		tutorialFrame.add(backButton);



		//image which shows what a game looks like 
		tutorialImage = new JLabel();
		tutorialImage.setIcon(new ImageIcon("images/TutorialImage.png"));
		tutorialImage.setBounds(780, 20, 400, 300);
		tutorialFrame.add(tutorialImage);	
		tutorialFrame.validate();

		//image which shows how to type into the text box properly
		placeCardImage = new JLabel();	
		placeCardImage.setIcon(new ImageIcon("images/PlaceCard.png"));
		placeCardImage.setBounds(780, 300, 400, 300);
		tutorialFrame.add(placeCardImage);	
		tutorialFrame.validate();

		//calls on the addRules method
		addRules();

	}

	/**
	 * This method reads the rules from the text file
	 */
	public void addRules() {
		int yAxis = 0;

		try {

			BufferedReader in = new BufferedReader(new FileReader("rules.txt"));

			while ((line = in.readLine()) != null) {

				displayText(line, yAxis); //calls on the displayText method so that only one JLabel variable is used
				yAxis += 30;
			}

			in.close();
		}

		catch (IOException iox) {
			System.out.println("File not found");
		}
	}

	/**
	 * This method takes a string and a y coordinate and adds that string to the frame with the given
	 * y coordinate
	 * @param text
	 * @param y
	 */
	public void displayText(String text, int y) {
		JLabel line = new JLabel(text);
		line.setBounds(20, y, 1800, 100); 
		tutorialFrame.add(line);
		tutorialFrame.revalidate();
	}

	/**
	 * Checks which actions the user has performed
	 * @param e 
	 */
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == backButton) {
			tutorialFrame.setVisible(false);

		
		}
	}

}