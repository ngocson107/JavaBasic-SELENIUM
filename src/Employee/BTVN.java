
//-----TẠO 1 CLASS CHUNG TẠI PACKAGE "Employee" CHỨA----- :
//-----TÊN, TUỔI, NGÀY SINH, GIỚI TÍNH-----
//-----IN RA THÔNG TIN TRÊN-----
//-----HÀM CỘNG 2 SỐ, HÀM NHÂN 2 SỐ NGUYÊN-----

//-----TẠO CLASS 2 TẠI PACKAGE "GetInfoEmployee" KẾ THỪA CLASS 1-----
//-----GỌI LẠI TẤT CẢ CÁC HÀM VÀ THUỘC TÍNH TRONG CLASS 1-----
//-----TRUYỀN 2 GIÁ TRỊ VÀO 2 HÀM CỘNG VÀ NHẬN TỪ LỚP 1 ĐẺ IN RA MÀN HÌNH-----

package Employee;

public class BTVN {
	public String Name;
	public int Age;
	public String Ngaysinh;
	public String Gioitinh;

    public BTVN(String Name, int Age, String Ngaysinh, String Gioitinh)
    {
        this.Name = Name;
        this.Age = Age;
        this.Ngaysinh = Ngaysinh;
        this.Gioitinh = Gioitinh;
    }

    public void displayInfo()
    {
        System.out.println("Name: " + Name);
        System.out.println("Age: " + Age);
        System.out.println("Ngaysinh: " + Ngaysinh);
        System.out.println("Gioitinh: " + Gioitinh);
    }

    public int Cong(int a, int b) {
        return a + b;
    }

    public int Nhan(int a, int b) {
        return a * b;
    }
}