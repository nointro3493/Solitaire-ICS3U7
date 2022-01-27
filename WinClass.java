import javax.swing.*;
import java.awt.*;
public class WinClass extends JFrame {
	private JFrame winFrame;
	private JLabel bgWin;
	private JLabel winnerMsg;
	WinClass(){
		winFrame = new JFrame("HOORAY!");
		winFrame.setSize(395, 396);
		winFrame.setVisible(true);
		winFrame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		
		winnerMsg = new JLabel("HOORAY YOU WIN!!");
		winnerMsg.setBounds(400, 200, 50, 50);
		winnerMsg.setFont(new Font("Comic Sans MS", Font.BOLD, 25));
		winFrame.add(winnerMsg);
		winFrame.validate();
		
		bgWin = new JLabel();
		bgWin.setIcon(new ImageIcon("images/giphy.gif"));
		bgWin.setBounds(500, 500, 0, 0);
		winFrame.add(bgWin	);	
		winFrame.validate();
		
		
	
	}

}
