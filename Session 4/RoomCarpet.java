public class RoomCarpet {
	
	private RoomDimension size;
	private double carpetCost;
	private double totalCost;
	
	public RoomCarpet( RoomDimension inSize, double inCarpetCost ) {
		size = inSize;
		carpetCost = inCarpetCost;
	}
	
	public double getTotalCost( ) {
		double totalCost = size.getArea() * carpetCost;
		return totalCost;
	}
	
	public String toString( ) {
		return "total cost: "+ totalCost;
	}
}