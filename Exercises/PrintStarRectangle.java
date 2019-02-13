import java.util.Scanner;

public class PrintStarRectangle {
    public static void main( String[] args ) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("Length: ");
		int length = in.nextInt();
		System.out.println("Height: ");
		int height = in.nextInt();
		
		for (int i = 0; i < (height); ++i) {
			System.out.println();
			
			for (int j = 0; j < (length); ++j) {
				System.out.print("*");
			}
		}
	}
}