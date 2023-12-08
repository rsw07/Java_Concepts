//Switch Case -->case values in string

package Controlstatements;

public class Example7 
{
	public static void main(String[]args)
	{
		switch("PINchange")
		{
		case "Withdraw":System.out.println("Running Withdraw money code");
		break;
		
		case "Balancecheck": System.out.println("Running check balance code");
		break;
		
		case "PINchange" : System.out.println("Running PIN change code");
		break;
		
		case "Ministatement" : System.out.println("Running code for ministatement");
		break;
		
		default:System.out.println("Invalid Input");
		
		}
		
	}

}
