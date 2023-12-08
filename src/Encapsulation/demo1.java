package Encapsulation;

public class demo1 
{
	public static void main(String[] args) 
	{
		demo d1 = new demo();
		d1.square();
		//System.out.println(d1.num1);  ==> not accessible because encapsulated with private access specifier
	}

}
