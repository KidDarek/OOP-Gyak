package gyak5;

import java.util.Scanner;

public class Gyak5 {
	
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] Args)
	{
		Hanglemez adat = new Hanglemez(sc.nextLine(),sc.nextLine(),Integer.parseInt(sc.nextLine()));
		adat.writeData(adat);
		System.out.println(adat.lenghtType(adat));
		System.out.println(adat.checkWriter(adat));
		sc.close();
	}

}
