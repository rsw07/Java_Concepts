//6.equalsIgnoreCase

package StringClass;

public class equalsIgnore
{
	public static void main(String[] args)
	{
		String s1 = "ABCD";
		String s2 = "ABCD";
		System.out.println(s1.equalsIgnoreCase(s2));   //true
		
		System.out.println("---------------------");
		
		String s3 = "abcd";
		String s4 = "abcd";
		System.out.println(s3.equalsIgnoreCase(s4));   //true
		
		System.out.println("---------------------");
		
		String s5 = "abcd";
		String s6 = "ABCD";
		System.out.println(s5.equalsIgnoreCase(s6));   //true
		
		System.out.println("---------------------");
		
		String s7 = "abcd";
		String s8 = "xyz";
		System.out.println(s7.equalsIgnoreCase(s8));   //false
		
		
	}

}
