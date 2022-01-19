import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class StartMenu extends JFrame implements ActionListener{
		private JFrame frame;
		private JLabel titleText;
		private JLabel bgPic;
		private JButton okbutton;
		private JButton exitbutton;
		private JButton helpbutton;
	StartMenu(){
		frame = new JFrame("Solitaire");
	    frame.setSize(1200,600);
	    frame.setVisible( true );
	    frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
	    bgPic = new JLabel();
	    
	    
	    
	    
	    titleText=new JLabel("Welcome to SpadeAce; The Best Solitaire In Its Class!");  
	    titleText.setBounds(50,50, 1500,49);  
	    titleText.setFont(new Font("Comic Sans MS", Font.BOLD, 40));
	    titleText.setForeground(Color.WHITE);
	    frame.add(titleText);
	    
	    okbutton = new JButton("Start");
		okbutton.setBounds(450, 300, 211, 50);
		okbutton.setFont(new Font("Comic Sans MS", Font.BOLD, 25));
		
		okbutton.setOpaque(true);
		
		okbutton.setBackground(Color.GREEN);
		okbutton.setBorderPainted(false);
		okbutton.addActionListener(this);
		
		frame.add(okbutton);
			
	
		 
		exitbutton = new JButton("Exit");
		exitbutton.setBounds(450, 375, 211, 50);
		exitbutton.setFont(new Font("Comic Sans MS", Font.BOLD, 25));
		exitbutton.setBorderPainted(false);
		exitbutton.setOpaque(true);
		exitbutton.setBackground(Color.RED);
		exitbutton.addActionListener(this);
		//exitbutton.addActionListener(this);
		frame.add(exitbutton);
		
		helpbutton = new JButton("HELP");
		helpbutton.setBounds(450, 450, 211, 50);
		helpbutton.setFont(new Font("Comic Sans MS", Font.BOLD, 25));
		helpbutton.setBorderPainted(false);
		helpbutton.setOpaque(true);
		helpbutton.setBackground(Color.YELLOW);
		helpbutton.addActionListener(this);
		//helpbutton.addActionListener(this);
		frame.add(helpbutton);
		
		
	
	    bgPic.setIcon(new ImageIcon("images/StartPage.jpeg"));
	    bgPic.setBounds(1200, 600, 0, 0);
	    frame.add(bgPic);	
	    frame.validate();
	    
	   
	}
	public static void main(String[] args) {
		new StartMenu();
	}

	 
	 public void actionPerformed(ActionEvent e) {
		 if(e.getSource()== okbutton) {
			SolitaireMain main = new SolitaireMain();
		 	frame.setVisible(false);
		 }
		 
		 
		 if(e.getSource() == exitbutton) {
			frame.setVisible(false);
		 }
		 
		 if(e.getSource() == helpbutton) {
			 tutorialClass tut = new tutorialClass();
			 
		 }
		 

		 
	 }
	

}