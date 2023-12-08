//Access Specifier ---> 3.protected --> can be accessed only in same package 
//and in different package using inheritance

package Access_Specifier;

public class Test_6
{
	public static void main(String[]args)
	{
		Test_5 T5a = new Test_5();
		T5a.cube();
		System.out.println(T5a.c);
	}

}
