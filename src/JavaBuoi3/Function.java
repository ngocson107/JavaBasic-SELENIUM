package JavaBuoi3;

public class Function {
	
	static void InputData(int arr[] , int number_value)
	{
	
	for (int i = 0; i < arr.length; i++)
	{
		arr[i] = number_value ;
		
	}
}
 	static void PrinData(int arr[] , int number) 
 	{
 	for ( int i = 0 ; i < arr.length; i ++)
 	{
// 	Cộng thêm một giá trị là 5 vào từng phần tử của mảng khi in
 		
 		System.out.println("Phan tu thu " + (i+1) + " la " + (arr[i] + number));
 	}
 }
 	
// 	Không trả về (tu khoa "void"truoc ten ham)
 	
 	static void min1(int arr[])
 	{
 		int min = arr[0] ;
 		for (int i = 1 ; i < arr.length; i ++)
 			
 			if (min > arr [i])
 			{
 				min = arr [i];
 			}
 		System.out.println(min);
 	}
// 	Trả về (int/float/String)
 	static int min2(int arr[])
 	{
 		int min = arr[0];
 		for (int i = 1; i < arr.length; i ++)
 			
 			if ( min > arr[i])
 			{
 				min = arr[i] ;
 			}
 		
 		return min ; //return là từ khóa biểu thị cho sụ trả về cho 1 hàm nào đó
 	}
 	
 	

	public static void main(String[] args)
	{
		
		int mang[] = new int[50];
		
		int mang1[] = new int[100];
		
		InputData(mang, 10);
		
		InputData(mang1, 20);
		
		PrinData(mang1, 5);
		
		PrinData(mang1, 10);
		
	}

}
