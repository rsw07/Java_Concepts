//Practice of all method types

package Methods;

public class Sample6
{
	public static void main(String[]args)
	{
		Meth1();       //Static method call from same class
		
		Sample6 S6 = new Sample6(); 
		S6.Meth2();    //Non Static method call from same class
		
		Sample7.Meth3();   // static method call from different class i.e. Sample7
		
		Sample7 S7 = new Sample7();
		S7.Meth4();    //Non Static method call from Different class i.e. Sample7
		
	}
	
	public static void Meth1()
	{
		System.out.println("Running static method Meth1");
	}
	
	public void Meth2()
	{
		System.out.println("Running Non static method Meth2");
	}
	

}
