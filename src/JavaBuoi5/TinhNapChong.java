package JavaBuoi5;


//Nạp chồng có quyền tạo ra hàm giống nhau nhưng buộc phải khác
//nhau về kiểu dữ liệu hoặc dối số bên trong.

	class Adder {
	static int add (int a, int b) {
		return a+b;
	}
	
	static int add(int a, int b, int c)
	{
		return a + b+ c;
	}
	
	static String add(String a, String b, String c)
	{
		return a + b+ c;
	}
}
	public class TinhNapChong {
		
	public static void main(String[] args) {
		System.out.println("Vi dụ về nạp chồng:");
		System.out.println(Adder.add(14, 11));
		
		System.out.println(Adder.add(14, 11, 20));
		
		System.out.println(Adder.add("14", "11", "2002"));
		

	}

}
