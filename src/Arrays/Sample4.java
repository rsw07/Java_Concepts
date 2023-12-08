//WAP to create an integer array and print the elements of it in ascending order

package Arrays;

import java.util.Arrays;          //imported package to use sort method of Arrays class present in this package

public class Sample4
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
		
		for(int i = 0;i<=(arr.length-1);i++)
		{
			System.out.println(arr[i]);
		}
	}
}
