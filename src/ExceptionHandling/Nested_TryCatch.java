package ExceptionHandling;

public class Nested_TryCatch
{
	public static void main(String[] args)
	{
		int[] arr = {10,56,89,23,47,53};
		try
		{
			try
			{
				int a = 10;
				int b = 0;
				System.out.println(a/b);
						
			}
			catch(ArithmeticException e)
			{
				System.out.println(" inner ArithmeticException Handled");
			}
			System.out.println(arr[9]);
		}
		catch(ArrayIndexOutOfBoundsException d)
		{
			System.out.println(" outer ArrayIndexOutOfBoundsException handled");
		}
		
	}

}
