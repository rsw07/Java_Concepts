//method overloading

package Polymorphism;

public class test1
{
	public void add(int a, int b)              //method with two int parameters
	{
		System.out.println(a+b);
	}

	public void add(int a, int b,int c)         //method with three int parameters
	{
		System.out.println(a+b+c);
	}
	public static void main(String[]args)
	{
		test1 t = new test1();
		t.add(10, 20);
		t.add(10, 20,30);
	}

}
