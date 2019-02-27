public class Library {
	public static void main( String args[] ) {
		
		class Library {
		
		private String name;
		private String barcode;
		
		public AddBook( String inName, String inBarcode) {
			name = inName;
			barcode = inbarcode;
		}
		
		public String getName( ) {
			return name;
		}
		
		public String getBarcode( ) {
			return barcode;
		}
		
		
		
		public String toString( ) {
			String s = name + "\t(" + number + ") ";
			return s;
		}
	}
	}
}