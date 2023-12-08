//Multidimentional array

//WAP to print 10 20 30
//             40 50 60

package Arrays;

public class Sample10
{
	public static void main(String[] args)
	{
		int[][] arr = new int[2][3];        //Declaration of multidimentional array
		
		arr[0][0] = 10;                     //initialization of multidimentional array
		arr[0][1] = 20;
		arr[0][2] = 30;
		arr[1][0] = 40;
		arr[1][1] = 50;
		arr[1][2] = 60;
		
		System.out.println(arr[0][1]);   //20
		
		System.out.println(arr.length);   //2 --> length will print length of rows(i.e. no.of rows)
		
		System.out.println("Printing all data");
		
		for(int i=0;i<=1;i++)         //outer for loop for rows 
		{
			for(int j = 0;j<=2;j++)    //inner for loop for columns
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
			
		}
	}
	

}
