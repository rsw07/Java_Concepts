//8.startsWith()

package StringClass;

public class Startswith 
{
	public static void main(String[] args)
	{
		String s1 = "Rashmi";
		System.out.println(s1.startsWith("R"));   //true
		System.out.println(s1.startsWith("r"));   //false
		System.out.println(s1.endsWith(" "));   //false
	}

}
