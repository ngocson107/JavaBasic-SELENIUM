package JavaBuoi5;

//private: Chỉ sử dụng trong phạm vi đó
//get: dùng, sử dụng
//set: Ghi


public class TinhDongGoi {
	
	private String name ;
	
	public String getname ()
	{
		return name ; 
	}
	public void setname(String name) {
		this.name = name ;
		
	}
	
	public static void main(String[] args) {
		TinhDongGoi tinh_DongGoi = new TinhDongGoi();
		
		tinh_DongGoi.setname("Auto") ;
		System.out.println(tinh_DongGoi.getname());
		
		
		tinh_DongGoi.setname("Auto22") ;
		System.out.println(tinh_DongGoi.getname());
	}

}
