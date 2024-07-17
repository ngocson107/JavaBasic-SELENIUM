package JavaBuoi4;

class TestClass
{
	public int number1 = 10;
	public int number2 = 30 ;
	
	public int Cong(int a, int b)
	{
		return a + b;
	}
	
	public void Print(int a, int b)
	{
		System.out.println(Cong(a, b));
	}
}

public class ClassAndObject {

	public static void main(String[] args) {
		int a = 14 ;
		
		int b = 11 ;
		
		//Khoi tạo 1 object thuộc 1 class
		
		TestClass obClass = new TestClass();
		obClass.Print(a, b); //cách gọi ra các thành phần trong class thong qua object
		//obClass.Cong(a, b) ;

	}

}
