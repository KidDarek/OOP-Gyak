package gyakzh;

import java.time.LocalDate;
import java.util.Scanner;

import gyakzh.Jegy;
import gyakzh.Jegy.Kedvezmeny;
import gyakzh.ICjegy;

public class Runner {
	
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] Args)
	{
		ICjegy[] jegyek = new ICjegy[3];
	 	String as = sc.nextLine();
		for(int i = 0 ; i < jegyek.length; i++)
		{
			LocalDate datum = LocalDate.parse(sc.nextLine());
			Kedvezmeny kedv = Kedvezmeny.valueOf(sc.nextLine());
			String nev = sc.nextLine();
			int kocsiosztaly = Integer.parseInt(sc.nextLine());
			int kocsi;
			if(kocsiosztaly == 1 || kocsiosztaly == 2)
			{
				kocsi = kocsiosztaly;
			}
			else
			{
				System.out.println("Error Wrong input value");
			}
			int tav = Integer.parseInt(sc.nextLine());
			int tav2;
			if(tav >= 10 && tav <= 800)
			{
				tav2 = tav;
			}
			else
			{
				System.out.println("Error Wrong input value");
			}
			jegyek[i] = ICjegy(datum,kedv,nev, kocsi, tav2);
		}
		
	}
	
	public int sum(ICjegy[] jegyek)
	{
		int[] sum = new int[jegyek.length]
		for(int i = 0 ; i < jegyek.length; i++)
		{
			
		}
	}

}
