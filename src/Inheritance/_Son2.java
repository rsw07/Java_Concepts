//Hierarchical Inheritance    ---> sub class2


package Inheritance;

public class _Son2 extends _Mother
{
	public void laptop()
	{
		System.out.println("Laptop");
	}
	
	public static void main(String[] args) 
	{
		_Son2 S2 = new _Son2();
		S2.House();
		S2.Car();
		S2.laptop();
	}

}
