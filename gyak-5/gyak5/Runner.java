package gyak5;

import java.util.Scanner;

public class Runner {

	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] Args)
	{
		int length = Integer.parseInt(sc.nextLine());
		Hanglemez[] adat = new Hanglemez[length];
		for(int i = 0; i < adat.length; i++)
		{
			adat[i].eloado = sc.nextLine();
			adat[i].cim = sc.nextLine();
			adat[i].ido = Integer.parseInt(sc.nextLine());
		}
		int index = longestLemez(adat);
		adat[index].writeData(adat[index]);
		sameName(adat,sc.nextLine());
	}
	public static int longestLemez(Hanglemez[] adat)
	{
		int index = 0;
		int max = 0;
		for(int i = 0; i < adat.length; i++)
		{
			if(adat[i].ido>max)
			{
				index = i;
				max = adat[i].ido;
			}
		}
		return index;
	}
	public static void sameName(Hanglemez[] adat, String name)
	{
		for(int i = 0 ; i < adat.length; i++)
		{
			if(adat[i].eloado.equals(name))
			{
				System.out.println(adat[i].cim);
			}
		}
	}
}
