//Non-Static regular Method call from same class

package Methods;

public class Sample3
{
	public static void main(String[]args)
	{
		Sample3 obj = new Sample3(); //object creation-->classname objectname = new classname();
		obj.M3(); //method call--> object name.methodname;
		obj.M4();
		
		
	}
	
	
	//Non-static Regular method
	public void M3()
	{
		System.out.println("Running Non-static regular method M3 from same class");
	}
	public void M4()
	{
		System.out.println("Running Non-static regular method M4 from same class");
	}
	
}
