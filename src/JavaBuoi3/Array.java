	package JavaBuoi3;


public class Array {

	public static void main(String[] args) {
		
////		tên mảng[vị trí]
		
//		int arr[] = { 14, 11, 20, 02 };
		
//		for ( int i : arr)
			
//		{
//			System.out.println(i);
//		}
////		khai báo và khởi tạo mảng
//		int a[] = new int[3];
				
//		a[0] = 14 ;
		
//		a[1] = 11;
		
//		a[2] = 2002;
		
////		in mảng ra màn hình
////		chạy từ 0 đến bé hơn độ dài của mảng a là 3
		
//		for (int i = 0; i < 3; i++)
//		{
//			System.out.print(a[i] + "");
//		}
		
//		-----------------Bài toán: Gán giá trị 25 cho một phần tử trong mảng 100 phần tử-------------------
		
		 int arr2[] = new int[100] ;
		 
		 for ( int i = 0 ; i < arr2.length ; i ++ )
		 {
			 arr2[i] = 20 ;
			 
		 }
		 for ( int i = 0 ; i < arr2.length; i ++ )
		 {
			 System.out.println("Phan tu la" + (i + 1));
		 }
			
	}
}