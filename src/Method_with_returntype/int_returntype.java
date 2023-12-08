//Method with int returntype


package Method_with_returntype;

public class int_returntype 
{
	public static void main(String[] args)
	{
		int sum =add(10,20); //returned value from add need to be accepted in a variable
		System.out.println(sum);
		
		System.out.println(add(15,56));
		
		int d = 50;
		int e = add(2,6);
		System.out.println(d*e);
		
		System.out.println("---------------------");
		
		int_returntype obj = new int_returntype();
		int div = obj.sub(20,5);
		System.out.println(div);
	}
	public static int add(int a,int b)       //return type --> int --> returns output to the method call
	{
		int c = a+b;
		return c;
	}
	
	public int sub(int num1,int num2)      //non-static method
	{
		int num3 = num1-num2;
		return num3;
	}
	
	

}
