//String objects are immutable

package StringClass;

public class sample2
{
	public static void main(String[] args)
	{
		String s1 = "abc";
		
		s1.concat("xyz");
		System.out.println(s1);    //provides output as abc even after 
		                           //concatenation because string objects are immutable
		
	}
	

}
