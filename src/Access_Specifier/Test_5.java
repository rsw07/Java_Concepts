//Access Specifier ---> 3.protected --> can be accessed only in same package 
//and in different package using inheritance

package Access_Specifier;

public class Test_5
{
	protected int c;
	
	protected Test_5()
	{
		c = 2;
	}
	
	protected void cube()
	{
		System.out.println(c*c*c);
	}
}

