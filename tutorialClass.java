import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class tutorialClass extends JFrame implements ActionListener{
	JFrame tutorialFrame;
	JLabel bgPicture;
	JLabel stepOne;
	JLabel stepTwo;
	JLabel stepThree;
	JLabel stepFour;


	tutorialClass(){
		tutorialFrame = new JFrame("tutorial");
		tutorialFrame.setSize(1200,600);
		tutorialFrame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		tutorialFrame.setVisible( true );
		
		bgPicture = new JLabel();
		stepOne = new JLabel();

		stepOne.setIcon(new ImageIcon("images/Step1.jpeg"));
		stepOne.setBounds(200,400, 0, 0);
		tutorialFrame.add(stepOne);	
		tutorialFrame.validate();

		bgPicture.setIcon(new ImageIcon("images/StartPage.jpeg"));
		bgPicture.setBounds(1200, 600, 0, 0);
		tutorialFrame.add(bgPicture);	
		tutorialFrame.validate();



	}
	public static void main(String[] args) {
		new tutorialClass();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

	}


}
