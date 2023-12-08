//Constructor with parameter call from same class

package Constructor;

public class Demo5
{
	String name;    //global variable
	
	Demo5(String a)   //Constructor
	{
		name = a;
	}
	
	public void M1()
	{
		System.out.println(name);
	}
	
	

}
