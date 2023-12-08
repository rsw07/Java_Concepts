//Static global variable -->
//1.static variable call from same class
// we can access static global variable in both static & non-static method

package Methods;

public class variables_sample12
{
	static int a=10;   //Static/class global variable
	public static void main(String[]args)
	{
		System.out.println(a);
		M1();
		variables_sample12 var = new variables_sample12();
		var.M2();
		
	}
	
	public static void M1()
	{
		System.out.println(a);
	}
	
	public void M2()
	{
		System.out.println(a);
	}
}
