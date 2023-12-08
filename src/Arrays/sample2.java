//WAP to create an string array and print any element and length of it.

package Arrays;

public class sample2
{
	public static void main(String[] args)
	{
		String[] sarr = new String[5];  //string array declaration
		
		sarr[0] = "Shrutika";           //array initialization
		sarr[1] = "Rashmi";
		sarr[3] = "Vedant";
		sarr[4] = "ciana";
		
		System.out.println(sarr[0]);    //Shrutika
		System.out.println(sarr[2]);    //null
		
		//To print length of an string array 
		System.out.println("Length of an array is : "+sarr.length);

	}

}
