package myProducts;

import java.util.Scanner;

public class Runner {
	
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] Args)
	{
		
		Product[] prods = new Product[Integer.parseInt(sc.nextLine())];
		for(int i = 0 ; i < prods.length;i++)
		{
		prods[i].setName(sc.nextLine());
		prods[i].setaKey(Integer.parseInt(sc.nextLine()));
		prods[i].setNetPrice(Integer.parseInt(sc.nextLine()));
		}
		int[] prodPrice = new int[prods.length];
		for(int i = 0 ; i < prods.length;i++)
		{
			Bread a = (Bread)prods[i];
			Book b = (Book)prods[i];
			if(prodPrice[i] <= (a - prodPrice[i]) || prodPrice[i] <= (b - prodPrice[i]))
			{
				
			}
		}
		
	}

}
