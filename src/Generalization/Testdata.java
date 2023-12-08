package Generalization;

public class Testdata
{
	public static void main(String[] args)
	{
		System.out.println("-------- JIO RECHARGE ------");
		Jio j = new Jio();
		j.call();
		j.data();
		j.sms();
		
		System.out.println("-------- VI RECHARGE ------");
		VI v = new VI();
		v.call();
		v.data();
		v.sms();
		
		System.out.println("-------- AIRTEL RECHARGE ------");
		Airtel a = new Airtel();
		a.call();
		a.data();
		a.sms();
		
	}
	
	

}
