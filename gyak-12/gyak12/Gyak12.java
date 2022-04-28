package gyak12;

import exept.Exeption;

public class Gyak12 {
	
	public static void main(String[] Args)
	{
		Acc acc = new Acc("123");
		acc.raiseFunds(10);
		System.out.println(acc);
		try	{
		acc.takeFund(5);
		}
		catch(Exeption e)
		{
			System.out.println("Not cash money "+ e.getMissingfund());
		}
		System.out.println(acc);
	}

}
