package main;

public class Gyak2and3 
{

	public static void main(String[] args)
	{
		int max = 100;
		int count = pairs(max);
		System.out.println(count);
		//3. feladat fügvények nélkül
		int[] arr = new int[10];
		//kiiras es feltöltes
		for(int i = 0; i < arr.length; i++)
		{
			arr[i] = (int)(Math.random()*50);
			System.out.println(arr[i]);
		}
		//fordítva
		for(int i = arr.length-1; i >= 0 ; i--)
		{
			System.out.println(arr[i]);
		}
		//atlag
		int ertek = 0 ;
		int darab = 0 ;
		for(int i = 0 ; i < arr.length; i++)
		{
			if(arr[i]%2 == 0)
			{
				ertek+=arr[i];
				darab++;
			}
		}
		System.out.println((double)ertek/darab);
		//min
		int min = arr[0];
		for(int i = 0 ; i < arr.length ; i++)
		{
			if(arr[i]<min)
			{
			min = arr[i];	
			}
		}
		System.out.println(min);
		//monoton
		boolean mono = true;
		for(int i = 1 ; i < arr.length ; i++)
		{
			if(arr[i-1] > arr[i])
			{
				mono = false;
			}
		}
		System.out.println("A tomb monoton novekvo? " + mono);
		
	}


	static boolean isprim(int num)
	{
		int div = 0;
		for(int i = 1; i<=num;i++)
		{
			if(num%i==0)
			{
				div++;
			}
		}
		if(div == 2)
		{
		return true;
		}
		else
		{
		return false;	
		}
	}
	
	static int pairs(int max) 
	{
		int prim = 0;
		for(int i = 1; i <= max;i++)
		{
			boolean egy = isprim(i);
			for(int j = 1; j <= max;j++)
			{
				boolean ket = isprim(j);
				if(Math.abs(i-j) == 2 && egy == true && ket == true)
				{
				prim++;	
				}
			}
		}
		
		return prim/2;
	}
	
	
}

