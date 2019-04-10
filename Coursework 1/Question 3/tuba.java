public class tuba extends brass {

	public tuba (String price, String material, String owner, String metal) {
		super(price, material, owner, metal);

	}

	public void print() {
		System.out.println("Tuba Details: ");
		super.print();
		//System.out.println("\t");
	}
}