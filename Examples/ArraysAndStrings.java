import java.lang.*;

public class ArraysAndStrings {
	public static void main( String args[] ) {
	
		int [] nums = {3,5,7,9,10};
		
		int startVal = 0;
		
		for (int i = 0; i < nums.length; i++) {
			
			startVal = (startVal + nums[i]);
		}
	
	System.out.print(startVal);
	
	}
}