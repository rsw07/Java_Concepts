package Encapsulation;

public class demo 
{
	//step-1 => declare global variable with private access specifier
	private int num1;
	
	//step-2 => Initialize within constructor with public access specifier
	public demo()
	{
		num1=10;
	}
	
	//step-3 => Utilize within a method with public access specifier
	public void square()
	{
		System.out.println(num1*num1);
	}
	
	public static void main(String[] args) 
	{
		demo d =new demo();
		d.square();
		System.out.println(d.num1);
		
	}

}
