//Hierarchical Inheritance    ---> sub class1


package Inheritance;

public class _Son1 extends _Mother
{
	public void Mobile()
	{
		System.out.println("Mobile");
	}
	
	public static void main(String[] args) 
	{
		_Son1 S1 = new _Son1();
		S1.House();
		S1.Car();
		S1.Mobile();
	}

}
