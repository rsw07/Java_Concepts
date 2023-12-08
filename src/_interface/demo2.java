//implementation class

package _interface;

public class demo2 implements demo1
{
	public void M1()        
	{
		System.out.println("Running interface method M1");   //method overriding
	}
	
	public void M2()
	{
		System.out.println("Running interface method M2");   //method overriding
	}
	
	public static void main(String[]args)
	{
		demo2 d = new demo2();
		d.M1();
		d.M2();
		System.out.println(demo2.a);
	}

}
