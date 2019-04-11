//Peter Snook 1842512
public class cello extends string {

	private boolean stand;

	public cello (String price, String material, String owner, int noStrings, boolean stand) {
		super(price, material, owner, noStrings);
		this.stand = stand;

	}

	public void print() {
		System.out.println("Cello Details: ");
		super.print();
		System.out.println("Stand: " + stand);
	}
}