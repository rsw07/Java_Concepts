//Static global variable -->
//2.static variable call from different class

package Methods;

public class variables_sample14
{
	public static void main(String[]args)
	{
		System.out.println(variables_sample13.b);
		M3();
		variables_sample14 var2=new variables_sample14();
		var2.M4();
	}
	
	public static void M3()
	{
		System.out.println(variables_sample13.b);
	}
	
	public void M4()
	{
		System.out.println(variables_sample13.b);
	}

}
