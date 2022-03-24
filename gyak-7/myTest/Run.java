package myTest;

import gyak7.Kid;
import gyak7.Parent;
import gyak7.Person;

import java.util.Scanner;

public class Run {
	
	Scanner sc = new Scanner(System.in);

	public static void main(String[] Args)
	{
	
		
	}
	
	public Person setInfo()
	{
		int age = Integer.parseInt(sc.nextLine());
		String name = sc.nextLine();
		if( age < 18)
		{
		Person person = new Kid(setName(name), setAge(age), setSchool(sc.nextLine()));
		}
		else
		{
		Person person = new Parent(setName(name), setAge(age), setWorkplace(sc.nextLine()));
		}
		
	}

	
}


