import javax.swing.*;
import java.awt.*;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
/**
 * @authors Kabir Jain and Jade Marmash
 * Date: January 28th
 * Program Name: SpadeAce (version 16.0.2)
 * Description: The win class displays a window which congratulates a winning player and shows the
 * number of games won, number of games played and win percentage in the program.
 */
public class WinClass extends JFrame {
	//declare variables
	private JFrame winFrame;
	private JLabel bgWin;
	private JLabel winnerMsg;
	private JLabel wins;
	private JLabel loss;
	
	//constructor
	WinClass(){
		
		//creates new frame
		winFrame = new JFrame("HOORAY!");
		winFrame.setSize(395, 396);
		winFrame.setVisible(true);
		winFrame.setLayout(null);
		winFrame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );

		//displays a message that tells the winner they won
		winnerMsg = new JLabel("HOORAY YOU WIN!!");
		winnerMsg.setBounds(20,50, 300, 300);
		winnerMsg.setFont(new Font("Comic Sans MS", Font.BOLD, 25));
		winFrame.add(winnerMsg);
		winFrame.validate();

		//declares total wins and total games as strings
		String winString = "Total Wins: "+ WinClass.getWins();
		String lossString = "Total games: " + WinClass.getTotalGames();

		//displays total wins on frame
		wins = new JLabel(winString);
		wins.setBounds(100, 100, 200, 400);
		winFrame.add(wins);
		winFrame.validate();

		//displays total losses on frame
		loss = new JLabel(lossString);
		loss.setBounds(100, 120, 200, 400);
		winFrame.add(loss);
		winFrame.validate();

		//calculates the win percentage and displays it
		double winPercentage = ((double)WinClass.getWins()/WinClass.getTotalGames())*100;
		int winPercentageInt = (int) winPercentage;
		JLabel percentWin = new JLabel("Win Percentage: "+ (winPercentageInt)+"%");
		percentWin.setBounds(100, 140, 200, 400);
		winFrame.add(percentWin);
		winFrame.validate();

		//creates a background
		bgWin = new JLabel();
		bgWin.setIcon(new ImageIcon("images/giphy.gif"));
		bgWin.setBounds(0, 0, 395, 396);
		winFrame.add(bgWin);	
		winFrame.validate();
	}

	/**
	 * This method reads a txt file to get the total number of games won
	 * @return The number of games won
	 */
	public static int getWins() {
		String fileName = "gamesWon.txt";
		String gamesWon;
		int gamesWonInt = 0;
		String line ="";
		String lastLine = "";

		try {
			BufferedReader reader = new BufferedReader(new FileReader(fileName));
			while((lastLine = reader.readLine())!= null) {
				line = lastLine;

			}
			gamesWon = line;

			reader.close();

		}

		catch(IOException iox) {
			System.out.println("Problem reading " + fileName);

		}
		
		return Integer.valueOf(line);
	}

	/**
	 * This method reads a txt file to get the total number of games played
	 * @return total number of games played
	 */
	public static int getTotalGames() {
		String fileName = "totalGames.txt";
		String gamesWon;
		//String gamesLost;
		String lastLine = "";
		String line = "";
		int gamesWonInt;
		int gamesLostInt = 0;
		
		try {
			BufferedReader reader = new BufferedReader(new FileReader(fileName));

			while((lastLine = reader.readLine())!= null) {
				line = lastLine;
			}
			gamesWon = line; 

			reader.close();
		}

		catch(IOException iox) {
			System.out.println("Problem reading " + fileName);

		}
		
		return Integer.valueOf(line);
	}

	/**
	 * Writes a number for the number of games won in a txt file
	 * @param i 
	 */
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

	/**
	 * Writes a number for the number of games played in a txt file
	 * @param i 
	 */
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
