package AbstractandConcrete;

public class sample4 extends sample3   //concrete class
{
	public void M2()
	{
		System.out.println("Runing method M2");
	}
	
	public void M4()
	{
		System.out.println("Runing method M4");
	}
	
	public static void main(String[] args)
	{
		sample4 s  = new sample4();
		s.M1();
		s.M2();
		s.M3();
		s.M4();
	}
}
