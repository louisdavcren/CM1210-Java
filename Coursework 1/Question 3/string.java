public class string extends instrument {

	private int noStrings;

	public string (String price, String material, String owner, int noStrings) {
		super(price, material, owner);
		this.noStrings = noStrings;
	}

	public void print() {
		super.print();
		System.out.println("Number of Strings: " + noStrings);
	}
}