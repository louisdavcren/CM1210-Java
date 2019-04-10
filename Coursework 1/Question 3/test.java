public class test {
	public static void main(String[] args){

		instrument tri = new triangle("30", "brass", "mack", false, "b");
		tri.print();


		System.out.println();
		System.out.println(tri.getowner());
		System.out.println(tri.getprice());
		System.out.println(tri.getmaterial());
		System.out.println();


		tri.setowner("john");
		tri.setprice("100");
		tri.setmaterial("water");
		tri.print();

	}
}