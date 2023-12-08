//Multi level inheritance ---> Example1

package Inheritance;

public class Whatsappv3 extends Whatsappv2
{
	public void Videocall()
	{
		System.out.println("Video call");
	}
	
	public static void main(String[]args)
	{
		Whatsappv3 obj1 = new Whatsappv3();
		obj1.Message();
		obj1.Audiocall();
		obj1.Videocall();
	}


}
