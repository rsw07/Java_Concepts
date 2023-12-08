/*
WAP to print following pattern
****
***
**
*
 
*/


package Star_Pattern;

public class Star_6 
{
	public static void main(String[] args)
	{
		for(int i=1;i<=4;i++)
		{
			for(int j=i;j<=4;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
