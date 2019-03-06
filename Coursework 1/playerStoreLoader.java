import java.util.Scanner;
import java.io.File;

public class playerStoreLoader {

	public static playerStore loadPlayerStore( String filename ) throws Exception {
		File fileIn = new File( filename );

		try {
			Scanner in = new Scanner( fileIn );
			playerStore store = new playerStore();

			while( in.hasNextLine() ) {
				String line = in.nextLine();

				String[] parts = line.split(",");
				String playerName = parts[0];
				String playerID = parts[1];
				int careerTriesScored = Integer.parseInt(parts[2]);
				String teamName = parts[3];
				String teamID = parts[4];
				String homeStadiumStreet = parts[5];
				String homeStadiumTown = parts[6];
				String homeStadiumPostcode = parts[7];

				store.add( playerName, playerID, careerTriesScored, teamName, teamID, homeStadiumStreet, homeStadiumTown, homeStadiumPostcode );
			}
			in.close();

			return store;
		}
		catch( Exception e ) {
			System.out.println( "Problem reading file: " + filename + e);
			throw e;
		}
	}

	public static void main( String[] args ) {
		try {
			String filename = args[0];
			playerStore ps = loadPlayerStore( filename );
			System.out.println( ps );
		}
		catch( Exception e ) {
		
		}
	}
}







