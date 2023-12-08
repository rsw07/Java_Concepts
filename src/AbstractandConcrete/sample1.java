//Concrete class  --->completes the incomplete methods of abstract class by using extends keyword.

package AbstractandConcrete;

public class sample1 extends sample
{
	public void M3()
	{
		System.out.println("Running M3 method");  //completed abstract class method M3
	}
	
	public void M4()
	{
		System.out.println("Running M4 method");   //completed abstract class method M4
	}
	
	public static void main(String[]args)
	{
		sample1 s1 = new sample1();
		s1.M1();
		s1.M2();
		s1.M3();
		s1.M4();
	}

}

