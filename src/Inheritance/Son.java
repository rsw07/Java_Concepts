//Single level inheritance ---> Example1

package Inheritance;

public class Son extends Father    //Son --> Sub/Child class
{
	public void Mobile()
	{
		System.out.println("Mobile:Samsung");
	}
	
	
	public static void main(String[]args)
	{
		Son s1 = new Son();
		s1.Mobile();
		s1.Car();
		s1.House();
		s1.Money();
	}

}

