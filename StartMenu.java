import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class StartMenu extends JFrame implements ActionListener{
	private JFrame frame;
	private JLabel t1;
	private JLabel j1;
	private JButton okbutton;
	private JButton exitbutton;
	private JButton helpbutton;
	StartMenu(){
		frame = new JFrame("Solitaire");
	    frame.setSize(1200,600);
	    frame.setVisible( true );
	    frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
	    j1 = new JLabel();
	    
	    
	    
	    
	    t1=new JLabel("Welcome to SpadeAce; The Best Solitaire In Its Class!");  
	    t1.setBounds(50,50, 1500,49);  
	    t1.setFont(new Font("Comic Sans MS", Font.BOLD, 40));
	    t1.setForeground(Color.WHITE);
	    frame.add(t1);
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
		//exitbutton.addActionListener(this);
		frame.add(exitbutton);
		
		helpbutton = new JButton("HELP");
		helpbutton.setBounds(450, 450, 211, 50);
		helpbutton.setFont(new Font("Comic Sans MS", Font.BOLD, 25));
		helpbutton.setBorderPainted(false);
		helpbutton.setOpaque(true);
		helpbutton.setBackground(Color.YELLOW);
		//helpbutton.addActionListener(this);
		frame.add(helpbutton);
		
		
	
	    j1.setIcon(new ImageIcon("images/StartPage.jpeg"));
	    j1.setBounds(1200, 600, 0, 0);
	    frame.add(j1);
	    frame.validate();
	    
	   
	}
	 public static void main(String[] args) {
	    	new StartMenu();
	    }
	 
	 public void actionPerformed(ActionEvent e) {
		 SolitaireMain main = new SolitaireMain();

		 
	 }
	

}