package Methods;

public class Method_with_returntype
{
	public static void main(String[] args)
	{
		M1(10,15);
		int result = M2(20,5);      //returned value from M2 need to be accepted in avariable
		System.out.println(result);
	}
	
	public static void M1(int a,int b)       //return type --> void --> don't return anything
	{
		int c = a+b;
		//return c;   --> Error --> Void methods cannot return a value
		System.out.println(c);
	}
	
	public static int M2(int c,int d)       //return type --> int --> returns output to the method call
	{
		int e = c-d;
		return e;
	}

}
