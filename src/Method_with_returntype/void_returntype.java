//void   ---> dont return anything

package Method_with_returntype;

public class void_returntype 
{
	public static void main(String[] args)
	{
		M1(10,15);
	}
	
	public static void M1(int a,int b)       //return type --> void --> don't return anything
	{
		int c = a+b;
		//return c;   --> Error --> Void methods cannot return a value
		System.out.println(c);
	}

}
