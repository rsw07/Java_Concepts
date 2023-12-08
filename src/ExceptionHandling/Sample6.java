//Multiple catch blocks for single try blocks

package ExceptionHandling;

public class Sample6 
{
	public static void main(String[] args)
	{
		int a = 5;
		int b = 0;
		
		try
		{
			System.out.println(a/b);
		}
		
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Array Index Out Of Bounds Exception Handled");
		}
		
		catch(ArithmeticException e)
		{
			System.out.println("Arithmatic Exception Handled");
		}
		
		catch(StringIndexOutOfBoundsException e)
		{
			System.out.println("String Index Out Of Bounds Exception handled");
		}
		
		System.out.println("Done!!!");
	}

}
