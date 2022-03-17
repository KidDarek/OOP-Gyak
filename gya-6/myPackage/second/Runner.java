package myPackage.second;

import java.util.Scanner;

public class Runner {
	
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] Args)
	{
		myPackage.first.Szam numdata = new myPackage.first.Szam(9);
		final double num = Math.random();
		double num2;
		int count = 0;
		do
		{
			num2 = Math.random();
			count++;
		}
		while(Math.abs(num-num2) <= numdata.getTures() );
		numdata.setValos(Integer.parseInt(sc.nextLine()));
		sc.close;
	}
	

}