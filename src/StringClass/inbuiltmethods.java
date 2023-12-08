package StringClass;

public class inbuiltmethods
{
	public static void main(String[] args)
	{
		String s1 = "Rashmi";
		String s3 = "rASHmi";
		String s2 = "  This is a flower";
		
		System.out.println(s1.length());              //6
		System.out.println(s2.startsWith(" "));   //true
		System.out.println(s2.endsWith("is"));        //false
		System.out.println(s1.toUpperCase());        //RASHMI
		System.out.println(s1.toLowerCase());        //rashmi
		System.out.println(s2.contains("flower"));   //true
		System.out.println(s1.equals(s2));           //false
		System.out.println(s1.equalsIgnoreCase(s3)); //true
		System.out.println(s2.trim());               //This is a flower
		System.out.println(s2.replace("flower", "fruit")); //  This is a fruit
		System.out.println(s1+s3);      //RashirASHmi
		System.out.println(s1.concat(s3).concat(s2)); //RashirASHmi  This is a flowers2
		System.out.println(s2.substring(7,9));  //is
		System.out.println(s1.charAt(2));      //s
		System.out.println(s2.indexOf('i'));   //4
		System.out.println(s2.lastIndexOf('s'));  //8
		System.out.println(s3.isEmpty());    //false
		
		System.out.println("-----------------------");
		
		String[]arr = s2.split(" ");
		System.out.println(arr.length); //6
		for(int i=0;i<=arr.length-1;i++)
		{
			System.out.println(arr[i]);   
		}
		
		
	}

}
