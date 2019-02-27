public class Employee {
	
	private String name;
	private int idNumber;
	private String department;
	private String position;
	
	public Employee( ) {
		name = "";
		idNumber = 0;
		department = "";
		position = "";
	}
	
	public Employee( String name, int inIdNumber ) {
		this.name = name;
		inIdNumber = idNumber;
	}
	
	public Employee( String inName, int inIdNumber, String inDepartment, String inPosition ) {
		
		name = inName;
		idNumber = inIdNumber;
		department = inDepartment;
		position = inPosition;
	}
	
	public String getName() {
		return name;
	}
	
	public int getIdNumber() {
		return idNumber;
	}
	
	public String getDepartment() {
		return department;
	}
	
	public String getPosition() {
		return position;
	}
	
	public void setName( String inName ) {
		name = inName;
	}
	
	public void setIdNumber( int inIdNumber ) {
		idNumber = inIdNumber;
	}
	
	public void setDepartment( String inDepartment ) {
		department = inDepartment;
	}
	
	public void setPosition( String inPosition ) {
		position = inPosition;
	}

	public String toString( ){
		return ( name + "\t" + idNumber + "\t" + department + "\t" + position );
	}		



	
}
	
	
	
	
	