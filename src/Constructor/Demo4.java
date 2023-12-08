//Constructor with parameter call from same class

package Constructor;

public class Demo4 
{
	int num1;   //global variable declaration
	int num2;
	Demo4(int a,int b)
	{
		num1 = a;     //global variable = local variable
		num2 = b;
	}
	
	public void add()
	{
		System.out.println(num1+num2);
	}
	
	public void mul()
	{
		System.out.println(num1*num2);
	}
	
	public static void main(String[] args)
	{
		Demo4 d4 = new Demo4(20,30);
		d4.add();
		
		Demo4 d5 = new Demo4(2,3);
		d5.mul();
		
	}

}
