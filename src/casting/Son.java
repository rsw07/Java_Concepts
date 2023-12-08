package casting;

//sub class
public class Son extends Father              //inheritance
{
	public void Mobile()                     //own method of sub class son
	{
		System.out.println("Mobile:Samsung");
	}
	
	public void car()
	{
		System.out.println("car:Audi");      //method overriding
	}
	
	public void money()                     //method overriding
	{
		System.out.println("Money:10k");
	}
	
	public static void main(String[] args)
	{
		Father obj = new Son();              //upcasting
		obj.car();
		obj.Home();
		obj.Money();
		//obj.mobile();--> not possible as object type is father so object can only access father class properties
	}

}
