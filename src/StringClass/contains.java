//7.contains

package StringClass;

public class contains
{
	public static void main(String[] args)
	{
		String s1 = "I love my country";
		System.out.println(s1.contains("my"));  //True
		
		System.out.println(s1.contains("My"));  //false
		
		System.out.println(s1.contains(" "));  //True
		
		
	}

}
