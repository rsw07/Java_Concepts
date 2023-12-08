package UseofStaticNonstatic;

public class Employee_Static2
{
	public static void main(String[]args)
	{
		
		Employee_Static.Ename = "Rashmi";
		Employee_Static.Eid = 101;
		Employee_Static.ECeoName ="xyz";
		
		
		Employee_Static.Ename = "Shrutika";
		Employee_Static.Eid = 102;
		Employee_Static.ECeoName ="abc";
		
		Employee_Static e1 = new Employee_Static();
		e1.emp();
		Employee_Static e2 = new Employee_Static();
		e2.emp();
	}

}
