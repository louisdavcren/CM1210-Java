import java.util.Scanner;

public class EasyAdd {
	public static void main( String args[] ) {
	
		int x = getInt("Enter first number: ");
		int y = getInt("Enter second number: ");
	
		int sum = x + y;
		System.out.println( "Their sum is " + sum);
	
	}

	public static int getInt(String outText) {
		
		Scanner in = new Scanner(System.in);
		System.out.print( outText );
		int num = in.nextInt();
		
		return num;
	
	}
	
	
	
	
	
	
	
	
}