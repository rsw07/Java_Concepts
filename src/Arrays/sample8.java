//declaring array in single step

package Arrays;

public class sample8 
{
	public static void main(String[] args)
	{
		int[] arr = {10,56,89,20,34};        //array declaration and initialization
		
		System.out.println(arr[3]);        //20
		System.out.println(arr.length);   //5 
		
		System.out.println("Printing all elements");
		for(int i =0; i<=arr.length-1;i++)
		{
			System.out.println(arr[i]);
		}
	}

}
