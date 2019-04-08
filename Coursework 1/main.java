import java.util.Scanner;
import java.io.IOException;
import java.io.*;
import java.util.Vector;

public class main {

	static void display( String filename ) throws IOException {

		File fileIn = new File( filename );

		try {

			Scanner in = new Scanner( fileIn );
			playerStore store = new playerStore();

			while( in.hasNextLine() ) {

				String line = in.nextLine();
				
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

	static void search( String filename, String search ) throws IOException {

		File fileIn = new File( filename );

		try {

			Scanner in = new Scanner( fileIn );
			playerStore store = new playerStore();
			int lineNum = 0;
			Vector<playerEntry> matches = new Vector<playerEntry>();

			while( in.hasNextLine() ) {

				String line = in.nextLine();
				
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
				
				if ( store.get(lineNum).toString().contains( search )) {
				matches.add( store.get(lineNum));	
				}
				lineNum++;
			}
			in.close();
			System.out.println("Search results found: " + matches.size());

			for (playerEntry match : matches) {
                System.out.println();
                System.out.println(match.toString());
            }
        	System.out.println();
	    }
	    catch( Exception e ) {

			System.out.println( "reading file: " + filename + e);
			throw e;
		}
	}


	static void exit() {
		System.out.println( "exiting..." );	
	}


	static void create() throws IOException {

		Scanner in = new Scanner( System.in );
		System.out.println("name of file: ");
		String filename = in.nextLine();
		filename = filename + ".txt";

		File file = new File( filename );

		if (file.createNewFile()) {
			System.out.println( "file created" );
		}
		
		else {
			System.out.println( "operation failed" );
		}
	}


	static void write( String filename, boolean ow ) throws IOException {

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
			writeFile data = new writeFile( filename, ow );
			data.writeToFile( store.toString().trim() );
		}

		catch( Exception e ) {

			System.out.println( "writing error: " + filename + e);
			throw e;
		}
	}


	public static void main( String[] args ) throws IOException {

		boolean running = true;
		String filename = "none";
		String search;
		boolean ow = false;

		while ( running ) {

		Scanner in = new Scanner( System.in );
		System.out.println( "commands available: " );
		System.out.println( "~ load file" + "\t\t\t\t" + "(-l)");
		System.out.println( "~ overwrite" + "\t\t\t\t" + "(-o)" );
		System.out.println( "~ append" + "\t\t\t\t" + "(-a)" );
		System.out.println( "~ display file" + "\t\t\t\t" + "(-d)" );
		System.out.println( "~ search" + "\t\t\t\t" + "(-s)" );
		System.out.println( "~ create blank file" + "\t\t\t" + "(-b)" );
		System.out.println( "~ exit application" + "\t\t\t" + "(-e)" );
		System.out.println( "loaded file: " + filename );

		String choice = in.nextLine(); 
		
			if ( choice.equals( "-o" ) && filename != "none") {
				ow = false;
				write( filename, ow );
			}
			else if ( choice.equals( "-a" ) && filename != "none") {
				ow = true;
				write( filename, ow );
			}
			else if ( choice.equals( "-s" ) && filename != "none") {
				System.out.println( "enter search word: " );
				search = in.nextLine();
				search( filename, search );
			}
			else if ( choice.equals( "-d" ) && filename != "none") {
				display( filename );
			}
			else if ( choice.equals( "-e" )) {
				exit();
				running = false;
			}		
			else if ( choice.equals( "-b" )) {
				create();
			}
			else if ( choice.equals( "-l" )) {
				System.out.println("name of file: ");
				filename = in.nextLine();
				filename = filename + ".txt";
			}
			else {
				System.out.println( "error: invalid command or no file loaded" );
			}

		}
	}
}