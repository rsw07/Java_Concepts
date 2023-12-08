package Methods;

public class Sample8 
{
	public static void main(String[]args)
	{
		Add(10,20);
		Sub(20,10);
		Mult(2,3);
		Div(10,3);
	}
	// method with 2 int (int,int) parameter
	//Addition
	public static void Add(int a, int b)
	{
		int c;
		c = a+b;
		System.out.println("The addition is: "+c);
	}
	
	//Subtraction
	public static void Sub(int c , int d)
	{
		int e = c-d;
		System.out.println("The subtraction is: "+e);
	}
	
	//Multiplication
	public static void Mult(int f, int g)
	{
		int h = f*g;
		System.out.println("The multiplication is:"+h);
	}
	
	//Division
	public static void Div(float i,float j)
	{
		float k = i/j;
		System.out.println("Division is: "+k);
	}

}
