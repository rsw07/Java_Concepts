//Multidimentional array in single step

//WAP to print 10 20 30
//             40 50 60

package Arrays;

public class Sample11
{
	public static void main(String[] args)
	{
		int[][] arr = {{10,20,30},{40,50,60}};
		
		System.out.println(arr[0][1]);  //20
		
		System.out.println(arr.length);  //2
		
		System.out.println("Printing all data");
		for(int i = 0;i<=1;i++)
		{
			for(int j = 0;j<=2;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}

}
