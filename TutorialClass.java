import java.awt.*;
import java.io.*;
import java.util.Scanner;
import java.awt.event.*;

import javax.swing.*;	
public class TutorialClass extends JPanel{
	JFrame tutorialFrame;
	JLabel bgPicture;
	String line;
	JLabel stepTwo;
	JLabel stepThree;
	JLabel stepFour;
	JLabel tutorialImage;
	JLabel placeCardImage;
	JButton back;
	Color background = new Color(154, 180, 205); //100, 243, 56 (green)
	static int y = 10;


	TutorialClass() {
		tutorialFrame = new JFrame();
		tutorialFrame.setSize(1200, 600);
		tutorialFrame.getContentPane().setBackground(background);
		tutorialFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		tutorialFrame.setVisible(true);
		tutorialFrame.setLayout(null);
		
		addRules();


		tutorialImage = new JLabel();

		tutorialImage.setIcon(new ImageIcon("images/TutorialImage.png"));
		tutorialImage.setBounds(780, 20, 400, 300);
		tutorialFrame.add(tutorialImage);	
		tutorialFrame.validate();
		
		placeCardImage = new JLabel();
		
		placeCardImage.setIcon(new ImageIcon("images/PlaceCard.png"));
		placeCardImage.setBounds(780, 300, 400, 300);
		tutorialFrame.add(placeCardImage);	
		tutorialFrame.validate();

	}

	public void addRules() {
		int yAxis = 0;
		try {

			BufferedReader in = new BufferedReader(new FileReader("rules.txt"));

			while ((line = in.readLine()) != null) {

				displayText(line, yAxis);
				yAxis += 30;
			}
			in.close();
		}
		catch (IOException iox) {
			System.out.println("File not found");
		}
	}

	public void displayText(String text, int y) {
		JLabel line = new JLabel(text);
		line.setBounds(20, y, 1800, 100); 
		tutorialFrame.add(line);
		tutorialFrame.revalidate();
	}


}