//WAP to print elements of an array in ascending order without using sort().and print smallest and largest element

package Arrays;

public class practice2 
{
	public static void main(String[]args)
	{
		int temp=0;
		int[] arr = {5,3,9,86,75,12};
		
		//sorting loop
		for(int i = 0;i<arr.length;i++)
		{
			for(int j =i+1;j<arr.length;j++)
			{
				if(arr[i]>arr[j])
				{
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		
		//printing array
		System.out.println("Printing array in ascending order");
		for(int i = 0;i<=arr.length-1;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		
		System.out.println("smallest element of an array is : "+arr[0]);   
		System.out.println("Largest element of an array is : "+arr[arr.length-1]); 
	} 

}
