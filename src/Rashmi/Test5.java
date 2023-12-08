//WAP to print the whether the digits in number is odd or even

package Rashmi;

public class Test5
{
	public static void main(String[]args)
	{
		int num = 12345;
		while(num>0)
		{
			int a=num%10;   //a=12345%10 =5
			num=num/10;     //num = 12345/10 = 1234
			if(a%2==0)     //5%2 = 1
			{
				System.out.println(a+" = Even");
				
			}
			else
			{
				System.out.println(a+" = odd");
			}
		}
		
	}
	

}
