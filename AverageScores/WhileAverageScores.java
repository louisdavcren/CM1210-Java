
import java.util.Scanner;
public class WhileAverageScores {
	public static void main( String args[] ) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("Number of Marks: ");
		int noMarks = in.nextInt();
		int totalMark = 0;
		int i = 0;
		
		
		while (i < noMarks) {
			
			i++;
			System.out.print("Mark: ");
			int mark = in.nextInt();
			
			totalMark = (totalMark + mark);

		}
		
		int avg = (totalMark / noMarks);
		System.out.println(avg);
	}
}