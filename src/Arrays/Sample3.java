//WAP to create an integer array and print the elements of it.

package Arrays;

public class Sample3
{
	public static void main(String[] args) 
	{
		int[] arr = new int[5];
		
		arr[0]=50;
		arr[1]=10;
		arr[2]=100;
		arr[3]=2;
		arr[4]=5000;
		
		System.out.println("---printing each element in new line---");
		for(int i =0;i<=(arr.length-1);i++)
		{
			System.out.println(arr[i]);
		
		}
		
		System.out.println("---printing each element in same line---");
		for(int i =0;i<=(arr.length-1);i++)
		{
			System.out.print(arr[i]+" ");
		}
		
		
	}

}
