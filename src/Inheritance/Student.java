//Single level inheritance ---> Example2

package Inheritance;

public class Student extends Teacher
{
	public void Book3()
	{
		System.out.println("Book3 : Marathi");
	}
	public static void main(String[]args)
	{
		Student s1 = new Student();
		s1.Book1();
		s1.Book2();
		s1.Book3();
	}
}
