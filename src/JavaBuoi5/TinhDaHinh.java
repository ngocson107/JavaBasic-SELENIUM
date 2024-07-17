package JavaBuoi5;

class Bike {

	void run() {
		System.out.println("Chạy");
	}
	void run2() {
		System.out.println("Chạyww");
	}
	
	void run3() {
		System.out.println("KiềuNgocSon");
	}



	public void stop() {
		System.out.println("Mua roi");
	}
}

public class TinhDaHinh extends Bike {
	void run() {
		System.out.println("Chạy qua đây");
	}
	
	public void stop() {
		System.out.println("Chạy uuuuu");
	}

	public static void main(String[] args) {
		Bike bk = new TinhDaHinh();
		System.out.println("Vi du ve tinh DA HINH");
		bk.run();//vì ham nay trung voi ham tren lop cha là lop bike
		
		
		//Thực tế sử dụng thì
		TinhDaHinh hd = new TinhDaHinh(); //Sử dụng của th cha và con
		hd.run();
		hd.stop();
		hd.run2();
		hd.run3();
		
		Bike bk2 = new Bike();
		bk2.run(); //sử dụng của th Cha mà th con bị trùng

	}

}
