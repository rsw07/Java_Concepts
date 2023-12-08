package Methods;

public class Sample9
{
	public static void main(String[]args)
	{
		Sample9 studobj = new Sample9();
		studobj.Studentinfo("Rashmi",10,95.2f,'A');
		
		
		
	}
	
	public void Studentinfo(String name,int rollno,float percentage,char grade)
	{
		System.out.println("The name of student is: "+name);
		System.out.println("The roll no. of student is: "+rollno);
		System.out.println("Percentage of student is: "+percentage);
		System.out.println("Thegrade of student is: "+grade);
	}

}
