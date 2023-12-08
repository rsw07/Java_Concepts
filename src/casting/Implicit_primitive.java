//Primitive casting --> 1. Implicit casting -> Converting lower datatype info into higher datatype info.

package casting;

public class Implicit_primitive
{
	public static void main(String[] args)
	{
		int a = 20;       //4 bytes
		System.out.println("Before casting int value is : "+a);
		long b = a;       //8 bytes
		System.out.println("After casting casting long value is : "+b);
		
		
		float c = 20f;   //4 bytes
		double d = c;    //8 bytes
		
		
	}

}
