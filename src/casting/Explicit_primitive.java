//Primitive casting --> 2. Explicit casting -> Converting Higher datatype info into Lower datatype info.

package casting;

public class Explicit_primitive
{
	public static void main(String[] args)
	{
		double d = 4.56d;      //8 bytes
		System.out.println("Before casting double value is : "+d);
		float e =(float) (d);   //4 bytes
		System.out.println("After casting casting float value is : "+e);
		
		
		long a = 2000l;
		int b = (int) (a);
		
	}
	
}
