//sub class

package this_super_keyword;

public class demo2 extends demo1
{
	int a = 20;   //global variable of sub class
	
	public void M1()
	{
		int a = 30;     //local variable
		System.out.println(a);       //30--> prints local variable
		System.out.println(this.a);  //20 --> prints global variable of same class
		System.err.println(super.a); //10 --> prints global variable of super class
	}
	
	public static void main(String[] args)
	{
		demo2 d = new demo2();
		d.M1();
		
	}

}
