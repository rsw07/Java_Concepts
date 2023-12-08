package ExceptionHandling;

public class Sample5
{
	public static void main(String[] args) 
	{
		String s1 = "abcd";
		
		try
		{
			System.out.println(s1.charAt(5));  //StringIndexOutOfBounds Exception
		}
		catch(StringIndexOutOfBoundsException e )
		{
			System.out.println("Exception Handled");
		}
		
		
	}

}
