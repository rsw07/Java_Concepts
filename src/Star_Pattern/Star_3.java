/*
WAP to print following pattern
*
**
***
****

*/

package Star_Pattern;

public class Star_3 
{
	public static void main(String[] args) 
	{
		for(int i =1;i<=4;i++)
		{
			for(int j =1;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

}
