package gyak8;

import gyak8.Cilinder;
import gyak8.Gyak8;
import gyak8.Rect;

public class Runner {
	
	public static void main(String[] Args)
	{
		//Gyak8 p = new Gyak8(6);
		Cilinder c = new Cilinder(17.5, 5);
		System.out.println(c);
		
		Gyak8 pc = new Cilinder(1,1);
		System.out.println(pc);
		
		Gyak8[] prims = (new Gyak8(6.5,5),new Rect(3 ,7.5 ,12));
		System.out.println(prisms);
	}

}
