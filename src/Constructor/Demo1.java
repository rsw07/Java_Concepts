//default constructor
package Constructor;

public class Demo1 
{
	public static void main(String[]args)
	{
		//Demo1()
		//{
			
		//}
		
		//Default constructor call from same class
		Demo1 d1 = new Demo1();
		d1.M1();
		
		Demo2 d2 = new Demo2();
		d2.M2();
	}
	public void M1()
	{
		System.out.println("Running method M1");
	}
	

}