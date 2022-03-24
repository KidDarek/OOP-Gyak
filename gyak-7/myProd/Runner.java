package myProd;

import myProd.Product;
import myProd.kenyer;

public class Runner {
	
	
	public static void main(String[] Args)
	{
		Product prod = new Product("Hello Kitty skateboard", 1000 , 27);
		kenyer bread = new kenyer("Vajato", 500 , 27 , 0.5);
		System.out.println(bread);
		System.out.println(prod);
		bread.comparePrice(prod);
	}

}
