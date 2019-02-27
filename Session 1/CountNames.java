public class CountNames {
	public static void main( String args[] ) {
        
        String[] names = {"Tommy Lee Jones", "William Hurt", "Nicole Kidman",
            "Catherine Zeta-Jones", "JAMES EARL JONES", "Tom Hardy", 
            "Judi Dench", "Sean Bean", "Carey Mulligan", "Toby Jones" };
    
		
		int count = 0;
		
		for (int i = 0; i < names.length; i++) {
			
			if ((names[i]).toLowerCase().endsWith("jones")) {
				count++;
			} 
		}
		
		System.out.print(count);
	
	}
}

