public class RoomCarpetTest {
	public static void main ( String[] args ) {
		
		RoomDimension rd = new RoomDimension( 6, 10 );
		RoomCarpet carpetOne = new RoomCarpet ( rd, 12 );
		
		System.out.println(carpetOne);
	}
}