//Identifiers --> Identifiers are the name given to variables,classes,Methods and packages

package Variables;     // variable-->packagename-->Identifier

public class Demo3     //Demo3-->classname-->Identifier
{
	public static void main(String[]arg)    //main-->methodname-->identifier
	{
		int num=10;       //num-->variablename-->identifier
		int num1;
		int $num2;
		int _num3;
		//int 1num; ------> NOT ALLOWED-->IDENTIFIER SHOULD NOT START WITH A DIGIT
		//int num@1;------> SPECIAL SYMBOLS ARE NOT ALLOWED
		//int num 4;-----> WHITE SPACES ARE NOT ALLOWED
		
		System.out.println(num);
	}

}
