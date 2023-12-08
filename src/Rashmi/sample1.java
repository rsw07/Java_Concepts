//upcasting

package Rashmi;

public class sample1 extends sample
{
	
	
		public void sample()
        {
			System.out.println("sample of superclass");
			
		}
	
		public void sample2()
        {
			System.out.println("sample2 of sub class");
			
		}
	
		public static void main(String[] args) 
		{
			sample s = new sample1();
			s.sample();
		}
		
		
		
	

}
