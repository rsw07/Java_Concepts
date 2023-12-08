//2.isEmpty()

package StringClass;

public class empty
{
	public static void main(String[] args)
	{
		String s2 ="";         //true
		String s3 =" ";        //whitespace is considered as a character so result will be false
		String s4 = "abc";     //false
		System.out.println(s2.isEmpty());
		System.out.println(s3.isEmpty());
		System.out.println(s4.isEmpty());
		
		System.out.println("------------------");
		
		
	}

}
