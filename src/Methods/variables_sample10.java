//local variable

package Methods;

public class variables_sample10
{
	public static void main(String[] args)
	{
		int var1=10;   //local variable
		System.out.println(var1);
		M1();
		variables_sample10 V1 = new variables_sample10();
		V1.M2();	
		
	}
	public static void M1()
	{
		int var2=20;  //local variable
		System.out.println(var2);
	}
	
	public void M2()
	{
		int var3=30;  //local variable
		System.out.println(var3);
	}
}
