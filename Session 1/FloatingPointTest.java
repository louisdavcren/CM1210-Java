public class FloatingPointTest {
	public static void main( String args[] ) {
		
		float a = 1.36f;
		double b = 1.36;
		float c = 0.1f;
		float d = 1/49;
		double e = 1/49;
		
		System.out.println("float 1.36f == double 1.36 = " + (a == b));
		System.out.println("float 0.1f + 0.6f = " + (c + 0.6f));
		System.out.println("float 1/49 * 49 = " + (d * 49));
		System.out.println("float 1/49 * 49 = " + (e * 49));
		
	}
}