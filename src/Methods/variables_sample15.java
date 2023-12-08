//Non-Static global variable -->
//1.Non-static variable call from same class

package Methods;

public class variables_sample15 
{
	int c = 80;     // Non-static global variable
	
	public static void main(String[]args)
	{
		variables_sample15 var3=new variables_sample15();
		System.out.println(var3.c);
		M5();
		var3.M6();
		
	}
	
	public static void M5()
	{
		variables_sample15 var4 = new variables_sample15();
		System.out.println(var4.c);
		
	}
	
	public void M6()
	{
		System.out.println(c);
	}

}
