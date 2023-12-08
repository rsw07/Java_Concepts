//Hierarchical Inheritance    ---> sub class3


package Inheritance;

public class _Son3  extends _Mother
{
	public void tablet()
	{
		System.out.println("Tablet");
	}
	
	public static void main(String[] args) 
	{
		_Son3 S3 = new _Son3();
		S3.House();
		S3.Car();
		S3.tablet();
	}

}
