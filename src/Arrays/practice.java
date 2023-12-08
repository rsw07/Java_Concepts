//WAP to print smallest and largest element from integer string

package Arrays;

import java.util.Arrays;

public class practice 
{
	public static void main(String[] args)
	{
		int[] arr = {10,56,89,20,34};        //array declaration and initialization
		
		Arrays.sort(arr);
		System.out.println(arr[0]);
		System.out.println(arr[arr.length-1]);
	}

}
