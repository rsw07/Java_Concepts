//    *******
//     *****
//      ***
//       *

package Star_Pattern;

public class star_11 
{
	public static void main(String[] args) 
	{
		int star = 7;
		int space = 0;
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=space;j++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=star;j++)
			{
				System.out.print("*");
			}
			System.out.println();
			star=star-2;
			space++;
		}
		
	}

}
