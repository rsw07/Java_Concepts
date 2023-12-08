package ExceptionHandling;

public class Sample7
{
	public static void main(String[] args)
	{
		String s1 = "abcd";
		
		try
		{
			System.out.println(s1.charAt(5));  
		}
		
		catch(Exception e)
		{
			System.out.println("Exception Handled");
			e.printStackTrace();    //to print which exception has been occured
		
		}
		
	}

}
