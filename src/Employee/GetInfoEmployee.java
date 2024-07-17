package Employee;

public class GetInfoEmployee extends BTVN
	{
    public GetInfoEmployee(String name, int age, String Ngaysinh, String Gioitinh) {
        super(name, age, Ngaysinh, Gioitinh);
    }

    public static void main(String[] args)
    {
        GetInfoEmployee employee = new GetInfoEmployee("Kieu Ngoc Son", 22, "07/06/2002", "Nam");
        employee.displayInfo();

        int A = employee.Cong(14, 11);
        int B = employee.Nhan(14, 11);

        System.out.println("Cộng: " + A);
        System.out.println("Nhân: " + B);
    }
}