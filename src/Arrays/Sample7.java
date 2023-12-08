package Arrays;

import java.util.Arrays;

public class Sample7 
{
	public static void main(String[] args) 
	{
		String[] arr = new String[5];  //array declaration
		
		arr[0] = "Shrutika";
		arr[1] = "Rashmi";
		arr[2] = "Shourya";
		arr[3] = "Vedant";
		arr[4] = "Ciana";
		
		Arrays.sort(arr);       //sorts in ascending i.e a-b-c-d...
		
		for(int i =arr.length-1;i>=0;i--)
		{
			System.out.println(arr[i]);    //prints in descending order
		}
	}

}
