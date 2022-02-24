package main;

import java.util.Scanner;
import java.io.*;

public class gyak3 
{

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] Args)

	{
		int num = 0;
		boolean ok = false;
		do
		{
			ok = true;
			try 
			{
				String text = sc.nextLine();
				num = Integer.parseInt(text);
				if(num < 1 || num > 10)
				{
					ok = false;
					System.out.println("out of range");
				}
			}
			catch(Exception e)
			{
				ok = false;
				System.out.println("Error...");
			}
		}while(!ok);
		System.out.println("Number read: " + num);
		sc.close();
	}

	public static void main2(String[] Args)
	{
		Console line = System.console();
		String[][] data = new String[5][];
		for(int i = 0 ; i < data.length;i++)
		{
			System.out.println("Adja meg hogy hany emailt szeretne tárolni ");
			String oneline = line.readLine();
			int num = Integer.parseInt(oneline);
			data[i] = new String[num];
		}
		for(int i = 0 ; i < data.length;i++)
		{
			System.out.println("Adja meg a nevet ");
			for(int j = 0 ; j < data[i].length;j++)
			{
				String oneline = line.readLine();
				System.out.println("Adja meg az emailt/emaileket ");
				data[i][j] = oneline;
				
			}
		}		
		
	}
}

