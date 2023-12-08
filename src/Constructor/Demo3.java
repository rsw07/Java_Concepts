//Without parameter/zero parameter constructor

package Constructor;

public class Demo3
{
	int num1;
	int num2;
	Demo3()
	{
		num1 = 40;
		num2 = 20;
	}
	public static void main(String[]args)
	{
		Demo3 d3 = new Demo3();
		d3.Add();
		d3.Sub();
		
		Demo3 d4 = new Demo3();
		d4.Add();
		d4.Sub();
		
	}
	
	public void Add()
	{
		System.out.println("The addition is "+(num1+num2));
	}
	
	public void Sub()
	{
		System.out.println("The subtraction is "+(num1-num2));
	}
	
	

}
