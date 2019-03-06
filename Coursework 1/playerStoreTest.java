public class playerStoreTest {
	
	public static void main( String [] args ) {

		playerStore ps = new playerStore();
		ps.add("George North", "RFU00005", 0, "Cardiff Blues", "CDB2456", "3 Cardinal Avenue", "Cardiff", "B0PQW");
		ps.add("Jonathan Sexton", "RFU05674", 33, "Bath", "BTH0739", "The Strand", "Bristol", "M9SLD");
		System.out.println();
		
		System.out.println( ps );
		System.out.println();

	}
}