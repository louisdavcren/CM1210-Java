public class violin extends string {

	private String chinrest;

	public violin (String price, String material, String owner, int noStrings, String chinrest) {
		super(price, material, owner, noStrings);
		this.chinrest = chinrest;

	}

	public void print() {
		System.out.println("Violin Details: ");
		super.print();
		System.out.println("Chinrest: " + chinrest);
	}
}