//Static regular Method

package Methods;

public class Sample1
{
	//Main Method
	public static void main(String[]args)
	{
		System.out.println("Running Main method from class Sample1");
		M1(); //Method call from same class
		Sample2.M2(); //Method call from different class
	}
	
	//static regular method
	public static void M1()
	{
		System.out.println("Running static regular method m1 from sample1 class");
	}

}
