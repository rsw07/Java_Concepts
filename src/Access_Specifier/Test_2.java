//Access Specifier ---> 2. Default --> can be accessed only in same package

package Access_Specifier;

public class Test_2 
{
	int b;      //default variable
	
	Test_2()    //default constructor
	{
		b = 5;
	}
	
	void square()   //default method
	{
		System.out.println(b*b);
	}
	
	public static void main(String[]args)
	{
		Test_2 T2 = new Test_2();
		T2.square();
		System.out.println(T2.b);
	}
}
