//if we create same static method in derived class then it is not method overriding,it is method hiding


package Polymorphism;

public class Method_hiding extends overriding_static
{
	public static void M1()                 //Method Hiding
	{
		System.out.println("Method 1");
	}

}
