package Method_with_returntype;

public class string_returntype
{
	public static void main(String[] args)
	{
		String b = m1("Rashmi");
		System.out.println(b);
		
	}
	
	public static String m1(String str)

	{
		String a = str.toUpperCase();
		return a;
	}
}
