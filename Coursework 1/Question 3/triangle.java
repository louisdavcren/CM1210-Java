public class triangle extends percussion {

	private String singlenote;

	public triangle (String price, String material, String owner, boolean pitched, String singlenote) {
		super(price, material, owner, pitched);
		this.singlenote = singlenote;

	}

	public void print() {
		System.out.println("Traingle Details: ");
		super.print();
		System.out.println("Singlenote: " + singlenote);
	}
}