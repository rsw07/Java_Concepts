//split()  --> breaks the string

package StringClass;

public class split 
{
	public static void main(String[] args)
	{
		String s1 = "I love my india";
		String[] arr = s1.split(" ");
		System.out.println(arr.length);   //4
		System.out.println("--------------------");
		System.out.println(arr[2]);       //my
		System.out.println("--------------------");
		for(int i=0;i<4;i++)
		{
			System.out.println(arr[i]);
		}
		
	}

}
