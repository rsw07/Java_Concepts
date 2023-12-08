//Nested If 

package Controlstatements;

public class Example5
{
	public static void main(String[]args)
	{
		int PEM = 400;
		int MEM = 900;
		if(PEM>=300)        //Outer if 
		{
			System.out.println("You are eligible for MAINS exam");
			if(MEM>=800)
			{
				System.out.println("Congrats!!!You are selected");
			}
			else
			{
				System.out.println("You are rejected as your mains exam marks are less than 800");
			}
		}
		else
		{
			System.out.println("You are not eligible for Mains exam");
		}
		
	}

}
