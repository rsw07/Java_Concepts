//Non-Static global variable -->
//1.Non-static variable call from different class

package Methods;

public class variables_sample17
{
	public static void main(String[]args)
	{
		variables_sample16 var6 = new variables_sample16();
		System.out.println(var6.d);   //non static variable call from main method of different class
		M9();
		variables_sample17 var17 = new variables_sample17();
		var17.M10();
	}
	
	public static void M9()
	{
		variables_sample16 var7 = new variables_sample16();
		System.out.println(var7.d);   //non static variable call from static method of different class
	}
	
	public void M10()
	{
		variables_sample16 var8 = new variables_sample16();
		System.out.println(var8.d);   //non static variable call from non static method of different class
	}

}
