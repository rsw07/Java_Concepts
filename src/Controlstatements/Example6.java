//Switch Case -->case values in integer

/*NOTE --> Break will stop the execution.if we don't use break statement then it will execute all the 
cases available after the case value provided in Switch(value) including default case.i.e.Switch(5)
so,it will execute all cases available after case 5(case 5,case 6, case 7,default)*/

package Controlstatements;

public class Example6
{
	public static void main(String[]args)
	{
		switch(5)
		{
		case 1:System.out.println("Today is Monday");
		break;
		
		case 2:System.out.println("Today is Tuesday");
		break;
		
		case 3:System.out.println("Today is Wednesday");
		break;
		
		case 4:System.out.println("Today is Thursday");
		break;
		
		case 5:System.out.println("Today is Friday");
		break;
		
		case 6:System.out.println("Today is Saturday");
		break;
		
		case 7:System.out.println("Today is sunday");
		break;
		
		default:System.out.println("Invalid Input");
		}
	}

}
