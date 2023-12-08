//implementation class
//sub class

package _interface;

public class implementation_sub_class implements superinterface1,superinterface2    //sub class 
{
	int a=10;
	int b = 20;
	
	public void add()
	{
		System.out.println(a+b);
	}
	
	public void sub()
	{
		System.out.println(a-b);
	}
	
	public void mul()
	{
		System.out.println(a*b);
	}
	
	public void div()
	{
		System.out.println(a/b);
	}
	
	public static void main(String[] args)
	{
		implementation_sub_class obj = new implementation_sub_class();
		obj.add();
		obj.sub();
		obj.mul();
		obj.div();
	}
}
