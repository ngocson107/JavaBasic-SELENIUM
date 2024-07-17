package JavaBuoi2;

public class IF_ELSE {

	public static void main(String[] args) {
//		int age = 14 ;
//		
//		if (age == 11)
//		{
//			System.out.println("Nho hơn chu sao");
//		}
//		else
//		{
//			
//			System.out.println("Lon hon roi");
//		}
		int math = 65;

		if (math < 50) 
		{
			System.out.println("Truot..!");
		} 
		else if (math > 90)
		{
			System.out.println("Diem A");
		}
		else if (math >= 70 && math < 80)
		{
			System.out.println("Diem B");
		} 
		else if (math >= 5.5 && math <= 70) 
		{
			System.out.println("Diem C");
		} 
		else if (math <= 4 && math <= 5.5) 
		{
			System.out.println("Diem D");
		} 
		else 
		{
			System.out.println("Gia tri khong ton tai");
		}

	}

}
