//Peter Snook 1842512
public class woodwind extends instrument {

	private String mouthpiece;

	public woodwind (String price, String material, String owner, String mouthpiece) {
		super(price, material, owner);
		this.mouthpiece = mouthpiece;
	}

	public void print() {
		super.print();
		System.out.println("Mouthpiece: " + mouthpiece);
	}
}