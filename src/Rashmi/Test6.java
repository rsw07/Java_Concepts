//wap to reverse the number

package Rashmi;

public class Test6
{
	public static void main(String[] args)
	{
		String rev = "";
		int num = 12345;
		while(num>0)
		{
			int a = num%10; 
			num = num/10;
			rev = rev+a;
		}
		System.out.println(rev);
	}
	

}
