//Single level inheritance ---> Example3

package Inheritance;

public class B extends A
{
	public void M3()
	{
		System.out.println("Running M3 method of Class B");
	}
	
	public void M4()
	{
		System.out.println("Running M4 method of Class B");
	}
	
	public static void main(String[]args)
	{
		B b1 = new B();
		b1.M1();
		b1.M2();
		b1.M3();
		b1.M4();
		
		
		
	}


}
