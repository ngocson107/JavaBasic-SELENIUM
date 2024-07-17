package JavaBuoi4;


import JavaBuoi1.*; //import lại



public class BT {
    static class GetInformation 
    {
        String name = "KNS";
        
        int age = 22;
        
        public void display() 
        {
            System.out.println("Tên là: " + name);
            System.out.println("Tuổi là: " + age);
        }
    }

    public static void main(String[] args)     
    {
    	//Goi lại package từ buổi 1
    	HelloTester HelloTester = new HelloTester() ;
	
    	System.out.println(HelloTester.name);
    	
        GetInformation info = new GetInformation();
        
        info.display();
    }
}