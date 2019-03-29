import java.util.Scanner;

public class commandLine {
	public static void main( String[] args ) {

		boolean running = true;

		while ( running ) {

		Scanner in = new Scanner(System.in);
		System.out.print( "Do you want to SAVE to a file or LOAD a file: " );
		String choice = in.nextLine(); 

		if ( choice.equals( "save" )) {
			System.out.println( "save" );




		} else if ( choice.equals( "load" )) {
			System.out.println( "load" );

		} else if ( choice.equals( "exit" )) {
			System.out.println( "exit" );
			running = false;


		} else {
			System.out.println( "invalid" );
		}





		}
	}	
}