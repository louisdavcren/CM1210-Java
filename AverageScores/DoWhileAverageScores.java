
import java.util.Scanner;
public class DoWhileAverageScores {
	public static void main( String args[] ) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("Number of Marks: ");
		int noMarks = in.nextInt();
		int totalMark = 0;
		int i = 0;
		
		
		 do {
			
			i++;
			System.out.print("Mark: ");
			int mark = in.nextInt();
			
			totalMark = (totalMark + mark);

		}
		
		while (i < noMarks);
		
		int avg = (totalMark / noMarks);
		System.out.println(avg);
	}
}