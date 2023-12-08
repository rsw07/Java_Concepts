package ExceptionHandling;

public class Multiple_try_catch
{
	public static void main(String[] args)
	{
		int a = 10;
		int b = 0;
		try
		{
			System.out.println(a/b);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Arithmatic Exception Handled");
		}
		
		String s = "abcd";
		try
		{
			System.out.println(s.charAt(5));
		}
		catch(StringIndexOutOfBoundsException c)
		{
			System.out.println("StringIndexOutOfBoundsException Handled");
		}
		
	}

}
