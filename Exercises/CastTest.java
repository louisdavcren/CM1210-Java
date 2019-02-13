public class CastTest {
	public static void main( String args[] ) {
		int i = 150;
        
        // Cast i to a float...
        System.out.println( (float) i );
        
        // Cast i to a double...
        System.out.println( (double) i );
        
        // Cast i to a long...
        System.out.println( (long) i );

       // cannot convert int to boolean System.out.println( (boolean) i );
		
		System.out.println( (byte) i );
		
		System.out.println( (char) i );
		
		System.out.println( (short) i );
	}
}
