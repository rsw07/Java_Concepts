package Constructor;

public class Demo7
{
	int Num1;        //Global variable
	int Num2;        //Global variable
	String name;     //Global variable
	
	Demo7(int a,int b)
	{
		Num1 = a;     //Initialization ---> global variable=local variable
		Num2 = b;     //Initialization ---> global variable=local variable
	}
	
	Demo7(String c)
	{
		name = c;    //Initialization ---> global variable=local variable
	}
	
	public void add()
	{
		System.out.println(Num1+Num2);
	}
	
	public void Sname()
	{
		System.out.println(name);
	}
	
	public static void main(String[] args)
	{
		Demo7 d7 = new Demo7(20,50);
		d7.add();
		
		Demo7 d8 = new Demo7("Rashmi");
		d8.Sname();
		
		
		
	}
			

}
