package ExceptionHandling;

public class sample4
{
	public static void main(String[] args) 
	{
		int [] arr = {10,5,69,78,36,45};
		
		try 
		{
			System.out.println(arr[6]);  //ArrayIndexOutOfBounds Exception
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Exception handled");
		}
	}
}
