import java.util.Scanner;
import java.io.IOException;
import java.io.*;

public class main {

	static void display( String filename ) throws IOException {

		File fileIn = new File( filename );

		try {

			Scanner in = new Scanner( fileIn );
			playerStore store = new playerStore();

			while( in.hasNextLine() ) {

				String line = in.nextLine();
				in.nextLine();
				String[] parts = line.split(",");
				String playerName = parts[0];
				String playerID = parts[1];
				String careerTriesScored = parts[2];
				String teamName = parts[3];
				String teamID = parts[4];
				String homeStadiumStreet = parts[5];
				String homeStadiumTown = parts[6];
				String homeStadiumPostcode = parts[7];

				store.add( playerName, playerID, careerTriesScored, teamName, teamID, homeStadiumStreet, homeStadiumTown, homeStadiumPostcode );
			}
			in.close();
			System.out.println( store ); 
	    }
	    catch( Exception e ) {

			System.out.println( "reading file: " + filename + e);
			throw e;
		}
	}


	static void exit() {
		System.out.println( "exiting..." );	
	}


	static void create( String filename ) throws IOException {

		filename = filename + ".txt";

		File file = new File( filename );

		if (file.createNewFile()) {
			System.out.println( "file created" );
		}
		
		else {
			System.out.println( "operation failed" );
		}
	}


	static void write( String filename ) throws IOException {

		Scanner in = new Scanner( System.in );
		System.out.println( "no of entries: " );
		int noEntries = in.nextInt();
		in.nextLine();

		try {
			playerStore store = new playerStore();

			for (int i = 0; i < noEntries; i++) {	 

				System.out.println( "entry: " + i );

	 			System.out.println( "player name: " );
				String playerName = in.nextLine();
				
				System.out.println( "player id: " );
				String playerID = in.nextLine();
				
				System.out.println( "career tries scored: " );
				String careerTriesScored = in.nextLine();
				
				System.out.println( "team name: " );
				String teamName = in.nextLine();
				
				System.out.println( "team id: " );
				String teamID = in.nextLine();
				
				System.out.println( "home stadium street: " );
				String homeStadiumStreet = in.nextLine();
				
				System.out.println( "home stadium town: " );
				String homeStadiumTown = in.nextLine();
				
				System.out.println( "home stadium postcode: " );
				String homeStadiumPostcode = in.nextLine();

				store.add( playerName, playerID, careerTriesScored, teamName, teamID, homeStadiumStreet, homeStadiumTown, homeStadiumPostcode );

			}
			writeFile data = new writeFile(filename, true);
			data.writeToFile( store.toString() );
		}

		catch( Exception e ) {

			System.out.println( "writing error: " + filename + e);
			throw e;
		}
	}


	public static void main( String[] args ) throws IOException {

		boolean running = true;
		String filename; 

		while ( running ) {

		Scanner in = new Scanner( System.in );
		System.out.println( "commands available: " );
		System.out.println( "~ write" );
		System.out.println( "~ display" );
		System.out.println( "~ create" );
		System.out.println( "~ exit" );
		String choice = in.nextLine(); 
		
			if ( choice.equals( "write" )) {
				System.out.println("name of file: ");
				filename = in.nextLine();
				filename = filename + ".txt";
				write( filename );
			}
			else if ( choice.equals( "display" )) {

				System.out.println("name of file: ");
				filename = in.nextLine();
				filename = filename + ".txt";
				display( filename );
			}
			else if ( choice.equals( "exit" )) {
				exit();
				running = false;
			}		
			else if ( choice.equals( "create" )) {
				System.out.println("name of file: ");
				filename = in.nextLine();
				filename = filename + ".txt";
				create( filename );
			}
			else {
				System.out.println( "invalid" );
			}

		}
	}
}