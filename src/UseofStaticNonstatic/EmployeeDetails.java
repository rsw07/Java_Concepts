//Non-Static ---> Maintains Different data for every object.

package UseofStaticNonstatic;

public class EmployeeDetails 
{
	public static void main(String[]args)
	{
		Employee E1=new Employee();
		E1.EmpName ="Rashmi";
		E1.EmpID = 101;
		E1.EmpCEOName = "xyz";
		
		Employee E2=new Employee();
		E2.EmpName ="Shrutika";
		E2.EmpID = 102;
		E2.EmpCEOName = "xyz";
		
		Employee E3=new Employee();
		E3.EmpName ="vedant";
		E3.EmpID = 103;
		E3.EmpCEOName = "ABC";
	
		E1.EmpInfo();
		E2.EmpInfo();
		E3.EmpInfo();
	}
	
}
