public class brass extends instrument {

	private String type;

	public brass (String price, String material, String owner, String type) {
		super(price, material, owner);
		this.type = type;
	}

	public void print() {
		super.print();
		System.out.println("Type: " + type);
	}
}