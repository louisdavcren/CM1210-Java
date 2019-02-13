import java.util.Scanner;

public class RewriteNumber {
	public static void main( String args[] ) {
	    Scanner in = new Scanner( System.in );

	    System.out.println( "Enter an integer between 0 and 9" );
	   
	    int num = in.nextInt();
	    
		/*
		if ( num == 1 ) {
			System.out.println("one");
		} else if ( num == 2 ) {
			System.out.println("two");
		} else if ( num == 3 ) {
			System.out.println("three");
		} else if ( num == 4 ) {
			System.out.println("four");
		} else if ( num == 5 ) {
			System.out.println("five");
		} else if ( num == 6 ) {
			System.out.println("six");
		} else if ( num == 7 ) {
			System.out.println("seven");
		} else if ( num == 8 ) {
			System.out.println("eight");
		} else if ( num == 9 ) {
			System.out.println("nine");
		}
		*/
		
		String numberString;
		
		switch (num) {
			case 1: numberString = "one";
				break;
			case 2: numberString = "two";
				break;
			case 3: numberString = "three";
				break;
			case 4: numberString = "four";
				break;
			case 5: numberString = "five";
				break;
			case 6: numberString = "six";
				break;
			case 7: numberString = "seven";
				break;
			case 8: numberString = "eight";
				break;
			case 9: numberString = "nine";
				break;
			default: numberString = "invalid number";
				break;
		}
		System.out.println(numberString);	
		
	}
}
