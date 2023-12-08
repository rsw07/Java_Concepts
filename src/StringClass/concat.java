//concatenation can be done using --> 1.+ operator --> combines two strings
//                                    2.concat()  --> combines two strings

package StringClass;

public class concat 
{
	public static void main(String[] args)
	{
		String s1 = "Hello";
		String s2 = "All";
		String s3 = "Friends";
	
		System.out.println(s1+s2);    //HelloAll
		System.out.println(s1.concat(s2)); //HelloAll
		System.out.println(s1.concat(s2).concat(s3));  //HelloAllFriends
	}
}
