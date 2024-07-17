package JavaBuoi1;

public class HelloTester {

	public String name = "KieuNgocSon"; // Bien Instance (Bien toàn cục)
	// public là pham vi truy cập
	
	public String ten1;
	
	public String ten2;

	public int tuoi = 22;

	public static String ten3 = " Kieu Ngoc Son"; // Bien static

	public void getName() {
		System.out.println("Ten: " + ten1);
	}

	public void getAge() {
		System.out.println("Ten: " + tuoi);
	}

	public static void main(String[] args) {

		int n = 10;

		String name = "KieuNgocSon";

		System.out.println("Hello KIEU NGOC SON LEARN TO TESTER");

		System.out.println("Biến cục bộ:" + n);

		System.out.println(name);

		// System.out.println("Ten: " + ten1) ;

		System.out.println("Ten: " + ten3);

	}

}
