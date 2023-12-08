//Non-Static ---> Maintains Different data for every object.

package UseofStaticNonstatic;

public class Employee
{
	String EmpName;
	int EmpID;
	String EmpCEOName;
	
	public void EmpInfo()
	{
		System.out.println(EmpName+":"+EmpID+":"+EmpCEOName);
	}
}
