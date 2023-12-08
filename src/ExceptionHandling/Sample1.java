package ExceptionHandling;

public class Sample1
{
	public static void main(String[] args)
	{
		String s1 = "abcd";
		System.out.println(s1.charAt(2));   //c
		System.out.println(s1.charAt(4));   // exception --> string index out of bound
	}

}
