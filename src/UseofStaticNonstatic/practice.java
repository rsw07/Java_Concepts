package UseofStaticNonstatic;

public class practice 
{
	String Sname;
	static int Sroll;
	
	public void Student()
	{
		System.out.println(Sname+":"+Sroll);
	}

	
	public static void main(String[]args)
	{
		Sroll = 102;
		practice p1 = new practice();
		p1.Sname = "Sara";

		Sroll = 105;
		practice p2 = new practice();
		p2.Sname = "Sachin";
		
		p1.Student();
		p2.Student();
		
		
		
	}
}
