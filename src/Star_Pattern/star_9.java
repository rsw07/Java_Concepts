//    *
//   ***
//  *****
// *******
//*********

package Star_Pattern;

public class star_9 
{
	public static void main(String[] args) 
	{
		int space = 4;
		int star = 1;
		
		for(int i=1;i<=5;i++)           //outer for loop for rows
		{
			for(int j=1;j<=space;j++)    //1st inner for loop for spaces
			{
				System.out.print(" ");
			}
			for(int j=1;j<=star;j++)    //2nd inner for loop for stars
			{
				System.out.print("*");
			}
			System.out.println();
			space--;
			star = star+2;
		}
		
		
	}

}