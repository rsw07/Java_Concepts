//substring(startingindex,endingindex+1)  -->substring is nothing but a small part of original string

package StringClass;

public class substring 
{
	public static void main(String[] args)
	{
		String s = "Rashmi";
		System.out.println(s.substring(2));  //shmi
		System.out.println(s.substring(0,4)); //it prints substring from index 0 to 3
		System.out.println(s.substring(2,5));
		
	}

}
