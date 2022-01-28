import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ScoreBoard {
	private String fileName = "gamesLostWon.txt";
	private String gamesWon;
	private String gamesLost;

	ScoreBoard(){
		try {
			BufferedReader reader = new BufferedReader(new FileReader(fileName));
			gamesWon = reader.readLine(); //read in a line
			gamesLost = reader.readLine();

			reader.close();

		}

		catch(IOException iox) {
			System.out.println("Problem reading " + fileName);

		}

	}
	
	


}
