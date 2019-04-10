public class instrument {

	private String price;
	private String material;
	private String owner;

	public instrument (String price, String material, String owner) {
		this.price = price;
		this.material = material;
		this.owner = owner;
	}

	protected final String getowner(){
		return this.owner;
	}

	protected final String getprice(){
		return this.price;
	}

	protected final String getmaterial(){
		return this.material;
	}

	public void setowner(String inowner){
		this.owner = inowner;
	}

	public void setprice(String inprice){
		this.price = inprice;
	}

	public void setmaterial(String inmaterial){
		this.material = inmaterial;
	}

	public void print() {
		System.out.println("Owner: " + owner);
		System.out.println("Price: " + price);
		System.out.println("Material: " + material);
	}
}