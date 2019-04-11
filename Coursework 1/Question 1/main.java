import java.util.Scanner;
import java.io.IOException;
import java.io.*;
import java.util.Vector;
import java.util.regex.Pattern;

//Peter Snook 1842512

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
				String homeStadiumName = parts[5];
				String homeStadiumStreet = parts[6];
				String homeStadiumTown = parts[7];
				String homeStadiumPostcode = parts[8];

				store.add( playerName, playerID, careerTriesScored, teamName, teamID, homeStadiumName, homeStadiumStreet, homeStadiumTown, homeStadiumPostcode );
			}
			in.close();
			System.out.println( store ); 
	    }
	    catch( Exception e ) {

			System.out.println( "reading file: " + filename + e);
			throw e;
		}
	}

	static void search( String filename, String search, boolean caseSen ) throws IOException {

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
				String homeStadiumName = parts[5];
				String homeStadiumStreet = parts[6];
				String homeStadiumTown = parts[7];
				String homeStadiumPostcode = parts[8];

				store.add( playerName, playerID, careerTriesScored, teamName, teamID, homeStadiumName, homeStadiumStreet, homeStadiumTown, homeStadiumPostcode );
				if ( caseSen == (true) && ( store.get(lineNum).toString().toLowerCase().contains( search ))) {
					matches.add( store.get(lineNum));
					}

				if ( caseSen == (false) && ( store.get(lineNum).toString().contains( search ))) {
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

	static void displayParameters( String filename, int startAt, int endAt ) throws IOException {

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
				String homeStadiumName = parts[5];
				String homeStadiumStreet = parts[6];
				String homeStadiumTown = parts[7];
				String homeStadiumPostcode = parts[8];

				store.add( playerName, playerID, careerTriesScored, teamName, teamID, homeStadiumName, homeStadiumStreet, homeStadiumTown, homeStadiumPostcode );	
		
			}
			in.close();

			while (startAt <= endAt){
				System.out.println(store.get(startAt));
				startAt++;
			}
	    }
	    catch( Exception e ) {

			System.out.println( "reading file: " + filename + e);
			throw e;
		}
	}

	static void delete( String filename, int pos ) throws IOException {

		File fileIn = new File( filename );

		try {

			Scanner in = new Scanner( fileIn );
			playerStore store = new playerStore();
			int lineNum = 0;

			while( in.hasNextLine() ) {

				String line = in.nextLine();
				
				String[] parts = line.split(",");
				String playerName = parts[0];
				String playerID = parts[1];
				String careerTriesScored = parts[2];
				String teamName = parts[3];
				String teamID = parts[4];
				String homeStadiumName = parts[5];
				String homeStadiumStreet = parts[6];
				String homeStadiumTown = parts[7];
				String homeStadiumPostcode = parts[8];

				if (lineNum != pos) {
				store.add( playerName, playerID, careerTriesScored, teamName, teamID, homeStadiumName, homeStadiumStreet, homeStadiumTown, homeStadiumPostcode );	
				}
				lineNum++;
			}
			in.close();
			writeFile data = new writeFile( filename, false );
			data.writeToFile( store.toString().trim() );

			System.out.println("REMOVED SELECTION" );
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
			System.out.println( "FILE CREATED" );
		}
		
		else {
			System.out.println( "OPERATION FAILED" );
		}
	}


	static void write( String filename, boolean ow ) throws IOException {

		Scanner in = new Scanner( System.in );
		System.out.println( "no of entries: " );
		int noEntries = in.nextInt();
		in.nextLine();

		String playerName; 
		String playerID;
		String careerTriesScored;
		String teamName;
		String teamID;
		String homeStadiumName;
		String homeStadiumStreet;
		String homeStadiumTown;
		String homeStadiumPostcode;

		try {
			playerStore store = new playerStore();

			for (int i = 0; i < noEntries; i++) {	 

				System.out.println( "entry: " + i );

				while(true) {
	 				System.out.println( "player name: " );
					playerName = in.nextLine();
					if (Pattern.matches("[A-Z][a-z]+ [A-Z][a-z]+",playerName)){
						break;
					}
					else{
						System.out.println("only letters/spaces allowed, must include forename AND surname separated by a space");
						continue;
					}
				}
				
				while(true) {
					System.out.println( "player id: " );
					playerID = in.nextLine();
					if (Pattern.matches("[R][F][U]\\d{5}",playerID)){
						break;
					}
					else{
						System.out.println("uppercase 'RFU' followed by 5 digits ");
						continue;
					}
				}
				
				while(true) {
					System.out.println( "career tries scored: " );
					careerTriesScored = in.nextLine();
					if (Pattern.matches("\\d{0,}",careerTriesScored)){
						break;
					}
					else{
						System.out.println("at least one digit");
						continue;
					}
				}

				while(true) {
					System.out.println( "team name: " );
					teamName = in.nextLine();
					if (Pattern.matches("\\D+",teamName)){
						break;
					}
					else{
						System.out.println("only letters/spaces allowed, at least one character");
						continue;
					}
				}
				
				while(true) {
					System.out.println( "team id: " );
					teamID = in.nextLine();
					if (Pattern.matches("[A-Z]{3}\\d{4}",teamID)){
						break;
					}
					else{
						System.out.println("3 uppercase letters followed by 4 digits");
						continue;
					}
				}

				while(true) {
					System.out.println( "home stadium name: " );
					homeStadiumName = in.nextLine();
					if (Pattern.matches("\\D+",homeStadiumName)){
						break;
					}
					else{
						System.out.println("Only letters/spaces allowed, at least one character");
						continue;
					}
				}
				
				while(true) {
					System.out.println( "home stadium street: " );
					homeStadiumStreet = in.nextLine();
					if (Pattern.matches("\\D+",homeStadiumStreet)){
						break;
					}
					else{
						System.out.println("only digits/letters/spaces allowed, at least one character");
						continue;
					}
				}
				
				while(true) {
					System.out.println( "home stadium town: " );
					homeStadiumTown = in.nextLine();
					if (Pattern.matches("\\D+",homeStadiumTown)){
						break;
					}
					else{
						System.out.println("only letters/spaces allowed, at least one character");
						continue;
					}
				}
				
				while(true) {	
					System.out.println( "home stadium postcode: " );
					homeStadiumPostcode = in.nextLine();
					if (Pattern.matches("[A-Z]\\d[A-Z]{3}",homeStadiumPostcode)){
						break;
					}
					else{
						System.out.println("1 upper case letter, 1 digit, 3 upper case letters");
						continue;
					}
				}

			store.add( playerName, playerID, careerTriesScored, teamName, teamID, homeStadiumName, homeStadiumStreet, homeStadiumTown, homeStadiumPostcode );

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
		int pos;
		boolean caseSen;
		boolean caseRun = true;
		String caseChoice;
		int startAt;
		int endAt;

		while ( running ) {

		Scanner in = new Scanner( System.in );
		System.out.println( "commands available: " );
		System.out.println( "~ load file" + "\t\t\t\t" + "(-l)");
		System.out.println( "~ overwrite" + "\t\t\t\t" + "(-o)" );
		System.out.println( "~ append" + "\t\t\t\t" + "(-a)" );
		System.out.println( "~ read file" + "\t\t\t\t" + "(-r)" );
		System.out.println( "~ search" + "\t\t\t\t" + "(-s)" );
		System.out.println( "~ read with parameters" + "\t\t\t" + "(-sub)" );
		System.out.println( "~ delete entry" + "\t\t\t\t" + "(-del)" );
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
			else if ( choice.equals( "-r" ) && filename != "none") {
				display( filename);
			}
			else if ( choice.equals( "-s" ) && filename != "none") {
				caseRun = true;
				while ( caseRun ) {
					System.out.println( "case insensitive (-ci) or case sensitive (-cs)" );
					caseChoice = in.nextLine();
					if ( caseChoice.equals( "-ci" )) {
						caseSen = true;
						System.out.println( "enter search word: " );
						search = in.nextLine();
						search( filename, search, caseSen );
						caseRun = false;
					}
					else if ( caseChoice.equals( "-cs" )) {
						caseSen = false;
						System.out.println( "enter search word: " );
						search = in.nextLine();
						search( filename, search, caseSen );
						caseRun = false;
					}
					else {
						System.out.println( "invalid command");
					}
				}
			}
			else if ( choice.equals( "-sub" ) && filename != "none") {
				System.out.println( "starts at line 0" );
				System.out.println( "start at: " );
				startAt = in.nextInt();
				System.out.println( "end at: " );
				endAt = in.nextInt();
				displayParameters( filename, startAt, endAt );	
				System.out.println();	
			}
			else if ( choice.equals( "-del" ) && filename != "none") {
				System.out.println( "delete position: " );
				pos = in.nextInt();
				delete( filename, pos );
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