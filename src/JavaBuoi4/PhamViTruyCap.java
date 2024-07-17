package JavaBuoi4;

class A_Private
{
	private int data = 40 ;
	
	private void msg()
	{
		System.out.println(data);
	}
}

public class PhamViTruyCap {

	
		protected void msg()
		{
			System.out.println("Hello");
		}

		protected void msgKNS()
		{
			System.out.println("Hi");
		}
		
		protected void msgTTNQ()
		{
			System.out.println("How Are You ?");
		}
		
		
		public int cong2so(int a, int b)
		{
			return a+b;
		}
		public static void main(String[] args)
		{
			A_Private obj = new A_Private();
		}
	}


