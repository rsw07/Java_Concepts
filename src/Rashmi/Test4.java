package Rashmi;

public class Test4
{
	public static void main(String[]args)
	{
		int num = 123;
		int addition = 0;
		while(num>0)
		{
			int a=num%10;
		    num=num/10;
			addition = addition+a;
		}	
		System.out.println(addition);
	}
}
