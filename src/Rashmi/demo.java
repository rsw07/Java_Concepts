//final local and global variable

package Rashmi;

public class demo
{ 
	final static int a=10;
	public static void main(String[] args)
	{
		
		System.out.println(a);
		m1();
		
	}
	
	public static void m1()
	{
		final int a=20;
		System.out.println(a);
	}


}
