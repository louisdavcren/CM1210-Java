public class RoomDimension {
	
	private double length;
	private double width;
	private double area;
	
	public RoomDimension( double inLength, double inWidth ) {
		length = inLength;
		width = inWidth;
	}
	
	public double getArea( ) {
		double area = length * width;
		return area;
	}
	
	public String toString( ) {
		return "room area: "+ area;
	}
}