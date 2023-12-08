//Control Statements
//2.if-else Statement

// & opearator ---> when both the conditions are true then and then only it executes the else if block.

package Controlstatements;

public class Example4 
{
	public static void main(String[]args)
	{
		int Marks = 90;
		if(Marks>=90)
		{
			System.out.println("Distinction");
		}
		else if(Marks>=80 & Marks<90)
		{
			System.out.println("First class");	
		}
		else if(Marks>=70 & Marks<80)
		{
			System.out.println("Second class");
		}
		else if(Marks>=50 & Marks<70)
		{
			System.out.println("PASS");
		}
		else
		{
			System.out.println("FAIL");
		}
		
	}

}
