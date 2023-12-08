//WAP to create an integer array and print the elements of it in descending order

package Arrays;

import java.util.Arrays;

public class Sample5 
{
	public static void main(String[] args)
	{
		int[] arr = new int[5];
		
		arr[0]=50;
		arr[1]=10;
		arr[2]=100;
		arr[3]=2;
		arr[4]=5000;
		
		Arrays.sort(arr);     //Arrays --> class &   sort() --> method in Arrays class
		                      //By default sort method sorts elements in Ascending order
		
		for(int i=(arr.length-1);i>=0;i--)  //prints array in descending order
		{
			System.out.println(arr[i]);
		}
	}
	

}
