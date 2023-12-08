//Access Specifier ---> 1.Private --> can be accessed only in same class
package Access_Specifier;

public class Test_1
{
	private int a;           //private variable
	
	private Test_1()         //private Constructor
	{
		a=30;
	}
	
	private void Square()    //private method
	{
		System.out.println(a*a);
	}
	
	public static void main(String[]args)
	{
		
	}
}
