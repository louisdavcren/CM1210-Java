public class drum extends percussion {

	private String drumhead;

	public drum (String price, String material, String owner, boolean pitched, String drumhead) {
		super(price, material, owner, pitched);
		this.drumhead = drumhead;

	}

	public void print() {
		System.out.println("Drum Details: ");
		super.print();
		System.out.println("Drumhead: " + drumhead);
	}
}