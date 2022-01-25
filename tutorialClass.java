import javax.swing.*;	
public class tutorialClass extends JFrame{
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

		bgPicture.setIcon(new ImageIcon("images/StartPage.jpeg"));
		bgPicture.setBounds(1200, 600, 0, 0);
		tutorialFrame.add(bgPicture);	
		tutorialFrame.validate();



	}
	public static void main(String[] args) {
		new tutorialClass();

	}


}
