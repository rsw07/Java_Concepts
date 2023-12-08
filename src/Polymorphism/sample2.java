//Method overriding
//sub class

package Polymorphism;

public class sample2 extends sample
{
	public void Mobile()
	{
		System.out.println("Mobile : samsung");
	}
	
	public void car()      //Method overriding
	{
		System.out.println("car : i20");
	}
	
	
	public static void main(String[] args)
	{
		sample2 s2 = new sample2();
		s2.Mobile();
		s2.House();
		s2.Money();
		System.out.println("------- calling method from Child class object ---------");
		s2.car();
		
		System.out.println("------- calling method from parent class object ---------");
		
		sample s = new sample();
		s.car();
		
		
	}

}
