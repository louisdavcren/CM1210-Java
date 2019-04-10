public class trumpet extends brass {

	private String mute;

	public trumpet (String price, String material, String owner, String type, String mute) {
		super(price, material, owner, type);
		this.mute = mute;

	}

	public void print() {
		System.out.println("Trumpet Details: ");
		super.print();
		System.out.println("Mute: " + mute);
	}
}