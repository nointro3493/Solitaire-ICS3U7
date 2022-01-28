import javax.swing.*;
import java.awt.*;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
public class WinClass extends JFrame {
	private JFrame winFrame;
	private JLabel bgWin;
	private JLabel winnerMsg;
	private JLabel wins;
	private JLabel loss;
	WinClass(){
		winFrame = new JFrame("HOORAY!");
		winFrame.setSize(395, 396);
		winFrame.setVisible(true);
		winFrame.setLayout(null);
		winFrame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );

		winnerMsg = new JLabel("HOORAY YOU WIN!!");
		winnerMsg.setBounds(20,50, 300, 300);
		winnerMsg.setFont(new Font("Comic Sans MS", Font.BOLD, 25));
		winFrame.add(winnerMsg);
		winFrame.validate();
		
		
		String winString = "Total Wins: "+WinClass.getWins();
		String lossString = "Total games: " + WinClass.getTotalGames();
		
		
		
		wins = new JLabel(winString);
		wins.setBounds(100,100,200,400);
		winFrame.add(wins);
		winFrame.validate();
		
		loss = new JLabel(lossString);
		loss.setBounds(100,120,200,400);
		winFrame.add(loss);
		winFrame.validate();
		
		double winPercentage = ((double)WinClass.getTotalGames()/WinClass.getWins())*100;
		
		int winPercentageInt = (int) winPercentage;
		JLabel percentWin = new JLabel(""+ (winPercentage)+"");
		percentWin.setBounds(100, 140, 200, 400);
		winFrame.add(percentWin);
		winFrame.validate();

		bgWin = new JLabel();
		bgWin.setIcon(new ImageIcon("images/giphy.gif"));
		bgWin.setBounds(0, 0, 395, 396);
		winFrame.add(bgWin);	
		winFrame.validate();



	}

	public static int getWins() {
		String fileName = "gamesWon.txt";
		String line ="";
		String lastLine = "";
		
		try {
			BufferedReader reader = new BufferedReader(new FileReader(fileName));
			while((lastLine = reader.readLine())!= null) {
				line = lastLine;
				
			}

			reader.close();
		}

		catch(IOException iox) {
			System.out.println("Problem reading " + fileName);

		}
		return Integer.valueOf(line);
	}

	public static int getTotalGames() {
		String fileName = "totalGames.txt";
		String gamesWon;
		String gamesLost;
		String lastLine = "";
		String line = "";
		int gamesWonInt;
		int gamesLostInt = 0;
		try {
			BufferedReader reader = new BufferedReader(new FileReader(fileName));
			while((lastLine = reader.readLine())!= null) {
				line = lastLine;
			
			
			}
			reader.close();
		}

		catch(IOException iox) {
			System.out.println("Problem reading " + fileName);

		}
		return Integer.valueOf(line);
	}
	
	public static void setWins(int i) {
		String fileName = "gamesWon.txt";
		int prevWins = WinClass.getWins() + 1;
		
		try {
			BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true));
			writer.write(""+prevWins);
			writer.newLine();
			writer.close();
		}
		catch(IOException iox) {
			System.out.println("Problem wrting to" + fileName);
			
		}
	}
	
	public static void setTotalGames(int i) {
		String fileName = "totalGames.txt";
		int prevLosses = WinClass.getTotalGames()+ 1;
		
		try {
			BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true));
			writer.write(""+prevLosses);
			writer.newLine();
			writer.close();
		}
		catch(IOException iox) {
			System.out.println("Problem wrting to" + fileName);
			
		}
	}


}

