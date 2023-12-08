//Hierarchical Inheritance    ---> Parent class

package Inheritance;

public class _Mother
{
	public void House()
	{
		System.out.println("House");
	}
	
	public void Car()
	{
		System.out.println("Car");
	}
	
	public static void main(String[] args) 
	{
		_Mother M1 = new _Mother();
		M1.House();
		M1.Car();
	}

}
