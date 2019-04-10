public class clarinet extends woodwind {

	private String reed;

	public clarinet (String price, String material, String owner, String mouthpiece, String reed) {
		super(price, material, owner, mouthpiece);
		this.reed = reed;

	}

	public void print() {
		System.out.println("Clarinet Details: ");
		super.print();
		System.out.println("Reed: " + reed);
	}
}