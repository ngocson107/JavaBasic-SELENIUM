package JavaBuoi2;

public class Bien {

	public String name = "KieuNgocSon"; // Bien instance (Bien toàn cục)

	// public la pham vi truy cap
	public String Ten = "KNSON07062002";
	public int Tuoi = 22;
	public String Diachi = "KhanhHoa";
	public String Congviec = " InternTest";

	public static String ten2 = "Kieu Ngoc Son"; // Bien Static

	public void getName() {
		System.out.println("Ten: " + Ten);

	}

	public void getAge() {
		System.out.println("Ten:" + Tuoi);
	}

	public void getInfo() {
		System.out.println("Ten:" + Ten);
		System.out.println("Tuoi: " + Tuoi);
		System.out.println("Diachi:" + Diachi);
		System.out.println("Congviec:" + Congviec);
	}

	public static void main(String[] args) 
	{
		//int n = 10;
		String name = " Kieu Ngoc Son";

		int Age = 25;

		float Weight = 55.6f;

		Boolean sex = true; // Gioi tinh nam

		Bien info = new Bien();
		info.getInfo();

		System.out.println(name);
		System.out.println(Age);
		System.out.println(Weight);
		System.out.println(sex);

	}

}
