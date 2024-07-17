package JavaBuoi4;

public class BT1 {
	
	static class Sinhvien
	{
		public String sinhvien1 = "KNS";
		public String sinhvien2 = "TTNQ";
	
	public void display() 
	{
		
		System.out.println("sinhvien1");
		System.out.println("sinhvien2");
	}
	}
	public static void main(String[] args) {
		
		Sinhvien info = new Sinhvien() ;
			info.display();	

	}

}
