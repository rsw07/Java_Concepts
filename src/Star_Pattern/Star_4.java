/*
 WAP to print folliwing pattern
 *****
 *****
 *****
 
 */



package Star_Pattern;

public class Star_4
{
	public static void main(String[]args)
	{
		for(int i=1;i<=3;i++)        //outer for loop-->for Rows
		{
			for(int j=1;j<=5;j++)    //inner for loop-->for columns
			{
				System.out.print("*");
			}
			System.out.println();     //to move cursor to the next line
		}
	}

}
