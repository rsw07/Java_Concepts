//Access Specifier ---> 3.protected --> can be accessed only in same package
//and in different package using inheritance

package Access_Specifier2;
import Access_Specifier.Test_5;
 
public class Test_4 extends Test_5
{
	public static void main(String[]args)
	{
		Test_4 t = new Test_4();
		t.cube();
		System.out.println(t.c);
	}
}
