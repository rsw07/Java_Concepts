//declaring array in single step

package Arrays;

public class Sample9
{
	public static void main(String[] args)
	{
		String arr[] = {"Rashmi","Shrutika","Vedant","Ciana","Shourya"};
		
		System.out.println(arr[4]);    //Shourya
		
		System.out.println("Length of an array is: "+arr.length);   //5
		
		System.out.println("Printing all elements");
		for(int i =0; i<=arr.length-1;i++)
		{
			System.out.println(arr[i]);
		}
		
	}

}
