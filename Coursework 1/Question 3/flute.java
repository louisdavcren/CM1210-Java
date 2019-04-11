//Peter Snook 1842512
public class flute extends woodwind {

	private String category;

	public flute (String price, String material, String owner, String mouthpiece, String category) {
		super(price, material, owner, mouthpiece);
		this.category = category;

	}

	public void print() {
		System.out.println("Flute Details: ");
		super.print();
		System.out.println("Category: " + category);
	}
}