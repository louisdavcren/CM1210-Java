public class percussion extends instrument {

	private boolean pitched;

	public percussion (String price, String material, String owner, boolean pitched) {
		super(price, material, owner);
		this.pitched = pitched;
	}

	public void print() {
		super.print();
		System.out.println("Pitched: " + pitched);
	}
}