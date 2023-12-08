//Data Structure --> 1. Array
//WAP to create an integer array and print any element and length of it.
package Arrays;

public class sample
{
	public static void main(String[]args)
	{
		//step 1. array declaration
		int[] arr = new int[6];
		
		//step 2. array initialization
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		arr[3] = 5;
		arr[4] = 90;
		
		//step 3. array Usage
		System.out.println(arr[2]);      //30
		System.out.println(arr[5]);      //0
		
		//To print length of an  integer array 
		System.out.println("Length of an array is : "+arr.length);
		
	}

}
