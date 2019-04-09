import java.io.IOException;
import java.io.File;
import java.util.Scanner;

public class Encrypt {

	public static void main(String [] args) throws IOException {

		if ( args.length != 1 ) {
			System.err.println( "Needs file name as argument" );
			System.exit(1);
		}

		try {
	
		File filename = new File(args[0]);
		Scanner in = new Scanner(filename);

			while ( in.hasNextLine() ) {
				String currentLine = in.nextLine();
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

	








