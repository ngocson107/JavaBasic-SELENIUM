package JavaBuoi4;

class Student
{
	public String name ;
	
	public int age ;
	
	public float height ;
	
	
	public static String  universityName = "Kieu Ngoc Son dz" ;
	public static int total = 0 ; //khi khởi tạo Student lần 1 thì total bằng 1
	
	public Student(String nameString, int age, float height)
	{
		this.name = name ;
		this.age = age ;
		this.height = height ;
		total += 1; //total tăng 1
	}
}

public class Static {

	public static void main(String[] args) {
		
		Student a = new Student("Son", 21, 1.6f) ;
		System.out.println("University (from class):" + Student.universityName);
		System.out.println("Unviversity (from instance):" + a.universityName); 
		System.out.println("Total (form class):" + Student.total); // total = 1 
		
		Student b = new Student("Quynh" , 14, 1.6f) ;
		System.out.println("Total (form class):" + b.total); //total = 1

	}

}
