package ExceptionHandling;

public class Sample3
{
	public static void main(String[] args) 
	{
		int a = 10;
		int b = 0;
		try
		{
			System.out.println(a/b);      //Arithmatic Exception
		}
		catch(ArithmeticException e)
		{
			System.out.println("Exception Handled");
		}
		
		System.out.println("done");
		
	}
}
