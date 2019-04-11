import java.io.IOException;
import java.io.File;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileReader;

//Peter Snook 1842512

public class Encrypt {

	public static void main(String [] args) throws IOException {

		if ( args.length != 1 ) {
			System.err.println( "Needs file name as argument" );
			System.exit(1);
		}

		try {
		
			String filename = args[0];
	        FileReader fileReader = new FileReader(filename);
	        BufferedReader bufferedReader = new BufferedReader(fileReader);
	        String currentLine;

			while ((currentLine = bufferedReader.readLine()) != null) {
				for ( char character : currentLine.toCharArray() ) {
					if ( Character.isLowerCase(character) ) {

						int ascii = ( int ) character;

						if ( ascii == 97 ) {
							ascii = 122;
						}

						else {
							ascii--;
						}

						character = ( char ) ascii;
					}
					System.out.print( character );
				}
				System.out.println();
			}
		}
		catch ( IOException e ) {
			System.out.println(e);
			throw e;
		}
	}
}

	








