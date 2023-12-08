//Abstract class  ---> object cannot be created

package AbstractandConcrete;

abstract public class sample      //incomplete class --> abstract class
{
	public void M1()     //Complete method
	{
		System.out.println("Running M1 method");
	}
	
	public void M2()     //Complete method
	{
		System.out.println("Running M2 method ");
	}
	
	abstract public void M3();     //incomplete method
	
	abstract public void M4();     //incomplete method
	

}
