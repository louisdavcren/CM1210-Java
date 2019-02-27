public class PhoneBook {
	
	private PhoneBookEntry[] entries;
	private int size;
	private int maxEntriesLength = 1;
	
	public PhoneBook( ) {
		entries = new PhoneBookEntry[maxEntriesLength];
	}
	
	public void add( String name, String number ) {
		System.out.println("Size: " + size + " , " + maxEntriesLength);
		if ( size == entries.length ) {
			System.out.println("Doubling");
			maxEntriesLength = 2 * maxEntriesLength;
			PhoneBookEntry[] temp = new PhoneBookEntry[ maxEntriesLength ];
			System.arraycopy( entries, 0, temp, 0, entries.length );
			entries = temp;
		}
			
		entries[size] = new PhoneBookEntry( name, number );
		System.out.println("Adding : " + name);
		size++;
		System.out.println("Size: " + size + " , " + maxEntriesLength);
		}
	
	
	public String toString() {
		StringBuffer temp = new StringBuffer();
		for (int i = 0; i < size; ++i) {
			temp.append( entries[i].toString() + "\n" );
		}
		return temp.toString();
	}
}