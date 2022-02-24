package main;

import java.util.Scanner;
import java.io.*;

public class gyak3 
{

	static Scanner sc = new Scanner(System.in);
	//gyak
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

	//2.gyak 5.feladat
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
	//3. gyak 1. feladat
	public static void main3(String[] Args)
	{
		Console line = System.console();
		boolean go = false;
		do
		{
			String op = line.readLine();
			
			switch(op)
			{
			case("+"):
			{
				//első szám
				int num1 = Integer.parseInt(line.readLine());
				//második szám
				int num2 = Integer.parseInt(line.readLine());
				int numcal = num1+num2;
				System.out.println(num1 + " + " + num2 + " = " + numcal);
				break;
			}
			case("-"):
			{
				//első szám
				int num1 = Integer.parseInt(line.readLine());
				//második szám
				int num2 = Integer.parseInt(line.readLine());
				int numcal = num1-num2;
				System.out.println(num1 + " - " + num2 + " = " + numcal);
				break;
			}
			case("*"):
			{
				//első szám
				int num1 = Integer.parseInt(line.readLine());
				//második szám
				int num2 = Integer.parseInt(line.readLine());
				int numcal = num1*num2;
				System.out.println(num1 + " * " + num2 + " = " + numcal);
				break;
			}
			case("/"):
			{
				//első szám
				int num1 = Integer.parseInt(line.readLine());
				//második szám
				int num2 = Integer.parseInt(line.readLine());
				if(num2 == 0)
				{
					System.out.println("Error");
					break;
				}
				else
				{
				int numcal = num1/num2;
				System.out.println(num1 + " / " + num2 + " = " + numcal);
				break;
				}
			}
			}
			String cont;
			do
			{
			System.out.println("Do you wish to continue? (Y/N)");
			cont = line.readLine();
			if(cont=="Y")
			{
				go = false;
			}
			else if(cont=="N") 
			{
				go = true;
			}
			else
			{
				System.out.println("Error");
			}
			}while(cont == "Y" || cont == "N");
			
		}while(!go);
	}
}

