//Access Specifier ---> 3.protected --> can be accessed throughout the project

package Access_Specifier;

public class sample
{
	public int d;    //public variable
	
	public sample()   //public constructor
	{
		d=5;
	}
	
	public void cube()  //public method
	{
		System.out.println(d*d*d);
	}
	
	public static void main(String[] args)
	{
		sample s1 = new sample();
		s1.cube();
		System.out.println(s1.d);
		
	}

}
