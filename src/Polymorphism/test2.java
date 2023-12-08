//method overloading

package Polymorphism;

public class test2 
{
	public void M1(String name,int age)
	{
		System.out.println("Name:"+name+" age:"+age);
		
	}
	
	public void M1(int age,String name)
	{
		System.out.println("Name:"+name+" age:"+age);
	}
	
	public static void main(String[] args)
	{
		test2 t2 = new test2();
		t2.M1("Vedant",19);
		t2.M1(22, "Rashmi");
		
	}

}
